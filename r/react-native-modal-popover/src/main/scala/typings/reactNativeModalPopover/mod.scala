package typings.reactNativeModalPopover

import typings.reactNativeModalPopover.popoverMod.PopoverProps
import typings.reactNativeModalPopover.popoverTouchableMod.Props
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-modal-popover", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Popover protected ()
    extends typings.reactNativeModalPopover.popoverMod.Popover {
    def this(props: PopoverProps) = this()
  }
  
  @js.native
  class PopoverController ()
    extends typings.reactNativeModalPopover.popoverControllerMod.PopoverController
  
  @js.native
  class PopoverTouchable protected ()
    extends typings.reactNativeModalPopover.popoverTouchableMod.PopoverTouchable {
    def this(props: Props) = this()
  }
  
  @js.native
  class default protected ()
    extends typings.reactNativeModalPopover.popoverMod.Popover {
    def this(props: PopoverProps) = this()
  }
  
  /* static members */
  @js.native
  object Popover extends js.Object {
    var defaultProps: Partial[PopoverProps] = js.native
    var displayName: String = js.native
    var propTypes: AnonArgs = js.native
  }
  
  /* static members */
  @js.native
  object PopoverController extends js.Object {
    var propTypes: AnonArgsChildren = js.native
  }
  
  /* static members */
  @js.native
  object PopoverTouchable extends js.Object {
    var propTypes: AnonArgsOnPopoverDisplayed = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Partial[PopoverProps] = js.native
    var displayName: String = js.native
    var propTypes: AnonArgs = js.native
  }
  
}

