package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechGrammar extends StObject {
  
  var src: java.lang.String = js.native
  
  var weight: Double = js.native
}
object SpeechGrammar {
  
  @scala.inline
  def apply(src: java.lang.String, weight: Double): SpeechGrammar = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechGrammar]
  }
  
  @scala.inline
  implicit class SpeechGrammarMutableBuilder[Self <: SpeechGrammar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSrc(value: java.lang.String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
