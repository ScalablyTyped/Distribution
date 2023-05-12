package typings.prosemirrorView.anon

import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pos extends StObject {
  
  var node: Text
  
  var pos: Double
  
  var text: String
}
object Pos {
  
  inline def apply(node: Text, pos: Double, text: String): Pos = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pos]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pos] (val x: Self) extends AnyVal {
    
    inline def setNode(value: Text): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
