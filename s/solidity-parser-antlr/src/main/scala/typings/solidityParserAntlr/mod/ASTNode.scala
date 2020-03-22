package typings.solidityParserAntlr.mod

import typings.solidityParserAntlr.solidityParserAntlrStrings.`private`
import typings.solidityParserAntlr.solidityParserAntlrStrings.constant
import typings.solidityParserAntlr.solidityParserAntlrStrings.days
import typings.solidityParserAntlr.solidityParserAntlrStrings.default
import typings.solidityParserAntlr.solidityParserAntlrStrings.ether
import typings.solidityParserAntlr.solidityParserAntlrStrings.external
import typings.solidityParserAntlr.solidityParserAntlrStrings.finney
import typings.solidityParserAntlr.solidityParserAntlrStrings.hours
import typings.solidityParserAntlr.solidityParserAntlrStrings.internal
import typings.solidityParserAntlr.solidityParserAntlrStrings.minutes
import typings.solidityParserAntlr.solidityParserAntlrStrings.payable
import typings.solidityParserAntlr.solidityParserAntlrStrings.public
import typings.solidityParserAntlr.solidityParserAntlrStrings.pure
import typings.solidityParserAntlr.solidityParserAntlrStrings.seconds
import typings.solidityParserAntlr.solidityParserAntlrStrings.szabo
import typings.solidityParserAntlr.solidityParserAntlrStrings.view
import typings.solidityParserAntlr.solidityParserAntlrStrings.weeks
import typings.solidityParserAntlr.solidityParserAntlrStrings.wei
import typings.solidityParserAntlr.solidityParserAntlrStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait ASTNode extends js.Object

object ASTNode {
  @scala.inline
  def NumberLiteral(
    number: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null,
    subdenomination: wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (subdenomination != null) __obj.updateDynamic("subdenomination")(subdenomination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def IfStatement(
    condition: Expression,
    trueBody: Statement,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.IfStatement,
    falseBody: Statement = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], trueBody = trueBody.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (falseBody != null) __obj.updateDynamic("falseBody")(falseBody.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def TupleExpression(
    components: js.Array[Expression],
    isArray: Boolean,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def StringLiteral(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyCall(
    arguments: js.Array[AssemblyExpression],
    functionName: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ImportDirective(
    path: String,
    symbolAliases: js.Array[js.Tuple2[String, String]],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective,
    unitAlias: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], symbolAliases = symbolAliases.asInstanceOf[js.Any], unitAlias = unitAlias.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def FunctionCall(
    arguments: js.Array[Expression],
    expression: Expression,
    names: js.Array[String],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def PragmaDirective(
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ForStatement(
    body: Statement,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ForStatement,
    conditionExpression: Expression = null,
    initExpression: SimpleStatement = null,
    loc: Location = null,
    loopExpression: ExpressionStatement = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (conditionExpression != null) __obj.updateDynamic("conditionExpression")(conditionExpression.asInstanceOf[js.Any])
    if (initExpression != null) __obj.updateDynamic("initExpression")(initExpression.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (loopExpression != null) __obj.updateDynamic("loopExpression")(loopExpression.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def MemberAccess(
    expression: Expression,
    memberName: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], memberName = memberName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyIf(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyFunctionDefinition(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyLocalDefinition(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def SourceUnit(
    children: js.Array[ASTNode],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Conditional(
    falseExpression: ASTNode,
    trueExpression: ASTNode,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Conditional,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(falseExpression = falseExpression.asInstanceOf[js.Any], trueExpression = trueExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def VariableDeclarationStatement(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement,
    variables: js.Array[ASTNode],
    initialValue: Expression = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyFor(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyStackAssignment(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ThrowStatement(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Mapping(
    keyType: ElementaryTypeName,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Mapping,
    valueType: TypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def InheritanceSpecifier(
    arguments: js.Array[Expression],
    baseName: UserDefinedTypeName,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], baseName = baseName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def EnumValue(
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumValue,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ContinueStatement(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def VariableDeclaration(
    isIndexed: Boolean,
    isStateVar: Boolean,
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration,
    typeName: TypeName,
    expression: Expression = null,
    isDeclaredConst: js.UndefOr[Boolean] = js.undefined,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null,
    storageLocation: String = null,
    visibility: public | `private` | internal | default = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(isIndexed = isIndexed.asInstanceOf[js.Any], isStateVar = isStateVar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (!js.isUndefined(isDeclaredConst)) __obj.updateDynamic("isDeclaredConst")(isDeclaredConst.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (storageLocation != null) __obj.updateDynamic("storageLocation")(storageLocation.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def EmitStatement(
    eventCall: FunctionCall,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(eventCall = eventCall.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def FunctionTypeName(
    parameterTypes: js.Array[TypeName],
    returnTypes: js.Array[TypeName],
    stateMutability: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName,
    visibility: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(parameterTypes = parameterTypes.asInstanceOf[js.Any], returnTypes = returnTypes.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyCase(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ExpressionStatement(
    expression: Expression,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def BreakStatement(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DecimalNumber(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def IndexAccess(
    base: Expression,
    index: Expression,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyAssignment(
    expression: AssemblyExpression,
    names: js.Array[Identifier],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ContractDefinition(
    baseContracts: js.Array[InheritanceSpecifier],
    kind: String,
    name: String,
    subNodes: js.Array[ASTNode],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(baseContracts = baseContracts.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subNodes = subNodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ElementaryTypeNameExpression(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression,
    typeName: ElementaryTypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def InlineAssemblyStatement(
    body: AssemblyBlock,
    language: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def UsingForDeclaration(
    libraryName: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration,
    typeName: TypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(libraryName = libraryName.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DoWhileStatement(
    body: Statement,
    condition: Expression,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def BooleanLiteral(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral,
    value: Boolean,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Continue(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Continue,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyLiteral(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def FunctionDefinition(
    isConstructor: Boolean,
    modifiers: js.Array[ModifierInvocation],
    parameters: js.Array[VariableDeclaration],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition,
    visibility: default | external | internal | public | `private`,
    body: Block = null,
    loc: Location = null,
    name: String = null,
    range: js.Tuple2[Double, Double] = null,
    returnParameters: js.Array[VariableDeclaration] = null,
    stateMutability: pure | constant | payable | view = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(isConstructor = isConstructor.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (returnParameters != null) __obj.updateDynamic("returnParameters")(returnParameters.asInstanceOf[js.Any])
    if (stateMutability != null) __obj.updateDynamic("stateMutability")(stateMutability.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def EventDefinition(
    name: String,
    parameters: js.Array[VariableDeclaration],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Break(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Break,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def HexLiteral(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ReturnStatement(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement,
    expression: Expression = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ElementaryTypeName(
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def WhileStatement(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Identifier(
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Identifier,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyFunctionReturns(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def HexNumber(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.HexNumber,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblySwitch(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ModifierInvocation(
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation,
    arguments: js.Array[Expression] = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def LabelDefinition(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def AssemblyBlock(
    operations: js.Array[AssemblyItem],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def EnumDefinition(
    members: js.Array[EnumValue],
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def Block(
    statements: js.Array[Statement],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Block,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def StructDefinition(
    members: js.Array[VariableDeclaration],
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def UserDefinedTypeName(
    namePath: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ModifierDefinition(
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def SubAssembly(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def StateVariableDeclaration(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration,
    variables: js.Array[VariableDeclaration],
    initialValue: Expression = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def BinaryOperation(
    left: Expression,
    operator: BinOp,
    right: Expression,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ArrayTypeName(
    baseTypeName: TypeName,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName,
    length: Expression = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal(baseTypeName = baseTypeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
}

