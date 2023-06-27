package typings.speechRuleEngine

import typings.speechRuleEngine.jsAudioXmlRendererMod.XmlRenderer
import typings.speechRuleEngine.jsCommonEngineConstMod.personalityProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAudioSableRendererMod {
  
  @JSImport("speech-rule-engine/js/audio/sable_renderer", "SableRenderer")
  @js.native
  open class SableRenderer () extends XmlRenderer {
    
    def closeTag(tag: String): String = js.native
    
    def prosodyElement(tag: personalityProps, value: Double): String = js.native
  }
}
