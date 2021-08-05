package typings.rollupPluginPostcss

import typings.cssnano.mod.CssNanoOptions
import typings.rollup.mod.Plugin
import typings.rollupPluginPostcss.anon.Ctx
import typings.rollupPluginPostcss.anon.InsertAt
import typings.rollupPluginPostcss.rollupPluginPostcssStrings.`inline`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-postcss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin]
  inline def default(options: PostCssPluginOptions): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  trait PostCssPluginOptions extends StObject {
    
    var autoModules: js.UndefOr[Boolean] = js.undefined
    
    var config: js.UndefOr[Boolean | Ctx] = js.undefined
    
    var exec: js.UndefOr[Boolean] = js.undefined
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var extract: js.UndefOr[Boolean | String] = js.undefined
    
    var inject: js.UndefOr[
        Boolean | InsertAt | (js.Function2[/* cssVariableName */ String, /* fileId */ String, String])
      ] = js.undefined
    
    var loaders: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var minimize: js.UndefOr[Boolean | CssNanoOptions] = js.undefined
    
    var modules: js.UndefOr[Boolean | js.Any] = js.undefined
    
    var name: js.UndefOr[js.Array[js.Any | js.Array[js.Any]]] = js.undefined
    
    var namedExports: js.UndefOr[(js.Function1[/* name */ String, String]) | Boolean] = js.undefined
    
    var onImport: js.UndefOr[js.Function1[/* id */ js.Any, Unit]] = js.undefined
    
    var parser: js.UndefOr[(js.Function1[/* repeated */ js.Any, Unit]) | String] = js.undefined
    
    var plugins: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var sourceMap: js.UndefOr[Boolean | `inline`] = js.undefined
    
    var stringifier: js.UndefOr[(js.Function1[/* repeated */ js.Any, Unit]) | String] = js.undefined
    
    var syntax: js.UndefOr[(js.Function1[/* repeated */ js.Any, Unit]) | String] = js.undefined
  }
  object PostCssPluginOptions {
    
    inline def apply(): PostCssPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostCssPluginOptions]
    }
    
    extension [Self <: PostCssPluginOptions](x: Self) {
      
      inline def setAutoModules(value: Boolean): Self = StObject.set(x, "autoModules", value.asInstanceOf[js.Any])
      
      inline def setAutoModulesUndefined: Self = StObject.set(x, "autoModules", js.undefined)
      
      inline def setConfig(value: Boolean | Ctx): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setExec(value: Boolean): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      inline def setExtract(value: Boolean | String): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
      
      inline def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
      
      inline def setInject(
        value: Boolean | InsertAt | (js.Function2[/* cssVariableName */ String, /* fileId */ String, String])
      ): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectFunction2(value: (/* cssVariableName */ String, /* fileId */ String) => String): Self = StObject.set(x, "inject", js.Any.fromFunction2(value))
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      inline def setLoaders(value: js.Array[js.Any]): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      inline def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
      
      inline def setLoadersVarargs(value: js.Any*): Self = StObject.set(x, "loaders", js.Array(value :_*))
      
      inline def setMinimize(value: Boolean | CssNanoOptions): Self = StObject.set(x, "minimize", value.asInstanceOf[js.Any])
      
      inline def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
      
      inline def setModules(value: Boolean | js.Any): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setName(value: js.Array[js.Any | js.Array[js.Any]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNameVarargs(value: (js.Any | js.Array[js.Any])*): Self = StObject.set(x, "name", js.Array(value :_*))
      
      inline def setNamedExports(value: (js.Function1[/* name */ String, String]) | Boolean): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
      
      inline def setNamedExportsFunction1(value: /* name */ String => String): Self = StObject.set(x, "namedExports", js.Any.fromFunction1(value))
      
      inline def setNamedExportsUndefined: Self = StObject.set(x, "namedExports", js.undefined)
      
      inline def setOnImport(value: /* id */ js.Any => Unit): Self = StObject.set(x, "onImport", js.Any.fromFunction1(value))
      
      inline def setOnImportUndefined: Self = StObject.set(x, "onImport", js.undefined)
      
      inline def setParser(value: (js.Function1[/* repeated */ js.Any, Unit]) | String): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserFunction1(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPlugins(value: js.Array[js.Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: js.Any*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      inline def setSourceMap(value: Boolean | `inline`): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setStringifier(value: (js.Function1[/* repeated */ js.Any, Unit]) | String): Self = StObject.set(x, "stringifier", value.asInstanceOf[js.Any])
      
      inline def setStringifierFunction1(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "stringifier", js.Any.fromFunction1(value))
      
      inline def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
      
      inline def setSyntax(value: (js.Function1[/* repeated */ js.Any, Unit]) | String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      inline def setSyntaxFunction1(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "syntax", js.Any.fromFunction1(value))
      
      inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    }
  }
}
