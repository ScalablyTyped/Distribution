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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberLiteral
  extends PrimaryExpression
     with BaseASTNode
     with AssemblyItem {
  
  var number: String = js.native
  
  var subdenomination: Null | wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years = js.native
  
  @JSName("type")
  var type_NumberLiteral: typings.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral = js.native
}
object NumberLiteral {
  
  @scala.inline
  def apply(number: String, `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral): NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberLiteral]
  }
  
  @scala.inline
  implicit class NumberLiteralMutableBuilder[Self <: NumberLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdenomination(value: wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years): Self = StObject.set(x, "subdenomination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdenominationNull: Self = StObject.set(x, "subdenomination", null)
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
