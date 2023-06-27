package typings.speechRuleEngine

import typings.speechRuleEngine.anon.Cayleyshort
import typings.speechRuleEngine.jsAudioXmlRendererMod.XmlRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAudioLayoutRendererMod {
  
  @JSImport("speech-rule-engine/js/audio/layout_renderer", "LayoutRenderer")
  @js.native
  open class LayoutRenderer () extends XmlRenderer {
    
    def closeTag(tag: String): String = js.native
    
    /* private */ var layoutValue: Any = js.native
    
    /* private */ var processContent: Any = js.native
    
    /* private */ var values: Any = js.native
  }
  /* static members */
  object LayoutRenderer {
    
    @JSImport("speech-rule-engine/js/audio/layout_renderer", "LayoutRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/audio/layout_renderer", "LayoutRenderer.options")
    @js.native
    def options: Cayleyshort = js.native
    inline def options_=(x: Cayleyshort): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
}
