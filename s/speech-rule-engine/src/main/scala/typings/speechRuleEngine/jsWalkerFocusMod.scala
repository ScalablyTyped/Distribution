package typings.speechRuleEngine

import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.speechRuleEngine.jsWalkerRebuildStreeMod.RebuildStree
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsWalkerFocusMod {
  
  @JSImport("speech-rule-engine/js/walker/focus", "Focus")
  @js.native
  open class Focus protected () extends StObject {
    def this(nodes: js.Array[SemanticNode], primary: SemanticNode) = this()
    
    /* private */ var allNodes: Any = js.native
    
    /* private */ var domNodes: Any = js.native
    
    /* private */ var domPrimary_ : Any = js.native
    
    def getDomNodes(): js.Array[Element | Null] = js.native
    
    def getDomPrimary(): Element = js.native
    
    def getNodes(): js.Array[Element] = js.native
    
    def getSemanticNodes(): js.Array[SemanticNode] = js.native
    
    def getSemanticPrimary(): SemanticNode = js.native
    
    /* private */ var nodes: Any = js.native
    
    /* private */ var primary: Any = js.native
  }
  /* static members */
  object Focus {
    
    @JSImport("speech-rule-engine/js/walker/focus", "Focus")
    @js.native
    val ^ : js.Any = js.native
    
    inline def factory(primaryId: String, nodeIds: js.Array[String], rebuilt: RebuildStree, dom: Element): Focus = (^.asInstanceOf[js.Dynamic].applyDynamic("factory")(primaryId.asInstanceOf[js.Any], nodeIds.asInstanceOf[js.Any], rebuilt.asInstanceOf[js.Any], dom.asInstanceOf[js.Any])).asInstanceOf[Focus]
    
    @JSImport("speech-rule-engine/js/walker/focus", "Focus.generateAllVisibleNodes_")
    @js.native
    def generateAllVisibleNodes_ : Any = js.native
    inline def generateAllVisibleNodes__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("generateAllVisibleNodes_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/walker/focus", "Focus.getAllVisibleNodes")
    @js.native
    def getAllVisibleNodes: Any = js.native
    inline def getAllVisibleNodes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllVisibleNodes")(x.asInstanceOf[js.Any])
  }
}
