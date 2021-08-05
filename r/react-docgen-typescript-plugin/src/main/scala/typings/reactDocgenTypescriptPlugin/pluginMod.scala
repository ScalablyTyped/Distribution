package typings.reactDocgenTypescriptPlugin

import org.scalablytyped.runtime.Instantiable1
import typings.reactDocgenTypescript.parserMod.ParserOptions
import typings.typescript.mod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("react-docgen-typescript-plugin/dist/plugin", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with DocgenPlugin {
    def this(options: PluginOptions) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
    
    /* private */ /* CompleteClass */
    var name: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var options: js.Any = js.native
  }
  
  trait DocgenPlugin extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit
    
    /* private */ var name: js.Any
    
    /* private */ var options: js.Any
  }
  object DocgenPlugin {
    
    inline def apply(
      apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any => Unit,
      name: js.Any,
      options: js.Any
    ): DocgenPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocgenPlugin]
    }
    
    extension [Self <: DocgenPlugin](x: Self) {
      
      inline def setApply(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any => Unit
      ): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  type DocgenPluginType = Instantiable1[/* options */ js.UndefOr[PluginOptions], DocgenPlugin]
  
  trait LoaderOptions extends StObject {
    
    /**
      * Specify the docgen collection name to use. All docgen information will
      * be collected into this global object. Set to null to disable.
      *
      * @default STORYBOOK_REACT_CLASSES
      * @see https://github.com/gongreg/react-storybook-addon-docgen
      **/
    var docgenCollectionName: js.UndefOr[String | Null] = js.undefined
    
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
    var setDisplayName: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify the name of the property for docgen info prop type.
      *
      * @default "type"
      */
    var typePropName: js.UndefOr[String] = js.undefined
  }
  object LoaderOptions {
    
    inline def apply(): LoaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderOptions]
    }
    
    extension [Self <: LoaderOptions](x: Self) {
      
      inline def setDocgenCollectionName(value: String): Self = StObject.set(x, "docgenCollectionName", value.asInstanceOf[js.Any])
      
      inline def setDocgenCollectionNameNull: Self = StObject.set(x, "docgenCollectionName", null)
      
      inline def setDocgenCollectionNameUndefined: Self = StObject.set(x, "docgenCollectionName", js.undefined)
      
      inline def setSetDisplayName(value: Boolean): Self = StObject.set(x, "setDisplayName", value.asInstanceOf[js.Any])
      
      inline def setSetDisplayNameUndefined: Self = StObject.set(x, "setDisplayName", js.undefined)
      
      inline def setTypePropName(value: String): Self = StObject.set(x, "typePropName", value.asInstanceOf[js.Any])
      
      inline def setTypePropNameUndefined: Self = StObject.set(x, "typePropName", js.undefined)
    }
  }
  
  trait PluginOptions
    extends StObject
       with ParserOptions
       with LoaderOptions
       with TypescriptOptions {
    
    /** Glob patterns to ignore */
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Glob patterns to include. defaults to ts|tsx */
    var include: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PluginOptions {
    
    inline def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    extension [Self <: PluginOptions](x: Self) {
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
    }
  }
  
  trait TypescriptOptions extends StObject {
    
    /** Specify TypeScript compiler options. Can not be used with tsconfigPath. */
    var compilerOptions: js.UndefOr[CompilerOptions] = js.undefined
    
    /**
      * Specify the location of the tsconfig.json to use. Can not be used with
      * compilerOptions.
      **/
    var tsconfigPath: js.UndefOr[String] = js.undefined
  }
  object TypescriptOptions {
    
    inline def apply(): TypescriptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypescriptOptions]
    }
    
    extension [Self <: TypescriptOptions](x: Self) {
      
      inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      inline def setTsconfigPath(value: String): Self = StObject.set(x, "tsconfigPath", value.asInstanceOf[js.Any])
      
      inline def setTsconfigPathUndefined: Self = StObject.set(x, "tsconfigPath", js.undefined)
    }
  }
}
