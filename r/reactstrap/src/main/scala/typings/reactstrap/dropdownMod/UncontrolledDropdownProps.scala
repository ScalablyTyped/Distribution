package typings.reactstrap.dropdownMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UncontrolledDropdownProps extends DropdownProps {
  
  var defaultOpen: js.UndefOr[Boolean] = js.native
  
  var onToggle: js.UndefOr[
    js.Function2[
      /* event */ KeyboardEvent[Element] | (MouseEvent[Element, NativeMouseEvent]), 
      /* isOpen */ Boolean, 
      Unit
    ]
  ] = js.native
}
object UncontrolledDropdownProps {
  
  @scala.inline
  def apply(): UncontrolledDropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UncontrolledDropdownProps]
  }
  
  @scala.inline
  implicit class UncontrolledDropdownPropsOps[Self <: UncontrolledDropdownProps] (val x: Self) extends AnyVal {
    
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
    def setDefaultOpen(value: Boolean): Self = this.set("defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOpen: Self = this.set("defaultOpen", js.undefined)
    
    @scala.inline
    def setOnToggle(
      value: (/* event */ KeyboardEvent[Element] | (MouseEvent[Element, NativeMouseEvent]), /* isOpen */ Boolean) => Unit
    ): Self = this.set("onToggle", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
  }
}
