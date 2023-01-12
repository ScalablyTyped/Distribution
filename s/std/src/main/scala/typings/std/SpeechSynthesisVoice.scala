package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Web Speech API interface represents a voice that the system supports. Every SpeechSynthesisVoice has its own relative speech service including information about language, name and URI. */
trait SpeechSynthesisVoice extends StObject {
  
  /* standard dom */
  val default: scala.Boolean
  
  /* standard dom */
  val lang: java.lang.String
  
  /* standard dom */
  val localService: scala.Boolean
  
  /* standard dom */
  val name: java.lang.String
  
  /* standard dom */
  val voiceURI: java.lang.String
}
object SpeechSynthesisVoice {
  
  inline def apply(
    default: scala.Boolean,
    lang: java.lang.String,
    localService: scala.Boolean,
    name: java.lang.String,
    voiceURI: java.lang.String
  ): SpeechSynthesisVoice = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], localService = localService.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], voiceURI = voiceURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisVoice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpeechSynthesisVoice] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: scala.Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setLang(value: java.lang.String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLocalService(value: scala.Boolean): Self = StObject.set(x, "localService", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVoiceURI(value: java.lang.String): Self = StObject.set(x, "voiceURI", value.asInstanceOf[js.Any])
  }
}
