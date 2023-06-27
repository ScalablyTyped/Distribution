package typings.speechRuleEngine

import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticFont
import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticRole
import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticType
import typings.speechRuleEngine.jsSemanticTreeSemanticTreeMod.SemanticTree
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSemanticTreeSemanticMod {
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTree(mml: Element): SemanticTree = ^.asInstanceOf[js.Dynamic].applyDynamic("getTree")(mml.asInstanceOf[js.Any]).asInstanceOf[SemanticTree]
  
  inline def getTreeFromString(expr: String): SemanticTree = ^.asInstanceOf[js.Dynamic].applyDynamic("getTreeFromString")(expr.asInstanceOf[js.Any]).asInstanceOf[SemanticTree]
  
  inline def xmlTree(mml: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlTree")(mml.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type Attr = Font | Role | Type
  
  type Font = SemanticFont
  
  type Role = SemanticRole
  
  type Type = SemanticType
}
