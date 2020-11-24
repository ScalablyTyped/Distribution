package typings.rmcFeedback

import typings.react.mod.Component
import typings.rmcFeedback.anon.Active
import typings.rmcFeedback.anon.Disabled
import typings.rmcFeedback.propTypesMod.ITouchProps
import typings.rmcFeedback.propTypesMod.ITouchState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rmc-feedback/lib/TouchFeedback", JSImport.Namespace)
@js.native
object touchFeedbackMod extends js.Object {
  
  @js.native
  trait TouchFeedback
    extends Component[ITouchProps, ITouchState, js.Any] {
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTouchFeedback(): Unit = js.native
    
    def onMouseDown(e: js.Any): Unit = js.native
    
    def onMouseLeave(e: js.Any): Unit = js.native
    
    def onMouseUp(e: js.Any): Unit = js.native
    
    def onTouchCancel(e: js.Any): Unit = js.native
    
    def onTouchEnd(e: js.Any): Unit = js.native
    
    def onTouchMove(e: js.Any): Unit = js.native
    
    def onTouchStart(e: js.Any): Unit = js.native
    
    @JSName("state")
    var state_TouchFeedback: Active = js.native
    
    def triggerEvent(`type`: js.Any, isActive: js.Any, ev: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends TouchFeedback
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: Disabled = js.native
  }
}
