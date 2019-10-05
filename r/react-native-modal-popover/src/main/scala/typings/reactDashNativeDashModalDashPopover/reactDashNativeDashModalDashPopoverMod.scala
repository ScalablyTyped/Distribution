package typings.reactDashNativeDashModalDashPopover

import typings.reactDashNativeDashModalDashPopover.libPopoverMod.PopoverProps
import typings.reactDashNativeDashModalDashPopover.libPopoverTouchableMod.Props
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-modal-popover", JSImport.Namespace)
@js.native
object reactDashNativeDashModalDashPopoverMod extends js.Object {
  @js.native
  class Popover protected ()
    extends typings.reactDashNativeDashModalDashPopover.libPopoverMod.Popover {
    def this(props: PopoverProps) = this()
  }
  
  @js.native
  class PopoverController ()
    extends typings.reactDashNativeDashModalDashPopover.libPopoverControllerMod.PopoverController
  
  @js.native
  class PopoverTouchable protected ()
    extends typings.reactDashNativeDashModalDashPopover.libPopoverTouchableMod.PopoverTouchable {
    def this(props: Props) = this()
  }
  
  @js.native
  class default protected ()
    extends typings.reactDashNativeDashModalDashPopover.libPopoverMod.Popover {
    def this(props: PopoverProps) = this()
  }
  
  /* static members */
  @js.native
  object Popover extends js.Object {
    var defaultProps: Partial[PopoverProps] = js.native
    var displayName: String = js.native
    var propTypes: Anon_Args = js.native
  }
  
  /* static members */
  @js.native
  object PopoverController extends js.Object {
    var propTypes: Anon_ArgsChildren = js.native
  }
  
  /* static members */
  @js.native
  object PopoverTouchable extends js.Object {
    var propTypes: Anon_ArgsOnPopoverDisplayed = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Partial[PopoverProps] = js.native
    var displayName: String = js.native
    var propTypes: Anon_Args = js.native
  }
  
}

