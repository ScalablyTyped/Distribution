package typings.speedMeasureWebpackPlugin

import typings.speedMeasureWebpackPlugin.anon.FilePath
import typings.std.Record
import typings.webpack.mod.Compiler
import typings.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * See how fast (or not) your plugins and loaders are, so you can optimise your builds
    */
  @JSImport("speed-measure-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with SpeedMeasurePlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
    
    /* CompleteClass */
    override def wrap(config: Configuration): Configuration = js.native
  }
  
  type LoaderBuild = FilePath & (Record[String, String])
  
  /**
    * Pass these into the constructor, as an object:
    */
  trait Options extends StObject {
    
    /**
      * This option gives you a comparison over time of the module count and time spent, per loader.
      * This option provides more data when outputFormat: "humanVerbose".
      */
    var compareLoadersBuild: js.UndefOr[LoaderBuild] = js.undefined
    
    /**
      * If truthy, this plugin does nothing at all.
      * @default false
      */
    var disable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, SMP measures loaders in groups.
      * If truthy, this plugin will give per-loader timing information.
      * This flag is experimental. Some loaders will have inaccurate results:
      * loaders using separate processes (e.g. thread-loader)
      * loaders emitting file output (e.g. file-loader)
      * We will find solutions to these issues before removing the (experimental) flag on this option.
      * @default false
      */
    var granularLoaderData: js.UndefOr[Boolean] = js.undefined
    
    /**
      * You can configure SMP to include the files that take the most time per loader,
      * when using outputFormat: 'humanVerbose'
      * @default 0
      */
    var loaderTopFiles: js.UndefOr[Double] = js.undefined
    
    /**
      * Determines in what format this plugin prints its measurements
      * @default 'human'
      */
    var outputFormat: js.UndefOr[OutputFormat] = js.undefined
    
    var outputTarget: js.UndefOr[OutputTarget] = js.undefined
    
    /**
      * By default, SMP derives plugin names through plugin.constructor.name.
      * For some plugins this doesn't work (or you may want to override this default).
      * This option takes an object of pluginName: PluginConstructor
      */
    var pluginNames: js.UndefOr[Record[String, js.Object]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCompareLoadersBuild(value: LoaderBuild): Self = StObject.set(x, "compareLoadersBuild", value.asInstanceOf[js.Any])
      
      inline def setCompareLoadersBuildUndefined: Self = StObject.set(x, "compareLoadersBuild", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setGranularLoaderData(value: Boolean): Self = StObject.set(x, "granularLoaderData", value.asInstanceOf[js.Any])
      
      inline def setGranularLoaderDataUndefined: Self = StObject.set(x, "granularLoaderData", js.undefined)
      
      inline def setLoaderTopFiles(value: Double): Self = StObject.set(x, "loaderTopFiles", value.asInstanceOf[js.Any])
      
      inline def setLoaderTopFilesUndefined: Self = StObject.set(x, "loaderTopFiles", js.undefined)
      
      inline def setOutputFormat(value: OutputFormat): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      inline def setOutputFormatFunction1(value: /* json */ Any => String): Self = StObject.set(x, "outputFormat", js.Any.fromFunction1(value))
      
      inline def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
      
      inline def setOutputTarget(value: OutputTarget): Self = StObject.set(x, "outputTarget", value.asInstanceOf[js.Any])
      
      inline def setOutputTargetFunction2(value: (/* output */ String, /* repeated */ Any) => Unit): Self = StObject.set(x, "outputTarget", js.Any.fromFunction2(value))
      
      inline def setOutputTargetUndefined: Self = StObject.set(x, "outputTarget", js.undefined)
      
      inline def setPluginNames(value: Record[String, js.Object]): Self = StObject.set(x, "pluginNames", value.asInstanceOf[js.Any])
      
      inline def setPluginNamesUndefined: Self = StObject.set(x, "pluginNames", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.speedMeasureWebpackPlugin.speedMeasureWebpackPluginStrings.json
    - typings.speedMeasureWebpackPlugin.speedMeasureWebpackPluginStrings.human
    - typings.speedMeasureWebpackPlugin.speedMeasureWebpackPluginStrings.humanVerbose
    - js.Function1[/ * json * / scala.Any, java.lang.String]
  */
  type OutputFormat = _OutputFormat | (js.Function1[/* json */ Any, String])
  
  type OutputTarget = String | (js.Function2[/* output */ String, /* repeated */ Any, Unit])
  
  /**
    * See how fast (or not) your plugins and loaders are, so you can optimise your builds
    */
  trait SpeedMeasurePlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
    
    def wrap(config: Configuration): Configuration
  }
  object SpeedMeasurePlugin {
    
    inline def apply(apply: Compiler => Unit, wrap: Configuration => Configuration): SpeedMeasurePlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), wrap = js.Any.fromFunction1(wrap))
      __obj.asInstanceOf[SpeedMeasurePlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpeedMeasurePlugin] (val x: Self) extends AnyVal {
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setWrap(value: Configuration => Configuration): Self = StObject.set(x, "wrap", js.Any.fromFunction1(value))
    }
  }
  
  trait _OutputFormat extends StObject
}
