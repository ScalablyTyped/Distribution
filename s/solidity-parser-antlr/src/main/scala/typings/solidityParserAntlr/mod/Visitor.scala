package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  var ArrayTypeName: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.ArrayTypeName, _]] = js.undefined
  @JSName("ArrayTypeName:exit")
  var ArrayTypeNameColonexit: js.UndefOr[js.Function1[/* node */ ArrayTypeName, _]] = js.undefined
  var AssemblyAssignment: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.AssemblyAssignment, _]] = js.undefined
  @JSName("AssemblyAssignment:exit")
  var AssemblyAssignmentColonexit: js.UndefOr[js.Function1[/* node */ AssemblyAssignment, _]] = js.undefined
  var AssemblyBlock: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.AssemblyBlock, _]] = js.undefined
  @JSName("AssemblyBlock:exit")
  var AssemblyBlockColonexit: js.UndefOr[js.Function1[/* node */ AssemblyBlock, _]] = js.undefined
  var AssemblyCall: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.AssemblyCall, _]] = js.undefined
  @JSName("AssemblyCall:exit")
  var AssemblyCallColonexit: js.UndefOr[js.Function1[/* node */ AssemblyCall, _]] = js.undefined
  var AssemblyCase: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.AssemblyCase, _]] = js.undefined
  @JSName("AssemblyCase:exit")
  var AssemblyCaseColonexit: js.UndefOr[js.Function1[/* node */ AssemblyCase, _]] = js.undefined
  var AssemblyFor: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.AssemblyFor, _]] = js.undefined
  @JSName("AssemblyFor:exit")
  var AssemblyForColonexit: js.UndefOr[js.Function1[/* node */ AssemblyFor, _]] = js.undefined
  var AssemblyFunctionDefinition: js.UndefOr[
    js.Function1[/* node */ typings.solidityParserAntlr.mod.AssemblyFunctionDefinition, _]
  ] = js.undefined
  @JSName("AssemblyFunctionDefinition:exit")
  var AssemblyFunctionDefinitionColonexit: js.UndefOr[js.Function1[/* node */ AssemblyFunctionDefinition, _]] = js.undefined
  var AssemblyFunctionReturns: js.UndefOr[
    js.Function1[/* node */ typings.solidityParserAntlr.mod.AssemblyFunctionReturns, _]
  ] = js.undefined
  @JSName("AssemblyFunctionReturns:exit")
  var AssemblyFunctionReturnsColonexit: js.UndefOr[js.Function1[/* node */ AssemblyFunctionReturns, _]] = js.undefined
  var AssemblyIf: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.AssemblyIf, _]] = js.undefined
  @JSName("AssemblyIf:exit")
  var AssemblyIfColonexit: js.UndefOr[js.Function1[/* node */ AssemblyIf, _]] = js.undefined
  var AssemblyLiteral: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.AssemblyLiteral, _]] = js.undefined
  @JSName("AssemblyLiteral:exit")
  var AssemblyLiteralColonexit: js.UndefOr[js.Function1[/* node */ AssemblyLiteral, _]] = js.undefined
  var AssemblyLocalDefinition: js.UndefOr[
    js.Function1[/* node */ typings.solidityParserAntlr.mod.AssemblyLocalDefinition, _]
  ] = js.undefined
  @JSName("AssemblyLocalDefinition:exit")
  var AssemblyLocalDefinitionColonexit: js.UndefOr[js.Function1[/* node */ AssemblyLocalDefinition, _]] = js.undefined
  var AssemblyStackAssignment: js.UndefOr[
    js.Function1[/* node */ typings.solidityParserAntlr.mod.AssemblyStackAssignment, _]
  ] = js.undefined
  @JSName("AssemblyStackAssignment:exit")
  var AssemblyStackAssignmentColonexit: js.UndefOr[js.Function1[/* node */ AssemblyStackAssignment, _]] = js.undefined
  var AssemblySwitch: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.AssemblySwitch, _]] = js.undefined
  @JSName("AssemblySwitch:exit")
  var AssemblySwitchColonexit: js.UndefOr[js.Function1[/* node */ AssemblySwitch, _]] = js.undefined
  var BinaryOperation: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.BinaryOperation, _]] = js.undefined
  @JSName("BinaryOperation:exit")
  var BinaryOperationColonexit: js.UndefOr[js.Function1[/* node */ BinaryOperation, _]] = js.undefined
  var Block: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.Block, _]] = js.undefined
  @JSName("Block:exit")
  var BlockColonexit: js.UndefOr[js.Function1[/* node */ Block, _]] = js.undefined
  var BooleanLiteral: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.BooleanLiteral, _]] = js.undefined
  @JSName("BooleanLiteral:exit")
  var BooleanLiteralColonexit: js.UndefOr[js.Function1[/* node */ BooleanLiteral, _]] = js.undefined
  var Break: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.Break, _]] = js.undefined
  @JSName("Break:exit")
  var BreakColonexit: js.UndefOr[js.Function1[/* node */ Break, _]] = js.undefined
  var BreakStatement: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.BreakStatement, _]] = js.undefined
  @JSName("BreakStatement:exit")
  var BreakStatementColonexit: js.UndefOr[js.Function1[/* node */ BreakStatement, _]] = js.undefined
  var Conditional: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.Conditional, _]] = js.undefined
  @JSName("Conditional:exit")
  var ConditionalColonexit: js.UndefOr[js.Function1[/* node */ Conditional, _]] = js.undefined
  var Continue: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.Continue, _]] = js.undefined
  @JSName("Continue:exit")
  var ContinueColonexit: js.UndefOr[js.Function1[/* node */ Continue, _]] = js.undefined
  var ContinueStatement: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.ContinueStatement, _]] = js.undefined
  @JSName("ContinueStatement:exit")
  var ContinueStatementColonexit: js.UndefOr[js.Function1[/* node */ ContinueStatement, _]] = js.undefined
  var ContractDefinition: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.ContractDefinition, _]] = js.undefined
  @JSName("ContractDefinition:exit")
  var ContractDefinitionColonexit: js.UndefOr[js.Function1[/* node */ ContractDefinition, _]] = js.undefined
  var DecimalNumber: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.DecimalNumber, _]] = js.undefined
  @JSName("DecimalNumber:exit")
  var DecimalNumberColonexit: js.UndefOr[js.Function1[/* node */ DecimalNumber, _]] = js.undefined
  var DoWhileStatement: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.DoWhileStatement, _]] = js.undefined
  @JSName("DoWhileStatement:exit")
  var DoWhileStatementColonexit: js.UndefOr[js.Function1[/* node */ DoWhileStatement, _]] = js.undefined
  var ElementaryTypeName: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.ElementaryTypeName, _]] = js.undefined
  @JSName("ElementaryTypeName:exit")
  var ElementaryTypeNameColonexit: js.UndefOr[js.Function1[/* node */ ElementaryTypeName, _]] = js.undefined
  var ElementaryTypeNameExpression: js.UndefOr[
    js.Function1[/* node */ typings.solidityParserAntlr.mod.ElementaryTypeNameExpression, _]
  ] = js.undefined
  @JSName("ElementaryTypeNameExpression:exit")
  var ElementaryTypeNameExpressionColonexit: js.UndefOr[js.Function1[/* node */ ElementaryTypeNameExpression, _]] = js.undefined
  var EmitStatement: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.EmitStatement, _]] = js.undefined
  @JSName("EmitStatement:exit")
  var EmitStatementColonexit: js.UndefOr[js.Function1[/* node */ EmitStatement, _]] = js.undefined
  var EnumDefinition: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.EnumDefinition, _]] = js.undefined
  @JSName("EnumDefinition:exit")
  var EnumDefinitionColonexit: js.UndefOr[js.Function1[/* node */ EnumDefinition, _]] = js.undefined
  var EnumValue: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.EnumValue, _]] = js.undefined
  @JSName("EnumValue:exit")
  var EnumValueColonexit: js.UndefOr[js.Function1[/* node */ EnumValue, _]] = js.undefined
  var EventDefinition: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.EventDefinition, _]] = js.undefined
  @JSName("EventDefinition:exit")
  var EventDefinitionColonexit: js.UndefOr[js.Function1[/* node */ EventDefinition, _]] = js.undefined
  var ExpressionStatement: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.ExpressionStatement, _]] = js.undefined
  @JSName("ExpressionStatement:exit")
  var ExpressionStatementColonexit: js.UndefOr[js.Function1[/* node */ ExpressionStatement, _]] = js.undefined
  var ForStatement: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.ForStatement, _]] = js.undefined
  @JSName("ForStatement:exit")
  var ForStatementColonexit: js.UndefOr[js.Function1[/* node */ ForStatement, _]] = js.undefined
  var FunctionDefinition: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.FunctionDefinition, _]] = js.undefined
  @JSName("FunctionDefinition:exit")
  var FunctionDefinitionColonexit: js.UndefOr[js.Function1[/* node */ FunctionDefinition, _]] = js.undefined
  var FunctionTypeName: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.FunctionTypeName, _]] = js.undefined
  @JSName("FunctionTypeName:exit")
  var FunctionTypeNameColonexit: js.UndefOr[js.Function1[/* node */ FunctionTypeName, _]] = js.undefined
  var HexNumber: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.HexNumber, _]] = js.undefined
  @JSName("HexNumber:exit")
  var HexNumberColonexit: js.UndefOr[js.Function1[/* node */ HexNumber, _]] = js.undefined
  var Identifier: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.Identifier, _]] = js.undefined
  @JSName("Identifier:exit")
  var IdentifierColonexit: js.UndefOr[js.Function1[/* node */ Identifier, _]] = js.undefined
  var IfStatement: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.IfStatement, _]] = js.undefined
  @JSName("IfStatement:exit")
  var IfStatementColonexit: js.UndefOr[js.Function1[/* node */ IfStatement, _]] = js.undefined
  var ImportDirective: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.ImportDirective, _]] = js.undefined
  @JSName("ImportDirective:exit")
  var ImportDirectiveColonexit: js.UndefOr[js.Function1[/* node */ ImportDirective, _]] = js.undefined
  var IndexAccess: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.IndexAccess, _]] = js.undefined
  @JSName("IndexAccess:exit")
  var IndexAccessColonexit: js.UndefOr[js.Function1[/* node */ IndexAccess, _]] = js.undefined
  var InheritanceSpecifier: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.InheritanceSpecifier, _]] = js.undefined
  @JSName("InheritanceSpecifier:exit")
  var InheritanceSpecifierColonexit: js.UndefOr[js.Function1[/* node */ InheritanceSpecifier, _]] = js.undefined
  var InlineAssemblyStatement: js.UndefOr[
    js.Function1[/* node */ typings.solidityParserAntlr.mod.InlineAssemblyStatement, _]
  ] = js.undefined
  @JSName("InlineAssemblyStatement:exit")
  var InlineAssemblyStatementColonexit: js.UndefOr[js.Function1[/* node */ InlineAssemblyStatement, _]] = js.undefined
  var LabelDefinition: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.LabelDefinition, _]] = js.undefined
  @JSName("LabelDefinition:exit")
  var LabelDefinitionColonexit: js.UndefOr[js.Function1[/* node */ LabelDefinition, _]] = js.undefined
  var Mapping: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.Mapping, _]] = js.undefined
  @JSName("Mapping:exit")
  var MappingColonexit: js.UndefOr[js.Function1[/* node */ Mapping, _]] = js.undefined
  var MemberAccess: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.MemberAccess, _]] = js.undefined
  @JSName("MemberAccess:exit")
  var MemberAccessColonexit: js.UndefOr[js.Function1[/* node */ MemberAccess, _]] = js.undefined
  var ModifierDefinition: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.ModifierDefinition, _]] = js.undefined
  @JSName("ModifierDefinition:exit")
  var ModifierDefinitionColonexit: js.UndefOr[js.Function1[/* node */ ModifierDefinition, _]] = js.undefined
  var ModifierInvocation: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.ModifierInvocation, _]] = js.undefined
  @JSName("ModifierInvocation:exit")
  var ModifierInvocationColonexit: js.UndefOr[js.Function1[/* node */ ModifierInvocation, _]] = js.undefined
  var NumberLiteral: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.NumberLiteral, _]] = js.undefined
  @JSName("NumberLiteral:exit")
  var NumberLiteralColonexit: js.UndefOr[js.Function1[/* node */ NumberLiteral, _]] = js.undefined
  var PragmaDirective: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.PragmaDirective, _]] = js.undefined
  @JSName("PragmaDirective:exit")
  var PragmaDirectiveColonexit: js.UndefOr[js.Function1[/* node */ PragmaDirective, _]] = js.undefined
  var ReturnStatement: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.ReturnStatement, _]] = js.undefined
  @JSName("ReturnStatement:exit")
  var ReturnStatementColonexit: js.UndefOr[js.Function1[/* node */ ReturnStatement, _]] = js.undefined
  var SourceUnit: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.SourceUnit, _]] = js.undefined
  // Start of :exit handler for each type. Must be consistent with above
  @JSName("SourceUnit:exit")
  var SourceUnitColonexit: js.UndefOr[js.Function1[/* node */ SourceUnit, _]] = js.undefined
  var StateVariableDeclaration: js.UndefOr[
    js.Function1[/* node */ typings.solidityParserAntlr.mod.StateVariableDeclaration, _]
  ] = js.undefined
  @JSName("StateVariableDeclaration:exit")
  var StateVariableDeclarationColonexit: js.UndefOr[js.Function1[/* node */ StateVariableDeclaration, _]] = js.undefined
  var StructDefinition: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.StructDefinition, _]] = js.undefined
  @JSName("StructDefinition:exit")
  var StructDefinitionColonexit: js.UndefOr[js.Function1[/* node */ StructDefinition, _]] = js.undefined
  var SubAssembly: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.SubAssembly, _]] = js.undefined
  @JSName("SubAssembly:exit")
  var SubAssemblyColonexit: js.UndefOr[js.Function1[/* node */ SubAssembly, _]] = js.undefined
  var ThrowStatement: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.ThrowStatement, _]] = js.undefined
  @JSName("ThrowStatement:exit")
  var ThrowStatementColonexit: js.UndefOr[js.Function1[/* node */ ThrowStatement, _]] = js.undefined
  var TupleExpression: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.TupleExpression, _]] = js.undefined
  @JSName("TupleExpression:exit")
  var TupleExpressionColonexit: js.UndefOr[js.Function1[/* node */ TupleExpression, _]] = js.undefined
  var UserDefinedTypeName: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.UserDefinedTypeName, _]] = js.undefined
  @JSName("UserDefinedTypeName:exit")
  var UserDefinedTypeNameColonexit: js.UndefOr[js.Function1[/* node */ UserDefinedTypeName, _]] = js.undefined
  var UsingForDeclaration: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.UsingForDeclaration, _]] = js.undefined
  @JSName("UsingForDeclaration:exit")
  var UsingForDeclarationColonexit: js.UndefOr[js.Function1[/* node */ UsingForDeclaration, _]] = js.undefined
  var VariableDeclaration: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.VariableDeclaration, _]] = js.undefined
  @JSName("VariableDeclaration:exit")
  var VariableDeclarationColonexit: js.UndefOr[js.Function1[/* node */ VariableDeclaration, _]] = js.undefined
  var VariableDeclarationStatement: js.UndefOr[
    js.Function1[/* node */ typings.solidityParserAntlr.mod.VariableDeclarationStatement, _]
  ] = js.undefined
  @JSName("VariableDeclarationStatement:exit")
  var VariableDeclarationStatementColonexit: js.UndefOr[js.Function1[/* node */ VariableDeclarationStatement, _]] = js.undefined
  var WhileStatement: js.UndefOr[js.Function1[/* node */ typings.solidityParserAntlr.mod.WhileStatement, _]] = js.undefined
  @JSName("WhileStatement:exit")
  var WhileStatementColonexit: js.UndefOr[js.Function1[/* node */ WhileStatement, _]] = js.undefined
}

object Visitor {
  @scala.inline
  def apply(
    ArrayTypeName: /* node */ ArrayTypeName => _ = null,
    ArrayTypeNameColonexit: /* node */ ArrayTypeName => _ = null,
    AssemblyAssignment: /* node */ AssemblyAssignment => _ = null,
    AssemblyAssignmentColonexit: /* node */ AssemblyAssignment => _ = null,
    AssemblyBlock: /* node */ AssemblyBlock => _ = null,
    AssemblyBlockColonexit: /* node */ AssemblyBlock => _ = null,
    AssemblyCall: /* node */ AssemblyCall => _ = null,
    AssemblyCallColonexit: /* node */ AssemblyCall => _ = null,
    AssemblyCase: /* node */ AssemblyCase => _ = null,
    AssemblyCaseColonexit: /* node */ AssemblyCase => _ = null,
    AssemblyFor: /* node */ AssemblyFor => _ = null,
    AssemblyForColonexit: /* node */ AssemblyFor => _ = null,
    AssemblyFunctionDefinition: /* node */ AssemblyFunctionDefinition => _ = null,
    AssemblyFunctionDefinitionColonexit: /* node */ AssemblyFunctionDefinition => _ = null,
    AssemblyFunctionReturns: /* node */ AssemblyFunctionReturns => _ = null,
    AssemblyFunctionReturnsColonexit: /* node */ AssemblyFunctionReturns => _ = null,
    AssemblyIf: /* node */ AssemblyIf => _ = null,
    AssemblyIfColonexit: /* node */ AssemblyIf => _ = null,
    AssemblyLiteral: /* node */ AssemblyLiteral => _ = null,
    AssemblyLiteralColonexit: /* node */ AssemblyLiteral => _ = null,
    AssemblyLocalDefinition: /* node */ AssemblyLocalDefinition => _ = null,
    AssemblyLocalDefinitionColonexit: /* node */ AssemblyLocalDefinition => _ = null,
    AssemblyStackAssignment: /* node */ AssemblyStackAssignment => _ = null,
    AssemblyStackAssignmentColonexit: /* node */ AssemblyStackAssignment => _ = null,
    AssemblySwitch: /* node */ AssemblySwitch => _ = null,
    AssemblySwitchColonexit: /* node */ AssemblySwitch => _ = null,
    BinaryOperation: /* node */ BinaryOperation => _ = null,
    BinaryOperationColonexit: /* node */ BinaryOperation => _ = null,
    Block: /* node */ Block => _ = null,
    BlockColonexit: /* node */ Block => _ = null,
    BooleanLiteral: /* node */ BooleanLiteral => _ = null,
    BooleanLiteralColonexit: /* node */ BooleanLiteral => _ = null,
    Break: /* node */ Break => _ = null,
    BreakColonexit: /* node */ Break => _ = null,
    BreakStatement: /* node */ BreakStatement => _ = null,
    BreakStatementColonexit: /* node */ BreakStatement => _ = null,
    Conditional: /* node */ Conditional => _ = null,
    ConditionalColonexit: /* node */ Conditional => _ = null,
    Continue: /* node */ Continue => _ = null,
    ContinueColonexit: /* node */ Continue => _ = null,
    ContinueStatement: /* node */ ContinueStatement => _ = null,
    ContinueStatementColonexit: /* node */ ContinueStatement => _ = null,
    ContractDefinition: /* node */ ContractDefinition => _ = null,
    ContractDefinitionColonexit: /* node */ ContractDefinition => _ = null,
    DecimalNumber: /* node */ DecimalNumber => _ = null,
    DecimalNumberColonexit: /* node */ DecimalNumber => _ = null,
    DoWhileStatement: /* node */ DoWhileStatement => _ = null,
    DoWhileStatementColonexit: /* node */ DoWhileStatement => _ = null,
    ElementaryTypeName: /* node */ ElementaryTypeName => _ = null,
    ElementaryTypeNameColonexit: /* node */ ElementaryTypeName => _ = null,
    ElementaryTypeNameExpression: /* node */ ElementaryTypeNameExpression => _ = null,
    ElementaryTypeNameExpressionColonexit: /* node */ ElementaryTypeNameExpression => _ = null,
    EmitStatement: /* node */ EmitStatement => _ = null,
    EmitStatementColonexit: /* node */ EmitStatement => _ = null,
    EnumDefinition: /* node */ EnumDefinition => _ = null,
    EnumDefinitionColonexit: /* node */ EnumDefinition => _ = null,
    EnumValue: /* node */ EnumValue => _ = null,
    EnumValueColonexit: /* node */ EnumValue => _ = null,
    EventDefinition: /* node */ EventDefinition => _ = null,
    EventDefinitionColonexit: /* node */ EventDefinition => _ = null,
    ExpressionStatement: /* node */ ExpressionStatement => _ = null,
    ExpressionStatementColonexit: /* node */ ExpressionStatement => _ = null,
    ForStatement: /* node */ ForStatement => _ = null,
    ForStatementColonexit: /* node */ ForStatement => _ = null,
    FunctionDefinition: /* node */ FunctionDefinition => _ = null,
    FunctionDefinitionColonexit: /* node */ FunctionDefinition => _ = null,
    FunctionTypeName: /* node */ FunctionTypeName => _ = null,
    FunctionTypeNameColonexit: /* node */ FunctionTypeName => _ = null,
    HexNumber: /* node */ HexNumber => _ = null,
    HexNumberColonexit: /* node */ HexNumber => _ = null,
    Identifier: /* node */ Identifier => _ = null,
    IdentifierColonexit: /* node */ Identifier => _ = null,
    IfStatement: /* node */ IfStatement => _ = null,
    IfStatementColonexit: /* node */ IfStatement => _ = null,
    ImportDirective: /* node */ ImportDirective => _ = null,
    ImportDirectiveColonexit: /* node */ ImportDirective => _ = null,
    IndexAccess: /* node */ IndexAccess => _ = null,
    IndexAccessColonexit: /* node */ IndexAccess => _ = null,
    InheritanceSpecifier: /* node */ InheritanceSpecifier => _ = null,
    InheritanceSpecifierColonexit: /* node */ InheritanceSpecifier => _ = null,
    InlineAssemblyStatement: /* node */ InlineAssemblyStatement => _ = null,
    InlineAssemblyStatementColonexit: /* node */ InlineAssemblyStatement => _ = null,
    LabelDefinition: /* node */ LabelDefinition => _ = null,
    LabelDefinitionColonexit: /* node */ LabelDefinition => _ = null,
    Mapping: /* node */ Mapping => _ = null,
    MappingColonexit: /* node */ Mapping => _ = null,
    MemberAccess: /* node */ MemberAccess => _ = null,
    MemberAccessColonexit: /* node */ MemberAccess => _ = null,
    ModifierDefinition: /* node */ ModifierDefinition => _ = null,
    ModifierDefinitionColonexit: /* node */ ModifierDefinition => _ = null,
    ModifierInvocation: /* node */ ModifierInvocation => _ = null,
    ModifierInvocationColonexit: /* node */ ModifierInvocation => _ = null,
    NumberLiteral: /* node */ NumberLiteral => _ = null,
    NumberLiteralColonexit: /* node */ NumberLiteral => _ = null,
    PragmaDirective: /* node */ PragmaDirective => _ = null,
    PragmaDirectiveColonexit: /* node */ PragmaDirective => _ = null,
    ReturnStatement: /* node */ ReturnStatement => _ = null,
    ReturnStatementColonexit: /* node */ ReturnStatement => _ = null,
    SourceUnit: /* node */ SourceUnit => _ = null,
    SourceUnitColonexit: /* node */ SourceUnit => _ = null,
    StateVariableDeclaration: /* node */ StateVariableDeclaration => _ = null,
    StateVariableDeclarationColonexit: /* node */ StateVariableDeclaration => _ = null,
    StructDefinition: /* node */ StructDefinition => _ = null,
    StructDefinitionColonexit: /* node */ StructDefinition => _ = null,
    SubAssembly: /* node */ SubAssembly => _ = null,
    SubAssemblyColonexit: /* node */ SubAssembly => _ = null,
    ThrowStatement: /* node */ ThrowStatement => _ = null,
    ThrowStatementColonexit: /* node */ ThrowStatement => _ = null,
    TupleExpression: /* node */ TupleExpression => _ = null,
    TupleExpressionColonexit: /* node */ TupleExpression => _ = null,
    UserDefinedTypeName: /* node */ UserDefinedTypeName => _ = null,
    UserDefinedTypeNameColonexit: /* node */ UserDefinedTypeName => _ = null,
    UsingForDeclaration: /* node */ UsingForDeclaration => _ = null,
    UsingForDeclarationColonexit: /* node */ UsingForDeclaration => _ = null,
    VariableDeclaration: /* node */ VariableDeclaration => _ = null,
    VariableDeclarationColonexit: /* node */ VariableDeclaration => _ = null,
    VariableDeclarationStatement: /* node */ VariableDeclarationStatement => _ = null,
    VariableDeclarationStatementColonexit: /* node */ VariableDeclarationStatement => _ = null,
    WhileStatement: /* node */ WhileStatement => _ = null,
    WhileStatementColonexit: /* node */ WhileStatement => _ = null
  ): Visitor = {
    val __obj = js.Dynamic.literal()
    if (ArrayTypeName != null) __obj.updateDynamic("ArrayTypeName")(js.Any.fromFunction1(ArrayTypeName))
    if (ArrayTypeNameColonexit != null) __obj.updateDynamic("ArrayTypeName:exit")(js.Any.fromFunction1(ArrayTypeNameColonexit))
    if (AssemblyAssignment != null) __obj.updateDynamic("AssemblyAssignment")(js.Any.fromFunction1(AssemblyAssignment))
    if (AssemblyAssignmentColonexit != null) __obj.updateDynamic("AssemblyAssignment:exit")(js.Any.fromFunction1(AssemblyAssignmentColonexit))
    if (AssemblyBlock != null) __obj.updateDynamic("AssemblyBlock")(js.Any.fromFunction1(AssemblyBlock))
    if (AssemblyBlockColonexit != null) __obj.updateDynamic("AssemblyBlock:exit")(js.Any.fromFunction1(AssemblyBlockColonexit))
    if (AssemblyCall != null) __obj.updateDynamic("AssemblyCall")(js.Any.fromFunction1(AssemblyCall))
    if (AssemblyCallColonexit != null) __obj.updateDynamic("AssemblyCall:exit")(js.Any.fromFunction1(AssemblyCallColonexit))
    if (AssemblyCase != null) __obj.updateDynamic("AssemblyCase")(js.Any.fromFunction1(AssemblyCase))
    if (AssemblyCaseColonexit != null) __obj.updateDynamic("AssemblyCase:exit")(js.Any.fromFunction1(AssemblyCaseColonexit))
    if (AssemblyFor != null) __obj.updateDynamic("AssemblyFor")(js.Any.fromFunction1(AssemblyFor))
    if (AssemblyForColonexit != null) __obj.updateDynamic("AssemblyFor:exit")(js.Any.fromFunction1(AssemblyForColonexit))
    if (AssemblyFunctionDefinition != null) __obj.updateDynamic("AssemblyFunctionDefinition")(js.Any.fromFunction1(AssemblyFunctionDefinition))
    if (AssemblyFunctionDefinitionColonexit != null) __obj.updateDynamic("AssemblyFunctionDefinition:exit")(js.Any.fromFunction1(AssemblyFunctionDefinitionColonexit))
    if (AssemblyFunctionReturns != null) __obj.updateDynamic("AssemblyFunctionReturns")(js.Any.fromFunction1(AssemblyFunctionReturns))
    if (AssemblyFunctionReturnsColonexit != null) __obj.updateDynamic("AssemblyFunctionReturns:exit")(js.Any.fromFunction1(AssemblyFunctionReturnsColonexit))
    if (AssemblyIf != null) __obj.updateDynamic("AssemblyIf")(js.Any.fromFunction1(AssemblyIf))
    if (AssemblyIfColonexit != null) __obj.updateDynamic("AssemblyIf:exit")(js.Any.fromFunction1(AssemblyIfColonexit))
    if (AssemblyLiteral != null) __obj.updateDynamic("AssemblyLiteral")(js.Any.fromFunction1(AssemblyLiteral))
    if (AssemblyLiteralColonexit != null) __obj.updateDynamic("AssemblyLiteral:exit")(js.Any.fromFunction1(AssemblyLiteralColonexit))
    if (AssemblyLocalDefinition != null) __obj.updateDynamic("AssemblyLocalDefinition")(js.Any.fromFunction1(AssemblyLocalDefinition))
    if (AssemblyLocalDefinitionColonexit != null) __obj.updateDynamic("AssemblyLocalDefinition:exit")(js.Any.fromFunction1(AssemblyLocalDefinitionColonexit))
    if (AssemblyStackAssignment != null) __obj.updateDynamic("AssemblyStackAssignment")(js.Any.fromFunction1(AssemblyStackAssignment))
    if (AssemblyStackAssignmentColonexit != null) __obj.updateDynamic("AssemblyStackAssignment:exit")(js.Any.fromFunction1(AssemblyStackAssignmentColonexit))
    if (AssemblySwitch != null) __obj.updateDynamic("AssemblySwitch")(js.Any.fromFunction1(AssemblySwitch))
    if (AssemblySwitchColonexit != null) __obj.updateDynamic("AssemblySwitch:exit")(js.Any.fromFunction1(AssemblySwitchColonexit))
    if (BinaryOperation != null) __obj.updateDynamic("BinaryOperation")(js.Any.fromFunction1(BinaryOperation))
    if (BinaryOperationColonexit != null) __obj.updateDynamic("BinaryOperation:exit")(js.Any.fromFunction1(BinaryOperationColonexit))
    if (Block != null) __obj.updateDynamic("Block")(js.Any.fromFunction1(Block))
    if (BlockColonexit != null) __obj.updateDynamic("Block:exit")(js.Any.fromFunction1(BlockColonexit))
    if (BooleanLiteral != null) __obj.updateDynamic("BooleanLiteral")(js.Any.fromFunction1(BooleanLiteral))
    if (BooleanLiteralColonexit != null) __obj.updateDynamic("BooleanLiteral:exit")(js.Any.fromFunction1(BooleanLiteralColonexit))
    if (Break != null) __obj.updateDynamic("Break")(js.Any.fromFunction1(Break))
    if (BreakColonexit != null) __obj.updateDynamic("Break:exit")(js.Any.fromFunction1(BreakColonexit))
    if (BreakStatement != null) __obj.updateDynamic("BreakStatement")(js.Any.fromFunction1(BreakStatement))
    if (BreakStatementColonexit != null) __obj.updateDynamic("BreakStatement:exit")(js.Any.fromFunction1(BreakStatementColonexit))
    if (Conditional != null) __obj.updateDynamic("Conditional")(js.Any.fromFunction1(Conditional))
    if (ConditionalColonexit != null) __obj.updateDynamic("Conditional:exit")(js.Any.fromFunction1(ConditionalColonexit))
    if (Continue != null) __obj.updateDynamic("Continue")(js.Any.fromFunction1(Continue))
    if (ContinueColonexit != null) __obj.updateDynamic("Continue:exit")(js.Any.fromFunction1(ContinueColonexit))
    if (ContinueStatement != null) __obj.updateDynamic("ContinueStatement")(js.Any.fromFunction1(ContinueStatement))
    if (ContinueStatementColonexit != null) __obj.updateDynamic("ContinueStatement:exit")(js.Any.fromFunction1(ContinueStatementColonexit))
    if (ContractDefinition != null) __obj.updateDynamic("ContractDefinition")(js.Any.fromFunction1(ContractDefinition))
    if (ContractDefinitionColonexit != null) __obj.updateDynamic("ContractDefinition:exit")(js.Any.fromFunction1(ContractDefinitionColonexit))
    if (DecimalNumber != null) __obj.updateDynamic("DecimalNumber")(js.Any.fromFunction1(DecimalNumber))
    if (DecimalNumberColonexit != null) __obj.updateDynamic("DecimalNumber:exit")(js.Any.fromFunction1(DecimalNumberColonexit))
    if (DoWhileStatement != null) __obj.updateDynamic("DoWhileStatement")(js.Any.fromFunction1(DoWhileStatement))
    if (DoWhileStatementColonexit != null) __obj.updateDynamic("DoWhileStatement:exit")(js.Any.fromFunction1(DoWhileStatementColonexit))
    if (ElementaryTypeName != null) __obj.updateDynamic("ElementaryTypeName")(js.Any.fromFunction1(ElementaryTypeName))
    if (ElementaryTypeNameColonexit != null) __obj.updateDynamic("ElementaryTypeName:exit")(js.Any.fromFunction1(ElementaryTypeNameColonexit))
    if (ElementaryTypeNameExpression != null) __obj.updateDynamic("ElementaryTypeNameExpression")(js.Any.fromFunction1(ElementaryTypeNameExpression))
    if (ElementaryTypeNameExpressionColonexit != null) __obj.updateDynamic("ElementaryTypeNameExpression:exit")(js.Any.fromFunction1(ElementaryTypeNameExpressionColonexit))
    if (EmitStatement != null) __obj.updateDynamic("EmitStatement")(js.Any.fromFunction1(EmitStatement))
    if (EmitStatementColonexit != null) __obj.updateDynamic("EmitStatement:exit")(js.Any.fromFunction1(EmitStatementColonexit))
    if (EnumDefinition != null) __obj.updateDynamic("EnumDefinition")(js.Any.fromFunction1(EnumDefinition))
    if (EnumDefinitionColonexit != null) __obj.updateDynamic("EnumDefinition:exit")(js.Any.fromFunction1(EnumDefinitionColonexit))
    if (EnumValue != null) __obj.updateDynamic("EnumValue")(js.Any.fromFunction1(EnumValue))
    if (EnumValueColonexit != null) __obj.updateDynamic("EnumValue:exit")(js.Any.fromFunction1(EnumValueColonexit))
    if (EventDefinition != null) __obj.updateDynamic("EventDefinition")(js.Any.fromFunction1(EventDefinition))
    if (EventDefinitionColonexit != null) __obj.updateDynamic("EventDefinition:exit")(js.Any.fromFunction1(EventDefinitionColonexit))
    if (ExpressionStatement != null) __obj.updateDynamic("ExpressionStatement")(js.Any.fromFunction1(ExpressionStatement))
    if (ExpressionStatementColonexit != null) __obj.updateDynamic("ExpressionStatement:exit")(js.Any.fromFunction1(ExpressionStatementColonexit))
    if (ForStatement != null) __obj.updateDynamic("ForStatement")(js.Any.fromFunction1(ForStatement))
    if (ForStatementColonexit != null) __obj.updateDynamic("ForStatement:exit")(js.Any.fromFunction1(ForStatementColonexit))
    if (FunctionDefinition != null) __obj.updateDynamic("FunctionDefinition")(js.Any.fromFunction1(FunctionDefinition))
    if (FunctionDefinitionColonexit != null) __obj.updateDynamic("FunctionDefinition:exit")(js.Any.fromFunction1(FunctionDefinitionColonexit))
    if (FunctionTypeName != null) __obj.updateDynamic("FunctionTypeName")(js.Any.fromFunction1(FunctionTypeName))
    if (FunctionTypeNameColonexit != null) __obj.updateDynamic("FunctionTypeName:exit")(js.Any.fromFunction1(FunctionTypeNameColonexit))
    if (HexNumber != null) __obj.updateDynamic("HexNumber")(js.Any.fromFunction1(HexNumber))
    if (HexNumberColonexit != null) __obj.updateDynamic("HexNumber:exit")(js.Any.fromFunction1(HexNumberColonexit))
    if (Identifier != null) __obj.updateDynamic("Identifier")(js.Any.fromFunction1(Identifier))
    if (IdentifierColonexit != null) __obj.updateDynamic("Identifier:exit")(js.Any.fromFunction1(IdentifierColonexit))
    if (IfStatement != null) __obj.updateDynamic("IfStatement")(js.Any.fromFunction1(IfStatement))
    if (IfStatementColonexit != null) __obj.updateDynamic("IfStatement:exit")(js.Any.fromFunction1(IfStatementColonexit))
    if (ImportDirective != null) __obj.updateDynamic("ImportDirective")(js.Any.fromFunction1(ImportDirective))
    if (ImportDirectiveColonexit != null) __obj.updateDynamic("ImportDirective:exit")(js.Any.fromFunction1(ImportDirectiveColonexit))
    if (IndexAccess != null) __obj.updateDynamic("IndexAccess")(js.Any.fromFunction1(IndexAccess))
    if (IndexAccessColonexit != null) __obj.updateDynamic("IndexAccess:exit")(js.Any.fromFunction1(IndexAccessColonexit))
    if (InheritanceSpecifier != null) __obj.updateDynamic("InheritanceSpecifier")(js.Any.fromFunction1(InheritanceSpecifier))
    if (InheritanceSpecifierColonexit != null) __obj.updateDynamic("InheritanceSpecifier:exit")(js.Any.fromFunction1(InheritanceSpecifierColonexit))
    if (InlineAssemblyStatement != null) __obj.updateDynamic("InlineAssemblyStatement")(js.Any.fromFunction1(InlineAssemblyStatement))
    if (InlineAssemblyStatementColonexit != null) __obj.updateDynamic("InlineAssemblyStatement:exit")(js.Any.fromFunction1(InlineAssemblyStatementColonexit))
    if (LabelDefinition != null) __obj.updateDynamic("LabelDefinition")(js.Any.fromFunction1(LabelDefinition))
    if (LabelDefinitionColonexit != null) __obj.updateDynamic("LabelDefinition:exit")(js.Any.fromFunction1(LabelDefinitionColonexit))
    if (Mapping != null) __obj.updateDynamic("Mapping")(js.Any.fromFunction1(Mapping))
    if (MappingColonexit != null) __obj.updateDynamic("Mapping:exit")(js.Any.fromFunction1(MappingColonexit))
    if (MemberAccess != null) __obj.updateDynamic("MemberAccess")(js.Any.fromFunction1(MemberAccess))
    if (MemberAccessColonexit != null) __obj.updateDynamic("MemberAccess:exit")(js.Any.fromFunction1(MemberAccessColonexit))
    if (ModifierDefinition != null) __obj.updateDynamic("ModifierDefinition")(js.Any.fromFunction1(ModifierDefinition))
    if (ModifierDefinitionColonexit != null) __obj.updateDynamic("ModifierDefinition:exit")(js.Any.fromFunction1(ModifierDefinitionColonexit))
    if (ModifierInvocation != null) __obj.updateDynamic("ModifierInvocation")(js.Any.fromFunction1(ModifierInvocation))
    if (ModifierInvocationColonexit != null) __obj.updateDynamic("ModifierInvocation:exit")(js.Any.fromFunction1(ModifierInvocationColonexit))
    if (NumberLiteral != null) __obj.updateDynamic("NumberLiteral")(js.Any.fromFunction1(NumberLiteral))
    if (NumberLiteralColonexit != null) __obj.updateDynamic("NumberLiteral:exit")(js.Any.fromFunction1(NumberLiteralColonexit))
    if (PragmaDirective != null) __obj.updateDynamic("PragmaDirective")(js.Any.fromFunction1(PragmaDirective))
    if (PragmaDirectiveColonexit != null) __obj.updateDynamic("PragmaDirective:exit")(js.Any.fromFunction1(PragmaDirectiveColonexit))
    if (ReturnStatement != null) __obj.updateDynamic("ReturnStatement")(js.Any.fromFunction1(ReturnStatement))
    if (ReturnStatementColonexit != null) __obj.updateDynamic("ReturnStatement:exit")(js.Any.fromFunction1(ReturnStatementColonexit))
    if (SourceUnit != null) __obj.updateDynamic("SourceUnit")(js.Any.fromFunction1(SourceUnit))
    if (SourceUnitColonexit != null) __obj.updateDynamic("SourceUnit:exit")(js.Any.fromFunction1(SourceUnitColonexit))
    if (StateVariableDeclaration != null) __obj.updateDynamic("StateVariableDeclaration")(js.Any.fromFunction1(StateVariableDeclaration))
    if (StateVariableDeclarationColonexit != null) __obj.updateDynamic("StateVariableDeclaration:exit")(js.Any.fromFunction1(StateVariableDeclarationColonexit))
    if (StructDefinition != null) __obj.updateDynamic("StructDefinition")(js.Any.fromFunction1(StructDefinition))
    if (StructDefinitionColonexit != null) __obj.updateDynamic("StructDefinition:exit")(js.Any.fromFunction1(StructDefinitionColonexit))
    if (SubAssembly != null) __obj.updateDynamic("SubAssembly")(js.Any.fromFunction1(SubAssembly))
    if (SubAssemblyColonexit != null) __obj.updateDynamic("SubAssembly:exit")(js.Any.fromFunction1(SubAssemblyColonexit))
    if (ThrowStatement != null) __obj.updateDynamic("ThrowStatement")(js.Any.fromFunction1(ThrowStatement))
    if (ThrowStatementColonexit != null) __obj.updateDynamic("ThrowStatement:exit")(js.Any.fromFunction1(ThrowStatementColonexit))
    if (TupleExpression != null) __obj.updateDynamic("TupleExpression")(js.Any.fromFunction1(TupleExpression))
    if (TupleExpressionColonexit != null) __obj.updateDynamic("TupleExpression:exit")(js.Any.fromFunction1(TupleExpressionColonexit))
    if (UserDefinedTypeName != null) __obj.updateDynamic("UserDefinedTypeName")(js.Any.fromFunction1(UserDefinedTypeName))
    if (UserDefinedTypeNameColonexit != null) __obj.updateDynamic("UserDefinedTypeName:exit")(js.Any.fromFunction1(UserDefinedTypeNameColonexit))
    if (UsingForDeclaration != null) __obj.updateDynamic("UsingForDeclaration")(js.Any.fromFunction1(UsingForDeclaration))
    if (UsingForDeclarationColonexit != null) __obj.updateDynamic("UsingForDeclaration:exit")(js.Any.fromFunction1(UsingForDeclarationColonexit))
    if (VariableDeclaration != null) __obj.updateDynamic("VariableDeclaration")(js.Any.fromFunction1(VariableDeclaration))
    if (VariableDeclarationColonexit != null) __obj.updateDynamic("VariableDeclaration:exit")(js.Any.fromFunction1(VariableDeclarationColonexit))
    if (VariableDeclarationStatement != null) __obj.updateDynamic("VariableDeclarationStatement")(js.Any.fromFunction1(VariableDeclarationStatement))
    if (VariableDeclarationStatementColonexit != null) __obj.updateDynamic("VariableDeclarationStatement:exit")(js.Any.fromFunction1(VariableDeclarationStatementColonexit))
    if (WhileStatement != null) __obj.updateDynamic("WhileStatement")(js.Any.fromFunction1(WhileStatement))
    if (WhileStatementColonexit != null) __obj.updateDynamic("WhileStatement:exit")(js.Any.fromFunction1(WhileStatementColonexit))
    __obj.asInstanceOf[Visitor]
  }
}

