package typings.speechRuleEngine

import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticMeaning
import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticSecondary
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSemanticTreeSemanticAttrMod {
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_attr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object NamedSymbol {
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_attr", "NamedSymbol.functionApplication")
    @js.native
    val functionApplication: String = js.native
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_attr", "NamedSymbol.invisibleComma")
    @js.native
    val invisibleComma: String = js.native
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_attr", "NamedSymbol.invisiblePlus")
    @js.native
    val invisiblePlus: String = js.native
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_attr", "NamedSymbol.invisibleTimes")
    @js.native
    val invisibleTimes: String = js.native
  }
  
  object SemanticMap {
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_attr", "SemanticMap.FencesHoriz")
    @js.native
    val FencesHoriz: Map[Any, Any] = js.native
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_attr", "SemanticMap.FencesVert")
    @js.native
    val FencesVert: Map[Any, Any] = js.native
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_attr", "SemanticMap.Meaning")
    @js.native
    val Meaning: meaningMap = js.native
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_attr", "SemanticMap.Secondary")
    @js.native
    val Secondary: secondaryMap = js.native
  }
  
  inline def addFunctionSemantic(base: String, names: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addFunctionSemantic")(base.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def equal(meaning1: SemanticMeaning, meaning2: SemanticMeaning): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(meaning1.asInstanceOf[js.Any], meaning2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isMatchingFence(open: String, close: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingFence")(open.asInstanceOf[js.Any], close.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @js.native
  trait meaningMap
    extends StObject
       with Map[String, SemanticMeaning]
  
  @js.native
  trait secondaryMap
    extends StObject
       with Map[String, String] {
    
    def get(char: String, kind: SemanticSecondary): String = js.native
    
    def has(char: String, kind: SemanticSecondary): Boolean = js.native
    
    /* private */ var secKey: Any = js.native
    
    def set(char: String, kind: SemanticSecondary): this.type = js.native
    def set(char: String, kind: SemanticSecondary, annotation: String): this.type = js.native
  }
}
