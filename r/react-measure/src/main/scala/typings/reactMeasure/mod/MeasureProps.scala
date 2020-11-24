package typings.reactMeasure.mod

import typings.react.mod.Ref
import typings.react.mod.SFC
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeasureProps extends js.Object {
  
  var bounds: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[SFC[MeasuredComponentProps]] = js.native
  
  var client: js.UndefOr[Boolean] = js.native
  
  var innerRef: js.UndefOr[Ref[Element]] = js.native
  
  var margin: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Boolean] = js.native
  
  var onResize: js.UndefOr[js.Function1[/* contentRect */ ContentRect, Unit]] = js.native
  
  var scroll: js.UndefOr[Boolean] = js.native
}
object MeasureProps {
  
  @scala.inline
  def apply(): MeasureProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureProps]
  }
  
  @scala.inline
  implicit class MeasurePropsOps[Self <: MeasureProps] (val x: Self) extends AnyVal {
    
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
    def setBounds(value: Boolean): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    
    @scala.inline
    def setChildren(value: SFC[MeasuredComponentProps]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClient(value: Boolean): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ Element | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRef(value: Ref[Element]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    
    @scala.inline
    def setMargin(value: Boolean): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setOffset(value: Boolean): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnResize(value: /* contentRect */ ContentRect => Unit): Self = this.set("onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
  }
}
