package typings.reactList.mod

import typings.react.mod.Props
import typings.react.mod.global.JSX.Element
import typings.reactList.reactListStrings.x
import typings.reactList.reactListStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactListProps extends Props[ReactList] {
  
  var axis: js.UndefOr[x | y] = js.native
  
  var initialIndex: js.UndefOr[Double] = js.native
  
  var itemRenderer: js.UndefOr[ItemRenderer] = js.native
  
  var itemSizeEstimator: js.UndefOr[ItemSizeEstimator] = js.native
  
  var itemSizeGetter: js.UndefOr[ItemSizeGetter] = js.native
  
  var itemsRenderer: js.UndefOr[ItemsRenderer] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var minSize: js.UndefOr[Double] = js.native
  
  var pageSize: js.UndefOr[Double] = js.native
  
  var scrollParentGetter: js.UndefOr[ScrollParentGetter] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var useStaticSize: js.UndefOr[Boolean] = js.native
  
  var useTranslate3d: js.UndefOr[Boolean] = js.native
}
object ReactListProps {
  
  @scala.inline
  def apply(): ReactListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactListProps]
  }
  
  @scala.inline
  implicit class ReactListPropsOps[Self <: ReactListProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAxis(value: typings.reactList.reactListStrings.x | y): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setInitialIndex(value: Double): Self = this.set("initialIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialIndex: Self = this.set("initialIndex", js.undefined)
    
    @scala.inline
    def setItemRenderer(value: (/* index */ Double, /* key */ Double | String) => Element): Self = this.set("itemRenderer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteItemRenderer: Self = this.set("itemRenderer", js.undefined)
    
    @scala.inline
    def setItemSizeEstimator(value: (/* index */ Double, /* cache */ js.Object) => Double): Self = this.set("itemSizeEstimator", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteItemSizeEstimator: Self = this.set("itemSizeEstimator", js.undefined)
    
    @scala.inline
    def setItemSizeGetter(value: /* index */ Double => Double): Self = this.set("itemSizeGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteItemSizeGetter: Self = this.set("itemSizeGetter", js.undefined)
    
    @scala.inline
    def setItemsRenderer(value: (/* items */ js.Array[Element], /* ref */ String) => Element): Self = this.set("itemsRenderer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteItemsRenderer: Self = this.set("itemsRenderer", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setScrollParentGetter(value: () => Element): Self = this.set("scrollParentGetter", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteScrollParentGetter: Self = this.set("scrollParentGetter", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUseStaticSize(value: Boolean): Self = this.set("useStaticSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseStaticSize: Self = this.set("useStaticSize", js.undefined)
    
    @scala.inline
    def setUseTranslate3d(value: Boolean): Self = this.set("useTranslate3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTranslate3d: Self = this.set("useTranslate3d", js.undefined)
  }
}
