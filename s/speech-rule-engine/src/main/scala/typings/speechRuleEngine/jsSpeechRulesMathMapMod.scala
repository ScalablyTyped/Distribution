package typings.speechRuleEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSpeechRulesMathMapMod {
  
  @JSImport("speech-rule-engine/js/speech_rules/math_map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadLocale(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLocale")().asInstanceOf[js.Promise[String]]
  inline def loadLocale(locale: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def standardLoader(): js.Function1[/* locale */ String, js.Promise[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("standardLoader")().asInstanceOf[js.Function1[/* locale */ String, js.Promise[String]]]
}
