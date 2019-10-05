package typings.rmcDashTrigger

import typings.react.reactMod.Component
import typings.rmcDashTrigger.libPropsTypeMod.ITriggerProps
import typings.rmcDashTrigger.rmcDashTriggerMod.TriggerWrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-trigger", JSImport.Namespace)
@js.native
object rmcDashTriggerMod extends js.Object {
  @js.native
  trait TriggerWrap
    extends Component[ITriggerProps, js.Any, js.Any] {
    var triggerRef: js.Any = js.native
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MTriggerWrap(nextProps: js.Any): Unit = js.native
    def onClose(): Unit = js.native
    def onTargetClick(): Unit = js.native
    def setPopupVisible(visible: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends TriggerWrap {
    def this(props: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_AfterPopupVisibleChange = js.native
    var displayName: String = js.native
  }
  
}

