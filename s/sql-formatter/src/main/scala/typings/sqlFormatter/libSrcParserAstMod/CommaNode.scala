package typings.sqlFormatter.libSrcParserAstMod

import typings.sqlFormatter.libSrcParserAstMod.NodeType.comma
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommaNode
  extends StObject
     with BaseNode
     with AstNode {
  
  var `type`: comma
}
object CommaNode {
  
  inline def apply(`type`: comma): CommaNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommaNode]
  }
  
  extension [Self <: CommaNode](x: Self) {
    
    inline def setType(value: comma): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
