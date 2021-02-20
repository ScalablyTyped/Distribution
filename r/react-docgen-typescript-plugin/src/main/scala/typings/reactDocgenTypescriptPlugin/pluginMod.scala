package typings.reactDocgenTypescriptPlugin

import org.scalablytyped.runtime.Instantiable1
import typings.reactDocgenTypescript.parserMod.Component
import typings.reactDocgenTypescript.parserMod.ComponentNameResolver
import typings.reactDocgenTypescript.parserMod.PropFilter
import typings.reactDocgenTypescript.parserMod.PropItem
import typings.reactDocgenTypescript.parserMod.StaticPropFilter
import typings.reactDocgenTypescript.reactDocgenTypescriptBooleans.`false`
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.SourceFile
import typings.typescript.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("react-docgen-typescript-plugin/dist/plugin", JSImport.Default)
  @js.native
  class default () extends DocgenPlugin {
    def this(options: PluginOptions) = this()
  }
  
  @js.native
  trait DocgenPlugin extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
    
    var name: js.Any = js.native
    
    var options: js.Any = js.native
  }
  object DocgenPlugin {
    
    @scala.inline
    def apply(
      apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any => Unit,
      name: js.Any,
      options: js.Any
    ): DocgenPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocgenPlugin]
    }
    
    @scala.inline
    implicit class DocgenPluginMutableBuilder[Self <: DocgenPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any => Unit
      ): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  type DocgenPluginType = Instantiable1[/* options */ js.UndefOr[PluginOptions], DocgenPlugin]
  
  @js.native
  trait LoaderOptions extends StObject {
    
    /**
      * Specify the docgen collection name to use. All docgen information will
      * be collected into this global object. Set to null to disable.
      *
      * @default STORYBOOK_REACT_CLASSES
      * @see https://github.com/gongreg/react-storybook-addon-docgen
      **/
    var docgenCollectionName: js.UndefOr[String | Null] = js.native
    
    /**
      * Automatically set the component's display name. If you want to set display
      * names yourself or are using another plugin to do this, you should disable
      * this option.
      *
      * ```
      * class MyComponent extends React.Component {
      * ...
      * }
      *
      * MyComponent.displayName = "MyComponent";
      * ```
      *
      * @default true
      */
    var setDisplayName: js.UndefOr[Boolean] = js.native
    
    /**
      * Specify the name of the property for docgen info prop type.
      *
      * @default "type"
      */
    var typePropName: js.UndefOr[String] = js.native
  }
  object LoaderOptions {
    
    @scala.inline
    def apply(): LoaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderOptions]
    }
    
    @scala.inline
    implicit class LoaderOptionsMutableBuilder[Self <: LoaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocgenCollectionName(value: String): Self = StObject.set(x, "docgenCollectionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocgenCollectionNameNull: Self = StObject.set(x, "docgenCollectionName", null)
      
      @scala.inline
      def setDocgenCollectionNameUndefined: Self = StObject.set(x, "docgenCollectionName", js.undefined)
      
      @scala.inline
      def setSetDisplayName(value: Boolean): Self = StObject.set(x, "setDisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetDisplayNameUndefined: Self = StObject.set(x, "setDisplayName", js.undefined)
      
      @scala.inline
      def setTypePropName(value: String): Self = StObject.set(x, "typePropName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypePropNameUndefined: Self = StObject.set(x, "typePropName", js.undefined)
    }
  }
  
  /* Inlined react-docgen-typescript.react-docgen-typescript.ParserOptions & react-docgen-typescript-plugin.react-docgen-typescript-plugin/dist/plugin.LoaderOptions & react-docgen-typescript-plugin.react-docgen-typescript-plugin/dist/plugin.TypescriptOptions & {  exclude :std.Array<string> | undefined,   include :std.Array<string> | undefined} */
  @js.native
  trait PluginOptions extends StObject {
    
    /** Specify TypeScript compiler options. Can not be used with tsconfigPath. */
    var compilerOptions: js.UndefOr[CompilerOptions] = js.native
    
    var componentNameResolver: js.UndefOr[ComponentNameResolver] = js.native
    
    /**
      * Specify the docgen collection name to use. All docgen information will
      * be collected into this global object. Set to null to disable.
      *
      * @default STORYBOOK_REACT_CLASSES
      * @see https://github.com/gongreg/react-storybook-addon-docgen
      **/
    var docgenCollectionName: js.UndefOr[String | Null] = js.native
    
    /** Glob patterns to ignore */
    var exclude: js.UndefOr[js.Array[String]] = js.native
    
    /** Glob patterns to include. defaults to ts|tsx */
    var include: js.UndefOr[js.Array[String]] = js.native
    
    var propFilter: js.UndefOr[StaticPropFilter | PropFilter] = js.native
    
    var savePropValueAsString: js.UndefOr[Boolean] = js.native
    
    /**
      * Automatically set the component's display name. If you want to set display
      * names yourself or are using another plugin to do this, you should disable
      * this option.
      *
      * ```
      * class MyComponent extends React.Component {
      * ...
      * }
      *
      * MyComponent.displayName = "MyComponent";
      * ```
      *
      * @default true
      */
    var setDisplayName: js.UndefOr[Boolean] = js.native
    
    var shouldExtractLiteralValuesFromEnum: js.UndefOr[Boolean] = js.native
    
    var shouldExtractValuesFromUnion: js.UndefOr[Boolean] = js.native
    
    var shouldRemoveUndefinedFromOptional: js.UndefOr[Boolean] = js.native
    
    /**
      * Specify the location of the tsconfig.json to use. Can not be used with
      * compilerOptions.
      **/
    var tsconfigPath: js.UndefOr[String] = js.native
    
    /**
      * Specify the name of the property for docgen info prop type.
      *
      * @default "type"
      */
    var typePropName: js.UndefOr[String] = js.native
  }
  object PluginOptions {
    
    @scala.inline
    def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    @scala.inline
    implicit class PluginOptionsMutableBuilder[Self <: PluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      @scala.inline
      def setComponentNameResolver(value: (/* exp */ Symbol, /* source */ SourceFile) => js.UndefOr[String | Null | `false`]): Self = StObject.set(x, "componentNameResolver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setComponentNameResolverUndefined: Self = StObject.set(x, "componentNameResolver", js.undefined)
      
      @scala.inline
      def setDocgenCollectionName(value: String): Self = StObject.set(x, "docgenCollectionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocgenCollectionNameNull: Self = StObject.set(x, "docgenCollectionName", null)
      
      @scala.inline
      def setDocgenCollectionNameUndefined: Self = StObject.set(x, "docgenCollectionName", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
      
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
      def setSetDisplayName(value: Boolean): Self = StObject.set(x, "setDisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetDisplayNameUndefined: Self = StObject.set(x, "setDisplayName", js.undefined)
      
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
      
      @scala.inline
      def setTsconfigPath(value: String): Self = StObject.set(x, "tsconfigPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTsconfigPathUndefined: Self = StObject.set(x, "tsconfigPath", js.undefined)
      
      @scala.inline
      def setTypePropName(value: String): Self = StObject.set(x, "typePropName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypePropNameUndefined: Self = StObject.set(x, "typePropName", js.undefined)
    }
  }
  
  @js.native
  trait TypescriptOptions extends StObject {
    
    /** Specify TypeScript compiler options. Can not be used with tsconfigPath. */
    var compilerOptions: js.UndefOr[CompilerOptions] = js.native
    
    /**
      * Specify the location of the tsconfig.json to use. Can not be used with
      * compilerOptions.
      **/
    var tsconfigPath: js.UndefOr[String] = js.native
  }
  object TypescriptOptions {
    
    @scala.inline
    def apply(): TypescriptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypescriptOptions]
    }
    
    @scala.inline
    implicit class TypescriptOptionsMutableBuilder[Self <: TypescriptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      @scala.inline
      def setTsconfigPath(value: String): Self = StObject.set(x, "tsconfigPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTsconfigPathUndefined: Self = StObject.set(x, "tsconfigPath", js.undefined)
    }
  }
}
