package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.`thrown-error`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThrownError extends StObject {
  
  val componentName: js.UndefOr[String] = js.undefined
  
  val message: String
  
  val phase: Phase
  
  val timestamp: Milliseconds
  
  val `type`: `thrown-error`
}
object ThrownError {
  
  inline def apply(message: String, phase: Phase, timestamp: Milliseconds): ThrownError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("thrown-error")
    __obj.asInstanceOf[ThrownError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThrownError] (val x: Self) extends AnyVal {
    
    inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: Phase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Milliseconds): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: `thrown-error`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
