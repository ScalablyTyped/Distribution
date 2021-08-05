package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionContextCreated extends StObject {
  
  val ExecutionContextCreated: js.Symbol
  
  val ExecutionContextDestroyed: js.Symbol
  
  val FrameAttached: js.Symbol
  
  val FrameDetached: js.Symbol
  
  val FrameNavigated: js.Symbol
  
  val FrameNavigatedWithinDocument: js.Symbol
  
  val LifecycleEvent: js.Symbol
}
object ExecutionContextCreated {
  
  inline def apply(
    ExecutionContextCreated: js.Symbol,
    ExecutionContextDestroyed: js.Symbol,
    FrameAttached: js.Symbol,
    FrameDetached: js.Symbol,
    FrameNavigated: js.Symbol,
    FrameNavigatedWithinDocument: js.Symbol,
    LifecycleEvent: js.Symbol
  ): ExecutionContextCreated = {
    val __obj = js.Dynamic.literal(ExecutionContextCreated = ExecutionContextCreated.asInstanceOf[js.Any], ExecutionContextDestroyed = ExecutionContextDestroyed.asInstanceOf[js.Any], FrameAttached = FrameAttached.asInstanceOf[js.Any], FrameDetached = FrameDetached.asInstanceOf[js.Any], FrameNavigated = FrameNavigated.asInstanceOf[js.Any], FrameNavigatedWithinDocument = FrameNavigatedWithinDocument.asInstanceOf[js.Any], LifecycleEvent = LifecycleEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionContextCreated]
  }
  
  extension [Self <: ExecutionContextCreated](x: Self) {
    
    inline def setExecutionContextCreated(value: js.Symbol): Self = StObject.set(x, "ExecutionContextCreated", value.asInstanceOf[js.Any])
    
    inline def setExecutionContextDestroyed(value: js.Symbol): Self = StObject.set(x, "ExecutionContextDestroyed", value.asInstanceOf[js.Any])
    
    inline def setFrameAttached(value: js.Symbol): Self = StObject.set(x, "FrameAttached", value.asInstanceOf[js.Any])
    
    inline def setFrameDetached(value: js.Symbol): Self = StObject.set(x, "FrameDetached", value.asInstanceOf[js.Any])
    
    inline def setFrameNavigated(value: js.Symbol): Self = StObject.set(x, "FrameNavigated", value.asInstanceOf[js.Any])
    
    inline def setFrameNavigatedWithinDocument(value: js.Symbol): Self = StObject.set(x, "FrameNavigatedWithinDocument", value.asInstanceOf[js.Any])
    
    inline def setLifecycleEvent(value: js.Symbol): Self = StObject.set(x, "LifecycleEvent", value.asInstanceOf[js.Any])
  }
}
