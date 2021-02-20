package typings.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rollup.rollupBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizedInputOptions extends StObject {
  
  var acorn: js.Object = js.native
  
  var acornInjectPlugins: js.Array[js.Function] = js.native
  
  var cache: js.UndefOr[`false` | RollupCache] = js.native
  
  var context: String = js.native
  
  var experimentalCacheExpiry: Double = js.native
  
  def external(source: String, importer: js.UndefOr[scala.Nothing], isResolved: Boolean): Boolean = js.native
  def external(source: String, importer: String, isResolved: Boolean): Boolean = js.native
  @JSName("external")
  var external_Original: IsExternal = js.native
  
  /** @deprecated Use the "inlineDynamicImports" output option instead. */
  var inlineDynamicImports: js.UndefOr[Boolean] = js.native
  
  var input: js.Array[String] | StringDictionary[String] = js.native
  
  /** @deprecated Use the "manualChunks" output option instead. */
  var manualChunks: js.UndefOr[ManualChunksOption] = js.native
  
  def moduleContext(id: String): String = js.native
  
  def onwarn(warning: RollupWarning): Unit = js.native
  @JSName("onwarn")
  var onwarn_Original: WarningHandler = js.native
  
  var perf: Boolean = js.native
  
  var plugins: js.Array[Plugin] = js.native
  
  var preserveEntrySignatures: PreserveEntrySignaturesOption = js.native
  
  /** @deprecated Use the "preserveModules" output option instead. */
  var preserveModules: js.UndefOr[Boolean] = js.native
  
  var preserveSymlinks: Boolean = js.native
  
  var shimMissingExports: Boolean = js.native
  
  var strictDeprecations: Boolean = js.native
  
  var treeshake: `false` | NormalizedTreeshakingOptions = js.native
}
