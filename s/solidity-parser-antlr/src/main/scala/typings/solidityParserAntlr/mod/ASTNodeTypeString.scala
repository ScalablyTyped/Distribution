package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait ASTNodeTypeString extends StObject
object ASTNodeTypeString {
  
  @scala.inline
  def ArrayTypeName: typings.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName = "ArrayTypeName".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName]
  
  @scala.inline
  def AssemblyAssignment: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment = "AssemblyAssignment".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment]
  
  @scala.inline
  def AssemblyBlock: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock = "AssemblyBlock".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock]
  
  @scala.inline
  def AssemblyCall: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall = "AssemblyCall".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall]
  
  @scala.inline
  def AssemblyCase: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase = "AssemblyCase".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase]
  
  @scala.inline
  def AssemblyFor: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor = "AssemblyFor".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor]
  
  @scala.inline
  def AssemblyFunctionDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition = "AssemblyFunctionDefinition".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition]
  
  @scala.inline
  def AssemblyFunctionReturns: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns = "AssemblyFunctionReturns".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionReturns]
  
  @scala.inline
  def AssemblyIf: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf = "AssemblyIf".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf]
  
  @scala.inline
  def AssemblyItem: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyItem = "AssemblyItem".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyItem]
  
  @scala.inline
  def AssemblyLiteral: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral = "AssemblyLiteral".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral]
  
  @scala.inline
  def AssemblyLocalDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition = "AssemblyLocalDefinition".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition]
  
  @scala.inline
  def AssemblyStackAssignment: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment = "AssemblyStackAssignment".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment]
  
  @scala.inline
  def AssemblySwitch: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch = "AssemblySwitch".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch]
  
  @scala.inline
  def BinaryOperation: typings.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation = "BinaryOperation".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation]
  
  @scala.inline
  def Block: typings.solidityParserAntlr.solidityParserAntlrStrings.Block = "Block".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.Block]
  
  @scala.inline
  def BooleanLiteral: typings.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral = "BooleanLiteral".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral]
  
  @scala.inline
  def Break: typings.solidityParserAntlr.solidityParserAntlrStrings.Break = "Break".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.Break]
  
  @scala.inline
  def BreakStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement = "BreakStatement".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement]
  
  @scala.inline
  def Conditional: typings.solidityParserAntlr.solidityParserAntlrStrings.Conditional = "Conditional".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.Conditional]
  
  @scala.inline
  def Continue: typings.solidityParserAntlr.solidityParserAntlrStrings.Continue = "Continue".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.Continue]
  
  @scala.inline
  def ContinueStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement = "ContinueStatement".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement]
  
  @scala.inline
  def ContractDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition = "ContractDefinition".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition]
  
  @scala.inline
  def DecimalNumber: typings.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber = "DecimalNumber".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber]
  
  @scala.inline
  def DoWhileStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement = "DoWhileStatement".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement]
  
  @scala.inline
  def ElementaryTypeName: typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName = "ElementaryTypeName".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName]
  
  @scala.inline
  def ElementaryTypeNameExpression: typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression = "ElementaryTypeNameExpression".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression]
  
  @scala.inline
  def EmitStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement = "EmitStatement".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement]
  
  @scala.inline
  def EnumDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition = "EnumDefinition".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition]
  
  @scala.inline
  def EnumValue: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumValue = "EnumValue".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.EnumValue]
  
  @scala.inline
  def EventDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition = "EventDefinition".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition]
  
  @scala.inline
  def ExpressionStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement = "ExpressionStatement".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement]
  
  @scala.inline
  def ForStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ForStatement = "ForStatement".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.ForStatement]
  
  @scala.inline
  def FunctionCall: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall = "FunctionCall".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall]
  
  @scala.inline
  def FunctionDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition = "FunctionDefinition".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition]
  
  @scala.inline
  def FunctionTypeName: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName = "FunctionTypeName".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName]
  
  @scala.inline
  def HexLiteral: typings.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral = "HexLiteral".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral]
  
  @scala.inline
  def HexNumber: typings.solidityParserAntlr.solidityParserAntlrStrings.HexNumber = "HexNumber".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.HexNumber]
  
  @scala.inline
  def Identifier: typings.solidityParserAntlr.solidityParserAntlrStrings.Identifier = "Identifier".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.Identifier]
  
  @scala.inline
  def IdentifierList: typings.solidityParserAntlr.solidityParserAntlrStrings.IdentifierList = "IdentifierList".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.IdentifierList]
  
  @scala.inline
  def IfStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.IfStatement = "IfStatement".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.IfStatement]
  
  @scala.inline
  def ImportDirective: typings.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective = "ImportDirective".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective]
  
  @scala.inline
  def IndexAccess: typings.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess = "IndexAccess".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess]
  
  @scala.inline
  def InheritanceSpecifier: typings.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier = "InheritanceSpecifier".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier]
  
  @scala.inline
  def InlineAssemblyStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement = "InlineAssemblyStatement".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement]
  
  @scala.inline
  def LabelDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition = "LabelDefinition".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition]
  
  @scala.inline
  def Mapping: typings.solidityParserAntlr.solidityParserAntlrStrings.Mapping = "Mapping".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.Mapping]
  
  @scala.inline
  def MemberAccess: typings.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess = "MemberAccess".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.MemberAccess]
  
  @scala.inline
  def ModifierDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition = "ModifierDefinition".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition]
  
  @scala.inline
  def ModifierInvocation: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation = "ModifierInvocation".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation]
  
  @scala.inline
  def NumberLiteral: typings.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral = "NumberLiteral".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral]
  
  @scala.inline
  def PragmaDirective: typings.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective = "PragmaDirective".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective]
  
  @scala.inline
  def PragmaName: typings.solidityParserAntlr.solidityParserAntlrStrings.PragmaName = "PragmaName".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.PragmaName]
  
  @scala.inline
  def PragmaValue: typings.solidityParserAntlr.solidityParserAntlrStrings.PragmaValue = "PragmaValue".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.PragmaValue]
  
  @scala.inline
  def ReturnStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement = "ReturnStatement".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement]
  
  @scala.inline
  def SourceUnit: typings.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit = "SourceUnit".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit]
  
  @scala.inline
  def StateMutability: typings.solidityParserAntlr.solidityParserAntlrStrings.StateMutability = "StateMutability".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.StateMutability]
  
  @scala.inline
  def StateVariableDeclaration: typings.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration = "StateVariableDeclaration".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration]
  
  @scala.inline
  def StorageLocation: typings.solidityParserAntlr.solidityParserAntlrStrings.StorageLocation = "StorageLocation".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.StorageLocation]
  
  @scala.inline
  def StringLiteral: typings.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral = "StringLiteral".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral]
  
  @scala.inline
  def StructDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition = "StructDefinition".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.StructDefinition]
  
  @scala.inline
  def SubAssembly: typings.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly = "SubAssembly".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly]
  
  @scala.inline
  def ThrowStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement = "ThrowStatement".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement]
  
  @scala.inline
  def TupleExpression: typings.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression = "TupleExpression".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression]
  
  @scala.inline
  def UserDefinedTypeName: typings.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName = "UserDefinedTypeName".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName]
  
  @scala.inline
  def UsingForDeclaration: typings.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration = "UsingForDeclaration".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration]
  
  @scala.inline
  def VariableDeclaration: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration = "VariableDeclaration".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration]
  
  @scala.inline
  def VariableDeclarationStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement = "VariableDeclarationStatement".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement]
  
  @scala.inline
  def WhileStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement = "WhileStatement".asInstanceOf[typings.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement]
}
