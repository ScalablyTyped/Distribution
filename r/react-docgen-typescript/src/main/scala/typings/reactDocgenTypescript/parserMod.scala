package typings.reactDocgenTypescript

import org.scalablytyped.runtime.StringDictionary
import typings.reactDocgenTypescript.anon.Description
import typings.reactDocgenTypescript.reactDocgenTypescriptBooleans.`false`
import typings.typescript.mod.ArrowFunction
import typings.typescript.mod.BindingElement
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.FunctionDeclaration
import typings.typescript.mod.FunctionExpression
import typings.typescript.mod.ImportSpecifier
import typings.typescript.mod.NodeArray
import typings.typescript.mod.Program
import typings.typescript.mod.PropertyAssignment
import typings.typescript.mod.Signature
import typings.typescript.mod.SourceFile
import typings.typescript.mod.Statement
import typings.typescript.mod.Symbol
import typings.typescript.mod.SymbolDisplayPart
import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("react-docgen-typescript/lib/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-docgen-typescript/lib/parser", "Parser")
  @js.native
  open class Parser protected () extends StObject {
    def this(program: Program, opts: ParserOptions) = this()
    
    /* private */ val checker: Any = js.native
    
    def extractDefaultPropsFromComponent(symbol: Symbol, source: SourceFile): js.Object = js.native
    
    def extractMembersFromType(`type`: Type): js.Array[Symbol] = js.native
    
    def extractPropsFromTypeIfStatefulComponent(`type`: Type): Symbol | Null = js.native
    
    def extractPropsFromTypeIfStatelessComponent(`type`: Type): Symbol | Null = js.native
    
    def findDocComment(symbol: Symbol): JSDoc = js.native
    
    def getCallSignature(symbol: Symbol): Signature = js.native
    
    /* private */ var getComponentFromExpression: Any = js.native
    
    def getComponentInfo(exp: Symbol, source: SourceFile): ComponentDoc | Null = js.native
    def getComponentInfo(
      exp: Symbol,
      source: SourceFile,
      componentNameResolver: Unit,
      customComponentTypes: js.UndefOr[js.Array[String]]
    ): ComponentDoc | Null = js.native
    def getComponentInfo(exp: Symbol, source: SourceFile, componentNameResolver: ComponentNameResolver): ComponentDoc | Null = js.native
    def getComponentInfo(
      exp: Symbol,
      source: SourceFile,
      componentNameResolver: ComponentNameResolver,
      customComponentTypes: js.UndefOr[js.Array[String]]
    ): ComponentDoc | Null = js.native
    
    def getDocgenType(propType: Type, isRequired: Boolean): PropItemType = js.native
    
    /**
      * Extracts a full JsDoc comment from a symbol, even
      * though TypeScript has broken down the JsDoc comment into plain
      * text and JsDoc tags.
      */
    def getFullJsDocComment(symbol: Symbol): JSDoc = js.native
    
    def getFunctionStatement(statement: Statement): js.UndefOr[ArrowFunction | FunctionExpression | FunctionDeclaration] = js.native
    
    /* private */ var getInfoFromUnionType: Any = js.native
    
    def getLiteralValueFromImportSpecifier(property: ImportSpecifier): js.UndefOr[String | Boolean | Double | Null] = js.native
    
    def getLiteralValueFromPropertyAssignment(property: BindingElement): js.UndefOr[String | Boolean | Double | Null] = js.native
    def getLiteralValueFromPropertyAssignment(property: PropertyAssignment): js.UndefOr[String | Boolean | Double | Null] = js.native
    
    def getMethodsInfo(`type`: Type): js.Array[Method] = js.native
    
    def getModifiers(member: Symbol): js.Array[String] = js.native
    
    def getParameterInfo(callSignature: Signature): js.Array[MethodParameter] = js.native
    
    def getPropMap(properties: NodeArray[PropertyAssignment | BindingElement]): StringIndexedObject[String | Boolean | Double | Null] = js.native
    
    def getPropsInfo(propsObj: Symbol): Props = js.native
    def getPropsInfo(propsObj: Symbol, defaultProps: StringIndexedObject[String]): Props = js.native
    
    def getReturnDescription(symbol: Symbol): js.UndefOr[js.Array[SymbolDisplayPart]] = js.native
    
    /* private */ var getValuesFromUnionType: Any = js.native
    
    def isTaggedPublic(symbol: Symbol): Boolean = js.native
    
    /* private */ val propFilter: Any = js.native
    
    /* private */ val savePropValueAsString: Any = js.native
    
    /* private */ val shouldExtractLiteralValuesFromEnum: Any = js.native
    
    /* private */ val shouldExtractValuesFromUnion: Any = js.native
    
    /* private */ val shouldIncludeExpression: Any = js.native
    
    /* private */ val shouldIncludePropTagMap: Any = js.native
    
    /* private */ val shouldRemoveUndefinedFromOptional: Any = js.native
  }
  
  @JSImport("react-docgen-typescript/lib/parser", "defaultOptions")
  @js.native
  val defaultOptions: CompilerOptions = js.native
  
  @JSImport("react-docgen-typescript/lib/parser", "defaultParserOpts")
  @js.native
  val defaultParserOpts: ParserOptions = js.native
  
  inline def getDefaultExportForFile(source: SourceFile): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultExportForFile")(source.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(filePathOrPaths: String): js.Array[ComponentDoc] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(filePathOrPaths.asInstanceOf[js.Any]).asInstanceOf[js.Array[ComponentDoc]]
  inline def parse(filePathOrPaths: String, parserOpts: ParserOptions): js.Array[ComponentDoc] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(filePathOrPaths.asInstanceOf[js.Any], parserOpts.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentDoc]]
  inline def parse(filePathOrPaths: js.Array[String]): js.Array[ComponentDoc] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(filePathOrPaths.asInstanceOf[js.Any]).asInstanceOf[js.Array[ComponentDoc]]
  inline def parse(filePathOrPaths: js.Array[String], parserOpts: ParserOptions): js.Array[ComponentDoc] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(filePathOrPaths.asInstanceOf[js.Any], parserOpts.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentDoc]]
  
  inline def withCompilerOptions(compilerOptions: CompilerOptions): FileParser = ^.asInstanceOf[js.Dynamic].applyDynamic("withCompilerOptions")(compilerOptions.asInstanceOf[js.Any]).asInstanceOf[FileParser]
  inline def withCompilerOptions(compilerOptions: CompilerOptions, parserOpts: ParserOptions): FileParser = (^.asInstanceOf[js.Dynamic].applyDynamic("withCompilerOptions")(compilerOptions.asInstanceOf[js.Any], parserOpts.asInstanceOf[js.Any])).asInstanceOf[FileParser]
  
  inline def withCustomConfig(tsconfigPath: String, parserOpts: ParserOptions): FileParser = (^.asInstanceOf[js.Dynamic].applyDynamic("withCustomConfig")(tsconfigPath.asInstanceOf[js.Any], parserOpts.asInstanceOf[js.Any])).asInstanceOf[FileParser]
  
  inline def withDefaultConfig(): FileParser = ^.asInstanceOf[js.Dynamic].applyDynamic("withDefaultConfig")().asInstanceOf[FileParser]
  inline def withDefaultConfig(parserOpts: ParserOptions): FileParser = ^.asInstanceOf[js.Dynamic].applyDynamic("withDefaultConfig")(parserOpts.asInstanceOf[js.Any]).asInstanceOf[FileParser]
  
  trait Component extends StObject {
    
    var name: String
  }
  object Component {
    
    inline def apply(name: String): Component = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Component]
    }
    
    extension [Self <: Component](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentDoc extends StObject {
    
    var description: String
    
    var displayName: String
    
    var expression: js.UndefOr[Symbol] = js.undefined
    
    var filePath: String
    
    var methods: js.Array[Method]
    
    var props: Props
    
    var tags: js.UndefOr[StringIndexedObject[String]] = js.undefined
  }
  object ComponentDoc {
    
    inline def apply(
      description: String,
      displayName: String,
      filePath: String,
      methods: js.Array[Method],
      props: Props
    ): ComponentDoc = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentDoc]
    }
    
    extension [Self <: ComponentDoc](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setExpression(value: Symbol): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setMethods(value: js.Array[Method]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsVarargs(value: Method*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringIndexedObject[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
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
  
  trait JSDoc extends StObject {
    
    var description: String
    
    var fullComment: String
    
    var tags: StringIndexedObject[String]
  }
  object JSDoc {
    
    inline def apply(description: String, fullComment: String, tags: StringIndexedObject[String]): JSDoc = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fullComment = fullComment.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSDoc]
    }
    
    extension [Self <: JSDoc](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setFullComment(value: String): Self = StObject.set(x, "fullComment", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringIndexedObject[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
  
  trait Method extends StObject {
    
    var description: String
    
    var docblock: String
    
    var modifiers: js.Array[String]
    
    var name: String
    
    var params: js.Array[MethodParameter]
    
    var returns: js.UndefOr[Description | Null] = js.undefined
  }
  object Method {
    
    inline def apply(
      description: String,
      docblock: String,
      modifiers: js.Array[String],
      name: String,
      params: js.Array[MethodParameter]
    ): Method = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], docblock = docblock.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    extension [Self <: Method](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDocblock(value: String): Self = StObject.set(x, "docblock", value.asInstanceOf[js.Any])
      
      inline def setModifiers(value: js.Array[String]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersVarargs(value: String*): Self = StObject.set(x, "modifiers", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[MethodParameter]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: MethodParameter*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setReturns(value: Description): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
      
      inline def setReturnsNull: Self = StObject.set(x, "returns", null)
      
      inline def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
    }
  }
  
  trait MethodParameter extends StObject {
    
    var description: js.UndefOr[String | Null] = js.undefined
    
    var name: String
    
    var `type`: MethodParameterType
  }
  object MethodParameter {
    
    inline def apply(name: String, `type`: MethodParameterType): MethodParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodParameter]
    }
    
    extension [Self <: MethodParameter](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: MethodParameterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MethodParameterType extends StObject {
    
    var name: String
  }
  object MethodParameterType {
    
    inline def apply(name: String): MethodParameterType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodParameterType]
    }
    
    extension [Self <: MethodParameterType](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParentType extends StObject {
    
    var fileName: String
    
    var name: String
  }
  object ParentType {
    
    inline def apply(fileName: String, name: String): ParentType = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParentType]
    }
    
    extension [Self <: ParentType](x: Self) {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParserOptions extends StObject {
    
    var componentNameResolver: js.UndefOr[ComponentNameResolver] = js.undefined
    
    var customComponentTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var propFilter: js.UndefOr[StaticPropFilter | PropFilter] = js.undefined
    
    var savePropValueAsString: js.UndefOr[Boolean] = js.undefined
    
    var shouldExtractLiteralValuesFromEnum: js.UndefOr[Boolean] = js.undefined
    
    var shouldExtractValuesFromUnion: js.UndefOr[Boolean] = js.undefined
    
    var shouldIncludeExpression: js.UndefOr[Boolean] = js.undefined
    
    var shouldIncludePropTagMap: js.UndefOr[Boolean] = js.undefined
    
    var shouldRemoveUndefinedFromOptional: js.UndefOr[Boolean] = js.undefined
    
    var skipChildrenPropWithoutDoc: js.UndefOr[Boolean] = js.undefined
  }
  object ParserOptions {
    
    inline def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    extension [Self <: ParserOptions](x: Self) {
      
      inline def setComponentNameResolver(value: (/* exp */ Symbol, /* source */ SourceFile) => js.UndefOr[String | Null | `false`]): Self = StObject.set(x, "componentNameResolver", js.Any.fromFunction2(value))
      
      inline def setComponentNameResolverUndefined: Self = StObject.set(x, "componentNameResolver", js.undefined)
      
      inline def setCustomComponentTypes(value: js.Array[String]): Self = StObject.set(x, "customComponentTypes", value.asInstanceOf[js.Any])
      
      inline def setCustomComponentTypesUndefined: Self = StObject.set(x, "customComponentTypes", js.undefined)
      
      inline def setCustomComponentTypesVarargs(value: String*): Self = StObject.set(x, "customComponentTypes", js.Array(value*))
      
      inline def setPropFilter(value: StaticPropFilter | PropFilter): Self = StObject.set(x, "propFilter", value.asInstanceOf[js.Any])
      
      inline def setPropFilterFunction2(value: (/* props */ PropItem, /* component */ Component) => Boolean): Self = StObject.set(x, "propFilter", js.Any.fromFunction2(value))
      
      inline def setPropFilterUndefined: Self = StObject.set(x, "propFilter", js.undefined)
      
      inline def setSavePropValueAsString(value: Boolean): Self = StObject.set(x, "savePropValueAsString", value.asInstanceOf[js.Any])
      
      inline def setSavePropValueAsStringUndefined: Self = StObject.set(x, "savePropValueAsString", js.undefined)
      
      inline def setShouldExtractLiteralValuesFromEnum(value: Boolean): Self = StObject.set(x, "shouldExtractLiteralValuesFromEnum", value.asInstanceOf[js.Any])
      
      inline def setShouldExtractLiteralValuesFromEnumUndefined: Self = StObject.set(x, "shouldExtractLiteralValuesFromEnum", js.undefined)
      
      inline def setShouldExtractValuesFromUnion(value: Boolean): Self = StObject.set(x, "shouldExtractValuesFromUnion", value.asInstanceOf[js.Any])
      
      inline def setShouldExtractValuesFromUnionUndefined: Self = StObject.set(x, "shouldExtractValuesFromUnion", js.undefined)
      
      inline def setShouldIncludeExpression(value: Boolean): Self = StObject.set(x, "shouldIncludeExpression", value.asInstanceOf[js.Any])
      
      inline def setShouldIncludeExpressionUndefined: Self = StObject.set(x, "shouldIncludeExpression", js.undefined)
      
      inline def setShouldIncludePropTagMap(value: Boolean): Self = StObject.set(x, "shouldIncludePropTagMap", value.asInstanceOf[js.Any])
      
      inline def setShouldIncludePropTagMapUndefined: Self = StObject.set(x, "shouldIncludePropTagMap", js.undefined)
      
      inline def setShouldRemoveUndefinedFromOptional(value: Boolean): Self = StObject.set(x, "shouldRemoveUndefinedFromOptional", value.asInstanceOf[js.Any])
      
      inline def setShouldRemoveUndefinedFromOptionalUndefined: Self = StObject.set(x, "shouldRemoveUndefinedFromOptional", js.undefined)
      
      inline def setSkipChildrenPropWithoutDoc(value: Boolean): Self = StObject.set(x, "skipChildrenPropWithoutDoc", value.asInstanceOf[js.Any])
      
      inline def setSkipChildrenPropWithoutDocUndefined: Self = StObject.set(x, "skipChildrenPropWithoutDoc", js.undefined)
    }
  }
  
  type PropFilter = js.Function2[/* props */ PropItem, /* component */ Component, Boolean]
  
  trait PropItem extends StObject {
    
    var declarations: js.UndefOr[js.Array[ParentType]] = js.undefined
    
    var defaultValue: Any
    
    var description: String
    
    var name: String
    
    var parent: js.UndefOr[ParentType] = js.undefined
    
    var required: Boolean
    
    var tags: js.UndefOr[js.Object] = js.undefined
    
    var `type`: PropItemType
  }
  object PropItem {
    
    inline def apply(defaultValue: Any, description: String, name: String, required: Boolean, `type`: PropItemType): PropItem = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropItem]
    }
    
    extension [Self <: PropItem](x: Self) {
      
      inline def setDeclarations(value: js.Array[ParentType]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
      
      inline def setDeclarationsUndefined: Self = StObject.set(x, "declarations", js.undefined)
      
      inline def setDeclarationsVarargs(value: ParentType*): Self = StObject.set(x, "declarations", js.Array(value*))
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParent(value: ParentType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Object): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setType(value: PropItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PropItemType extends StObject {
    
    var name: String
    
    var raw: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object PropItemType {
    
    inline def apply(name: String): PropItemType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropItemType]
    }
    
    extension [Self <: PropItemType](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Props = StringIndexedObject[PropItem]
  
  trait StaticPropFilter extends StObject {
    
    var skipPropsWithName: js.UndefOr[js.Array[String] | String] = js.undefined
    
    var skipPropsWithoutDoc: js.UndefOr[Boolean] = js.undefined
  }
  object StaticPropFilter {
    
    inline def apply(): StaticPropFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticPropFilter]
    }
    
    extension [Self <: StaticPropFilter](x: Self) {
      
      inline def setSkipPropsWithName(value: js.Array[String] | String): Self = StObject.set(x, "skipPropsWithName", value.asInstanceOf[js.Any])
      
      inline def setSkipPropsWithNameUndefined: Self = StObject.set(x, "skipPropsWithName", js.undefined)
      
      inline def setSkipPropsWithNameVarargs(value: String*): Self = StObject.set(x, "skipPropsWithName", js.Array(value*))
      
      inline def setSkipPropsWithoutDoc(value: Boolean): Self = StObject.set(x, "skipPropsWithoutDoc", value.asInstanceOf[js.Any])
      
      inline def setSkipPropsWithoutDocUndefined: Self = StObject.set(x, "skipPropsWithoutDoc", js.undefined)
    }
  }
  
  type StringIndexedObject[T] = StringDictionary[T]
}
