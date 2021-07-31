package typings.rtlcss

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.LazyResult
import typings.postcss.mod.Plugin_
import typings.postcss.mod.Result
import typings.postcss.mod.Root_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rtlcss", JSImport.Namespace)
  @js.native
  val ^ : RtlCss = js.native
  
  trait ConfigOptions extends StObject {
    
    /**
      * Applies to CSS rules containing no directional properties,
      * it will update the selector by applying String Map.
      */
    var autoRename: Boolean
    
    /**
      * Ensures autoRename is applied only if pair exists.
      */
    var autoRenameStrict: Boolean
    
    /**
      * An object map of disabled plugins directives,
      * where keys are plugin names and value are object
      * hash of disabled directives. e.g. {'rtlcss':{'config':true}}.
      */
    var blacklist: js.Object
    
    /**
      * Removes directives comments from output CSS.
      */
    var clean: Boolean
    
    /**
      * Fallback value for String Map options.
      */
    var greedy: Boolean
    
    /**
      * Applies String Map to URLs. You can also target specific node types using an object literal.
      * e.g. {'atrule': true, 'decl': false}.
      */
    var processUrls: Boolean | js.Object
    
    /**
      * The default array of String Map.
      */
    var stringMap: js.Array[StringMap]
    
    /**
      * When enabled, flips background-position expressed in length units using calc.
      */
    var useCalc: Boolean
  }
  object ConfigOptions {
    
    @scala.inline
    def apply(
      autoRename: Boolean,
      autoRenameStrict: Boolean,
      blacklist: js.Object,
      clean: Boolean,
      greedy: Boolean,
      processUrls: Boolean | js.Object,
      stringMap: js.Array[StringMap],
      useCalc: Boolean
    ): ConfigOptions = {
      val __obj = js.Dynamic.literal(autoRename = autoRename.asInstanceOf[js.Any], autoRenameStrict = autoRenameStrict.asInstanceOf[js.Any], blacklist = blacklist.asInstanceOf[js.Any], clean = clean.asInstanceOf[js.Any], greedy = greedy.asInstanceOf[js.Any], processUrls = processUrls.asInstanceOf[js.Any], stringMap = stringMap.asInstanceOf[js.Any], useCalc = useCalc.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoRename(value: Boolean): Self = StObject.set(x, "autoRename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRenameStrict(value: Boolean): Self = StObject.set(x, "autoRenameStrict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklist(value: js.Object): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessUrls(value: Boolean | js.Object): Self = StObject.set(x, "processUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringMap(value: js.Array[StringMap]): Self = StObject.set(x, "stringMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringMapVarargs(value: StringMap*): Self = StObject.set(x, "stringMap", js.Array(value :_*))
      
      @scala.inline
      def setUseCalc(value: Boolean): Self = StObject.set(x, "useCalc", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExportedAPI extends StObject {
    
    /**
      * Creates a new instance of RTLCSS using the passed configuration object.
      */
    def configure(config: ConfigOptions): js.Object = js.native
    
    /**
      * Creates a new RTLCSS instance, process the input and return its result.
      */
    def process(css: String): String = js.native
    def process(css: String, options: js.Object): String = js.native
    def process(css: String, options: js.Object, plugins: js.Array[String]): String = js.native
    def process(css: String, options: js.Object, plugins: js.Array[String], hooks: HookOptions): String = js.native
    def process(css: String, options: js.Object, plugins: js.Object): String = js.native
    def process(css: String, options: js.Object, plugins: js.Object, hooks: HookOptions): String = js.native
    def process(css: String, options: js.Object, plugins: Unit, hooks: HookOptions): String = js.native
    def process(css: String, options: Unit, plugins: js.Array[String]): String = js.native
    def process(css: String, options: Unit, plugins: js.Array[String], hooks: HookOptions): String = js.native
    def process(css: String, options: Unit, plugins: js.Object): String = js.native
    def process(css: String, options: Unit, plugins: js.Object, hooks: HookOptions): String = js.native
    def process(css: String, options: Unit, plugins: Unit, hooks: HookOptions): String = js.native
  }
  
  trait HookOptions extends StObject {
    
    /**
      * The function to be called after processing the CSS.
      */
    def post(): Unit
    
    /**
      * The function to be called before processing the CSS.
      */
    def pre(): Unit
  }
  object HookOptions {
    
    @scala.inline
    def apply(post: () => Unit, pre: () => Unit): HookOptions = {
      val __obj = js.Dynamic.literal(post = js.Any.fromFunction0(post), pre = js.Any.fromFunction0(pre))
      __obj.asInstanceOf[HookOptions]
    }
    
    @scala.inline
    implicit class HookOptionsMutableBuilder[Self <: HookOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPost(value: () => Unit): Self = StObject.set(x, "post", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPre(value: () => Unit): Self = StObject.set(x, "pre", js.Any.fromFunction0(value))
    }
  }
  
  trait MapOptions extends StObject {
    
    var greedy: js.UndefOr[Boolean] = js.undefined
    
    var ignoreCase: Boolean
    
    var scope: String
  }
  object MapOptions {
    
    @scala.inline
    def apply(ignoreCase: Boolean, scope: String): MapOptions = {
      val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapOptions]
    }
    
    @scala.inline
    implicit class MapOptionsMutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreedyUndefined: Self = StObject.set(x, "greedy", js.undefined)
      
      @scala.inline
      def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RtlCss
    extends Plugin_[ConfigOptions]
       with ExportedAPI {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* root */ Root_, arg2: /* result */ Result): js.Promise[js.Any] | js.Any = js.native
    
    /**
      * Creates a new RTLCSS instance, process the input and return its result.
      */
    /* InferMemberOverrides */
    override def process(css: String): String & LazyResult = js.native
  }
  
  trait StringMap extends StObject {
    
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var options: MapOptions
    
    var priority: Double
    
    var replace: String | js.Array[String]
    
    var search: String | js.Array[String]
  }
  object StringMap {
    
    @scala.inline
    def apply(
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
    implicit class StringMapMutableBuilder[Self <: StringMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: MapOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplace(value: String | js.Array[String]): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceVarargs(value: String*): Self = StObject.set(x, "replace", js.Array(value :_*))
      
      @scala.inline
      def setSearch(value: String | js.Array[String]): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchVarargs(value: String*): Self = StObject.set(x, "search", js.Array(value :_*))
    }
  }
  
  type _To = RtlCss
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RtlCss = ^
}
