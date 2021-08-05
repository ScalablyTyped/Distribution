package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexAccess
  extends StObject
     with BaseASTNode
     with ASTNode
     with Expression {
  
  var base: Expression
  
  var index: Expression
  
  @JSName("type")
  var type_IndexAccess: typings.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess
}
object IndexAccess {
  
  inline def apply(base: Expression, index: Expression): IndexAccess = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IndexAccess")
    __obj.asInstanceOf[IndexAccess]
  }
  
  extension [Self <: IndexAccess](x: Self) {
    
    inline def setBase(value: Expression): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Expression): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
