package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsRuleEngineDynamicCstrMod {
  
  @js.native
  sealed trait Axis extends StObject
  @JSImport("speech-rule-engine/js/rule_engine/dynamic_cstr", "Axis")
  @js.native
  object Axis extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Axis & String] = js.native
    
    @js.native
    sealed trait DOMAIN
      extends StObject
         with Axis
    /* "domain" */ val DOMAIN: typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.Axis.DOMAIN & String = js.native
    
    @js.native
    sealed trait LOCALE
      extends StObject
         with Axis
    /* "locale" */ val LOCALE: typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.Axis.LOCALE & String = js.native
    
    @js.native
    sealed trait MODALITY
      extends StObject
         with Axis
    /* "modality" */ val MODALITY: typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.Axis.MODALITY & String = js.native
    
    @js.native
    sealed trait STYLE
      extends StObject
         with Axis
    /* "style" */ val STYLE: typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.Axis.STYLE & String = js.native
    
    @js.native
    sealed trait TOPIC
      extends StObject
         with Axis
    /* "topic" */ val TOPIC: typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.Axis.TOPIC & String = js.native
  }
  
  @JSImport("speech-rule-engine/js/rule_engine/dynamic_cstr", "DefaultComparator")
  @js.native
  open class DefaultComparator protected ()
    extends StObject
       with Comparator {
    def this(reference: DynamicCstr) = this()
    def this(reference: DynamicCstr, fallback: DynamicProperties) = this()
    
    /* private */ var fallback: Any = js.native
    
    /* private */ var order: Any = js.native
    
    /* private */ var reference: Any = js.native
  }
  
  @JSImport("speech-rule-engine/js/rule_engine/dynamic_cstr", "DynamicCstr")
  @js.native
  open class DynamicCstr protected () extends DynamicProperties {
    def this(components_ : AxisMap) = this()
    def this(components_ : AxisMap, order: AxisOrder) = this()
    
    /* private */ var components: Any = js.native
    
    def equal(cstr: DynamicCstr): Boolean = js.native
    
    def getComponents(): AxisMap = js.native
    
    def getValue(key: Axis): String = js.native
    
    def getValues(): js.Array[String] = js.native
  }
  /* static members */
  object DynamicCstr {
    
    @JSImport("speech-rule-engine/js/rule_engine/dynamic_cstr", "DynamicCstr")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/rule_engine/dynamic_cstr", "DynamicCstr.BASE_LOCALE")
    @js.native
    def BASE_LOCALE: String = js.native
    inline def BASE_LOCALE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE_LOCALE")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/rule_engine/dynamic_cstr", "DynamicCstr.DEFAULT_ORDER")
    @js.native
    def DEFAULT_ORDER: AxisOrder = js.native
    inline def DEFAULT_ORDER_=(x: AxisOrder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ORDER")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/rule_engine/dynamic_cstr", "DynamicCstr.DEFAULT_VALUE")
    @js.native
    def DEFAULT_VALUE: String = js.native
    
    @JSImport("speech-rule-engine/js/rule_engine/dynamic_cstr", "DynamicCstr.DEFAULT_VALUES")
    @js.native
    def DEFAULT_VALUES: AxisMap = js.native
    inline def DEFAULT_VALUES_=(x: AxisMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_VALUES")(x.asInstanceOf[js.Any])
    
    inline def DEFAULT_VALUE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_VALUE")(x.asInstanceOf[js.Any])
    
    inline def createCstr(cstrList: String*): DynamicCstr = ^.asInstanceOf[js.Dynamic].applyDynamic("createCstr")(cstrList.asInstanceOf[Seq[js.Any]]*).asInstanceOf[DynamicCstr]
    
    inline def defaultCstr(): DynamicCstr = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultCstr")().asInstanceOf[DynamicCstr]
    
    inline def validOrder(order: AxisOrder): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validOrder")(order.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("speech-rule-engine/js/rule_engine/dynamic_cstr", "DynamicCstrParser")
  @js.native
  open class DynamicCstrParser protected () extends StObject {
    def this(order: AxisOrder) = this()
    
    /* private */ var order: Any = js.native
    
    def parse(str: String): DynamicCstr = js.native
  }
  
  @JSImport("speech-rule-engine/js/rule_engine/dynamic_cstr", "DynamicProperties")
  @js.native
  open class DynamicProperties protected () extends StObject {
    def this(properties: AxisProperties) = this()
    def this(properties: AxisProperties, order: AxisOrder) = this()
    
    def allProperties(): js.Array[js.Array[String]] = js.native
    
    def getAxes(): AxisOrder = js.native
    
    def getOrder(): AxisOrder = js.native
    
    def getProperties(): AxisProperties = js.native
    
    def getProperty(key: Axis): js.Array[String] = js.native
    
    /* protected */ var order: AxisOrder = js.native
    
    /* private */ var properties: Any = js.native
    
    def updateProperties(props: AxisProperties): Unit = js.native
  }
  /* static members */
  object DynamicProperties {
    
    @JSImport("speech-rule-engine/js/rule_engine/dynamic_cstr", "DynamicProperties")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createProp(cstrList: js.Array[String]*): DynamicProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("createProp")(cstrList.asInstanceOf[Seq[js.Any]]*).asInstanceOf[DynamicProperties]
  }
  
  type AxisMap = StringDictionary[String]
  
  type AxisOrder = js.Array[Axis]
  
  type AxisProperties = StringDictionary[js.Array[String]]
  
  @js.native
  trait Comparator extends StObject {
    
    def compare(cstr1: DynamicCstr, cstr2: DynamicCstr): Double = js.native
    
    def getReference(): DynamicCstr = js.native
    
    def `match`(cstr: DynamicCstr): Boolean = js.native
    
    def setReference(cstr: DynamicCstr): Unit = js.native
    def setReference(cstr: DynamicCstr, opt_props: DynamicProperties): Unit = js.native
  }
}
