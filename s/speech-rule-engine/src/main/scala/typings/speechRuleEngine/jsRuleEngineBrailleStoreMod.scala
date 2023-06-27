package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsRuleEngineMathStoreMod.MathStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsRuleEngineBrailleStoreMod {
  
  @JSImport("speech-rule-engine/js/rule_engine/braille_store", "BrailleStore")
  @js.native
  open class BrailleStore () extends MathStore
  
  @JSImport("speech-rule-engine/js/rule_engine/braille_store", "EuroStore")
  @js.native
  open class EuroStore () extends BrailleStore {
    
    /* protected */ def cleanup(commands: js.Array[String]): js.Array[String] = js.native
    
    var customCommands: StringDictionary[String] = js.native
  }
}
