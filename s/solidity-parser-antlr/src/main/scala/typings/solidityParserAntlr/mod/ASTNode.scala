package typings.solidityParserAntlr.mod

import typings.solidityParserAntlr.solidityParserAntlrStrings.`private`
import typings.solidityParserAntlr.solidityParserAntlrStrings.default
import typings.solidityParserAntlr.solidityParserAntlrStrings.external
import typings.solidityParserAntlr.solidityParserAntlrStrings.internal
import typings.solidityParserAntlr.solidityParserAntlrStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.solidityParserAntlr.mod.SourceUnit
  - typings.solidityParserAntlr.mod.PragmaDirective
  - typings.solidityParserAntlr.mod.ImportDirective
  - typings.solidityParserAntlr.mod.ContractDefinition
  - typings.solidityParserAntlr.mod.InheritanceSpecifier
  - typings.solidityParserAntlr.mod.StateVariableDeclaration
  - typings.solidityParserAntlr.mod.UsingForDeclaration
  - typings.solidityParserAntlr.mod.StructDefinition
  - typings.solidityParserAntlr.mod.ModifierDefinition
  - typings.solidityParserAntlr.mod.ModifierInvocation
  - typings.solidityParserAntlr.mod.FunctionDefinition
  - typings.solidityParserAntlr.mod.EventDefinition
  - typings.solidityParserAntlr.mod.EnumValue
  - typings.solidityParserAntlr.mod.EnumDefinition
  - typings.solidityParserAntlr.mod.VariableDeclaration
  - typings.solidityParserAntlr.mod.TypeName
  - typings.solidityParserAntlr.mod.UserDefinedTypeName
  - typings.solidityParserAntlr.mod.Mapping
  - typings.solidityParserAntlr.mod.FunctionTypeName
  - typings.solidityParserAntlr.mod.Block
  - typings.solidityParserAntlr.mod.ExpressionStatement
  - typings.solidityParserAntlr.mod.IfStatement
  - typings.solidityParserAntlr.mod.WhileStatement
  - typings.solidityParserAntlr.mod.ForStatement
  - typings.solidityParserAntlr.mod.InlineAssemblyStatement
  - typings.solidityParserAntlr.mod.DoWhileStatement
  - typings.solidityParserAntlr.mod.ContinueStatement
  - typings.solidityParserAntlr.mod.BreakStatement
  - typings.solidityParserAntlr.mod.ReturnStatement
  - typings.solidityParserAntlr.mod.EmitStatement
  - typings.solidityParserAntlr.mod.ThrowStatement
  - typings.solidityParserAntlr.mod.VariableDeclarationStatement
  - typings.solidityParserAntlr.mod.ElementaryTypeName
  - typings.solidityParserAntlr.mod.AssemblyBlock
  - typings.solidityParserAntlr.mod.AssemblyCall
  - typings.solidityParserAntlr.mod.AssemblyLocalDefinition
  - typings.solidityParserAntlr.mod.AssemblyAssignment
  - typings.solidityParserAntlr.mod.AssemblyStackAssignment
  - typings.solidityParserAntlr.mod.LabelDefinition
  - typings.solidityParserAntlr.mod.AssemblySwitch
  - typings.solidityParserAntlr.mod.AssemblyCase
  - typings.solidityParserAntlr.mod.AssemblyFunctionDefinition
  - typings.solidityParserAntlr.mod.AssemblyFunctionReturns
  - typings.solidityParserAntlr.mod.AssemblyFor
  - typings.solidityParserAntlr.mod.AssemblyIf
  - typings.solidityParserAntlr.mod.AssemblyLiteral
  - typings.solidityParserAntlr.mod.SubAssembly
  - typings.solidityParserAntlr.mod.TupleExpression
  - typings.solidityParserAntlr.mod.ElementaryTypeNameExpression
  - typings.solidityParserAntlr.mod.BinaryOperation
  - typings.solidityParserAntlr.mod.Conditional
  - typings.solidityParserAntlr.mod.IndexAccess
  - typings.solidityParserAntlr.mod.AssemblyItem
  - typings.solidityParserAntlr.mod.Expression
*/
trait ASTNode extends StObject
object ASTNode {
  
  @scala.inline
  def ArrayTypeName(
    baseTypeName: TypeName,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName
  ): typings.solidityParserAntlr.mod.ArrayTypeName = {
    val __obj = js.Dynamic.literal(baseTypeName = baseTypeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ArrayTypeName]
  }
  
  @scala.inline
  def AssemblyAssignment(
    expression: AssemblyExpression,
    names: js.Array[Identifier],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment
  ): typings.solidityParserAntlr.mod.AssemblyAssignment = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyAssignment]
  }
  
  @scala.inline
  def AssemblyBlock(
    operations: js.Array[AssemblyItem],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock
  ): typings.solidityParserAntlr.mod.AssemblyBlock = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyBlock]
  }
  
  @scala.inline
  def AssemblyCall(
    arguments: js.Array[AssemblyExpression],
    functionName: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall
  ): typings.solidityParserAntlr.mod.AssemblyCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyCall]
  }
  
  @scala.inline
  def AssemblyCase(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase): typings.solidityParserAntlr.mod.AssemblyCase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyCase]
  }
  
  @scala.inline
  def AssemblyFor(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor): typings.solidityParserAntlr.mod.AssemblyFor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyFor]
  }
  
  @scala.inline
  def AssemblyFunctionDefinition(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition): typings.solidityParserAntlr.mod.AssemblyFunctionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyFunctionDefinition]
  }
  
  @scala.inline
  def AssemblyFunctionReturns(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns): typings.solidityParserAntlr.mod.AssemblyFunctionReturns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyFunctionReturns]
  }
  
  @scala.inline
  def AssemblyIf(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf): typings.solidityParserAntlr.mod.AssemblyIf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyIf]
  }
  
  @scala.inline
  def AssemblyLiteral(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral): typings.solidityParserAntlr.mod.AssemblyLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyLiteral]
  }
  
  @scala.inline
  def AssemblyLocalDefinition(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition): typings.solidityParserAntlr.mod.AssemblyLocalDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyLocalDefinition]
  }
  
  @scala.inline
  def AssemblyStackAssignment(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment): typings.solidityParserAntlr.mod.AssemblyStackAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblyStackAssignment]
  }
  
  @scala.inline
  def AssemblySwitch(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch): typings.solidityParserAntlr.mod.AssemblySwitch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.AssemblySwitch]
  }
  
  @scala.inline
  def BinaryOperation(
    left: Expression,
    operator: BinOp,
    right: Expression,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation
  ): typings.solidityParserAntlr.mod.BinaryOperation = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.BinaryOperation]
  }
  
  @scala.inline
  def Block(
    statements: js.Array[Statement],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Block
  ): typings.solidityParserAntlr.mod.Block = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.Block]
  }
  
  @scala.inline
  def BooleanLiteral(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral, value: Boolean): typings.solidityParserAntlr.mod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.BooleanLiteral]
  }
  
  @scala.inline
  def Break(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Break): typings.solidityParserAntlr.mod.Break = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.Break]
  }
  
  @scala.inline
  def BreakStatement(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement): typings.solidityParserAntlr.mod.BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.BreakStatement]
  }
  
  @scala.inline
  def Conditional(
    falseExpression: ASTNode,
    trueExpression: ASTNode,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Conditional
  ): typings.solidityParserAntlr.mod.Conditional = {
    val __obj = js.Dynamic.literal(falseExpression = falseExpression.asInstanceOf[js.Any], trueExpression = trueExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.Conditional]
  }
  
  @scala.inline
  def Continue(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Continue): typings.solidityParserAntlr.mod.Continue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.Continue]
  }
  
  @scala.inline
  def ContinueStatement(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement): typings.solidityParserAntlr.mod.ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ContinueStatement]
  }
  
  @scala.inline
  def ContractDefinition(
    baseContracts: js.Array[InheritanceSpecifier],
    kind: String,
    name: String,
    subNodes: js.Array[ASTNode],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition
  ): typings.solidityParserAntlr.mod.ContractDefinition = {
    val __obj = js.Dynamic.literal(baseContracts = baseContracts.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subNodes = subNodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ContractDefinition]
  }
  
  @scala.inline
  def DecimalNumber(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber, value: String): typings.solidityParserAntlr.mod.DecimalNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.DecimalNumber]
  }
  
  @scala.inline
  def DoWhileStatement(
    body: Statement,
    condition: Expression,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement
  ): typings.solidityParserAntlr.mod.DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.DoWhileStatement]
  }
  
  @scala.inline
  def ElementaryTypeName(name: String, `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName): typings.solidityParserAntlr.mod.ElementaryTypeName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ElementaryTypeName]
  }
  
  @scala.inline
  def ElementaryTypeNameExpression(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression,
    typeName: ElementaryTypeName
  ): typings.solidityParserAntlr.mod.ElementaryTypeNameExpression = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ElementaryTypeNameExpression]
  }
  
  @scala.inline
  def EmitStatement(
    eventCall: FunctionCall,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement
  ): typings.solidityParserAntlr.mod.EmitStatement = {
    val __obj = js.Dynamic.literal(eventCall = eventCall.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.EmitStatement]
  }
  
  @scala.inline
  def EnumDefinition(
    members: js.Array[EnumValue],
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition
  ): typings.solidityParserAntlr.mod.EnumDefinition = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.EnumDefinition]
  }
  
  @scala.inline
  def EnumValue(name: String, `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumValue): typings.solidityParserAntlr.mod.EnumValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.EnumValue]
  }
  
  @scala.inline
  def EventDefinition(
    name: String,
    parameters: js.Array[VariableDeclaration],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition
  ): typings.solidityParserAntlr.mod.EventDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.EventDefinition]
  }
  
  @scala.inline
  def ExpressionStatement(
    expression: Expression,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement
  ): typings.solidityParserAntlr.mod.ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ExpressionStatement]
  }
  
  @scala.inline
  def ForStatement(body: Statement, `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ForStatement): typings.solidityParserAntlr.mod.ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ForStatement]
  }
  
  @scala.inline
  def FunctionCall(
    arguments: js.Array[Expression],
    expression: Expression,
    names: js.Array[String],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall
  ): typings.solidityParserAntlr.mod.FunctionCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.FunctionCall]
  }
  
  @scala.inline
  def FunctionDefinition(
    isConstructor: Boolean,
    modifiers: js.Array[ModifierInvocation],
    parameters: js.Array[VariableDeclaration],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition,
    visibility: default | external | internal | public | `private`
  ): typings.solidityParserAntlr.mod.FunctionDefinition = {
    val __obj = js.Dynamic.literal(isConstructor = isConstructor.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.FunctionDefinition]
  }
  
  @scala.inline
  def FunctionTypeName(
    parameterTypes: js.Array[TypeName],
    returnTypes: js.Array[TypeName],
    stateMutability: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName,
    visibility: String
  ): typings.solidityParserAntlr.mod.FunctionTypeName = {
    val __obj = js.Dynamic.literal(parameterTypes = parameterTypes.asInstanceOf[js.Any], returnTypes = returnTypes.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.FunctionTypeName]
  }
  
  @scala.inline
  def HexLiteral(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral, value: String): typings.solidityParserAntlr.mod.HexLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.HexLiteral]
  }
  
  @scala.inline
  def HexNumber(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.HexNumber, value: String): typings.solidityParserAntlr.mod.HexNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.HexNumber]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Identifier): typings.solidityParserAntlr.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.Identifier]
  }
  
  @scala.inline
  def IfStatement(
    condition: Expression,
    trueBody: Statement,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.IfStatement
  ): typings.solidityParserAntlr.mod.IfStatement = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], trueBody = trueBody.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.IfStatement]
  }
  
  @scala.inline
  def ImportDirective(
    path: String,
    symbolAliases: js.Array[js.Tuple2[String, String]],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective,
    unitAlias: String
  ): typings.solidityParserAntlr.mod.ImportDirective = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], symbolAliases = symbolAliases.asInstanceOf[js.Any], unitAlias = unitAlias.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ImportDirective]
  }
  
  @scala.inline
  def IndexAccess(
    base: Expression,
    index: Expression,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess
  ): typings.solidityParserAntlr.mod.IndexAccess = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.IndexAccess]
  }
  
  @scala.inline
  def InheritanceSpecifier(
    arguments: js.Array[Expression],
    baseName: UserDefinedTypeName,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier
  ): typings.solidityParserAntlr.mod.InheritanceSpecifier = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], baseName = baseName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.InheritanceSpecifier]
  }
  
  @scala.inline
  def InlineAssemblyStatement(
    body: AssemblyBlock,
    language: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement
  ): typings.solidityParserAntlr.mod.InlineAssemblyStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.InlineAssemblyStatement]
  }
  
  @scala.inline
  def LabelDefinition(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition): typings.solidityParserAntlr.mod.LabelDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.LabelDefinition]
  }
  
  @scala.inline
  def Mapping(
    keyType: ElementaryTypeName,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Mapping,
    valueType: TypeName
  ): typings.solidityParserAntlr.mod.Mapping = {
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.Mapping]
  }
  
  @scala.inline
  def MemberAccess(
    expression: Expression,
    memberName: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess
  ): typings.solidityParserAntlr.mod.MemberAccess = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], memberName = memberName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.MemberAccess]
  }
  
  @scala.inline
  def ModifierDefinition(name: String, `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition): typings.solidityParserAntlr.mod.ModifierDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ModifierDefinition]
  }
  
  @scala.inline
  def ModifierInvocation(name: String, `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation): typings.solidityParserAntlr.mod.ModifierInvocation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ModifierInvocation]
  }
  
  @scala.inline
  def NumberLiteral(number: String, `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral): typings.solidityParserAntlr.mod.NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.NumberLiteral]
  }
  
  @scala.inline
  def PragmaDirective(
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective,
    value: String
  ): typings.solidityParserAntlr.mod.PragmaDirective = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.PragmaDirective]
  }
  
  @scala.inline
  def ReturnStatement(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement): typings.solidityParserAntlr.mod.ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ReturnStatement]
  }
  
  @scala.inline
  def SourceUnit(
    children: js.Array[ASTNode],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit
  ): typings.solidityParserAntlr.mod.SourceUnit = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.SourceUnit]
  }
  
  @scala.inline
  def StateVariableDeclaration(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration,
    variables: js.Array[VariableDeclaration]
  ): typings.solidityParserAntlr.mod.StateVariableDeclaration = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.StateVariableDeclaration]
  }
  
  @scala.inline
  def StringLiteral(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral, value: String): typings.solidityParserAntlr.mod.StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.StringLiteral]
  }
  
  @scala.inline
  def StructDefinition(
    members: js.Array[VariableDeclaration],
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition
  ): typings.solidityParserAntlr.mod.StructDefinition = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.StructDefinition]
  }
  
  @scala.inline
  def SubAssembly(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly): typings.solidityParserAntlr.mod.SubAssembly = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.SubAssembly]
  }
  
  @scala.inline
  def ThrowStatement(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement): typings.solidityParserAntlr.mod.ThrowStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ThrowStatement]
  }
  
  @scala.inline
  def TupleExpression(
    components: js.Array[Expression],
    isArray: Boolean,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression
  ): typings.solidityParserAntlr.mod.TupleExpression = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.TupleExpression]
  }
  
  @scala.inline
  def UserDefinedTypeName(
    namePath: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName
  ): typings.solidityParserAntlr.mod.UserDefinedTypeName = {
    val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.UserDefinedTypeName]
  }
  
  @scala.inline
  def UsingForDeclaration(
    libraryName: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration,
    typeName: TypeName
  ): typings.solidityParserAntlr.mod.UsingForDeclaration = {
    val __obj = js.Dynamic.literal(libraryName = libraryName.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.UsingForDeclaration]
  }
  
  @scala.inline
  def VariableDeclaration(
    isIndexed: Boolean,
    isStateVar: Boolean,
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration,
    typeName: TypeName
  ): typings.solidityParserAntlr.mod.VariableDeclaration = {
    val __obj = js.Dynamic.literal(isIndexed = isIndexed.asInstanceOf[js.Any], isStateVar = isStateVar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.VariableDeclaration]
  }
  
  @scala.inline
  def VariableDeclarationStatement(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement,
    variables: js.Array[ASTNode]
  ): typings.solidityParserAntlr.mod.VariableDeclarationStatement = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.VariableDeclarationStatement]
  }
  
  @scala.inline
  def WhileStatement(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement): typings.solidityParserAntlr.mod.WhileStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.WhileStatement]
  }
}
