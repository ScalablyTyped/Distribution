package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Visitor extends js.Object {
  var AssemblyAssignment: js.UndefOr[js.Function1[/* node */ AssemblyAssignment, scala.Unit]] = js.undefined
  var AssemblyBlock: js.UndefOr[js.Function1[/* node */ AssemblyBlock, scala.Unit]] = js.undefined
  var AssemblyCall: js.UndefOr[js.Function1[/* node */ AssemblyCall, scala.Unit]] = js.undefined
  var AssemblyCase: js.UndefOr[js.Function1[/* node */ AssemblyCase, scala.Unit]] = js.undefined
  var AssemblyExpression: js.UndefOr[js.Function1[/* node */ AssemblyExpression, scala.Unit]] = js.undefined
  var AssemblyFor: js.UndefOr[js.Function1[/* node */ AssemblyFor, scala.Unit]] = js.undefined
  var AssemblyFunctionDefinition: js.UndefOr[js.Function1[/* node */ AssemblyFunctionDefinition, scala.Unit]] = js.undefined
  var AssemblyFunctionReturns: js.UndefOr[js.Function1[/* node */ AssemblyFunctionReturns, scala.Unit]] = js.undefined
  var AssemblyIdentifierList: js.UndefOr[js.Function1[/* node */ AssemblyIdentifierList, scala.Unit]] = js.undefined
  var AssemblyIdentifierOrList: js.UndefOr[js.Function1[/* node */ AssemblyIdentifierOrList, scala.Unit]] = js.undefined
  var AssemblyIf: js.UndefOr[js.Function1[/* node */ AssemblyIf, scala.Unit]] = js.undefined
  var AssemblyItem: js.UndefOr[js.Function1[/* node */ AssemblyItem, scala.Unit]] = js.undefined
  var AssemblyLiteral: js.UndefOr[js.Function1[/* node */ AssemblyLiteral, scala.Unit]] = js.undefined
  var AssemblyLocalDefinition: js.UndefOr[js.Function1[/* node */ AssemblyLocalDefinition, scala.Unit]] = js.undefined
  var AssemblyStackAssignment: js.UndefOr[js.Function1[/* node */ AssemblyStackAssignment, scala.Unit]] = js.undefined
  var AssemblySwitch: js.UndefOr[js.Function1[/* node */ AssemblySwitch, scala.Unit]] = js.undefined
  var BinaryOperation: js.UndefOr[js.Function1[/* node */ BinaryOperation, scala.Unit]] = js.undefined
  var Block: js.UndefOr[js.Function1[/* node */ Block, scala.Unit]] = js.undefined
  var BreakStatement: js.UndefOr[js.Function1[/* node */ BreakStatement, scala.Unit]] = js.undefined
  var Conditional: js.UndefOr[js.Function1[/* node */ Conditional, scala.Unit]] = js.undefined
  var ContinueStatement: js.UndefOr[js.Function1[/* node */ ContinueStatement, scala.Unit]] = js.undefined
  var ContractDefinition: js.UndefOr[js.Function1[/* node */ ContractDefinition, scala.Unit]] = js.undefined
  var ContractPart: js.UndefOr[js.Function1[/* node */ ContractPart, scala.Unit]] = js.undefined
  var DoWhileStatement: js.UndefOr[js.Function1[/* node */ DoWhileStatement, scala.Unit]] = js.undefined
  var ElementaryTypeName: js.UndefOr[js.Function1[/* node */ ElementaryTypeName, scala.Unit]] = js.undefined
  var ElementaryTypeNameExpression: js.UndefOr[js.Function1[/* node */ ElementaryTypeNameExpression, scala.Unit]] = js.undefined
  var EnumDefinition: js.UndefOr[js.Function1[/* node */ EnumDefinition, scala.Unit]] = js.undefined
  var EnumValue: js.UndefOr[js.Function1[/* node */ EnumValue, scala.Unit]] = js.undefined
  var EventDefinition: js.UndefOr[js.Function1[/* node */ EventDefinition, scala.Unit]] = js.undefined
  var EventParameter: js.UndefOr[js.Function1[/* node */ EventParameter, scala.Unit]] = js.undefined
  var EventParameterList: js.UndefOr[js.Function1[/* node */ EventParameterList, scala.Unit]] = js.undefined
  var Expression: js.UndefOr[js.Function1[/* node */ Expression, scala.Unit]] = js.undefined
  var ExpressionList: js.UndefOr[js.Function1[/* node */ ExpressionList, scala.Unit]] = js.undefined
  var ExpressionStatement: js.UndefOr[js.Function1[/* node */ ExpressionStatement, scala.Unit]] = js.undefined
  var ForStatement: js.UndefOr[js.Function1[/* node */ ForStatement, scala.Unit]] = js.undefined
  var FunctionCallArguments: js.UndefOr[js.Function1[/* node */ FunctionCallArguments, scala.Unit]] = js.undefined
  var FunctionDefinition: js.UndefOr[js.Function1[/* node */ FunctionDefinition, scala.Unit]] = js.undefined
  var FunctionTypeName: js.UndefOr[js.Function1[/* node */ FunctionTypeName, scala.Unit]] = js.undefined
  var FunctionTypeParameter: js.UndefOr[js.Function1[/* node */ FunctionTypeParameter, scala.Unit]] = js.undefined
  var FunctionTypeParameterList: js.UndefOr[js.Function1[/* node */ FunctionTypeParameterList, scala.Unit]] = js.undefined
  var Identifier: js.UndefOr[js.Function1[/* node */ Identifier, scala.Unit]] = js.undefined
  var IdentifierList: js.UndefOr[js.Function1[/* node */ IdentifierList, scala.Unit]] = js.undefined
  var IfStatement: js.UndefOr[js.Function1[/* node */ IfStatement, scala.Unit]] = js.undefined
  var ImportDeclaration: js.UndefOr[js.Function1[/* node */ ImportDeclaration, scala.Unit]] = js.undefined
  var ImportDirective: js.UndefOr[js.Function1[/* node */ ImportDirective, scala.Unit]] = js.undefined
  var InheritanceSpecifier: js.UndefOr[js.Function1[/* node */ InheritanceSpecifier, scala.Unit]] = js.undefined
  var InlineAssemblyStatement: js.UndefOr[js.Function1[/* node */ InlineAssemblyStatement, scala.Unit]] = js.undefined
  var LabelDefinition: js.UndefOr[js.Function1[/* node */ LabelDefinition, scala.Unit]] = js.undefined
  var Mapping: js.UndefOr[js.Function1[/* node */ Mapping, scala.Unit]] = js.undefined
  var ModifierDefinition: js.UndefOr[js.Function1[/* node */ ModifierDefinition, scala.Unit]] = js.undefined
  var ModifierInvocation: js.UndefOr[js.Function1[/* node */ ModifierInvocation, scala.Unit]] = js.undefined
  var ModifierList: js.UndefOr[js.Function1[/* node */ ModifierList, scala.Unit]] = js.undefined
  var NameValue: js.UndefOr[js.Function1[/* node */ NameValue, scala.Unit]] = js.undefined
  var NameValueList: js.UndefOr[js.Function1[/* node */ NameValueList, scala.Unit]] = js.undefined
  var NumberLiteral: js.UndefOr[js.Function1[/* node */ NumberLiteral, scala.Unit]] = js.undefined
  var Parameter: js.UndefOr[js.Function1[/* node */ Parameter, scala.Unit]] = js.undefined
  var ParameterList: js.UndefOr[js.Function1[/* node */ ParameterList, scala.Unit]] = js.undefined
  var PragmaDirective: js.UndefOr[js.Function1[/* node */ PragmaDirective, scala.Unit]] = js.undefined
  var PragmaName: js.UndefOr[js.Function1[/* node */ PragmaName, scala.Unit]] = js.undefined
  var PragmaValue: js.UndefOr[js.Function1[/* node */ PragmaValue, scala.Unit]] = js.undefined
  var PrimaryExpression: js.UndefOr[js.Function1[/* node */ PrimaryExpression, scala.Unit]] = js.undefined
  var ReturnParameters: js.UndefOr[js.Function1[/* node */ ReturnParameters, scala.Unit]] = js.undefined
  var ReturnStatement: js.UndefOr[js.Function1[/* node */ ReturnStatement, scala.Unit]] = js.undefined
  var SimpleStatement: js.UndefOr[js.Function1[/* node */ SimpleStatement, scala.Unit]] = js.undefined
  var SourceUnit: js.UndefOr[js.Function1[/* node */ SourceUnit, scala.Unit]] = js.undefined
  var StateMutability: js.UndefOr[js.Function1[/* node */ StateMutability, scala.Unit]] = js.undefined
  var StateVariableDeclaration: js.UndefOr[js.Function1[/* node */ StateVariableDeclaration, scala.Unit]] = js.undefined
  var Statement: js.UndefOr[js.Function1[/* node */ Statement, scala.Unit]] = js.undefined
  var StorageLocation: js.UndefOr[js.Function1[/* node */ StorageLocation, scala.Unit]] = js.undefined
  var StructDefinition: js.UndefOr[js.Function1[/* node */ StructDefinition, scala.Unit]] = js.undefined
  var SubAssembly: js.UndefOr[js.Function1[/* node */ SubAssembly, scala.Unit]] = js.undefined
  var ThrowStatement: js.UndefOr[js.Function1[/* node */ ThrowStatement, scala.Unit]] = js.undefined
  var TupleExpression: js.UndefOr[js.Function1[/* node */ TupleExpression, scala.Unit]] = js.undefined
  var TypeName: js.UndefOr[js.Function1[/* node */ TypeName, scala.Unit]] = js.undefined
  var UserDefinedTypeName: js.UndefOr[js.Function1[/* node */ UserDefinedTypeName, scala.Unit]] = js.undefined
  var UsingForDeclaration: js.UndefOr[js.Function1[/* node */ UsingForDeclaration, scala.Unit]] = js.undefined
  var VariableDeclaration: js.UndefOr[js.Function1[/* node */ VariableDeclaration, scala.Unit]] = js.undefined
  var VariableDeclarationStatement: js.UndefOr[js.Function1[/* node */ VariableDeclarationStatement, scala.Unit]] = js.undefined
  var Version: js.UndefOr[js.Function1[/* node */ Version, scala.Unit]] = js.undefined
  var VersionConstraint: js.UndefOr[js.Function1[/* node */ VersionConstraint, scala.Unit]] = js.undefined
  var VersionOperator: js.UndefOr[js.Function1[/* node */ VersionOperator, scala.Unit]] = js.undefined
  var WhileStatement: js.UndefOr[js.Function1[/* node */ WhileStatement, scala.Unit]] = js.undefined
}

