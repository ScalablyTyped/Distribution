package typings.reactDashNativeDashModalDashPopover.libPopoverMod

import typings.react.reactMod.Component
import typings.reactDashNativeDashModalDashPopover.Anon_Args
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-modal-popover/lib/Popover", "Popover")
@js.native
class Popover protected ()
  extends Component[PopoverProps, PopoverState, js.Any] {
  def this(props: PopoverProps) = this()
  var computeGeometry: js.Any = js.native
  var computeStyles: js.Any = js.native
  var defaultDisplayArea: js.Any = js.native
  var getTranslateOrigin: js.Any = js.native
  var measureContent: js.Any = js.native
  var onHidden: js.Any = js.native
  var onOrientationChange: js.Any = js.native
  var startAnimation: js.Any = js.native
  var updateState: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPopover(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MPopover(nextProps: PopoverProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPopover(): Unit = js.native
}

/* static members */
@JSImport("react-native-modal-popover/lib/Popover", "Popover")
@js.native
object Popover extends js.Object {
  var defaultProps: Partial[PopoverProps] = js.native
  var displayName: String = js.native
  var propTypes: Anon_Args = js.native
}

