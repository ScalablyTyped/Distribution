package typings.reactOverlays.dropdownToggleMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseDropdownToggleHelpers extends js.Object {
  
  var show: Boolean = js.native
  
  var toggle: js.Function2[
    /* nextShow */ Boolean, 
    /* event */ js.UndefOr[(SyntheticEvent[Element, Event]) | Event], 
    Unit
  ] = js.native
}
object UseDropdownToggleHelpers {
  
  @scala.inline
  def apply(
    show: Boolean,
    toggle: (/* nextShow */ Boolean, /* event */ js.UndefOr[(SyntheticEvent[Element, Event]) | Event]) => Unit
  ): UseDropdownToggleHelpers = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any], toggle = js.Any.fromFunction2(toggle))
    __obj.asInstanceOf[UseDropdownToggleHelpers]
  }
  
  @scala.inline
  implicit class UseDropdownToggleHelpersOps[Self <: UseDropdownToggleHelpers] (val x: Self) extends AnyVal {
    
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
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggle(
      value: (/* nextShow */ Boolean, /* event */ js.UndefOr[(SyntheticEvent[Element, Event]) | Event]) => Unit
    ): Self = this.set("toggle", js.Any.fromFunction2(value))
  }
}
