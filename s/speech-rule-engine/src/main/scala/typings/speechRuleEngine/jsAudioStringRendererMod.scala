package typings.speechRuleEngine

import typings.speechRuleEngine.jsAudioAbstractAudioRendererMod.AbstractAudioRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAudioStringRendererMod {
  
  @JSImport("speech-rule-engine/js/audio/string_renderer", "CountingRenderer")
  @js.native
  open class CountingRenderer () extends StringRenderer
  
  @JSImport("speech-rule-engine/js/audio/string_renderer", "StringRenderer")
  @js.native
  open class StringRenderer () extends AbstractAudioRenderer
}
