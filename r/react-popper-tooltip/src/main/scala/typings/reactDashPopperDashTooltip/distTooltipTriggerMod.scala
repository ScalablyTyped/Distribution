package typings.reactDashPopperDashTooltip

import typings.react.reactMod.Component
import typings.reactDashPopperDashTooltip.distTypesMod.TooltipTriggerProps
import typings.reactDashPopperDashTooltip.distTypesMod.TooltipTriggerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-popper-tooltip/dist/TooltipTrigger", JSImport.Namespace)
@js.native
object distTooltipTriggerMod extends js.Object {
  @js.native
  trait TooltipTrigger
    extends Component[TooltipTriggerProps, TooltipTriggerState, js.Any] {
    var clearScheduled: js.Any = js.native
    var clickToggle: js.Any = js.native
    var contextMenuToggle: js.Any = js.native
    var getState: js.Any = js.native
    var getTriggerProps: js.Any = js.native
    var hideTimeout: js.UndefOr[js.Any] = js.native
    var hideTooltip: js.Any = js.native
    var isControlled: js.Any = js.native
    var isTriggeredBy: js.Any = js.native
    var popperOffset: js.UndefOr[js.Any] = js.native
    var setTooltipState: js.Any = js.native
    var showTimeout: js.UndefOr[js.Any] = js.native
    var showTooltip: js.Any = js.native
    var toggleTooltip: js.Any = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTooltipTrigger(): Unit = js.native
  }
  
  @js.native
  class default () extends TooltipTrigger
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_CloseOnOutOfBoundaries = js.native
  }
  
}

