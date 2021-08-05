package typings.scriptExtHtmlWebpackPlugin

import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.async
import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.defer
import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.sync
import typings.std.Plugin
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("script-ext-html-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with ScriptExtHtmlWebpackPlugin {
    def this(options: Options) = this()
  }
  
  trait Custom extends StObject {
    
    var attribute: String
    
    var test: ScriptMatchingPattern
    
    var value: js.UndefOr[String] = js.undefined
  }
  object Custom {
    
    inline def apply(attribute: String, test: ScriptMatchingPattern): Custom = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[Custom]
    }
    
    extension [Self <: Custom](x: Self) {
      
      inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setTest(value: ScriptMatchingPattern): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestVarargs(value: (String | RegExp)*): Self = StObject.set(x, "test", js.Array(value :_*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * script names that should have an async attribute (default: `[]`)
      */
    var async: js.UndefOr[ScriptMatchingPattern] = js.undefined
    
    /**
      * scripts that should have a custom attribute(s) added, the attribute(s), and the value(s)
      */
    var custom: js.UndefOr[Custom | js.Array[Custom]] = js.undefined
    
    /**
      * the default attribute to set - 'sync' actually results in no attribute (default: 'sync')
      */
    var defaultAttribute: js.UndefOr[sync | async | defer] = js.undefined
    
    /**
      * script names that should have a defer attribute (default: `[]`)
      */
    var defer: js.UndefOr[ScriptMatchingPattern] = js.undefined
    
    /**
      * scripts that should be inlined in the html (default: `[]`)
      */
    var `inline`: js.UndefOr[ScriptMatchingPattern] = js.undefined
    
    /**
      * script names that should have a type="module" attribute (default: `[]`)
      */
    var module: js.UndefOr[ScriptMatchingPattern] = js.undefined
    
    /**
      * scripts that should have accompanying prefetch resource hints (default: `[]`)
      */
    var prefetch: js.UndefOr[ScriptMatchingPatternPre] = js.undefined
    
    /**
      * scripts that should have accompanying preload resource hints (default: `[]`)
      */
    var preload: js.UndefOr[ScriptMatchingPatternPre] = js.undefined
    
    /**
      * script names that should have no attribute (default: `[]`)
      */
    var sync: js.UndefOr[ScriptMatchingPattern] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAsync(value: ScriptMatchingPattern): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setAsyncVarargs(value: (String | RegExp)*): Self = StObject.set(x, "async", js.Array(value :_*))
      
      inline def setCustom(value: Custom | js.Array[Custom]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setCustomVarargs(value: Custom*): Self = StObject.set(x, "custom", js.Array(value :_*))
      
      inline def setDefaultAttribute(value: sync | async | defer): Self = StObject.set(x, "defaultAttribute", value.asInstanceOf[js.Any])
      
      inline def setDefaultAttributeUndefined: Self = StObject.set(x, "defaultAttribute", js.undefined)
      
      inline def setDefer(value: ScriptMatchingPattern): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      inline def setDeferVarargs(value: (String | RegExp)*): Self = StObject.set(x, "defer", js.Array(value :_*))
      
      inline def setInline(value: ScriptMatchingPattern): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setInlineVarargs(value: (String | RegExp)*): Self = StObject.set(x, "inline", js.Array(value :_*))
      
      inline def setModule(value: ScriptMatchingPattern): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setModuleVarargs(value: (String | RegExp)*): Self = StObject.set(x, "module", js.Array(value :_*))
      
      inline def setPrefetch(value: ScriptMatchingPatternPre): Self = StObject.set(x, "prefetch", value.asInstanceOf[js.Any])
      
      inline def setPrefetchUndefined: Self = StObject.set(x, "prefetch", js.undefined)
      
      inline def setPrefetchVarargs(value: (String | RegExp)*): Self = StObject.set(x, "prefetch", js.Array(value :_*))
      
      inline def setPreload(value: ScriptMatchingPatternPre): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setPreloadVarargs(value: (String | RegExp)*): Self = StObject.set(x, "preload", js.Array(value :_*))
      
      inline def setSync(value: ScriptMatchingPattern): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      inline def setSyncVarargs(value: (String | RegExp)*): Self = StObject.set(x, "sync", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ScriptExtHtmlWebpackPlugin
    extends StObject
       with Plugin {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit = js.native
  }
  
  type ScriptMatchingPattern = ScriptMatchingPatternBase | ScriptMatchingPatternHash
  
  type ScriptMatchingPatternBase = String | RegExp | (js.Array[String | RegExp])
  
  trait ScriptMatchingPatternHash extends StObject {
    
    var test: ScriptMatchingPatternBase
  }
  object ScriptMatchingPatternHash {
    
    inline def apply(test: ScriptMatchingPatternBase): ScriptMatchingPatternHash = {
      val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptMatchingPatternHash]
    }
    
    extension [Self <: ScriptMatchingPatternHash](x: Self) {
      
      inline def setTest(value: ScriptMatchingPatternBase): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestVarargs(value: (String | RegExp)*): Self = StObject.set(x, "test", js.Array(value :_*))
    }
  }
  
  type ScriptMatchingPatternPre = ScriptMatchingPatternBase | typings.scriptExtHtmlWebpackPlugin.anon.ScriptMatchingPatternHash
}
