package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechSynthesisEventInit extends EventInit {
  
  var charIndex: js.UndefOr[Double] = js.native
  
  var charLength: js.UndefOr[Double] = js.native
  
  var elapsedTime: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[java.lang.String] = js.native
  
  var utterance: SpeechSynthesisUtterance = js.native
}
object SpeechSynthesisEventInit {
  
  @scala.inline
  def apply(utterance: SpeechSynthesisUtterance): SpeechSynthesisEventInit = {
    val __obj = js.Dynamic.literal(utterance = utterance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisEventInit]
  }
  
  @scala.inline
  implicit class SpeechSynthesisEventInitMutableBuilder[Self <: SpeechSynthesisEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharIndex(value: Double): Self = StObject.set(x, "charIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharIndexUndefined: Self = StObject.set(x, "charIndex", js.undefined)
    
    @scala.inline
    def setCharLength(value: Double): Self = StObject.set(x, "charLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharLengthUndefined: Self = StObject.set(x, "charLength", js.undefined)
    
    @scala.inline
    def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsedTimeUndefined: Self = StObject.set(x, "elapsedTime", js.undefined)
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUtterance(value: SpeechSynthesisUtterance): Self = StObject.set(x, "utterance", value.asInstanceOf[js.Any])
  }
}
