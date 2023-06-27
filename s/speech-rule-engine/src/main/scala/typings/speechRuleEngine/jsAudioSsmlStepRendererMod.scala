package typings.speechRuleEngine

import typings.speechRuleEngine.jsAudioSsmlRendererMod.SsmlRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAudioSsmlStepRendererMod {
  
  @JSImport("speech-rule-engine/js/audio/ssml_step_renderer", "SsmlStepRenderer")
  @js.native
  open class SsmlStepRenderer () extends SsmlRenderer
  /* static members */
  object SsmlStepRenderer {
    
    @JSImport("speech-rule-engine/js/audio/ssml_step_renderer", "SsmlStepRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/audio/ssml_step_renderer", "SsmlStepRenderer.CHARACTER_ATTR")
    @js.native
    def CHARACTER_ATTR: Any = js.native
    inline def CHARACTER_ATTR_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHARACTER_ATTR")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/audio/ssml_step_renderer", "SsmlStepRenderer.MARKS")
    @js.native
    def MARKS: Any = js.native
    inline def MARKS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARKS")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/audio/ssml_step_renderer", "SsmlStepRenderer.MARK_KIND")
    @js.native
    def MARK_KIND: Boolean = js.native
    inline def MARK_KIND_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARK_KIND")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/audio/ssml_step_renderer", "SsmlStepRenderer.MARK_ONCE")
    @js.native
    def MARK_ONCE: Boolean = js.native
    inline def MARK_ONCE_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARK_ONCE")(x.asInstanceOf[js.Any])
  }
}
