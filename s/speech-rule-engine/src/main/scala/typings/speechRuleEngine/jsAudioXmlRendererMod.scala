package typings.speechRuleEngine

import typings.speechRuleEngine.jsAudioMarkupRendererMod.MarkupRenderer
import typings.speechRuleEngine.jsCommonEngineConstMod.personalityProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAudioXmlRendererMod {
  
  /* note: abstract class */ @JSImport("speech-rule-engine/js/audio/xml_renderer", "XmlRenderer")
  @js.native
  open class XmlRenderer () extends MarkupRenderer {
    
    def closeTag(tag: personalityProps): Unit = js.native
  }
}
