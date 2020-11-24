package typings.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rollup.rollupBooleans.`false`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputOptions extends js.Object {
  
  var acorn: js.UndefOr[js.Object] = js.native
  
  var acornInjectPlugins: js.UndefOr[js.Function | js.Array[js.Function]] = js.native
  
  var cache: js.UndefOr[`false` | RollupCache] = js.native
  
  var context: js.UndefOr[String] = js.native
  
  var experimentalCacheExpiry: js.UndefOr[Double] = js.native
  
  var external: js.UndefOr[ExternalOption] = js.native
  
  /** @deprecated Use the "inlineDynamicImports" output option instead. */
  var inlineDynamicImports: js.UndefOr[Boolean] = js.native
  
  var input: js.UndefOr[InputOption] = js.native
  
  /** @deprecated Use the "manualChunks" output option instead. */
  var manualChunks: js.UndefOr[ManualChunksOption] = js.native
  
  var moduleContext: js.UndefOr[
    (js.Function1[/* id */ String, js.UndefOr[String | Null]]) | StringDictionary[String]
  ] = js.native
  
  var onwarn: js.UndefOr[WarningHandlerWithDefault] = js.native
  
  var perf: js.UndefOr[Boolean] = js.native
  
  var plugins: js.UndefOr[js.Array[Plugin]] = js.native
  
  var preserveEntrySignatures: js.UndefOr[PreserveEntrySignaturesOption] = js.native
  
  /** @deprecated Use the "preserveModules" output option instead. */
  var preserveModules: js.UndefOr[Boolean] = js.native
  
  var preserveSymlinks: js.UndefOr[Boolean] = js.native
  
  var shimMissingExports: js.UndefOr[Boolean] = js.native
  
  var strictDeprecations: js.UndefOr[Boolean] = js.native
  
  var treeshake: js.UndefOr[Boolean | TreeshakingOptions] = js.native
  
  var watch: js.UndefOr[WatcherOptions | `false`] = js.native
}
object InputOptions {
  
  @scala.inline
  def apply(): InputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputOptions]
  }
  
  @scala.inline
  implicit class InputOptionsOps[Self <: InputOptions] (val x: Self) extends AnyVal {
    
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
    def setAcorn(value: js.Object): Self = this.set("acorn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcorn: Self = this.set("acorn", js.undefined)
    
    @scala.inline
    def setAcornInjectPluginsVarargs(value: js.Function*): Self = this.set("acornInjectPlugins", js.Array(value :_*))
    
    @scala.inline
    def setAcornInjectPlugins(value: js.Function | js.Array[js.Function]): Self = this.set("acornInjectPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcornInjectPlugins: Self = this.set("acornInjectPlugins", js.undefined)
    
    @scala.inline
    def setCache(value: `false` | RollupCache): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setExperimentalCacheExpiry(value: Double): Self = this.set("experimentalCacheExpiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimentalCacheExpiry: Self = this.set("experimentalCacheExpiry", js.undefined)
    
    @scala.inline
    def setExternalVarargs(value: (String | RegExp)*): Self = this.set("external", js.Array(value :_*))
    
    @scala.inline
    def setExternalFunction3(
      value: (/* source */ String, /* importer */ js.UndefOr[String], /* isResolved */ Boolean) => js.UndefOr[Boolean | Null]
    ): Self = this.set("external", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExternal(value: ExternalOption): Self = this.set("external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal: Self = this.set("external", js.undefined)
    
    @scala.inline
    def setInlineDynamicImports(value: Boolean): Self = this.set("inlineDynamicImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineDynamicImports: Self = this.set("inlineDynamicImports", js.undefined)
    
    @scala.inline
    def setInputVarargs(value: String*): Self = this.set("input", js.Array(value :_*))
    
    @scala.inline
    def setInput(value: InputOption): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setManualChunksFunction2(value: (/* id */ String, /* api */ GetManualChunkApi) => js.UndefOr[String | Null]): Self = this.set("manualChunks", js.Any.fromFunction2(value))
    
    @scala.inline
    def setManualChunks(value: ManualChunksOption): Self = this.set("manualChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualChunks: Self = this.set("manualChunks", js.undefined)
    
    @scala.inline
    def setModuleContextFunction1(value: /* id */ String => js.UndefOr[String | Null]): Self = this.set("moduleContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setModuleContext(value: (js.Function1[/* id */ String, js.UndefOr[String | Null]]) | StringDictionary[String]): Self = this.set("moduleContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleContext: Self = this.set("moduleContext", js.undefined)
    
    @scala.inline
    def setOnwarn(value: (/* warning */ RollupWarning, /* defaultHandler */ WarningHandler) => Unit): Self = this.set("onwarn", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnwarn: Self = this.set("onwarn", js.undefined)
    
    @scala.inline
    def setPerf(value: Boolean): Self = this.set("perf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerf: Self = this.set("perf", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: Plugin*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[Plugin]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setPreserveEntrySignatures(value: PreserveEntrySignaturesOption): Self = this.set("preserveEntrySignatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveEntrySignatures: Self = this.set("preserveEntrySignatures", js.undefined)
    
    @scala.inline
    def setPreserveModules(value: Boolean): Self = this.set("preserveModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveModules: Self = this.set("preserveModules", js.undefined)
    
    @scala.inline
    def setPreserveSymlinks(value: Boolean): Self = this.set("preserveSymlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveSymlinks: Self = this.set("preserveSymlinks", js.undefined)
    
    @scala.inline
    def setShimMissingExports(value: Boolean): Self = this.set("shimMissingExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShimMissingExports: Self = this.set("shimMissingExports", js.undefined)
    
    @scala.inline
    def setStrictDeprecations(value: Boolean): Self = this.set("strictDeprecations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictDeprecations: Self = this.set("strictDeprecations", js.undefined)
    
    @scala.inline
    def setTreeshake(value: Boolean | TreeshakingOptions): Self = this.set("treeshake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreeshake: Self = this.set("treeshake", js.undefined)
    
    @scala.inline
    def setWatch(value: WatcherOptions | `false`): Self = this.set("watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
}
