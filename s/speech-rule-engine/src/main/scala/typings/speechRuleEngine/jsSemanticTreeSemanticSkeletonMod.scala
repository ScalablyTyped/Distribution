package typings.speechRuleEngine

import org.scalablytyped.runtime.NumberDictionary
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.speechRuleEngine.jsSemanticTreeSemanticTreeMod.SemanticTree
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSemanticTreeSemanticSkeletonMod {
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_skeleton", "SemanticSkeleton")
  @js.native
  open class SemanticSkeleton protected () extends StObject {
    def this(skeleton: Sexp) = this()
    
    var array: Sexp = js.native
    
    def directChildren(id: Double): js.Array[Double] = js.native
    
    def isRoot(id: Double): Boolean = js.native
    
    var levelsMap: NumberDictionary[js.Array[Sexp]] = js.native
    
    var parents: NumberDictionary[js.Array[Double]] = js.native
    
    def populate(): Unit = js.native
    
    /* private */ var populate_ : Any = js.native
    
    def subtreeNodes(id: Double): js.Array[Double] = js.native
  }
  /* static members */
  object SemanticSkeleton {
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_skeleton", "SemanticSkeleton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_skeleton", "SemanticSkeleton.addAria")
    @js.native
    def addAria: Any = js.native
    inline def addAria_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addAria")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_skeleton", "SemanticSkeleton.addOwns_")
    @js.native
    def addOwns_ : Any = js.native
    inline def addOwns__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addOwns_")(x.asInstanceOf[js.Any])
    
    inline def collapsedLeafs(args: Sexp*): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("collapsedLeafs")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Double]]
    
    inline def combineContentChildren[T](semantic: SemanticNode, content: js.Array[T], children: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineContentChildren")(semantic.asInstanceOf[js.Any], content.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def contentCollapseStructure(strct: Sexp): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contentCollapseStructure")(strct.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def fromNode(node: SemanticNode): SemanticSkeleton = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNode")(node.asInstanceOf[js.Any]).asInstanceOf[SemanticSkeleton]
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_skeleton", "SemanticSkeleton.fromNode_")
    @js.native
    def fromNode_ : Any = js.native
    inline def fromNode__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromNode_")(x.asInstanceOf[js.Any])
    
    inline def fromString(skel: String): SemanticSkeleton = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(skel.asInstanceOf[js.Any]).asInstanceOf[SemanticSkeleton]
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_skeleton", "SemanticSkeleton.fromString_")
    @js.native
    def fromString_ : Any = js.native
    inline def fromString__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromString_")(x.asInstanceOf[js.Any])
    
    inline def fromStructure(mml: Element, tree: SemanticTree): SemanticSkeleton = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStructure")(mml.asInstanceOf[js.Any], tree.asInstanceOf[js.Any])).asInstanceOf[SemanticSkeleton]
    
    inline def fromTree(tree: SemanticTree): SemanticSkeleton = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTree")(tree.asInstanceOf[js.Any]).asInstanceOf[SemanticSkeleton]
    
    inline def interleaveIds(first: Sexp, second: Sexp): Sexp = (^.asInstanceOf[js.Dynamic].applyDynamic("interleaveIds")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[Sexp]
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_skeleton", "SemanticSkeleton.makeSexp_")
    @js.native
    def makeSexp_ : Any = js.native
    inline def makeSexp__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeSexp_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_skeleton", "SemanticSkeleton.realLeafs_")
    @js.native
    def realLeafs_ : Any = js.native
    inline def realLeafs__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("realLeafs_")(x.asInstanceOf[js.Any])
    
    inline def simpleCollapseStructure(strct: Sexp): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleCollapseStructure")(strct.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("speech-rule-engine/js/semantic_tree/semantic_skeleton", "SemanticSkeleton.tree_")
    @js.native
    def tree_ : Any = js.native
    inline def tree__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tree_")(x.asInstanceOf[js.Any])
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Sexp = number | std.Array<speech-rule-engine.speech-rule-engine/js/semantic_tree/semantic_skeleton.Sexp>
  }}}
  to avoid circular code involving: 
  - speech-rule-engine.speech-rule-engine/js/semantic_tree/semantic_skeleton.Sexp
  */
  type Sexp = Double | js.Array[Any]
}
