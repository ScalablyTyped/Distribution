package typings.sqlFormatter.libSrcParserAstMod

import typings.sqlFormatter.libSrcParserAstMod.NodeType.identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentifierNode
  extends StObject
     with BaseNode
     with AstNode {
  
  var text: String
  
  var `type`: identifier
}
object IdentifierNode {
  
  inline def apply(text: String, `type`: identifier): IdentifierNode = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifierNode]
  }
  
  extension [Self <: IdentifierNode](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
