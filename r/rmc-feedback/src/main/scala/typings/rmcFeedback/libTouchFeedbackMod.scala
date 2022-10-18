package typings.rmcFeedback

import typings.react.mod.Component
import typings.rmcFeedback.anon.Active
import typings.rmcFeedback.anon.Disabled
import typings.rmcFeedback.libPropTypesMod.ITouchProps
import typings.rmcFeedback.libPropTypesMod.ITouchState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTouchFeedbackMod {
  
  @JSImport("rmc-feedback/lib/TouchFeedback", JSImport.Default)
  @js.native
  open class default () extends TouchFeedback
  /* static members */
  object default {
    
    @JSImport("rmc-feedback/lib/TouchFeedback", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-feedback/lib/TouchFeedback", "default.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    inline def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TouchFeedback extends Component[ITouchProps, ITouchState, Any] {
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTouchFeedback(): Unit = js.native
    
    def onMouseDown(e: Any): Unit = js.native
    
    def onMouseLeave(e: Any): Unit = js.native
    
    def onMouseUp(e: Any): Unit = js.native
    
    def onTouchCancel(e: Any): Unit = js.native
    
    def onTouchEnd(e: Any): Unit = js.native
    
    def onTouchMove(e: Any): Unit = js.native
    
    def onTouchStart(e: Any): Unit = js.native
    
    @JSName("state")
    var state_TouchFeedback: Active = js.native
    
    def triggerEvent(`type`: Any, isActive: Any, ev: Any): Unit = js.native
  }
}
