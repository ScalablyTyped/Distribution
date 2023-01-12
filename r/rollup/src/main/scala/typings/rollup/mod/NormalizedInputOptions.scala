package typings.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rollup.rollupBooleans.`false`
import typings.rollup.rollupStrings.ifRelativeSource
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizedInputOptions extends StObject {
  
  var acorn: Record[String, Any]
  
  var acornInjectPlugins: js.Array[js.Function0[Any]]
  
  var cache: js.UndefOr[`false` | RollupCache] = js.undefined
  
  var context: String
  
  var experimentalCacheExpiry: Double
  
  def external(source: String, importer: String, isResolved: Boolean): Boolean
  def external(source: String, importer: Unit, isResolved: Boolean): Boolean
  @JSName("external")
  var external_Original: IsExternal
  
  /** @deprecated Use the "inlineDynamicImports" output option instead. */
  var inlineDynamicImports: js.UndefOr[Boolean] = js.undefined
  
  var input: js.Array[String] | StringDictionary[String]
  
  var makeAbsoluteExternalsRelative: Boolean | ifRelativeSource
  
  /** @deprecated Use the "manualChunks" output option instead. */
  var manualChunks: js.UndefOr[ManualChunksOption] = js.undefined
  
  var maxParallelFileOps: Double
  
  /** @deprecated Use the "maxParallelFileOps" option instead. */
  var maxParallelFileReads: Double
  
  def moduleContext(id: String): String
  
  def onwarn(warning: RollupWarning): Unit
  @JSName("onwarn")
  var onwarn_Original: WarningHandler
  
  var perf: Boolean
  
  var plugins: js.Array[Plugin]
  
  var preserveEntrySignatures: PreserveEntrySignaturesOption
  
  /** @deprecated Use the "preserveModules" output option instead. */
  var preserveModules: js.UndefOr[Boolean] = js.undefined
  
  var preserveSymlinks: Boolean
  
  var shimMissingExports: Boolean
  
  var strictDeprecations: Boolean
  
  var treeshake: `false` | NormalizedTreeshakingOptions
}
object NormalizedInputOptions {
  
  inline def apply(
    acorn: Record[String, Any],
    acornInjectPlugins: js.Array[js.Function0[Any]],
    context: String,
    experimentalCacheExpiry: Double,
    external: (/* source */ String, /* importer */ js.UndefOr[String], /* isResolved */ Boolean) => Boolean,
    input: js.Array[String] | StringDictionary[String],
    makeAbsoluteExternalsRelative: Boolean | ifRelativeSource,
    maxParallelFileOps: Double,
    maxParallelFileReads: Double,
    moduleContext: String => String,
    onwarn: /* warning */ RollupWarning => Unit,
    perf: Boolean,
    plugins: js.Array[Plugin],
    preserveEntrySignatures: PreserveEntrySignaturesOption,
    preserveSymlinks: Boolean,
    shimMissingExports: Boolean,
    strictDeprecations: Boolean,
    treeshake: `false` | NormalizedTreeshakingOptions
  ): NormalizedInputOptions = {
    val __obj = js.Dynamic.literal(acorn = acorn.asInstanceOf[js.Any], acornInjectPlugins = acornInjectPlugins.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], experimentalCacheExpiry = experimentalCacheExpiry.asInstanceOf[js.Any], external = js.Any.fromFunction3(external), input = input.asInstanceOf[js.Any], makeAbsoluteExternalsRelative = makeAbsoluteExternalsRelative.asInstanceOf[js.Any], maxParallelFileOps = maxParallelFileOps.asInstanceOf[js.Any], maxParallelFileReads = maxParallelFileReads.asInstanceOf[js.Any], moduleContext = js.Any.fromFunction1(moduleContext), onwarn = js.Any.fromFunction1(onwarn), perf = perf.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], preserveEntrySignatures = preserveEntrySignatures.asInstanceOf[js.Any], preserveSymlinks = preserveSymlinks.asInstanceOf[js.Any], shimMissingExports = shimMissingExports.asInstanceOf[js.Any], strictDeprecations = strictDeprecations.asInstanceOf[js.Any], treeshake = treeshake.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedInputOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NormalizedInputOptions] (val x: Self) extends AnyVal {
    
    inline def setAcorn(value: Record[String, Any]): Self = StObject.set(x, "acorn", value.asInstanceOf[js.Any])
    
    inline def setAcornInjectPlugins(value: js.Array[js.Function0[Any]]): Self = StObject.set(x, "acornInjectPlugins", value.asInstanceOf[js.Any])
    
    inline def setAcornInjectPluginsVarargs(value: js.Function0[Any]*): Self = StObject.set(x, "acornInjectPlugins", js.Array(value*))
    
    inline def setCache(value: `false` | RollupCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setExperimentalCacheExpiry(value: Double): Self = StObject.set(x, "experimentalCacheExpiry", value.asInstanceOf[js.Any])
    
    inline def setExternal(
      value: (/* source */ String, /* importer */ js.UndefOr[String], /* isResolved */ Boolean) => Boolean
    ): Self = StObject.set(x, "external", js.Any.fromFunction3(value))
    
    inline def setInlineDynamicImports(value: Boolean): Self = StObject.set(x, "inlineDynamicImports", value.asInstanceOf[js.Any])
    
    inline def setInlineDynamicImportsUndefined: Self = StObject.set(x, "inlineDynamicImports", js.undefined)
    
    inline def setInput(value: js.Array[String] | StringDictionary[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputVarargs(value: String*): Self = StObject.set(x, "input", js.Array(value*))
    
    inline def setMakeAbsoluteExternalsRelative(value: Boolean | ifRelativeSource): Self = StObject.set(x, "makeAbsoluteExternalsRelative", value.asInstanceOf[js.Any])
    
    inline def setManualChunks(value: ManualChunksOption): Self = StObject.set(x, "manualChunks", value.asInstanceOf[js.Any])
    
    inline def setManualChunksFunction2(value: (/* id */ String, /* meta */ ManualChunkMeta) => String | NullValue): Self = StObject.set(x, "manualChunks", js.Any.fromFunction2(value))
    
    inline def setManualChunksUndefined: Self = StObject.set(x, "manualChunks", js.undefined)
    
    inline def setMaxParallelFileOps(value: Double): Self = StObject.set(x, "maxParallelFileOps", value.asInstanceOf[js.Any])
    
    inline def setMaxParallelFileReads(value: Double): Self = StObject.set(x, "maxParallelFileReads", value.asInstanceOf[js.Any])
    
    inline def setModuleContext(value: String => String): Self = StObject.set(x, "moduleContext", js.Any.fromFunction1(value))
    
    inline def setOnwarn(value: /* warning */ RollupWarning => Unit): Self = StObject.set(x, "onwarn", js.Any.fromFunction1(value))
    
    inline def setPerf(value: Boolean): Self = StObject.set(x, "perf", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setPreserveEntrySignatures(value: PreserveEntrySignaturesOption): Self = StObject.set(x, "preserveEntrySignatures", value.asInstanceOf[js.Any])
    
    inline def setPreserveModules(value: Boolean): Self = StObject.set(x, "preserveModules", value.asInstanceOf[js.Any])
    
    inline def setPreserveModulesUndefined: Self = StObject.set(x, "preserveModules", js.undefined)
    
    inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
    
    inline def setShimMissingExports(value: Boolean): Self = StObject.set(x, "shimMissingExports", value.asInstanceOf[js.Any])
    
    inline def setStrictDeprecations(value: Boolean): Self = StObject.set(x, "strictDeprecations", value.asInstanceOf[js.Any])
    
    inline def setTreeshake(value: `false` | NormalizedTreeshakingOptions): Self = StObject.set(x, "treeshake", value.asInstanceOf[js.Any])
  }
}
