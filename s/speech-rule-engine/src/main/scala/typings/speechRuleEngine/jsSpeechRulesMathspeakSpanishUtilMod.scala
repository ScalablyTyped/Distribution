package typings.speechRuleEngine

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSpeechRulesMathspeakSpanishUtilMod {
  
  object default {
    
    @JSImport("speech-rule-engine/js/speech_rules/mathspeak_spanish_util", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def ordinalCounter(_node: Element, context: String): js.Function0[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("ordinalCounter")(_node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Function0[String]]
    
    inline def smallRoot(node: Element): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("smallRoot")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  }
}
