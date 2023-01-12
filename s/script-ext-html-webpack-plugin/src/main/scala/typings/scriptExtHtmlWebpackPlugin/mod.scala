package typings.scriptExtHtmlWebpackPlugin

import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.async
import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.defer
import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.sync
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("script-ext-html-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ScriptExtHtmlWebpackPlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Custom] (val x: Self) extends AnyVal {
      
      inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setTest(value: ScriptMatchingPattern): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "test", js.Array(value*))
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: ScriptMatchingPattern): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setAsyncVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "async", js.Array(value*))
      
      inline def setCustom(value: Custom | js.Array[Custom]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setCustomVarargs(value: Custom*): Self = StObject.set(x, "custom", js.Array(value*))
      
      inline def setDefaultAttribute(value: sync | async | defer): Self = StObject.set(x, "defaultAttribute", value.asInstanceOf[js.Any])
      
      inline def setDefaultAttributeUndefined: Self = StObject.set(x, "defaultAttribute", js.undefined)
      
      inline def setDefer(value: ScriptMatchingPattern): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      inline def setDeferVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "defer", js.Array(value*))
      
      inline def setInline(value: ScriptMatchingPattern): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setInlineVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "inline", js.Array(value*))
      
      inline def setModule(value: ScriptMatchingPattern): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setModuleVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "module", js.Array(value*))
      
      inline def setPrefetch(value: ScriptMatchingPatternPre): Self = StObject.set(x, "prefetch", value.asInstanceOf[js.Any])
      
      inline def setPrefetchUndefined: Self = StObject.set(x, "prefetch", js.undefined)
      
      inline def setPrefetchVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "prefetch", js.Array(value*))
      
      inline def setPreload(value: ScriptMatchingPatternPre): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setPreloadVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "preload", js.Array(value*))
      
      inline def setSync(value: ScriptMatchingPattern): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      inline def setSyncVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "sync", js.Array(value*))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ trait ScriptExtHtmlWebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
  }
  object ScriptExtHtmlWebpackPlugin {
    
    inline def apply(apply: Compiler => Unit): ScriptExtHtmlWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[ScriptExtHtmlWebpackPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScriptExtHtmlWebpackPlugin] (val x: Self) extends AnyVal {
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  type ScriptMatchingPattern = ScriptMatchingPatternBase | ScriptMatchingPatternHash
  
  type ScriptMatchingPatternBase = String | js.RegExp | (js.Array[String | js.RegExp])
  
  trait ScriptMatchingPatternHash extends StObject {
    
    var test: ScriptMatchingPatternBase
  }
  object ScriptMatchingPatternHash {
    
    inline def apply(test: ScriptMatchingPatternBase): ScriptMatchingPatternHash = {
      val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptMatchingPatternHash]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScriptMatchingPatternHash] (val x: Self) extends AnyVal {
      
      inline def setTest(value: ScriptMatchingPatternBase): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "test", js.Array(value*))
    }
  }
  
  type ScriptMatchingPatternPre = ScriptMatchingPatternBase | typings.scriptExtHtmlWebpackPlugin.anon.ScriptMatchingPatternHash
}
