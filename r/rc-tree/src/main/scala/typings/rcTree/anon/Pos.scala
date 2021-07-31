package typings.rcTree.anon

import typings.rcTree.interfaceMod.DataNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pos extends StObject {
  
  var node: DataNode
  
  var pos: String
}
object Pos {
  
  @scala.inline
  def apply(node: DataNode, pos: String): Pos = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pos]
  }
  
  @scala.inline
  implicit class PosMutableBuilder[Self <: Pos] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: DataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
