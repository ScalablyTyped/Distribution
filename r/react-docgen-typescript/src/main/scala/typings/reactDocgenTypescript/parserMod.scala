package typings.reactDocgenTypescript

import org.scalablytyped.runtime.StringDictionary
import typings.reactDocgenTypescript.anon.Description
import typings.reactDocgenTypescript.reactDocgenTypescriptBooleans.`false`
import typings.typescript.mod.ArrowFunction
import typings.typescript.mod.BindingElement
import typings.typescript.mod.CompilerOptions
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("react-docgen-typescript/lib/parser", "Parser")
  @js.native
  class Parser protected () extends StObject {
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
  
  @JSImport("react-docgen-typescript/lib/parser", "defaultOptions")
  @js.native
  val defaultOptions: CompilerOptions = js.native
  
  @JSImport("react-docgen-typescript/lib/parser", "defaultParserOpts")
  @js.native
  val defaultParserOpts: ParserOptions = js.native
  
  @JSImport("react-docgen-typescript/lib/parser", "getDefaultExportForFile")
  @js.native
  def getDefaultExportForFile(source: SourceFile): String = js.native
  
  @JSImport("react-docgen-typescript/lib/parser", "parse")
  @js.native
  def parse(filePathOrPaths: String): js.Array[ComponentDoc] = js.native
  @JSImport("react-docgen-typescript/lib/parser", "parse")
  @js.native
  def parse(filePathOrPaths: String, parserOpts: ParserOptions): js.Array[ComponentDoc] = js.native
  @JSImport("react-docgen-typescript/lib/parser", "parse")
  @js.native
  def parse(filePathOrPaths: js.Array[String]): js.Array[ComponentDoc] = js.native
  @JSImport("react-docgen-typescript/lib/parser", "parse")
  @js.native
  def parse(filePathOrPaths: js.Array[String], parserOpts: ParserOptions): js.Array[ComponentDoc] = js.native
  
  @JSImport("react-docgen-typescript/lib/parser", "withCompilerOptions")
  @js.native
  def withCompilerOptions(compilerOptions: CompilerOptions): FileParser = js.native
  @JSImport("react-docgen-typescript/lib/parser", "withCompilerOptions")
  @js.native
  def withCompilerOptions(compilerOptions: CompilerOptions, parserOpts: ParserOptions): FileParser = js.native
  
  @JSImport("react-docgen-typescript/lib/parser", "withCustomConfig")
  @js.native
  def withCustomConfig(tsconfigPath: String, parserOpts: ParserOptions): FileParser = js.native
  
  @JSImport("react-docgen-typescript/lib/parser", "withDefaultConfig")
  @js.native
  def withDefaultConfig(): FileParser = js.native
  @JSImport("react-docgen-typescript/lib/parser", "withDefaultConfig")
  @js.native
  def withDefaultConfig(parserOpts: ParserOptions): FileParser = js.native
  
  @js.native
  trait Component extends StObject {
    
    var name: String = js.native
  }
  object Component {
    
    @scala.inline
    def apply(name: String): Component = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Component]
    }
    
    @scala.inline
    implicit class ComponentMutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ComponentDoc extends StObject {
    
    var description: String = js.native
    
    var displayName: String = js.native
    
    var methods: js.Array[Method] = js.native
    
    var props: Props = js.native
  }
  object ComponentDoc {
    
    @scala.inline
    def apply(description: String, displayName: String, methods: js.Array[Method], props: Props): ComponentDoc = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentDoc]
    }
    
    @scala.inline
    implicit class ComponentDocMutableBuilder[Self <: ComponentDoc] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethods(value: js.Array[Method]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsVarargs(value: Method*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type ComponentNameResolver = js.Function2[/* exp */ Symbol, /* source */ SourceFile, js.UndefOr[String | Null | `false`]]
  
  @js.native
  trait FileParser extends StObject {
    
    def parse(filePathOrPaths: String): js.Array[ComponentDoc] = js.native
    def parse(filePathOrPaths: js.Array[String]): js.Array[ComponentDoc] = js.native
    
    def parseWithProgramProvider(filePathOrPaths: String): js.Array[ComponentDoc] = js.native
    def parseWithProgramProvider(filePathOrPaths: String, programProvider: js.Function0[Program]): js.Array[ComponentDoc] = js.native
    def parseWithProgramProvider(filePathOrPaths: js.Array[String]): js.Array[ComponentDoc] = js.native
    def parseWithProgramProvider(filePathOrPaths: js.Array[String], programProvider: js.Function0[Program]): js.Array[ComponentDoc] = js.native
  }
  
  @js.native
  trait JSDoc extends StObject {
    
    var description: String = js.native
    
    var fullComment: String = js.native
    
    var tags: StringIndexedObject[String] = js.native
  }
  object JSDoc {
    
    @scala.inline
    def apply(description: String, fullComment: String, tags: StringIndexedObject[String]): JSDoc = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fullComment = fullComment.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSDoc]
    }
    
    @scala.inline
    implicit class JSDocMutableBuilder[Self <: JSDoc] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullComment(value: String): Self = StObject.set(x, "fullComment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringIndexedObject[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Method extends StObject {
    
    var description: String = js.native
    
    var docblock: String = js.native
    
    var modifiers: js.Array[String] = js.native
    
    var name: String = js.native
    
    var params: js.Array[MethodParameter] = js.native
    
    var returns: js.UndefOr[Description | Null] = js.native
  }
  object Method {
    
    @scala.inline
    def apply(
      description: String,
      docblock: String,
      modifiers: js.Array[String],
      name: String,
      params: js.Array[MethodParameter]
    ): Method = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], docblock = docblock.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    @scala.inline
    implicit class MethodMutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocblock(value: String): Self = StObject.set(x, "docblock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiers(value: js.Array[String]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersVarargs(value: String*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Array[MethodParameter]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsVarargs(value: MethodParameter*): Self = StObject.set(x, "params", js.Array(value :_*))
      
      @scala.inline
      def setReturns(value: Description): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnsNull: Self = StObject.set(x, "returns", null)
      
      @scala.inline
      def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
    }
  }
  
  @js.native
  trait MethodParameter extends StObject {
    
    var description: js.UndefOr[String | Null] = js.native
    
    var name: String = js.native
    
    var `type`: MethodParameterType = js.native
  }
  object MethodParameter {
    
    @scala.inline
    def apply(name: String, `type`: MethodParameterType): MethodParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodParameter]
    }
    
    @scala.inline
    implicit class MethodParameterMutableBuilder[Self <: MethodParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: MethodParameterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MethodParameterType extends StObject {
    
    var name: String = js.native
  }
  object MethodParameterType {
    
    @scala.inline
    def apply(name: String): MethodParameterType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodParameterType]
    }
    
    @scala.inline
    implicit class MethodParameterTypeMutableBuilder[Self <: MethodParameterType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParentType extends StObject {
    
    var fileName: String = js.native
    
    var name: String = js.native
  }
  object ParentType {
    
    @scala.inline
    def apply(fileName: String, name: String): ParentType = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParentType]
    }
    
    @scala.inline
    implicit class ParentTypeMutableBuilder[Self <: ParentType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParserOptions extends StObject {
    
    var componentNameResolver: js.UndefOr[ComponentNameResolver] = js.native
    
    var propFilter: js.UndefOr[StaticPropFilter | PropFilter] = js.native
    
    var savePropValueAsString: js.UndefOr[Boolean] = js.native
    
    var shouldExtractLiteralValuesFromEnum: js.UndefOr[Boolean] = js.native
    
    var shouldExtractValuesFromUnion: js.UndefOr[Boolean] = js.native
    
    var shouldRemoveUndefinedFromOptional: js.UndefOr[Boolean] = js.native
  }
  object ParserOptions {
    
    @scala.inline
    def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    @scala.inline
    implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentNameResolver(value: (/* exp */ Symbol, /* source */ SourceFile) => js.UndefOr[String | Null | `false`]): Self = StObject.set(x, "componentNameResolver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setComponentNameResolverUndefined: Self = StObject.set(x, "componentNameResolver", js.undefined)
      
      @scala.inline
      def setPropFilter(value: StaticPropFilter | PropFilter): Self = StObject.set(x, "propFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropFilterFunction2(value: (/* props */ PropItem, /* component */ Component) => Boolean): Self = StObject.set(x, "propFilter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPropFilterUndefined: Self = StObject.set(x, "propFilter", js.undefined)
      
      @scala.inline
      def setSavePropValueAsString(value: Boolean): Self = StObject.set(x, "savePropValueAsString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSavePropValueAsStringUndefined: Self = StObject.set(x, "savePropValueAsString", js.undefined)
      
      @scala.inline
      def setShouldExtractLiteralValuesFromEnum(value: Boolean): Self = StObject.set(x, "shouldExtractLiteralValuesFromEnum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldExtractLiteralValuesFromEnumUndefined: Self = StObject.set(x, "shouldExtractLiteralValuesFromEnum", js.undefined)
      
      @scala.inline
      def setShouldExtractValuesFromUnion(value: Boolean): Self = StObject.set(x, "shouldExtractValuesFromUnion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldExtractValuesFromUnionUndefined: Self = StObject.set(x, "shouldExtractValuesFromUnion", js.undefined)
      
      @scala.inline
      def setShouldRemoveUndefinedFromOptional(value: Boolean): Self = StObject.set(x, "shouldRemoveUndefinedFromOptional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldRemoveUndefinedFromOptionalUndefined: Self = StObject.set(x, "shouldRemoveUndefinedFromOptional", js.undefined)
    }
  }
  
  type PropFilter = js.Function2[/* props */ PropItem, /* component */ Component, Boolean]
  
  @js.native
  trait PropItem extends StObject {
    
    var defaultValue: js.Any = js.native
    
    var description: String = js.native
    
    var name: String = js.native
    
    var parent: js.UndefOr[ParentType] = js.native
    
    var required: Boolean = js.native
    
    var `type`: PropItemType = js.native
  }
  object PropItem {
    
    @scala.inline
    def apply(defaultValue: js.Any, description: String, name: String, required: Boolean, `type`: PropItemType): PropItem = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropItem]
    }
    
    @scala.inline
    implicit class PropItemMutableBuilder[Self <: PropItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: ParentType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: PropItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PropItemType extends StObject {
    
    var name: String = js.native
    
    var raw: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object PropItemType {
    
    @scala.inline
    def apply(name: String): PropItemType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropItemType]
    }
    
    @scala.inline
    implicit class PropItemTypeMutableBuilder[Self <: PropItemType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Props = StringIndexedObject[PropItem]
  
  @js.native
  trait StaticPropFilter extends StObject {
    
    var skipPropsWithName: js.UndefOr[js.Array[String] | String] = js.native
    
    var skipPropsWithoutDoc: js.UndefOr[Boolean] = js.native
  }
  object StaticPropFilter {
    
    @scala.inline
    def apply(): StaticPropFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticPropFilter]
    }
    
    @scala.inline
    implicit class StaticPropFilterMutableBuilder[Self <: StaticPropFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSkipPropsWithName(value: js.Array[String] | String): Self = StObject.set(x, "skipPropsWithName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipPropsWithNameUndefined: Self = StObject.set(x, "skipPropsWithName", js.undefined)
      
      @scala.inline
      def setSkipPropsWithNameVarargs(value: String*): Self = StObject.set(x, "skipPropsWithName", js.Array(value :_*))
      
      @scala.inline
      def setSkipPropsWithoutDoc(value: Boolean): Self = StObject.set(x, "skipPropsWithoutDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipPropsWithoutDocUndefined: Self = StObject.set(x, "skipPropsWithoutDoc", js.undefined)
    }
  }
  
  type StringIndexedObject[T] = StringDictionary[T]
}
