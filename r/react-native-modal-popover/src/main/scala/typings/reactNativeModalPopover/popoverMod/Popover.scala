package typings.reactNativeModalPopover.popoverMod

import typings.react.mod.Component
import typings.reactNativeModalPopover.anon.ArrowSize
import typings.reactNativeModalPopover.anon.PartialPopoverProps
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
  var defaultProps: PartialPopoverProps = js.native
  var displayName: String = js.native
  var propTypes: ArrowSize = js.native
}

