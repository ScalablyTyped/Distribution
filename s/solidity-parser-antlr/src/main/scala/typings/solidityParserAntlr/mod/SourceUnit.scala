package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceUnit
  extends StObject
     with BaseASTNode
     with ASTNode {
  
  var children: js.Array[ASTNode]
  
  @JSName("type")
  var type_SourceUnit: typings.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit
}
object SourceUnit {
  
  inline def apply(children: js.Array[ASTNode]): SourceUnit = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SourceUnit")
    __obj.asInstanceOf[SourceUnit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceUnit] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[ASTNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: ASTNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
