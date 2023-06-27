package typings.speechRuleEngine

import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticFont
import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticMeaning
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSemanticTreeSemanticDefaultMod {
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_default", "SemanticDefault")
  @js.native
  open class SemanticDefault ()
    extends StObject
       with Map[String, SemanticMeaning] {
    
    def get(symbol: String, font: SemanticFont): SemanticMeaning = js.native
    
    def getNode(node: SemanticNode): SemanticMeaning = js.native
    
    def setNode(node: SemanticNode): Unit = js.native
  }
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_default", "SemanticMeaningCollator")
  @js.native
  open class SemanticMeaningCollator ()
    extends StObject
       with SemanticCollator[SemanticMeaning] {
    
    def default(): SemanticDefault = js.native
    
    def newDefault(): SemanticDefault | Null = js.native
    
    def reduce(): Unit = js.native
  }
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_default", "SemanticNodeCollator")
  @js.native
  open class SemanticNodeCollator ()
    extends StObject
       with SemanticCollator[SemanticNode] {
    
    def collateMeaning(): SemanticMeaningCollator = js.native
  }
  
  @js.native
  trait SemanticCollator[T]
    extends StObject
       with Map[String, js.Array[T]] {
    
    def add(symbol: String, entry: T): Unit = js.native
    
    def addNode(node: SemanticNode): Unit = js.native
    
    def get(symbol: String, font: SemanticFont): js.Array[T] = js.native
    
    def getNode(node: SemanticNode): js.Array[T] = js.native
    
    def isMultiValued(): Boolean = js.native
    
    def minimize(): Unit = js.native
  }
}
