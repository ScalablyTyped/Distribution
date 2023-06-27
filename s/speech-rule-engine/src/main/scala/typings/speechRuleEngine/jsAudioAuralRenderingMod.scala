package typings.speechRuleEngine

import typings.speechRuleEngine.jsAudioAudioRendererMod.AudioRenderer
import typings.speechRuleEngine.jsAudioAuditoryDescriptionMod.AuditoryDescription
import typings.speechRuleEngine.jsAudioSpanMod.Span
import typings.speechRuleEngine.jsCommonEngineConstMod.Markup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAudioAuralRenderingMod {
  
  @JSImport("speech-rule-engine/js/audio/aural_rendering", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def error(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def finalize_(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("finalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSeparator(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeparator")().asInstanceOf[String]
  
  inline def isXml(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isXml")().asInstanceOf[Boolean]
  
  inline def markup(descrs: js.Array[AuditoryDescription]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("markup")(descrs.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def merge(strs: js.Array[Span | String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(strs.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def registerRenderer(`type`: Markup, renderer: AudioRenderer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRenderer")(`type`.asInstanceOf[js.Any], renderer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setSeparator(sep: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSeparator")(sep.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
