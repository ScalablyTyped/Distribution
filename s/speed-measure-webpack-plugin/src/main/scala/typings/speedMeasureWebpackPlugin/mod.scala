package typings.speedMeasureWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * See how fast (or not) your plugins and loaders are, so you can optimise your builds
    */
  @JSImport("speed-measure-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with SpeedMeasurePlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def wrap(
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any
    ): js.Any = js.native
  }
  
  /**
    * Pass these into the constructor, as an object:
    */
  trait Options extends StObject {
    
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
    var pluginNames: js.UndefOr[StringDictionary[js.Object]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setGranularLoaderData(value: Boolean): Self = StObject.set(x, "granularLoaderData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGranularLoaderDataUndefined: Self = StObject.set(x, "granularLoaderData", js.undefined)
      
      @scala.inline
      def setOutputFormat(value: OutputFormat): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFormatFunction1(value: /* json */ js.Any => String): Self = StObject.set(x, "outputFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
      
      @scala.inline
      def setOutputTarget(value: OutputTarget): Self = StObject.set(x, "outputTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputTargetFunction2(value: (/* output */ String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "outputTarget", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOutputTargetUndefined: Self = StObject.set(x, "outputTarget", js.undefined)
      
      @scala.inline
      def setPluginNames(value: StringDictionary[js.Object]): Self = StObject.set(x, "pluginNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginNamesUndefined: Self = StObject.set(x, "pluginNames", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.speedMeasureWebpackPlugin.speedMeasureWebpackPluginStrings.json
    - typings.speedMeasureWebpackPlugin.speedMeasureWebpackPluginStrings.human
    - typings.speedMeasureWebpackPlugin.speedMeasureWebpackPluginStrings.humanVerbose
    - js.Function1[/ * json * / js.Any, java.lang.String]
  */
  type OutputFormat = _OutputFormat | (js.Function1[/* json */ js.Any, String])
  
  type OutputTarget = String | (js.Function2[/* output */ String, /* repeated */ js.Any, Unit])
  
  /**
    * See how fast (or not) your plugins and loaders are, so you can optimise your builds
    */
  trait SpeedMeasurePlugin extends StObject {
    
    def wrap(
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any
    ): js.Any
  }
  object SpeedMeasurePlugin {
    
    @scala.inline
    def apply(
      wrap: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any => js.Any
    ): SpeedMeasurePlugin = {
      val __obj = js.Dynamic.literal(wrap = js.Any.fromFunction1(wrap))
      __obj.asInstanceOf[SpeedMeasurePlugin]
    }
    
    @scala.inline
    implicit class SpeedMeasurePluginMutableBuilder[Self <: SpeedMeasurePlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWrap(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any => js.Any
      ): Self = StObject.set(x, "wrap", js.Any.fromFunction1(value))
    }
  }
  
  trait _OutputFormat extends StObject
}
