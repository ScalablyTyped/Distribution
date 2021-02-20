package typings.reactOverlays.anon

import typings.react.mod.SyntheticEvent
import typings.reactOverlays.esmDropdownToggleMod.UseDropdownToggleProps
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-overlays.react-overlays/esm/DropdownToggle.UseDropdownToggleHelpers & {  props :react-overlays.react-overlays/esm/DropdownToggle.UseDropdownToggleProps} */
@js.native
trait UseDropdownToggleHelperspProps extends StObject {
  
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
  implicit class UseDropdownToggleHelperspPropsMutableBuilder[Self <: UseDropdownToggleHelperspProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: UseDropdownToggleProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggle(
      value: (/* nextShow */ Boolean, /* event */ js.UndefOr[(SyntheticEvent[Element, Event]) | Event]) => Unit
    ): Self = StObject.set(x, "toggle", js.Any.fromFunction2(value))
  }
}
