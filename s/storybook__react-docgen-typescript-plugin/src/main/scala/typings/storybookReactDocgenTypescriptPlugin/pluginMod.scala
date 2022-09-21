package typings.storybookReactDocgenTypescriptPlugin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.reactDocgenTypescript.parserMod.ParserOptions
import typings.storybookReactDocgenTypescriptPlugin.anon.CompilerOptions
import typings.storybookReactDocgenTypescriptPlugin.anon.DocgenCollectionName
import typings.storybookReactDocgenTypescriptPlugin.typesMod.LoaderOptions
import typings.webpack.mod.Compiler
import typings.webpack.mod.WebpackPluginInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("@storybook/react-docgen-typescript-plugin/dist/plugin", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DocgenPlugin {
    def this(options: PluginOptions) = this()
    
    /**
    	 * The run point of the plugin, required method.
    	 */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
    
    /* CompleteClass */
    override def applyWebpack4(compiler: Compiler): Unit = js.native
    
    /* CompleteClass */
    override def applyWebpack5(compiler: Compiler): Unit = js.native
    
    /* CompleteClass */
    override def getOptions(): CompilerOptions = js.native
    
    /* private */ /* CompleteClass */
    var name: Any = js.native
    
    /* private */ /* CompleteClass */
    var options: Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@storybook/react-docgen-typescript-plugin/dist/plugin", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/react-docgen-typescript-plugin/dist/plugin", "default.defaultOptions")
    @js.native
    def defaultOptions: DocgenCollectionName = js.native
    inline def defaultOptions_=(x: DocgenCollectionName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  }
  
  trait DocgenPlugin
    extends StObject
       with WebpackPluginInstance {
    
    def applyWebpack4(compiler: Compiler): Unit
    
    def applyWebpack5(compiler: Compiler): Unit
    
    def getOptions(): CompilerOptions
    
    /* private */ var name: Any
    
    /* private */ var options: Any
  }
  object DocgenPlugin {
    
    inline def apply(
      apply: Compiler => Unit,
      applyWebpack4: Compiler => Unit,
      applyWebpack5: Compiler => Unit,
      getOptions: () => CompilerOptions,
      name: Any,
      options: Any
    ): DocgenPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), applyWebpack4 = js.Any.fromFunction1(applyWebpack4), applyWebpack5 = js.Any.fromFunction1(applyWebpack5), getOptions = js.Any.fromFunction0(getOptions), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocgenPlugin]
    }
    
    extension [Self <: DocgenPlugin](x: Self) {
      
      inline def setApplyWebpack4(value: Compiler => Unit): Self = StObject.set(x, "applyWebpack4", js.Any.fromFunction1(value))
      
      inline def setApplyWebpack5(value: Compiler => Unit): Self = StObject.set(x, "applyWebpack5", js.Any.fromFunction1(value))
      
      inline def setGetOptions(value: () => CompilerOptions): Self = StObject.set(x, "getOptions", js.Any.fromFunction0(value))
      
      inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DocgenPluginType
    extends StObject
       with Instantiable0[DocgenPlugin]
       with Instantiable1[/* options */ PluginOptions, DocgenPlugin] {
    
    var defaultOptions: DocgenCollectionName = js.native
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
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
    }
  }
  
  trait TypescriptOptions extends StObject {
    
    /** Specify TypeScript compiler options. Can not be used with tsconfigPath. */
    var compilerOptions: js.UndefOr[typings.typescript.mod.CompilerOptions] = js.undefined
    
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
      
      inline def setCompilerOptions(value: typings.typescript.mod.CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      inline def setTsconfigPath(value: String): Self = StObject.set(x, "tsconfigPath", value.asInstanceOf[js.Any])
      
      inline def setTsconfigPathUndefined: Self = StObject.set(x, "tsconfigPath", js.undefined)
    }
  }
}
