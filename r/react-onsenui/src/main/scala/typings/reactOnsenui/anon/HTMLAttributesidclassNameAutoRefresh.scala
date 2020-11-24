package typings.reactOnsenui.anon

import typings.react.mod.CSSProperties
import typings.reactOnsenui.mod.AnimationOptions
import typings.reactOnsenui.reactOnsenuiStrings.horizontal
import typings.reactOnsenui.reactOnsenuiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  direction :'horizontal' | 'vertical' | undefined,   fullscreen :boolean | undefined,   overscrollable :boolean | undefined,   centered :boolean | undefined,   itemWidth :number | string | undefined,   itemHeight :number | string | undefined,   autoScroll :boolean | undefined,   autoScrollRatio :number | undefined,   swipeable :boolean | undefined,   disabled :boolean | undefined,   index :number | undefined,   autoRefresh :boolean | undefined,   onPostChange :(): void | undefined,   onRefresh :(): void | undefined,   onOverscroll :(): void | undefined,   animationOptions :react-onsenui.react-onsenui.AnimationOptions | undefined} */
@js.native
trait HTMLAttributesidclassNameAutoRefresh extends js.Object {
  
  var animationOptions: js.UndefOr[AnimationOptions] = js.native
  
  var autoRefresh: js.UndefOr[Boolean] = js.native
  
  var autoScroll: js.UndefOr[Boolean] = js.native
  
  var autoScrollRatio: js.UndefOr[Double] = js.native
  
  var centered: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var direction: js.UndefOr[horizontal | vertical] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var fullscreen: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var itemHeight: js.UndefOr[Double | String] = js.native
  
  var itemWidth: js.UndefOr[Double | String] = js.native
  
  var onOverscroll: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPostChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onRefresh: js.UndefOr[js.Function0[Unit]] = js.native
  
  var overscrollable: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var swipeable: js.UndefOr[Boolean] = js.native
}
object HTMLAttributesidclassNameAutoRefresh {
  
  @scala.inline
  def apply(): HTMLAttributesidclassNameAutoRefresh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributesidclassNameAutoRefresh]
  }
  
  @scala.inline
  implicit class HTMLAttributesidclassNameAutoRefreshOps[Self <: HTMLAttributesidclassNameAutoRefresh] (val x: Self) extends AnyVal {
    
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
    def setAnimationOptions(value: AnimationOptions): Self = this.set("animationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationOptions: Self = this.set("animationOptions", js.undefined)
    
    @scala.inline
    def setAutoRefresh(value: Boolean): Self = this.set("autoRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRefresh: Self = this.set("autoRefresh", js.undefined)
    
    @scala.inline
    def setAutoScroll(value: Boolean): Self = this.set("autoScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScroll: Self = this.set("autoScroll", js.undefined)
    
    @scala.inline
    def setAutoScrollRatio(value: Double): Self = this.set("autoScrollRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScrollRatio: Self = this.set("autoScrollRatio", js.undefined)
    
    @scala.inline
    def setCentered(value: Boolean): Self = this.set("centered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDirection(value: horizontal | vertical): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setItemHeight(value: Double | String): Self = this.set("itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemHeight: Self = this.set("itemHeight", js.undefined)
    
    @scala.inline
    def setItemWidth(value: Double | String): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemWidth: Self = this.set("itemWidth", js.undefined)
    
    @scala.inline
    def setOnOverscroll(value: () => Unit): Self = this.set("onOverscroll", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOverscroll: Self = this.set("onOverscroll", js.undefined)
    
    @scala.inline
    def setOnPostChange(value: () => Unit): Self = this.set("onPostChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPostChange: Self = this.set("onPostChange", js.undefined)
    
    @scala.inline
    def setOnRefresh(value: () => Unit): Self = this.set("onRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRefresh: Self = this.set("onRefresh", js.undefined)
    
    @scala.inline
    def setOverscrollable(value: Boolean): Self = this.set("overscrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscrollable: Self = this.set("overscrollable", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSwipeable(value: Boolean): Self = this.set("swipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeable: Self = this.set("swipeable", js.undefined)
  }
}
