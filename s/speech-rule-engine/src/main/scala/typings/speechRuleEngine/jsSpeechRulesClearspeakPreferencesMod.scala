package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.AxisMap
import typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.AxisProperties
import typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.DefaultComparator
import typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.DynamicCstr
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSpeechRulesClearspeakPreferencesMod {
  
  @JSImport("speech-rule-engine/js/speech_rules/clearspeak_preferences", "ClearspeakPreferences")
  @js.native
  open class ClearspeakPreferences protected () extends DynamicCstr {
    def this(cstr: AxisMap, preference: StringDictionary[String]) = this()
    
    def equal(cstr: ClearspeakPreferences): Boolean = js.native
    
    var preference: StringDictionary[String] = js.native
  }
  /* static members */
  object ClearspeakPreferences {
    
    @JSImport("speech-rule-engine/js/speech_rules/clearspeak_preferences", "ClearspeakPreferences")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/speech_rules/clearspeak_preferences", "ClearspeakPreferences.AUTO")
    @js.native
    def AUTO: Any = js.native
    inline def AUTO_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTO")(x.asInstanceOf[js.Any])
    
    inline def addPreference(prefs: String, kind: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addPreference")(prefs.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def comparator(): Comparator = ^.asInstanceOf[js.Dynamic].applyDynamic("comparator")().asInstanceOf[Comparator]
    
    inline def currentPreference(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("currentPreference")().asInstanceOf[String]
    
    inline def findPreference(prefs: String, kind: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("findPreference")(prefs.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def fromPreference(pref: String): AxisMap = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPreference")(pref.asInstanceOf[js.Any]).asInstanceOf[AxisMap]
    
    inline def getLocalePreferences(): StringDictionary[AxisProperties] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalePreferences")().asInstanceOf[StringDictionary[AxisProperties]]
    inline def getLocalePreferences(opt_dynamic: StringDictionary[AxisProperties]): StringDictionary[AxisProperties] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalePreferences")(opt_dynamic.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[AxisProperties]]
    
    @JSImport("speech-rule-engine/js/speech_rules/clearspeak_preferences", "ClearspeakPreferences.getLocalePreferences_")
    @js.native
    def getLocalePreferences_ : Any = js.native
    inline def getLocalePreferences__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getLocalePreferences_")(x.asInstanceOf[js.Any])
    
    inline def relevantPreferences(node: SemanticNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("relevantPreferences")(node.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toPreference(pref: AxisMap): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toPreference")(pref.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @js.native
  trait Comparator extends DefaultComparator {
    
    var preference: AxisMap = js.native
  }
}
