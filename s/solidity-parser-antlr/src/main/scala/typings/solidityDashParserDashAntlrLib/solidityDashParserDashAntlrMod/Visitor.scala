package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  var AssemblyAssignment: js.UndefOr[js.Function1[/* node */ AssemblyAssignment, _]] = js.undefined
  var AssemblyBlock: js.UndefOr[js.Function1[/* node */ AssemblyBlock, _]] = js.undefined
  var AssemblyCall: js.UndefOr[js.Function1[/* node */ AssemblyCall, _]] = js.undefined
  var AssemblyCase: js.UndefOr[js.Function1[/* node */ AssemblyCase, _]] = js.undefined
  var AssemblyExpression: js.UndefOr[js.Function1[/* node */ AssemblyExpression, _]] = js.undefined
  var AssemblyFor: js.UndefOr[js.Function1[/* node */ AssemblyFor, _]] = js.undefined
  var AssemblyFunctionDefinition: js.UndefOr[js.Function1[/* node */ AssemblyFunctionDefinition, _]] = js.undefined
  var AssemblyFunctionReturns: js.UndefOr[js.Function1[/* node */ AssemblyFunctionReturns, _]] = js.undefined
  var AssemblyIdentifierList: js.UndefOr[js.Function1[/* node */ AssemblyIdentifierList, _]] = js.undefined
  var AssemblyIdentifierOrList: js.UndefOr[js.Function1[/* node */ AssemblyIdentifierOrList, _]] = js.undefined
  var AssemblyIf: js.UndefOr[js.Function1[/* node */ AssemblyIf, _]] = js.undefined
  var AssemblyItem: js.UndefOr[js.Function1[/* node */ AssemblyItem, _]] = js.undefined
  var AssemblyLiteral: js.UndefOr[js.Function1[/* node */ AssemblyLiteral, _]] = js.undefined
  var AssemblyLocalDefinition: js.UndefOr[js.Function1[/* node */ AssemblyLocalDefinition, _]] = js.undefined
  var AssemblyStackAssignment: js.UndefOr[js.Function1[/* node */ AssemblyStackAssignment, _]] = js.undefined
  var AssemblySwitch: js.UndefOr[js.Function1[/* node */ AssemblySwitch, _]] = js.undefined
  var BinaryOperation: js.UndefOr[js.Function1[/* node */ BinaryOperation, _]] = js.undefined
  var Block: js.UndefOr[js.Function1[/* node */ Block, _]] = js.undefined
  var BreakStatement: js.UndefOr[js.Function1[/* node */ BreakStatement, _]] = js.undefined
  var Conditional: js.UndefOr[js.Function1[/* node */ Conditional, _]] = js.undefined
  var ContinueStatement: js.UndefOr[js.Function1[/* node */ ContinueStatement, _]] = js.undefined
  var ContractDefinition: js.UndefOr[js.Function1[/* node */ ContractDefinition, _]] = js.undefined
  var ContractPart: js.UndefOr[js.Function1[/* node */ ContractPart, _]] = js.undefined
  var DoWhileStatement: js.UndefOr[js.Function1[/* node */ DoWhileStatement, _]] = js.undefined
  var ElementaryTypeName: js.UndefOr[js.Function1[/* node */ ElementaryTypeName, _]] = js.undefined
  var ElementaryTypeNameExpression: js.UndefOr[js.Function1[/* node */ ElementaryTypeNameExpression, _]] = js.undefined
  var EnumDefinition: js.UndefOr[js.Function1[/* node */ EnumDefinition, _]] = js.undefined
  var EnumValue: js.UndefOr[js.Function1[/* node */ EnumValue, _]] = js.undefined
  var EventDefinition: js.UndefOr[js.Function1[/* node */ EventDefinition, _]] = js.undefined
  var EventParameter: js.UndefOr[js.Function1[/* node */ EventParameter, _]] = js.undefined
  var EventParameterList: js.UndefOr[js.Function1[/* node */ EventParameterList, _]] = js.undefined
  var Expression: js.UndefOr[js.Function1[/* node */ Expression, _]] = js.undefined
  var ExpressionList: js.UndefOr[js.Function1[/* node */ ExpressionList, _]] = js.undefined
  var ExpressionStatement: js.UndefOr[js.Function1[/* node */ ExpressionStatement, _]] = js.undefined
  var ForStatement: js.UndefOr[js.Function1[/* node */ ForStatement, _]] = js.undefined
  var FunctionCallArguments: js.UndefOr[js.Function1[/* node */ FunctionCallArguments, _]] = js.undefined
  var FunctionDefinition: js.UndefOr[js.Function1[/* node */ FunctionDefinition, _]] = js.undefined
  var FunctionTypeName: js.UndefOr[js.Function1[/* node */ FunctionTypeName, _]] = js.undefined
  var FunctionTypeParameter: js.UndefOr[js.Function1[/* node */ FunctionTypeParameter, _]] = js.undefined
  var FunctionTypeParameterList: js.UndefOr[js.Function1[/* node */ FunctionTypeParameterList, _]] = js.undefined
  var Identifier: js.UndefOr[js.Function1[/* node */ Identifier, _]] = js.undefined
  var IdentifierList: js.UndefOr[js.Function1[/* node */ IdentifierList, _]] = js.undefined
  var IfStatement: js.UndefOr[js.Function1[/* node */ IfStatement, _]] = js.undefined
  var ImportDeclaration: js.UndefOr[js.Function1[/* node */ ImportDeclaration, _]] = js.undefined
  var ImportDirective: js.UndefOr[js.Function1[/* node */ ImportDirective, _]] = js.undefined
  var InheritanceSpecifier: js.UndefOr[js.Function1[/* node */ InheritanceSpecifier, _]] = js.undefined
  var InlineAssemblyStatement: js.UndefOr[js.Function1[/* node */ InlineAssemblyStatement, _]] = js.undefined
  var LabelDefinition: js.UndefOr[js.Function1[/* node */ LabelDefinition, _]] = js.undefined
  var Mapping: js.UndefOr[js.Function1[/* node */ Mapping, _]] = js.undefined
  var ModifierDefinition: js.UndefOr[js.Function1[/* node */ ModifierDefinition, _]] = js.undefined
  var ModifierInvocation: js.UndefOr[js.Function1[/* node */ ModifierInvocation, _]] = js.undefined
  var ModifierList: js.UndefOr[js.Function1[/* node */ ModifierList, _]] = js.undefined
  var NameValue: js.UndefOr[js.Function1[/* node */ NameValue, _]] = js.undefined
  var NameValueList: js.UndefOr[js.Function1[/* node */ NameValueList, _]] = js.undefined
  var NumberLiteral: js.UndefOr[js.Function1[/* node */ NumberLiteral, _]] = js.undefined
  var Parameter: js.UndefOr[js.Function1[/* node */ Parameter, _]] = js.undefined
  var ParameterList: js.UndefOr[js.Function1[/* node */ ParameterList, _]] = js.undefined
  var PragmaDirective: js.UndefOr[js.Function1[/* node */ PragmaDirective, _]] = js.undefined
  var PragmaName: js.UndefOr[js.Function1[/* node */ PragmaName, _]] = js.undefined
  var PragmaValue: js.UndefOr[js.Function1[/* node */ PragmaValue, _]] = js.undefined
  var PrimaryExpression: js.UndefOr[js.Function1[/* node */ PrimaryExpression, _]] = js.undefined
  var ReturnParameters: js.UndefOr[js.Function1[/* node */ ReturnParameters, _]] = js.undefined
  var ReturnStatement: js.UndefOr[js.Function1[/* node */ ReturnStatement, _]] = js.undefined
  var SimpleStatement: js.UndefOr[js.Function1[/* node */ SimpleStatement, _]] = js.undefined
  var SourceUnit: js.UndefOr[js.Function1[/* node */ SourceUnit, _]] = js.undefined
  var StateMutability: js.UndefOr[js.Function1[/* node */ StateMutability, _]] = js.undefined
  var StateVariableDeclaration: js.UndefOr[js.Function1[/* node */ StateVariableDeclaration, _]] = js.undefined
  var Statement: js.UndefOr[js.Function1[/* node */ Statement, _]] = js.undefined
  var StorageLocation: js.UndefOr[js.Function1[/* node */ StorageLocation, _]] = js.undefined
  var StructDefinition: js.UndefOr[js.Function1[/* node */ StructDefinition, _]] = js.undefined
  var SubAssembly: js.UndefOr[js.Function1[/* node */ SubAssembly, _]] = js.undefined
  var ThrowStatement: js.UndefOr[js.Function1[/* node */ ThrowStatement, _]] = js.undefined
  var TupleExpression: js.UndefOr[js.Function1[/* node */ TupleExpression, _]] = js.undefined
  var TypeName: js.UndefOr[js.Function1[/* node */ TypeName, _]] = js.undefined
  var UserDefinedTypeName: js.UndefOr[js.Function1[/* node */ UserDefinedTypeName, _]] = js.undefined
  var UsingForDeclaration: js.UndefOr[js.Function1[/* node */ UsingForDeclaration, _]] = js.undefined
  var VariableDeclaration: js.UndefOr[js.Function1[/* node */ VariableDeclaration, _]] = js.undefined
  var VariableDeclarationStatement: js.UndefOr[js.Function1[/* node */ VariableDeclarationStatement, _]] = js.undefined
  var Version: js.UndefOr[js.Function1[/* node */ Version, _]] = js.undefined
  var VersionConstraint: js.UndefOr[js.Function1[/* node */ VersionConstraint, _]] = js.undefined
  var VersionOperator: js.UndefOr[js.Function1[/* node */ VersionOperator, _]] = js.undefined
  var WhileStatement: js.UndefOr[js.Function1[/* node */ WhileStatement, _]] = js.undefined
}

object Visitor {
  @scala.inline
  def apply(
    AssemblyAssignment: /* node */ AssemblyAssignment => _ = null,
    AssemblyBlock: /* node */ AssemblyBlock => _ = null,
    AssemblyCall: /* node */ AssemblyCall => _ = null,
    AssemblyCase: /* node */ AssemblyCase => _ = null,
    AssemblyExpression: /* node */ AssemblyExpression => _ = null,
    AssemblyFor: /* node */ AssemblyFor => _ = null,
    AssemblyFunctionDefinition: /* node */ AssemblyFunctionDefinition => _ = null,
    AssemblyFunctionReturns: /* node */ AssemblyFunctionReturns => _ = null,
    AssemblyIdentifierList: /* node */ AssemblyIdentifierList => _ = null,
    AssemblyIdentifierOrList: /* node */ AssemblyIdentifierOrList => _ = null,
    AssemblyIf: /* node */ AssemblyIf => _ = null,
    AssemblyItem: /* node */ AssemblyItem => _ = null,
    AssemblyLiteral: /* node */ AssemblyLiteral => _ = null,
    AssemblyLocalDefinition: /* node */ AssemblyLocalDefinition => _ = null,
    AssemblyStackAssignment: /* node */ AssemblyStackAssignment => _ = null,
    AssemblySwitch: /* node */ AssemblySwitch => _ = null,
    BinaryOperation: /* node */ BinaryOperation => _ = null,
    Block: /* node */ Block => _ = null,
    BreakStatement: /* node */ BreakStatement => _ = null,
    Conditional: /* node */ Conditional => _ = null,
    ContinueStatement: /* node */ ContinueStatement => _ = null,
    ContractDefinition: /* node */ ContractDefinition => _ = null,
    ContractPart: /* node */ ContractPart => _ = null,
    DoWhileStatement: /* node */ DoWhileStatement => _ = null,
    ElementaryTypeName: /* node */ ElementaryTypeName => _ = null,
    ElementaryTypeNameExpression: /* node */ ElementaryTypeNameExpression => _ = null,
    EnumDefinition: /* node */ EnumDefinition => _ = null,
    EnumValue: /* node */ EnumValue => _ = null,
    EventDefinition: /* node */ EventDefinition => _ = null,
    EventParameter: /* node */ EventParameter => _ = null,
    EventParameterList: /* node */ EventParameterList => _ = null,
    Expression: /* node */ Expression => _ = null,
    ExpressionList: /* node */ ExpressionList => _ = null,
    ExpressionStatement: /* node */ ExpressionStatement => _ = null,
    ForStatement: /* node */ ForStatement => _ = null,
    FunctionCallArguments: /* node */ FunctionCallArguments => _ = null,
    FunctionDefinition: /* node */ FunctionDefinition => _ = null,
    FunctionTypeName: /* node */ FunctionTypeName => _ = null,
    FunctionTypeParameter: /* node */ FunctionTypeParameter => _ = null,
    FunctionTypeParameterList: /* node */ FunctionTypeParameterList => _ = null,
    Identifier: /* node */ Identifier => _ = null,
    IdentifierList: /* node */ IdentifierList => _ = null,
    IfStatement: /* node */ IfStatement => _ = null,
    ImportDeclaration: /* node */ ImportDeclaration => _ = null,
    ImportDirective: /* node */ ImportDirective => _ = null,
    InheritanceSpecifier: /* node */ InheritanceSpecifier => _ = null,
    InlineAssemblyStatement: /* node */ InlineAssemblyStatement => _ = null,
    LabelDefinition: /* node */ LabelDefinition => _ = null,
    Mapping: /* node */ Mapping => _ = null,
    ModifierDefinition: /* node */ ModifierDefinition => _ = null,
    ModifierInvocation: /* node */ ModifierInvocation => _ = null,
    ModifierList: /* node */ ModifierList => _ = null,
    NameValue: /* node */ NameValue => _ = null,
    NameValueList: /* node */ NameValueList => _ = null,
    NumberLiteral: /* node */ NumberLiteral => _ = null,
    Parameter: /* node */ Parameter => _ = null,
    ParameterList: /* node */ ParameterList => _ = null,
    PragmaDirective: /* node */ PragmaDirective => _ = null,
    PragmaName: /* node */ PragmaName => _ = null,
    PragmaValue: /* node */ PragmaValue => _ = null,
    PrimaryExpression: /* node */ PrimaryExpression => _ = null,
    ReturnParameters: /* node */ ReturnParameters => _ = null,
    ReturnStatement: /* node */ ReturnStatement => _ = null,
    SimpleStatement: /* node */ SimpleStatement => _ = null,
    SourceUnit: /* node */ SourceUnit => _ = null,
    StateMutability: /* node */ StateMutability => _ = null,
    StateVariableDeclaration: /* node */ StateVariableDeclaration => _ = null,
    Statement: /* node */ Statement => _ = null,
    StorageLocation: /* node */ StorageLocation => _ = null,
    StructDefinition: /* node */ StructDefinition => _ = null,
    SubAssembly: /* node */ SubAssembly => _ = null,
    ThrowStatement: /* node */ ThrowStatement => _ = null,
    TupleExpression: /* node */ TupleExpression => _ = null,
    TypeName: /* node */ TypeName => _ = null,
    UserDefinedTypeName: /* node */ UserDefinedTypeName => _ = null,
    UsingForDeclaration: /* node */ UsingForDeclaration => _ = null,
    VariableDeclaration: /* node */ VariableDeclaration => _ = null,
    VariableDeclarationStatement: /* node */ VariableDeclarationStatement => _ = null,
    Version: /* node */ Version => _ = null,
    VersionConstraint: /* node */ VersionConstraint => _ = null,
    VersionOperator: /* node */ VersionOperator => _ = null,
    WhileStatement: /* node */ WhileStatement => _ = null
  ): Visitor = {
    val __obj = js.Dynamic.literal()
    if (AssemblyAssignment != null) __obj.updateDynamic("AssemblyAssignment")(js.Any.fromFunction1(AssemblyAssignment))
    if (AssemblyBlock != null) __obj.updateDynamic("AssemblyBlock")(js.Any.fromFunction1(AssemblyBlock))
    if (AssemblyCall != null) __obj.updateDynamic("AssemblyCall")(js.Any.fromFunction1(AssemblyCall))
    if (AssemblyCase != null) __obj.updateDynamic("AssemblyCase")(js.Any.fromFunction1(AssemblyCase))
    if (AssemblyExpression != null) __obj.updateDynamic("AssemblyExpression")(js.Any.fromFunction1(AssemblyExpression))
    if (AssemblyFor != null) __obj.updateDynamic("AssemblyFor")(js.Any.fromFunction1(AssemblyFor))
    if (AssemblyFunctionDefinition != null) __obj.updateDynamic("AssemblyFunctionDefinition")(js.Any.fromFunction1(AssemblyFunctionDefinition))
    if (AssemblyFunctionReturns != null) __obj.updateDynamic("AssemblyFunctionReturns")(js.Any.fromFunction1(AssemblyFunctionReturns))
    if (AssemblyIdentifierList != null) __obj.updateDynamic("AssemblyIdentifierList")(js.Any.fromFunction1(AssemblyIdentifierList))
    if (AssemblyIdentifierOrList != null) __obj.updateDynamic("AssemblyIdentifierOrList")(js.Any.fromFunction1(AssemblyIdentifierOrList))
    if (AssemblyIf != null) __obj.updateDynamic("AssemblyIf")(js.Any.fromFunction1(AssemblyIf))
    if (AssemblyItem != null) __obj.updateDynamic("AssemblyItem")(js.Any.fromFunction1(AssemblyItem))
    if (AssemblyLiteral != null) __obj.updateDynamic("AssemblyLiteral")(js.Any.fromFunction1(AssemblyLiteral))
    if (AssemblyLocalDefinition != null) __obj.updateDynamic("AssemblyLocalDefinition")(js.Any.fromFunction1(AssemblyLocalDefinition))
    if (AssemblyStackAssignment != null) __obj.updateDynamic("AssemblyStackAssignment")(js.Any.fromFunction1(AssemblyStackAssignment))
    if (AssemblySwitch != null) __obj.updateDynamic("AssemblySwitch")(js.Any.fromFunction1(AssemblySwitch))
    if (BinaryOperation != null) __obj.updateDynamic("BinaryOperation")(js.Any.fromFunction1(BinaryOperation))
    if (Block != null) __obj.updateDynamic("Block")(js.Any.fromFunction1(Block))
    if (BreakStatement != null) __obj.updateDynamic("BreakStatement")(js.Any.fromFunction1(BreakStatement))
    if (Conditional != null) __obj.updateDynamic("Conditional")(js.Any.fromFunction1(Conditional))
    if (ContinueStatement != null) __obj.updateDynamic("ContinueStatement")(js.Any.fromFunction1(ContinueStatement))
    if (ContractDefinition != null) __obj.updateDynamic("ContractDefinition")(js.Any.fromFunction1(ContractDefinition))
    if (ContractPart != null) __obj.updateDynamic("ContractPart")(js.Any.fromFunction1(ContractPart))
    if (DoWhileStatement != null) __obj.updateDynamic("DoWhileStatement")(js.Any.fromFunction1(DoWhileStatement))
    if (ElementaryTypeName != null) __obj.updateDynamic("ElementaryTypeName")(js.Any.fromFunction1(ElementaryTypeName))
    if (ElementaryTypeNameExpression != null) __obj.updateDynamic("ElementaryTypeNameExpression")(js.Any.fromFunction1(ElementaryTypeNameExpression))
    if (EnumDefinition != null) __obj.updateDynamic("EnumDefinition")(js.Any.fromFunction1(EnumDefinition))
    if (EnumValue != null) __obj.updateDynamic("EnumValue")(js.Any.fromFunction1(EnumValue))
    if (EventDefinition != null) __obj.updateDynamic("EventDefinition")(js.Any.fromFunction1(EventDefinition))
    if (EventParameter != null) __obj.updateDynamic("EventParameter")(js.Any.fromFunction1(EventParameter))
    if (EventParameterList != null) __obj.updateDynamic("EventParameterList")(js.Any.fromFunction1(EventParameterList))
    if (Expression != null) __obj.updateDynamic("Expression")(js.Any.fromFunction1(Expression))
    if (ExpressionList != null) __obj.updateDynamic("ExpressionList")(js.Any.fromFunction1(ExpressionList))
    if (ExpressionStatement != null) __obj.updateDynamic("ExpressionStatement")(js.Any.fromFunction1(ExpressionStatement))
    if (ForStatement != null) __obj.updateDynamic("ForStatement")(js.Any.fromFunction1(ForStatement))
    if (FunctionCallArguments != null) __obj.updateDynamic("FunctionCallArguments")(js.Any.fromFunction1(FunctionCallArguments))
    if (FunctionDefinition != null) __obj.updateDynamic("FunctionDefinition")(js.Any.fromFunction1(FunctionDefinition))
    if (FunctionTypeName != null) __obj.updateDynamic("FunctionTypeName")(js.Any.fromFunction1(FunctionTypeName))
    if (FunctionTypeParameter != null) __obj.updateDynamic("FunctionTypeParameter")(js.Any.fromFunction1(FunctionTypeParameter))
    if (FunctionTypeParameterList != null) __obj.updateDynamic("FunctionTypeParameterList")(js.Any.fromFunction1(FunctionTypeParameterList))
    if (Identifier != null) __obj.updateDynamic("Identifier")(js.Any.fromFunction1(Identifier))
    if (IdentifierList != null) __obj.updateDynamic("IdentifierList")(js.Any.fromFunction1(IdentifierList))
    if (IfStatement != null) __obj.updateDynamic("IfStatement")(js.Any.fromFunction1(IfStatement))
    if (ImportDeclaration != null) __obj.updateDynamic("ImportDeclaration")(js.Any.fromFunction1(ImportDeclaration))
    if (ImportDirective != null) __obj.updateDynamic("ImportDirective")(js.Any.fromFunction1(ImportDirective))
    if (InheritanceSpecifier != null) __obj.updateDynamic("InheritanceSpecifier")(js.Any.fromFunction1(InheritanceSpecifier))
    if (InlineAssemblyStatement != null) __obj.updateDynamic("InlineAssemblyStatement")(js.Any.fromFunction1(InlineAssemblyStatement))
    if (LabelDefinition != null) __obj.updateDynamic("LabelDefinition")(js.Any.fromFunction1(LabelDefinition))
    if (Mapping != null) __obj.updateDynamic("Mapping")(js.Any.fromFunction1(Mapping))
    if (ModifierDefinition != null) __obj.updateDynamic("ModifierDefinition")(js.Any.fromFunction1(ModifierDefinition))
    if (ModifierInvocation != null) __obj.updateDynamic("ModifierInvocation")(js.Any.fromFunction1(ModifierInvocation))
    if (ModifierList != null) __obj.updateDynamic("ModifierList")(js.Any.fromFunction1(ModifierList))
    if (NameValue != null) __obj.updateDynamic("NameValue")(js.Any.fromFunction1(NameValue))
    if (NameValueList != null) __obj.updateDynamic("NameValueList")(js.Any.fromFunction1(NameValueList))
    if (NumberLiteral != null) __obj.updateDynamic("NumberLiteral")(js.Any.fromFunction1(NumberLiteral))
    if (Parameter != null) __obj.updateDynamic("Parameter")(js.Any.fromFunction1(Parameter))
    if (ParameterList != null) __obj.updateDynamic("ParameterList")(js.Any.fromFunction1(ParameterList))
    if (PragmaDirective != null) __obj.updateDynamic("PragmaDirective")(js.Any.fromFunction1(PragmaDirective))
    if (PragmaName != null) __obj.updateDynamic("PragmaName")(js.Any.fromFunction1(PragmaName))
    if (PragmaValue != null) __obj.updateDynamic("PragmaValue")(js.Any.fromFunction1(PragmaValue))
    if (PrimaryExpression != null) __obj.updateDynamic("PrimaryExpression")(js.Any.fromFunction1(PrimaryExpression))
    if (ReturnParameters != null) __obj.updateDynamic("ReturnParameters")(js.Any.fromFunction1(ReturnParameters))
    if (ReturnStatement != null) __obj.updateDynamic("ReturnStatement")(js.Any.fromFunction1(ReturnStatement))
    if (SimpleStatement != null) __obj.updateDynamic("SimpleStatement")(js.Any.fromFunction1(SimpleStatement))
    if (SourceUnit != null) __obj.updateDynamic("SourceUnit")(js.Any.fromFunction1(SourceUnit))
    if (StateMutability != null) __obj.updateDynamic("StateMutability")(js.Any.fromFunction1(StateMutability))
    if (StateVariableDeclaration != null) __obj.updateDynamic("StateVariableDeclaration")(js.Any.fromFunction1(StateVariableDeclaration))
    if (Statement != null) __obj.updateDynamic("Statement")(js.Any.fromFunction1(Statement))
    if (StorageLocation != null) __obj.updateDynamic("StorageLocation")(js.Any.fromFunction1(StorageLocation))
    if (StructDefinition != null) __obj.updateDynamic("StructDefinition")(js.Any.fromFunction1(StructDefinition))
    if (SubAssembly != null) __obj.updateDynamic("SubAssembly")(js.Any.fromFunction1(SubAssembly))
    if (ThrowStatement != null) __obj.updateDynamic("ThrowStatement")(js.Any.fromFunction1(ThrowStatement))
    if (TupleExpression != null) __obj.updateDynamic("TupleExpression")(js.Any.fromFunction1(TupleExpression))
    if (TypeName != null) __obj.updateDynamic("TypeName")(js.Any.fromFunction1(TypeName))
    if (UserDefinedTypeName != null) __obj.updateDynamic("UserDefinedTypeName")(js.Any.fromFunction1(UserDefinedTypeName))
    if (UsingForDeclaration != null) __obj.updateDynamic("UsingForDeclaration")(js.Any.fromFunction1(UsingForDeclaration))
    if (VariableDeclaration != null) __obj.updateDynamic("VariableDeclaration")(js.Any.fromFunction1(VariableDeclaration))
    if (VariableDeclarationStatement != null) __obj.updateDynamic("VariableDeclarationStatement")(js.Any.fromFunction1(VariableDeclarationStatement))
    if (Version != null) __obj.updateDynamic("Version")(js.Any.fromFunction1(Version))
    if (VersionConstraint != null) __obj.updateDynamic("VersionConstraint")(js.Any.fromFunction1(VersionConstraint))
    if (VersionOperator != null) __obj.updateDynamic("VersionOperator")(js.Any.fromFunction1(VersionOperator))
    if (WhileStatement != null) __obj.updateDynamic("WhileStatement")(js.Any.fromFunction1(WhileStatement))
    __obj.asInstanceOf[Visitor]
  }
}

