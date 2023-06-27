package typings.speechRuleEngine

import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSemanticTreeSemanticUtilMod {
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addAttributes(to: SemanticNode, from: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAttributes")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getEmbellishedInner(node: SemanticNode): SemanticNode = ^.asInstanceOf[js.Dynamic].applyDynamic("getEmbellishedInner")(node.asInstanceOf[js.Any]).asInstanceOf[SemanticNode]
  
  inline def hasDisplayTag(node: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDisplayTag")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasEmptyTag(node: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasEmptyTag")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasIgnoreTag(node: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasIgnoreTag")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasMathTag(node: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMathTag")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isOrphanedGlyph(node: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOrphanedGlyph")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isZeroLength(length: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isZeroLength")(length.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def partitionNodes(nodes: js.Array[SemanticNode], pred: js.Function1[/* p1 */ SemanticNode, Boolean]): Partition = (^.asInstanceOf[js.Dynamic].applyDynamic("partitionNodes")(nodes.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[Partition]
  
  inline def purgeNodes(nodes: js.Array[Element]): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("purgeNodes")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def sliceNodes(nodes: js.Array[SemanticNode], pred: js.Function1[/* p1 */ SemanticNode, Boolean]): Slice = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceNodes")(nodes.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[Slice]
  inline def sliceNodes(
    nodes: js.Array[SemanticNode],
    pred: js.Function1[/* p1 */ SemanticNode, Boolean],
    opt_reverse: Boolean
  ): Slice = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceNodes")(nodes.asInstanceOf[js.Any], pred.asInstanceOf[js.Any], opt_reverse.asInstanceOf[js.Any])).asInstanceOf[Slice]
  
  trait Partition extends StObject {
    
    var comp: js.Array[js.Array[SemanticNode]]
    
    var rel: js.Array[SemanticNode]
  }
  object Partition {
    
    inline def apply(comp: js.Array[js.Array[SemanticNode]], rel: js.Array[SemanticNode]): Partition = {
      val __obj = js.Dynamic.literal(comp = comp.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Partition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Partition] (val x: Self) extends AnyVal {
      
      inline def setComp(value: js.Array[js.Array[SemanticNode]]): Self = StObject.set(x, "comp", value.asInstanceOf[js.Any])
      
      inline def setCompVarargs(value: js.Array[SemanticNode]*): Self = StObject.set(x, "comp", js.Array(value*))
      
      inline def setRel(value: js.Array[SemanticNode]): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelVarargs(value: SemanticNode*): Self = StObject.set(x, "rel", js.Array(value*))
    }
  }
  
  trait Slice extends StObject {
    
    var div: SemanticNode
    
    var head: js.Array[SemanticNode]
    
    var tail: js.Array[SemanticNode]
  }
  object Slice {
    
    inline def apply(div: SemanticNode, head: js.Array[SemanticNode], tail: js.Array[SemanticNode]): Slice = {
      val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], tail = tail.asInstanceOf[js.Any])
      __obj.asInstanceOf[Slice]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Slice] (val x: Self) extends AnyVal {
      
      inline def setDiv(value: SemanticNode): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setHead(value: js.Array[SemanticNode]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadVarargs(value: SemanticNode*): Self = StObject.set(x, "head", js.Array(value*))
      
      inline def setTail(value: js.Array[SemanticNode]): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
      
      inline def setTailVarargs(value: SemanticNode*): Self = StObject.set(x, "tail", js.Array(value*))
    }
  }
}
