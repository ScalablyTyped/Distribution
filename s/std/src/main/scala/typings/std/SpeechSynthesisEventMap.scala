package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechSynthesisEventMap extends StObject {
  
  var voiceschanged: Event = js.native
}
object SpeechSynthesisEventMap {
  
  @scala.inline
  def apply(voiceschanged: Event): SpeechSynthesisEventMap = {
    val __obj = js.Dynamic.literal(voiceschanged = voiceschanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisEventMap]
  }
  
  @scala.inline
  implicit class SpeechSynthesisEventMapMutableBuilder[Self <: SpeechSynthesisEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceschanged(value: Event): Self = StObject.set(x, "voiceschanged", value.asInstanceOf[js.Any])
  }
}
