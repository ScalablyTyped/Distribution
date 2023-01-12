package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecondsValid extends StObject {
  
  var secondsValid: js.UndefOr[Double] = js.undefined
  
  var voiceChatId: js.UndefOr[Double] = js.undefined
}
object SecondsValid {
  
  inline def apply(): SecondsValid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecondsValid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecondsValid] (val x: Self) extends AnyVal {
    
    inline def setSecondsValid(value: Double): Self = StObject.set(x, "secondsValid", value.asInstanceOf[js.Any])
    
    inline def setSecondsValidUndefined: Self = StObject.set(x, "secondsValid", js.undefined)
    
    inline def setVoiceChatId(value: Double): Self = StObject.set(x, "voiceChatId", value.asInstanceOf[js.Any])
    
    inline def setVoiceChatIdUndefined: Self = StObject.set(x, "voiceChatId", js.undefined)
  }
}
