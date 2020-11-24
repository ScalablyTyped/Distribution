package typings.scriptExtHtmlWebpackPlugin.mod

import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.async
import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.defer
import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.sync
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * script names that should have an async attribute (default: `[]`)
    */
  var async: js.UndefOr[ScriptMatchingPattern] = js.native
  
  /**
    * scripts that should have a custom attribute(s) added, the attribute(s), and the value(s)
    */
  var custom: js.UndefOr[Custom | js.Array[Custom]] = js.native
  
  /**
    * the default attribute to set - 'sync' actually results in no attribute (default: 'sync')
    */
  var defaultAttribute: js.UndefOr[sync | async | defer] = js.native
  
  /**
    * script names that should have a defer attribute (default: `[]`)
    */
  var defer: js.UndefOr[ScriptMatchingPattern] = js.native
  
  /**
    * scripts that should be inlined in the html (default: `[]`)
    */
  var `inline`: js.UndefOr[ScriptMatchingPattern] = js.native
  
  /**
    * script names that should have a type="module" attribute (default: `[]`)
    */
  var module: js.UndefOr[ScriptMatchingPattern] = js.native
  
  /**
    * scripts that should have accompanying prefetch resource hints (default: `[]`)
    */
  var prefetch: js.UndefOr[ScriptMatchingPatternPre] = js.native
  
  /**
    * scripts that should have accompanying preload resource hints (default: `[]`)
    */
  var preload: js.UndefOr[ScriptMatchingPatternPre] = js.native
  
  /**
    * script names that should have no attribute (default: `[]`)
    */
  var sync: js.UndefOr[ScriptMatchingPattern] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAsyncVarargs(value: (String | RegExp)*): Self = this.set("async", js.Array(value :_*))
    
    @scala.inline
    def setAsync(value: ScriptMatchingPattern): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setCustomVarargs(value: Custom*): Self = this.set("custom", js.Array(value :_*))
    
    @scala.inline
    def setCustom(value: Custom | js.Array[Custom]): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setDefaultAttribute(value: sync | async | defer): Self = this.set("defaultAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultAttribute: Self = this.set("defaultAttribute", js.undefined)
    
    @scala.inline
    def setDeferVarargs(value: (String | RegExp)*): Self = this.set("defer", js.Array(value :_*))
    
    @scala.inline
    def setDefer(value: ScriptMatchingPattern): Self = this.set("defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
    
    @scala.inline
    def setInlineVarargs(value: (String | RegExp)*): Self = this.set("inline", js.Array(value :_*))
    
    @scala.inline
    def setInline(value: ScriptMatchingPattern): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setModuleVarargs(value: (String | RegExp)*): Self = this.set("module", js.Array(value :_*))
    
    @scala.inline
    def setModule(value: ScriptMatchingPattern): Self = this.set("module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    
    @scala.inline
    def setPrefetchVarargs(value: (String | RegExp)*): Self = this.set("prefetch", js.Array(value :_*))
    
    @scala.inline
    def setPrefetch(value: ScriptMatchingPatternPre): Self = this.set("prefetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefetch: Self = this.set("prefetch", js.undefined)
    
    @scala.inline
    def setPreloadVarargs(value: (String | RegExp)*): Self = this.set("preload", js.Array(value :_*))
    
    @scala.inline
    def setPreload(value: ScriptMatchingPatternPre): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setSyncVarargs(value: (String | RegExp)*): Self = this.set("sync", js.Array(value :_*))
    
    @scala.inline
    def setSync(value: ScriptMatchingPattern): Self = this.set("sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
  }
}
