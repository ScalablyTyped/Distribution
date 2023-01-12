package typings.rcTree.anon

import typings.rcTree.esInterfaceMod.DataNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  var index: Double
  
  var key: typings.rcTree.esInterfaceMod.Key
  
  var level: Double
  
  var node: DataNode
  
  var nodes: js.Array[DataNode]
  
  var parentPos: String | Double
  
  var pos: String
}
object Index {
  
  inline def apply(
    index: Double,
    key: typings.rcTree.esInterfaceMod.Key,
    level: Double,
    node: DataNode,
    nodes: js.Array[DataNode],
    parentPos: String | Double,
    pos: String
  ): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], parentPos = parentPos.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setKey(value: typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setNode(value: DataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[DataNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: DataNode*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setParentPos(value: String | Double): Self = StObject.set(x, "parentPos", value.asInstanceOf[js.Any])
    
    inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
