package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeechSynthesisEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var charIndex: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var charLength: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var elapsedTime: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var name: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var utterance: SpeechSynthesisUtterance
}
object SpeechSynthesisEventInit {
  
  inline def apply(utterance: SpeechSynthesisUtterance): SpeechSynthesisEventInit = {
    val __obj = js.Dynamic.literal(utterance = utterance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpeechSynthesisEventInit] (val x: Self) extends AnyVal {
    
    inline def setCharIndex(value: Double): Self = StObject.set(x, "charIndex", value.asInstanceOf[js.Any])
    
    inline def setCharIndexUndefined: Self = StObject.set(x, "charIndex", js.undefined)
    
    inline def setCharLength(value: Double): Self = StObject.set(x, "charLength", value.asInstanceOf[js.Any])
    
    inline def setCharLengthUndefined: Self = StObject.set(x, "charLength", js.undefined)
    
    inline def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    inline def setElapsedTimeUndefined: Self = StObject.set(x, "elapsedTime", js.undefined)
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUtterance(value: SpeechSynthesisUtterance): Self = StObject.set(x, "utterance", value.asInstanceOf[js.Any])
  }
}
