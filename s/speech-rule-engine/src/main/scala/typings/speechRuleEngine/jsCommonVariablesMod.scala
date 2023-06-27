package typings.speechRuleEngine

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsCommonVariablesMod {
  
  @JSImport("speech-rule-engine/js/common/variables", "Variables")
  @js.native
  open class Variables () extends StObject
  /* static members */
  object Variables {
    
    @JSImport("speech-rule-engine/js/common/variables", "Variables")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/common/variables", "Variables.LOCALES")
    @js.native
    val LOCALES: Map[String, String] = js.native
    
    @JSImport("speech-rule-engine/js/common/variables", "Variables.VERSION")
    @js.native
    val VERSION: String = js.native
    
    @JSImport("speech-rule-engine/js/common/variables", "Variables.WGXpath")
    @js.native
    val WGXpath: String = js.native
    
    inline def ensureLocale(loc: String, `def`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureLocale")(loc.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("speech-rule-engine/js/common/variables", "Variables.mathjaxVersion")
    @js.native
    val mathjaxVersion: String = js.native
    
    @JSImport("speech-rule-engine/js/common/variables", "Variables.url")
    @js.native
    val url: String = js.native
  }
}
