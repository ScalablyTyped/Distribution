package typings.reactDevtoolsInline.commonsMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitTree extends StObject {
  
  var nodes: Map[Double, CommitTreeNode]
  
  var rootID: Double
}
object CommitTree {
  
  inline def apply(nodes: Map[Double, CommitTreeNode], rootID: Double): CommitTree = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], rootID = rootID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitTree]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitTree] (val x: Self) extends AnyVal {
    
    inline def setNodes(value: Map[Double, CommitTreeNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setRootID(value: Double): Self = StObject.set(x, "rootID", value.asInstanceOf[js.Any])
  }
}
