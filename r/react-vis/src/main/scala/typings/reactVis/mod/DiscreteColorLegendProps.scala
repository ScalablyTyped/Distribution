package typings.reactVis.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactChild
import typings.reactVis.anon.Color
import typings.reactVis.reactVisStrings.horizontal
import typings.reactVis.reactVisStrings.vertical
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscreteColorLegendProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
   // default: ''
  var items: js.Array[Color | String | ReactChild] = js.native
  
  var onItemClick: js.UndefOr[RVMouseEventHandler] = js.native
  
  var onItemMouseEnter: js.UndefOr[RVItemEventHandler] = js.native
  
  var onItemMouseLeave: js.UndefOr[RVItemEventHandler] = js.native
  
  var orientation: js.UndefOr[vertical | horizontal] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object DiscreteColorLegendProps {
  
  @scala.inline
  def apply(items: js.Array[Color | String | ReactChild]): DiscreteColorLegendProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscreteColorLegendProps]
  }
  
  @scala.inline
  implicit class DiscreteColorLegendPropsOps[Self <: DiscreteColorLegendProps] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: (Color | String | ReactChild)*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Color | String | ReactChild]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setOnItemClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    
    @scala.inline
    def setOnItemMouseEnter(
      value: (/* item */ js.Any, /* index */ Double, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onItemMouseEnter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnItemMouseEnter: Self = this.set("onItemMouseEnter", js.undefined)
    
    @scala.inline
    def setOnItemMouseLeave(
      value: (/* item */ js.Any, /* index */ Double, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onItemMouseLeave", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnItemMouseLeave: Self = this.set("onItemMouseLeave", js.undefined)
    
    @scala.inline
    def setOrientation(value: vertical | horizontal): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
