package typings.sqlFormatter.astMod

import typings.sqlFormatter.astMod.NodeType.literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiteralNode
  extends StObject
     with BaseNode
     with AstNode {
  
  var text: String
  
  var `type`: literal
}
object LiteralNode {
  
  inline def apply(text: String, `type`: literal): LiteralNode = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralNode]
  }
  
  extension [Self <: LiteralNode](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
