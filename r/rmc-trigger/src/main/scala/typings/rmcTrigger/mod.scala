package typings.rmcTrigger

import typings.react.mod.Component
import typings.rmcTrigger.propsTypeMod.ITriggerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-trigger", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
    var defaultProps: AnonAfterPopupVisibleChange = js.native
    var displayName: String = js.native
  }
  
}

