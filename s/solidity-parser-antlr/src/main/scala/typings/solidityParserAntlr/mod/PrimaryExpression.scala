package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.solidityParserAntlr.mod.BooleanLiteral
  - typings.solidityParserAntlr.mod.NumberLiteral
  - typings.solidityParserAntlr.mod.Identifier
  - typings.solidityParserAntlr.mod.TupleExpression
  - typings.solidityParserAntlr.mod.ElementaryTypeNameExpression
*/
trait PrimaryExpression
  extends StObject
     with Expression
object PrimaryExpression {
  
  inline def BooleanLiteral(value: Boolean): typings.solidityParserAntlr.mod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.BooleanLiteral]
  }
  
  inline def ElementaryTypeNameExpression(typeName: ElementaryTypeName): typings.solidityParserAntlr.mod.ElementaryTypeNameExpression = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ElementaryTypeNameExpression")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ElementaryTypeNameExpression]
  }
  
  inline def Identifier(name: String): typings.solidityParserAntlr.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.Identifier]
  }
  
  inline def NumberLiteral(number: String): typings.solidityParserAntlr.mod.NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], subdenomination = null)
    __obj.updateDynamic("type")("NumberLiteral")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.NumberLiteral]
  }
  
  inline def TupleExpression(components: js.Array[Expression], isArray: Boolean): typings.solidityParserAntlr.mod.TupleExpression = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleExpression")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.TupleExpression]
  }
}
