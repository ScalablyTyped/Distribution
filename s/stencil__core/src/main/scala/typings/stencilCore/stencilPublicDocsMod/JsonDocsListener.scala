package typings.stencilCore.stencilPublicDocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonDocsListener extends StObject {
  
  var capture: Boolean
  
  var event: String
  
  var passive: Boolean
  
  var target: js.UndefOr[String] = js.undefined
}
object JsonDocsListener {
  
  inline def apply(capture: Boolean, event: String, passive: Boolean): JsonDocsListener = {
    val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], passive = passive.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonDocsListener]
  }
  
  extension [Self <: JsonDocsListener](x: Self) {
    
    inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
