package typings.reactOverlays.anon

import typings.react.mod.SyntheticEvent
import typings.reactOverlays.esmDropdownToggleMod.UseDropdownToggleProps
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-overlays.react-overlays/esm/DropdownToggle.UseDropdownToggleHelpers & {  props :react-overlays.react-overlays/esm/DropdownToggle.UseDropdownToggleProps} */
@js.native
trait UseDropdownToggleHelperspProps extends js.Object {
  
  var props: UseDropdownToggleProps = js.native
  
  var show: Boolean = js.native
  
  var toggle: js.Function2[
    /* nextShow */ Boolean, 
    /* event */ js.UndefOr[(SyntheticEvent[Element, Event]) | Event], 
    Unit
  ] = js.native
}
object UseDropdownToggleHelperspProps {
  
  @scala.inline
  def apply(
    props: UseDropdownToggleProps,
    show: Boolean,
    toggle: (/* nextShow */ Boolean, /* event */ js.UndefOr[(SyntheticEvent[Element, Event]) | Event]) => Unit
  ): UseDropdownToggleHelperspProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], toggle = js.Any.fromFunction2(toggle))
    __obj.asInstanceOf[UseDropdownToggleHelperspProps]
  }
  
  @scala.inline
  implicit class UseDropdownToggleHelperspPropsOps[Self <: UseDropdownToggleHelperspProps] (val x: Self) extends AnyVal {
    
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
    def setProps(value: UseDropdownToggleProps): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggle(
      value: (/* nextShow */ Boolean, /* event */ js.UndefOr[(SyntheticEvent[Element, Event]) | Event]) => Unit
    ): Self = this.set("toggle", js.Any.fromFunction2(value))
  }
}
