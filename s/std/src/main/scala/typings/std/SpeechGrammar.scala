package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeechGrammar extends StObject {
  
  var src: java.lang.String
  
  var weight: Double
}
object SpeechGrammar {
  
  inline def apply(src: java.lang.String, weight: Double): SpeechGrammar = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechGrammar]
  }
  
  extension [Self <: SpeechGrammar](x: Self) {
    
    inline def setSrc(value: java.lang.String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
