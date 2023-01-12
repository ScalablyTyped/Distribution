package typings.solidityParserAntlr.mod

import typings.solidityParserAntlr.solidityParserAntlrStrings.days
import typings.solidityParserAntlr.solidityParserAntlrStrings.ether
import typings.solidityParserAntlr.solidityParserAntlrStrings.finney
import typings.solidityParserAntlr.solidityParserAntlrStrings.hours
import typings.solidityParserAntlr.solidityParserAntlrStrings.minutes
import typings.solidityParserAntlr.solidityParserAntlrStrings.seconds
import typings.solidityParserAntlr.solidityParserAntlrStrings.szabo
import typings.solidityParserAntlr.solidityParserAntlrStrings.weeks
import typings.solidityParserAntlr.solidityParserAntlrStrings.wei
import typings.solidityParserAntlr.solidityParserAntlrStrings.years
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberLiteral
  extends StObject
     with BaseASTNode
     with AssemblyItem
     with PrimaryExpression {
  
  var number: String
  
  var subdenomination: Null | wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years
  
  @JSName("type")
  var type_NumberLiteral: typings.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral
}
object NumberLiteral {
  
  inline def apply(number: String): NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], subdenomination = null)
    __obj.updateDynamic("type")("NumberLiteral")
    __obj.asInstanceOf[NumberLiteral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberLiteral] (val x: Self) extends AnyVal {
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setSubdenomination(value: wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years): Self = StObject.set(x, "subdenomination", value.asInstanceOf[js.Any])
    
    inline def setSubdenominationNull: Self = StObject.set(x, "subdenomination", null)
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
