package typings.reactScrollspy.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollspyProps extends js.Object {
  
  // ClassName attribute to be passed to the generated <ul /> element
  var className: js.UndefOr[String] = js.native
  
  // HTML tag for Scrollspy component if you want to use other than ul
  var componentTag: js.UndefOr[String | ComponentType[js.Object]] = js.native
  
  // Class name that apply to the navigation element paired with the content element in viewport
  var currentClassName: String = js.native
  
  // Array of target element IDs
  var items: js.Array[String] = js.native
  
  // Offset value that adjusts to determine the elements are in the viewport
  var offset: js.UndefOr[Double] = js.native
  
  // Function to be executed when the active item has been updated
  var onUpdate: js.UndefOr[js.Function1[/* item */ HTMLElement, Unit]] = js.native
  
  // Selector for the element of scrollable container that can be used with querySelector
  var rootEl: js.UndefOr[String] = js.native
  
  // Class name that apply to the navigation elements that have been scrolled past
  var scrolledPastClassName: js.UndefOr[String] = js.native
  
  // Style attribute to be passed to the generated <ul /> element
  var style: js.UndefOr[CSSProperties] = js.native
}
object ScrollspyProps {
  
  @scala.inline
  def apply(currentClassName: String, items: js.Array[String]): ScrollspyProps = {
    val __obj = js.Dynamic.literal(currentClassName = currentClassName.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollspyProps]
  }
  
  @scala.inline
  implicit class ScrollspyPropsOps[Self <: ScrollspyProps] (val x: Self) extends AnyVal {
    
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
    def setCurrentClassName(value: String): Self = this.set("currentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[String]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setComponentTag(value: String | ComponentType[js.Object]): Self = this.set("componentTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentTag: Self = this.set("componentTag", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: /* item */ HTMLElement => Unit): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setRootEl(value: String): Self = this.set("rootEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootEl: Self = this.set("rootEl", js.undefined)
    
    @scala.inline
    def setScrolledPastClassName(value: String): Self = this.set("scrolledPastClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrolledPastClassName: Self = this.set("scrolledPastClassName", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
