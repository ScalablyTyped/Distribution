package typings.reactPopperTooltip

import typings.react.mod.Component
import typings.react.mod.Context
import typings.reactPopperTooltip.typesMod.TooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-popper-tooltip/dist/Tooltip", JSImport.Namespace)
@js.native
object tooltipMod extends js.Object {
  @js.native
  trait Tooltip
    extends Component[TooltipProps, js.Object, js.Any] {
    var addOutsideClickHandler: js.Any = js.native
    var addOutsideRightClickHandler: js.Any = js.native
    var contextValue: js.Any = js.native
    var getArrowProps: js.Any = js.native
    var getTooltipProps: js.Any = js.native
    var getTooltipRef: js.Any = js.native
    var handleOutsideClick: js.UndefOr[js.Any] = js.native
    var handleOutsideRightClick: js.UndefOr[js.Any] = js.native
    var isTriggeredBy: js.Any = js.native
    var observer: js.UndefOr[js.Any] = js.native
    var removeOutsideClickHandler: js.Any = js.native
    var removeOutsideRightClickHandler: js.Any = js.native
    var tooltipRef: js.Any = js.native
    @JSName("componentDidMount")
    def componentDidMount_MTooltip(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTooltip(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTooltip(): Unit = js.native
  }
  
  @js.native
  class default () extends Tooltip
  
  /* static members */
  @js.native
  object default extends js.Object {
    var contextType: Context[js.Object] = js.native
  }
  
}

