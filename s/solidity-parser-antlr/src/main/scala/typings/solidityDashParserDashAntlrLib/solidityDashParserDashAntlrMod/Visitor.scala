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

