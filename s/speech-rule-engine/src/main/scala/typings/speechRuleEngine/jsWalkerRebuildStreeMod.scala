package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticRole
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeFactoryMod.SemanticNodeFactory
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.speechRuleEngine.jsSemanticTreeSemanticSkeletonMod.Sexp
import typings.speechRuleEngine.jsSemanticTreeSemanticTreeMod.SemanticTree
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsWalkerRebuildStreeMod {
  
  @JSImport("speech-rule-engine/js/walker/rebuild_stree", "RebuildStree")
  @js.native
  open class RebuildStree protected () extends StObject {
    def this(mathml: Element) = this()
    
    def assembleTree(node: Element): SemanticNode = js.native
    
    /* private */ var collapsedChildren_ : Any = js.native
    
    def createNode(id: Double): SemanticNode = js.native
    
    var factory: SemanticNodeFactory = js.native
    
    def getTree(): SemanticTree = js.native
    
    def makeEmpty(snode: SemanticNode, collapsed: Double, role: SemanticRole): Unit = js.native
    
    def makeIndex(snode: SemanticNode, collapsed: Sexp, role: SemanticRole): Unit = js.native
    
    def makeNode(node: Element): SemanticNode = js.native
    
    def makePunctuated(snode: SemanticNode, collapsed: Any, role: SemanticRole): Unit = js.native
    
    def makePunctuation(id: Double): SemanticNode = js.native
    
    var mathml: Element = js.native
    
    var mmlRoot: Element = js.native
    
    var nodeDict: StringDictionary[SemanticNode] = js.native
    
    def postProcess(snode: SemanticNode, collapsed: String): SemanticNode = js.native
    
    /* private */ var setParent: Any = js.native
    
    var stree: SemanticTree = js.native
    
    var streeRoot: SemanticNode = js.native
    
    var xml: Element = js.native
  }
  /* static members */
  object RebuildStree {
    
    @JSImport("speech-rule-engine/js/walker/rebuild_stree", "RebuildStree")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isPunctuated(collapsed: Sexp): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPunctuated")(collapsed.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def textContent(snode: SemanticNode, node: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("textContent")(snode.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def textContent(snode: SemanticNode, node: Element, ignore: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("textContent")(snode.asInstanceOf[js.Any], node.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
