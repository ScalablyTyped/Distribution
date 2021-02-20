package typings.rmcFeedback

import typings.react.mod.Component
import typings.rmcFeedback.anon.Active
import typings.rmcFeedback.anon.Disabled
import typings.rmcFeedback.propTypesMod.ITouchProps
import typings.rmcFeedback.propTypesMod.ITouchState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchFeedbackMod {
  
  @JSImport("rmc-feedback/lib/TouchFeedback", JSImport.Default)
  @js.native
  class default () extends TouchFeedback
  /* static members */
  object default {
    
    @JSImport("rmc-feedback/lib/TouchFeedback", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-feedback/lib/TouchFeedback", "default.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    @scala.inline
    def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
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
}
