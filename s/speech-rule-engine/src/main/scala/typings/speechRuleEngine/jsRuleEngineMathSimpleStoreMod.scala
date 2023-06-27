package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.DynamicCstr
import typings.std.Map
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsRuleEngineMathSimpleStoreMod {
  
  @JSImport("speech-rule-engine/js/rule_engine/math_simple_store", "MathSimpleStore")
  @js.native
  open class MathSimpleStore () extends StObject {
    
    var base: BaseJson = js.native
    
    def defineRuleFromStrings(locale: String, modality: String, domain: String, style: String, content: String): Unit = js.native
    
    def defineRulesFromMappings(locale: String, modality: String, mapping: MappingsJson): Unit = js.native
    
    def getRules(key: String): js.Array[SimpleRule] = js.native
    
    def lookupRule(_node: Node, dynamic: DynamicCstr): SimpleRule = js.native
    
    var rules: Map[String, js.Array[SimpleRule]] = js.native
  }
  /* static members */
  object MathSimpleStore {
    
    @JSImport("speech-rule-engine/js/rule_engine/math_simple_store", "MathSimpleStore")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parseUnicode(num: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUnicode")(num.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("speech-rule-engine/js/rule_engine/math_simple_store", "MathSimpleStore.testDynamicConstraints_")
    @js.native
    def testDynamicConstraints_ : Any = js.native
    inline def testDynamicConstraints__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testDynamicConstraints_")(x.asInstanceOf[js.Any])
  }
  
  trait BaseJson extends StObject {
    
    var category: String
    
    var key: String
    
    var names: js.UndefOr[js.Array[String]] = js.undefined
    
    var si: js.UndefOr[Boolean] = js.undefined
  }
  object BaseJson {
    
    inline def apply(category: String, key: String): BaseJson = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseJson]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseJson] (val x: Self) extends AnyVal {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setSi(value: Boolean): Self = StObject.set(x, "si", value.asInstanceOf[js.Any])
      
      inline def setSiUndefined: Self = StObject.set(x, "si", js.undefined)
    }
  }
  
  trait MappingsJson
    extends StObject
       with /* domainName */ StringDictionary[StringDictionary[String]] {
    
    var default: StringDictionary[String]
  }
  object MappingsJson {
    
    inline def apply(default: StringDictionary[String]): MappingsJson = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[MappingsJson]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MappingsJson] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: StringDictionary[String]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  type SiJson = StringDictionary[String]
  
  trait SimpleRule extends StObject {
    
    var action: String
    
    var cstr: DynamicCstr
  }
  object SimpleRule {
    
    inline def apply(action: String, cstr: DynamicCstr): SimpleRule = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], cstr = cstr.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleRule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleRule] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setCstr(value: DynamicCstr): Self = StObject.set(x, "cstr", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnicodeJson
    extends StObject
       with BaseJson {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var mappings: MappingsJson
    
    var modality: js.UndefOr[String] = js.undefined
  }
  object UnicodeJson {
    
    inline def apply(category: String, key: String, mappings: MappingsJson): UnicodeJson = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnicodeJson]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnicodeJson] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMappings(value: MappingsJson): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setModality(value: String): Self = StObject.set(x, "modality", value.asInstanceOf[js.Any])
      
      inline def setModalityUndefined: Self = StObject.set(x, "modality", js.undefined)
    }
  }
}
