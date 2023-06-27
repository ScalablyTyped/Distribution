package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsCommonEngineSetupMod {
  
  @JSImport("speech-rule-engine/js/common/engine_setup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setup(feature: StringDictionary[Boolean | String]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(feature.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
