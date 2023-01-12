package typings.rtlcss

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.postcss.libProcessorMod.default
import typings.postcss.mod.PluginCreator
import typings.postcss.mod.Postcss
import typings.postcss.mod.Root_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rtlcss", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RtlCss = js.native
  
  trait ConfigOptions extends StObject {
    
    /**
      * An object map of property-name Aliases,
      * where keys are variable names and values are property names.
      * e.g. {"aliases": {"--small-padding": "padding"}}
      */
    var aliases: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * Applies to CSS rules containing no directional properties,
      * it will update the selector by applying String Map.
      */
    var autoRename: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Ensures autoRename is applied only if pair exists.
      */
    var autoRenameStrict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An object map of disabled plugins directives,
      * where keys are plugin names and value are object
      * hash of disabled directives. e.g. {'rtlcss':{'config':true}}.
      */
    var blacklist: js.UndefOr[StringDictionary[Record[String, Any]]] = js.undefined
    
    /**
      * Removes directives comments from output CSS.
      */
    var clean: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Fallback value for String Map options.
      */
    var greedy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When disabled, prevents flipping agent-defined environment variables
      * safe-area-inset-left, safe-area-inset-right.
      */
    var processEnv: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Applies String Map to URLs. You can also target specific node types using an object literal.
      * e.g. {'atrule': true, 'decl': false}.
      */
    var processUrls: js.UndefOr[Boolean | StringDictionary[Boolean]] = js.undefined
    
    /**
      * The default array of String Map.
      */
    var stringMap: js.UndefOr[js.Array[StringMap]] = js.undefined
    
    /**
      * When enabled, flips background-position expressed in length units using calc.
      */
    var useCalc: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setAliases(value: Record[String, String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setAutoRename(value: Boolean): Self = StObject.set(x, "autoRename", value.asInstanceOf[js.Any])
      
      inline def setAutoRenameStrict(value: Boolean): Self = StObject.set(x, "autoRenameStrict", value.asInstanceOf[js.Any])
      
      inline def setAutoRenameStrictUndefined: Self = StObject.set(x, "autoRenameStrict", js.undefined)
      
      inline def setAutoRenameUndefined: Self = StObject.set(x, "autoRename", js.undefined)
      
      inline def setBlacklist(value: StringDictionary[Record[String, Any]]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      inline def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
      
      inline def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
      
      inline def setGreedyUndefined: Self = StObject.set(x, "greedy", js.undefined)
      
      inline def setProcessEnv(value: Boolean): Self = StObject.set(x, "processEnv", value.asInstanceOf[js.Any])
      
      inline def setProcessEnvUndefined: Self = StObject.set(x, "processEnv", js.undefined)
      
      inline def setProcessUrls(value: Boolean | StringDictionary[Boolean]): Self = StObject.set(x, "processUrls", value.asInstanceOf[js.Any])
      
      inline def setProcessUrlsUndefined: Self = StObject.set(x, "processUrls", js.undefined)
      
      inline def setStringMap(value: js.Array[StringMap]): Self = StObject.set(x, "stringMap", value.asInstanceOf[js.Any])
      
      inline def setStringMapUndefined: Self = StObject.set(x, "stringMap", js.undefined)
      
      inline def setStringMapVarargs(value: StringMap*): Self = StObject.set(x, "stringMap", js.Array(value*))
      
      inline def setUseCalc(value: Boolean): Self = StObject.set(x, "useCalc", value.asInstanceOf[js.Any])
      
      inline def setUseCalcUndefined: Self = StObject.set(x, "useCalc", js.undefined)
    }
  }
  
  trait ConfigureOptions extends StObject {
    
    var hooks: js.UndefOr[HookOptions] = js.undefined
    
    var options: js.UndefOr[ConfigOptions] = js.undefined
    
    var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  }
  object ConfigureOptions {
    
    inline def apply(): ConfigureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigureOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigureOptions] (val x: Self) extends AnyVal {
      
      inline def setHooks(value: HookOptions): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setOptions(value: ConfigOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
  
  @js.native
  trait ExportedAPI extends StObject {
    
    /**
      * Creates a new instance of RTLCSS using the passed configuration object
      * @param config  An object containing RTLCSS options, plugins and hooks.
      * @returns A new RTLCSS instance.
      */
    def configure(config: ConfigureOptions): default = js.native
    
    /**
      * Creates a new RTLCSS instance, process the input and return its result.
      * @param  css  A string containing input CSS.
      * @param options  An object containing RTLCSS settings.
      * @param plugins An array containing a list of RTLCSS plugins or a single RTLCSS plugin.
      * @param hooks An object containing pre/post hooks.
      * @returns A string containing the RTLed css.
      */
    def process(css: String): String = js.native
    def process(css: String, options: Unit, plugins: js.Array[Plugin]): String = js.native
    def process(css: String, options: Unit, plugins: js.Array[Plugin], hooks: HookOptions): String = js.native
    def process(css: String, options: Unit, plugins: Unit, hooks: HookOptions): String = js.native
    def process(css: String, options: ConfigOptions): String = js.native
    def process(css: String, options: ConfigOptions, plugins: js.Array[Plugin]): String = js.native
    def process(css: String, options: ConfigOptions, plugins: js.Array[Plugin], hooks: HookOptions): String = js.native
    def process(css: String, options: ConfigOptions, plugins: Unit, hooks: HookOptions): String = js.native
  }
  
  /**
    * Hooks provides you with the ability to manipulate the css before/after it is processed,
    */
  type Hook = js.Function2[/* root */ Root_, /* postcss */ Postcss, Unit]
  
  trait HookOptions extends StObject {
    
    /**
      * The function to be called after processing the CSS.
      */
    var post: js.UndefOr[Hook] = js.undefined
    
    /**
      * The function to be called before processing the CSS.
      */
    var pre: js.UndefOr[Hook] = js.undefined
  }
  object HookOptions {
    
    inline def apply(): HookOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HookOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HookOptions] (val x: Self) extends AnyVal {
      
      inline def setPost(value: (/* root */ Root_, /* postcss */ Postcss) => Unit): Self = StObject.set(x, "post", js.Any.fromFunction2(value))
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setPre(value: (/* root */ Root_, /* postcss */ Postcss) => Unit): Self = StObject.set(x, "pre", js.Any.fromFunction2(value))
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    }
  }
  
  trait MapOptions extends StObject {
    
    var greedy: js.UndefOr[Boolean] = js.undefined
    
    var ignoreCase: Boolean
    
    var scope: String
  }
  object MapOptions {
    
    inline def apply(ignoreCase: Boolean, scope: String): MapOptions = {
      val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
      
      inline def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
      
      inline def setGreedyUndefined: Self = StObject.set(x, "greedy", js.undefined)
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  trait Plugin
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var name: String
  }
  object Plugin {
    
    inline def apply(name: String): Plugin = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RtlCss
    extends StObject
       with PluginCreator[ConfigOptions]
       with ExportedAPI
  
  trait StringMap extends StObject {
    
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var options: MapOptions
    
    var priority: Double
    
    var replace: String | js.Array[String]
    
    var search: String | js.Array[String]
  }
  object StringMap {
    
    inline def apply(
      name: String,
      options: MapOptions,
      priority: Double,
      replace: String | js.Array[String],
      search: String | js.Array[String]
    ): StringMap = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringMap] (val x: Self) extends AnyVal {
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: MapOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setReplace(value: String | js.Array[String]): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceVarargs(value: String*): Self = StObject.set(x, "replace", js.Array(value*))
      
      inline def setSearch(value: String | js.Array[String]): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchVarargs(value: String*): Self = StObject.set(x, "search", js.Array(value*))
    }
  }
  
  type _To = js.Object & RtlCss
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & RtlCss = ^
}
