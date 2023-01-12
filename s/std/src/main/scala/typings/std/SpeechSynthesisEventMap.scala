package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeechSynthesisEventMap extends StObject {
  
  /* standard dom */
  var voiceschanged: Event
}
object SpeechSynthesisEventMap {
  
  inline def apply(voiceschanged: Event): SpeechSynthesisEventMap = {
    val __obj = js.Dynamic.literal(voiceschanged = voiceschanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpeechSynthesisEventMap] (val x: Self) extends AnyVal {
    
    inline def setVoiceschanged(value: Event): Self = StObject.set(x, "voiceschanged", value.asInstanceOf[js.Any])
  }
}
