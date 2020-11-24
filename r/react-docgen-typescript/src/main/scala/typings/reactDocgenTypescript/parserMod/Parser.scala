package typings.reactDocgenTypescript.parserMod

import typings.typescript.mod.ArrowFunction
import typings.typescript.mod.BindingElement
import typings.typescript.mod.FunctionDeclaration
import typings.typescript.mod.FunctionExpression
import typings.typescript.mod.NodeArray
import typings.typescript.mod.Program
import typings.typescript.mod.PropertyAssignment
import typings.typescript.mod.Signature
import typings.typescript.mod.SourceFile
import typings.typescript.mod.Statement
import typings.typescript.mod.Symbol
import typings.typescript.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-docgen-typescript/lib/parser", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(program: Program, opts: ParserOptions) = this()
  
  var checker: js.Any = js.native
  
  def extractDefaultPropsFromComponent(symbol: Symbol, source: SourceFile): js.Object = js.native
  
  def extractMembersFromType(`type`: Type): js.Array[Symbol] = js.native
  
  def extractPropsFromTypeIfStatefulComponent(`type`: Type): Symbol | Null = js.native
  
  def extractPropsFromTypeIfStatelessComponent(`type`: Type): Symbol | Null = js.native
  
  def findDocComment(symbol: Symbol): JSDoc = js.native
  
  def getCallSignature(symbol: Symbol): Signature = js.native
  
  var getComponentFromExpression: js.Any = js.native
  
  def getComponentInfo(exp: Symbol, source: SourceFile): ComponentDoc | Null = js.native
  def getComponentInfo(exp: Symbol, source: SourceFile, componentNameResolver: ComponentNameResolver): ComponentDoc | Null = js.native
  
  def getDocgenType(propType: Type, isRequired: Boolean): PropItemType = js.native
  
  /**
    * Extracts a full JsDoc comment from a symbol, even
    * though TypeScript has broken down the JsDoc comment into plain
    * text and JsDoc tags.
    */
  def getFullJsDocComment(symbol: Symbol): JSDoc = js.native
  
  def getFunctionStatement(statement: Statement): js.UndefOr[ArrowFunction | FunctionExpression | FunctionDeclaration] = js.native
  
  def getLiteralValueFromPropertyAssignment(property: BindingElement): js.UndefOr[String | Boolean | Double | Null] = js.native
  def getLiteralValueFromPropertyAssignment(property: PropertyAssignment): js.UndefOr[String | Boolean | Double | Null] = js.native
  
  def getMethodsInfo(`type`: Type): js.Array[Method] = js.native
  
  def getModifiers(member: Symbol): js.Array[String] = js.native
  
  def getParameterInfo(callSignature: Signature): js.Array[MethodParameter] = js.native
  
  def getPropMap(properties: NodeArray[PropertyAssignment | BindingElement]): StringIndexedObject[String | Boolean | Double | Null] = js.native
  
  def getPropsInfo(propsObj: Symbol): Props = js.native
  def getPropsInfo(propsObj: Symbol, defaultProps: StringIndexedObject[String]): Props = js.native
  
  def getReturnDescription(symbol: Symbol): String | Null = js.native
  
  var getValuesFromUnionType: js.Any = js.native
  
  def isTaggedPublic(symbol: Symbol): Boolean = js.native
  
  var propFilter: js.Any = js.native
  
  var savePropValueAsString: js.Any = js.native
  
  var shouldExtractLiteralValuesFromEnum: js.Any = js.native
  
  var shouldExtractValuesFromUnion: js.Any = js.native
  
  var shouldRemoveUndefinedFromOptional: js.Any = js.native
}
