package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.solidityParserAntlr.mod.Identifier
  - typings.solidityParserAntlr.mod.AssemblyBlock
  - typings.solidityParserAntlr.mod.AssemblyExpression
  - typings.solidityParserAntlr.mod.AssemblyLocalDefinition
  - typings.solidityParserAntlr.mod.AssemblyAssignment
  - typings.solidityParserAntlr.mod.AssemblyStackAssignment
  - typings.solidityParserAntlr.mod.LabelDefinition
  - typings.solidityParserAntlr.mod.AssemblySwitch
  - typings.solidityParserAntlr.mod.AssemblyFunctionDefinition
  - typings.solidityParserAntlr.mod.AssemblyFor
  - typings.solidityParserAntlr.mod.AssemblyIf
  - typings.solidityParserAntlr.mod.Break
  - typings.solidityParserAntlr.mod.Continue
  - typings.solidityParserAntlr.mod.SubAssembly
  - typings.solidityParserAntlr.mod.NumberLiteral
  - typings.solidityParserAntlr.mod.StringLiteral
  - typings.solidityParserAntlr.mod.HexNumber
  - typings.solidityParserAntlr.mod.HexLiteral
  - typings.solidityParserAntlr.mod.DecimalNumber
*/
trait AssemblyItem
  extends StObject
     with ASTNode
object AssemblyItem {
  
  @scala.inline
  def AssemblyAssignment(expression: AssemblyExpression, names: js.Array[Identifier]): typings.solidityParserAntlr.mod.AssemblyAssignment = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssemblyAssignment")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyAssignment]
  }
  
  @scala.inline
  def AssemblyBlock(operations: js.Array[AssemblyItem]): typings.solidityParserAntlr.mod.AssemblyBlock = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssemblyBlock")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyBlock]
  }
  
  @scala.inline
  def AssemblyCall(arguments: js.Array[AssemblyExpression], functionName: String): typings.solidityParserAntlr.mod.AssemblyCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssemblyCall")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyCall]
  }
  
  @scala.inline
  def AssemblyFor(): typings.solidityParserAntlr.mod.AssemblyFor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyFor")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyFor]
  }
  
  @scala.inline
  def AssemblyFunctionDefinition(): typings.solidityParserAntlr.mod.AssemblyFunctionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyFunctionDefinition")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyFunctionDefinition]
  }
  
  @scala.inline
  def AssemblyIf(): typings.solidityParserAntlr.mod.AssemblyIf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyIf")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyIf]
  }
  
  @scala.inline
  def AssemblyLiteral(): typings.solidityParserAntlr.mod.AssemblyLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyLiteral")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyLiteral]
  }
  
  @scala.inline
  def AssemblyLocalDefinition(): typings.solidityParserAntlr.mod.AssemblyLocalDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyLocalDefinition")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyLocalDefinition]
  }
  
  @scala.inline
  def AssemblyStackAssignment(): typings.solidityParserAntlr.mod.AssemblyStackAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyStackAssignment")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyStackAssignment]
  }
  
  @scala.inline
  def AssemblySwitch(): typings.solidityParserAntlr.mod.AssemblySwitch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblySwitch")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblySwitch]
  }
  
  @scala.inline
  def Break(): typings.solidityParserAntlr.mod.Break = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Break")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.Break]
  }
  
  @scala.inline
  def Continue(): typings.solidityParserAntlr.mod.Continue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Continue")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.Continue]
  }
  
  @scala.inline
  def DecimalNumber(value: String): typings.solidityParserAntlr.mod.DecimalNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DecimalNumber")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.DecimalNumber]
  }
  
  @scala.inline
  def HexLiteral(value: String): typings.solidityParserAntlr.mod.HexLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("HexLiteral")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.HexLiteral]
  }
  
  @scala.inline
  def HexNumber(value: String): typings.solidityParserAntlr.mod.HexNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("HexNumber")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.HexNumber]
  }
  
  @scala.inline
  def Identifier(name: String): typings.solidityParserAntlr.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.Identifier]
  }
  
  @scala.inline
  def LabelDefinition(): typings.solidityParserAntlr.mod.LabelDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("LabelDefinition")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.LabelDefinition]
  }
  
  @scala.inline
  def NumberLiteral(number: String): typings.solidityParserAntlr.mod.NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], subdenomination = null)
    __obj.updateDynamic("type")("NumberLiteral")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.NumberLiteral]
  }
  
  @scala.inline
  def StringLiteral(value: String): typings.solidityParserAntlr.mod.StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.StringLiteral]
  }
  
  @scala.inline
  def SubAssembly(): typings.solidityParserAntlr.mod.SubAssembly = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("SubAssembly")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.SubAssembly]
  }
}
