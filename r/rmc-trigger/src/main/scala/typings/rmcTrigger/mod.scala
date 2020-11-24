package typings.rmcTrigger

import typings.react.mod.Component
import typings.rmcTrigger.anon.AfterPopupVisibleChange
import typings.rmcTrigger.propsTypeMod.ITriggerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rmc-trigger", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  trait TriggerWrap
    extends Component[ITriggerProps, js.Any, js.Any] {
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MTriggerWrap(nextProps: js.Any): Unit = js.native
    
    def onClose(): Unit = js.native
    
    def onTargetClick(): Unit = js.native
    
    def setPopupVisible(visible: js.Any): Unit = js.native
    
    var triggerRef: js.Any = js.native
  }
  
  @js.native
  class default protected () extends TriggerWrap {
    def this(props: js.Any) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: AfterPopupVisibleChange = js.native
    
    var displayName: String = js.native
  }
}
