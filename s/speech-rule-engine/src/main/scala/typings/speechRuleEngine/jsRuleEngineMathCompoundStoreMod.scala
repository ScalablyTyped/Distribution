package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.DynamicCstr
import typings.speechRuleEngine.jsRuleEngineMathSimpleStoreMod.BaseJson
import typings.speechRuleEngine.jsRuleEngineMathSimpleStoreMod.MappingsJson
import typings.speechRuleEngine.jsRuleEngineMathSimpleStoreMod.MathSimpleStore
import typings.speechRuleEngine.jsRuleEngineMathSimpleStoreMod.SiJson
import typings.speechRuleEngine.jsRuleEngineMathSimpleStoreMod.SimpleRule
import typings.speechRuleEngine.jsRuleEngineMathSimpleStoreMod.UnicodeJson
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsRuleEngineMathCompoundStoreMod {
  
  @JSImport("speech-rule-engine/js/rule_engine/math_compound_store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCharacterRules(json: js.Array[UnicodeJson]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCharacterRules")(json.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addFunctionRules(json: js.Array[UnicodeJson]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFunctionRules")(json.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addSymbolRules(json: js.Array[UnicodeJson]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSymbolRules")(json.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addUnitRules(json: js.Array[UnicodeJson]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addUnitRules")(json.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("speech-rule-engine/js/rule_engine/math_compound_store", "baseStores")
  @js.native
  val baseStores: Map[String, BaseJson] = js.native
  
  inline def changeLocale(json: UnicodeJson): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("changeLocale")(json.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def defineRule(domain: String, style: String, str: String, content: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineRule")(domain.asInstanceOf[js.Any], style.asInstanceOf[js.Any], str.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def defineRules(base: String, str: String, mappings: MappingsJson): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineRules")(base.asInstanceOf[js.Any], str.asInstanceOf[js.Any], mappings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enumerate(): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerate")().asInstanceOf[StringDictionary[Any]]
  inline def enumerate(info: StringDictionary[Any]): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerate")(info.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  
  inline def lookupCategory(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupCategory")(character.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def lookupRule(node: String, dynamic: DynamicCstr): SimpleRule = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupRule")(node.asInstanceOf[js.Any], dynamic.asInstanceOf[js.Any])).asInstanceOf[SimpleRule]
  
  inline def lookupString(text: String, dynamic: DynamicCstr): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupString")(text.asInstanceOf[js.Any], dynamic.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  inline def setSiPrefixes(prefixes: SiJson): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSiPrefixes")(prefixes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("speech-rule-engine/js/rule_engine/math_compound_store", "subStores")
  @js.native
  val subStores: Map[String, MathSimpleStore] = js.native
}
