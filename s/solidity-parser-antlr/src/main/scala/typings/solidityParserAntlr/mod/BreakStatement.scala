package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakStatement
  extends StObject
     with BaseASTNode
     with ASTNode
     with Statement {
  
  @JSName("type")
  var type_BreakStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement
}
object BreakStatement {
  
  inline def apply(): BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[BreakStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BreakStatement] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
