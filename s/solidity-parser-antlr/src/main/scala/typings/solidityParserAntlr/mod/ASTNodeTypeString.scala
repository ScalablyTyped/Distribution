package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit
  - typings.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective
  - typings.solidityParserAntlr.solidityParserAntlrStrings.PragmaName
  - typings.solidityParserAntlr.solidityParserAntlrStrings.PragmaValue
  - typings.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective
  - typings.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition
  - typings.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier
  - typings.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration
  - typings.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration
  - typings.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition
  - typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition
  - typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation
  - typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition
  - typings.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition
  - typings.solidityParserAntlr.solidityParserAntlrStrings.EnumValue
  - typings.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition
  - typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration
  - typings.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName
  - typings.solidityParserAntlr.solidityParserAntlrStrings.Mapping
  - typings.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName
  - typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName
  - typings.solidityParserAntlr.solidityParserAntlrStrings.StorageLocation
  - typings.solidityParserAntlr.solidityParserAntlrStrings.StateMutability
  - typings.solidityParserAntlr.solidityParserAntlrStrings.Block
  - typings.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement
  - typings.solidityParserAntlr.solidityParserAntlrStrings.IfStatement
  - typings.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement
  - typings.solidityParserAntlr.solidityParserAntlrStrings.ForStatement
  - typings.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement
  - typings.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement
  - typings.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement
  - typings.solidityParserAntlr.solidityParserAntlrStrings.Break
  - typings.solidityParserAntlr.solidityParserAntlrStrings.Continue
  - typings.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement
  - typings.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement
  - typings.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement
  - typings.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement
  - typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement
  - typings.solidityParserAntlr.solidityParserAntlrStrings.IdentifierList
  - typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName
  - typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall
  - typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock
  - typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyItem
  - typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall
  - typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition
  - typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment
  - typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment
  - typings.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition
  - typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch
  - typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase
  - typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition
  - typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns
  - typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor
  - typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf
  - typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral
  - typings.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly
  - typings.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression
  - typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression
  - typings.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral
  - typings.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral
  - typings.solidityParserAntlr.solidityParserAntlrStrings.Identifier
  - typings.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation
  - typings.solidityParserAntlr.solidityParserAntlrStrings.Conditional
  - typings.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral
  - typings.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral
  - typings.solidityParserAntlr.solidityParserAntlrStrings.HexNumber
  - typings.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber
  - typings.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess
  - typings.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess
*/
trait ASTNodeTypeString extends js.Object

object ASTNodeTypeString {
  @scala.inline
  def ArrayTypeName: typings.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName = this.cast("ArrayTypeName")
  @scala.inline
  def AssemblyAssignment: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment = this.cast("AssemblyAssignment")
  @scala.inline
  def AssemblyBlock: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock = this.cast("AssemblyBlock")
  @scala.inline
  def AssemblyCall: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall = this.cast("AssemblyCall")
  @scala.inline
  def AssemblyCase: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase = this.cast("AssemblyCase")
  @scala.inline
  def AssemblyFor: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor = this.cast("AssemblyFor")
  @scala.inline
  def AssemblyFunctionDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition = this.cast("AssemblyFunctionDefinition")
  @scala.inline
  def AssemblyFunctionReturns: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns = this.cast("AssemblyFunctionReturns")
  @scala.inline
  def AssemblyIf: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf = this.cast("AssemblyIf")
  @scala.inline
  def AssemblyItem: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyItem = this.cast("AssemblyItem")
  @scala.inline
  def AssemblyLiteral: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral = this.cast("AssemblyLiteral")
  @scala.inline
  def AssemblyLocalDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition = this.cast("AssemblyLocalDefinition")
  @scala.inline
  def AssemblyStackAssignment: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment = this.cast("AssemblyStackAssignment")
  @scala.inline
  def AssemblySwitch: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch = this.cast("AssemblySwitch")
  @scala.inline
  def BinaryOperation: typings.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation = this.cast("BinaryOperation")
  @scala.inline
  def Block: typings.solidityParserAntlr.solidityParserAntlrStrings.Block = this.cast("Block")
  @scala.inline
  def BooleanLiteral: typings.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral = this.cast("BooleanLiteral")
  @scala.inline
  def Break: typings.solidityParserAntlr.solidityParserAntlrStrings.Break = this.cast("Break")
  @scala.inline
  def BreakStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement = this.cast("BreakStatement")
  @scala.inline
  def Conditional: typings.solidityParserAntlr.solidityParserAntlrStrings.Conditional = this.cast("Conditional")
  @scala.inline
  def Continue: typings.solidityParserAntlr.solidityParserAntlrStrings.Continue = this.cast("Continue")
  @scala.inline
  def ContinueStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement = this.cast("ContinueStatement")
  @scala.inline
  def ContractDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition = this.cast("ContractDefinition")
  @scala.inline
  def DecimalNumber: typings.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber = this.cast("DecimalNumber")
  @scala.inline
  def DoWhileStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement = this.cast("DoWhileStatement")
  @scala.inline
  def ElementaryTypeName: typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName = this.cast("ElementaryTypeName")
  @scala.inline
  def ElementaryTypeNameExpression: typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression = this.cast("ElementaryTypeNameExpression")
  @scala.inline
  def EmitStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement = this.cast("EmitStatement")
  @scala.inline
  def EnumDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition = this.cast("EnumDefinition")
  @scala.inline
  def EnumValue: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumValue = this.cast("EnumValue")
  @scala.inline
  def EventDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition = this.cast("EventDefinition")
  @scala.inline
  def ExpressionStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement = this.cast("ExpressionStatement")
  @scala.inline
  def ForStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ForStatement = this.cast("ForStatement")
  @scala.inline
  def FunctionCall: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall = this.cast("FunctionCall")
  @scala.inline
  def FunctionDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition = this.cast("FunctionDefinition")
  @scala.inline
  def FunctionTypeName: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName = this.cast("FunctionTypeName")
  @scala.inline
  def HexLiteral: typings.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral = this.cast("HexLiteral")
  @scala.inline
  def HexNumber: typings.solidityParserAntlr.solidityParserAntlrStrings.HexNumber = this.cast("HexNumber")
  @scala.inline
  def Identifier: typings.solidityParserAntlr.solidityParserAntlrStrings.Identifier = this.cast("Identifier")
  @scala.inline
  def IdentifierList: typings.solidityParserAntlr.solidityParserAntlrStrings.IdentifierList = this.cast("IdentifierList")
  @scala.inline
  def IfStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.IfStatement = this.cast("IfStatement")
  @scala.inline
  def ImportDirective: typings.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective = this.cast("ImportDirective")
  @scala.inline
  def IndexAccess: typings.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess = this.cast("IndexAccess")
  @scala.inline
  def InheritanceSpecifier: typings.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier = this.cast("InheritanceSpecifier")
  @scala.inline
  def InlineAssemblyStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement = this.cast("InlineAssemblyStatement")
  @scala.inline
  def LabelDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition = this.cast("LabelDefinition")
  @scala.inline
  def Mapping: typings.solidityParserAntlr.solidityParserAntlrStrings.Mapping = this.cast("Mapping")
  @scala.inline
  def MemberAccess: typings.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess = this.cast("MemberAccess")
  @scala.inline
  def ModifierDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition = this.cast("ModifierDefinition")
  @scala.inline
  def ModifierInvocation: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation = this.cast("ModifierInvocation")
  @scala.inline
  def NumberLiteral: typings.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral = this.cast("NumberLiteral")
  @scala.inline
  def PragmaDirective: typings.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective = this.cast("PragmaDirective")
  @scala.inline
  def PragmaName: typings.solidityParserAntlr.solidityParserAntlrStrings.PragmaName = this.cast("PragmaName")
  @scala.inline
  def PragmaValue: typings.solidityParserAntlr.solidityParserAntlrStrings.PragmaValue = this.cast("PragmaValue")
  @scala.inline
  def ReturnStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement = this.cast("ReturnStatement")
  @scala.inline
  def SourceUnit: typings.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit = this.cast("SourceUnit")
  @scala.inline
  def StateMutability: typings.solidityParserAntlr.solidityParserAntlrStrings.StateMutability = this.cast("StateMutability")
  @scala.inline
  def StateVariableDeclaration: typings.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration = this.cast("StateVariableDeclaration")
  @scala.inline
  def StorageLocation: typings.solidityParserAntlr.solidityParserAntlrStrings.StorageLocation = this.cast("StorageLocation")
  @scala.inline
  def StringLiteral: typings.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral = this.cast("StringLiteral")
  @scala.inline
  def StructDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition = this.cast("StructDefinition")
  @scala.inline
  def SubAssembly: typings.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly = this.cast("SubAssembly")
  @scala.inline
  def ThrowStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement = this.cast("ThrowStatement")
  @scala.inline
  def TupleExpression: typings.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression = this.cast("TupleExpression")
  @scala.inline
  def UserDefinedTypeName: typings.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName = this.cast("UserDefinedTypeName")
  @scala.inline
  def UsingForDeclaration: typings.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration = this.cast("UsingForDeclaration")
  @scala.inline
  def VariableDeclaration: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration = this.cast("VariableDeclaration")
  @scala.inline
  def VariableDeclarationStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement = this.cast("VariableDeclarationStatement")
  @scala.inline
  def WhileStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement = this.cast("WhileStatement")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

