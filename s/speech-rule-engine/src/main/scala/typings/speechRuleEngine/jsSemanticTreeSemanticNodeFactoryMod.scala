package typings.speechRuleEngine

import typings.speechRuleEngine.jsSemanticTreeSemanticDefaultMod.SemanticDefault
import typings.speechRuleEngine.jsSemanticTreeSemanticDefaultMod.SemanticNodeCollator
import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticFont
import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticType
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSemanticTreeSemanticNodeFactoryMod {
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_node_factory", "SemanticNodeFactory")
  @js.native
  open class SemanticNodeFactory () extends StObject {
    
    /* private */ var createNode_ : Any = js.native
    
    var defaultMap: SemanticDefault = js.native
    
    /* private */ var idCounter_ : Any = js.native
    
    var leafMap: SemanticNodeCollator = js.native
    
    def makeBranchNode(`type`: SemanticType, children: js.Array[SemanticNode], contentNodes: js.Array[SemanticNode]): SemanticNode = js.native
    def makeBranchNode(
      `type`: SemanticType,
      children: js.Array[SemanticNode],
      contentNodes: js.Array[SemanticNode],
      opt_content: String
    ): SemanticNode = js.native
    
    def makeContentNode(content: String): SemanticNode = js.native
    
    def makeEmptyNode(): SemanticNode = js.native
    
    def makeLeafNode(content: String, font: SemanticFont): SemanticNode = js.native
    
    def makeMultipleContentNodes(num: Double, content: String): js.Array[SemanticNode] = js.native
    
    def makeNode(id: Double): SemanticNode = js.native
    
    def makeUnprocessed(mml: Element): SemanticNode = js.native
  }
}
