package typings.rollup.mod

import typings.rollup.anon.Id
import typings.rollup.rollupBooleans.`true`
import typings.rollup.rollupStrings.`inline`
import typings.rollup.rollupStrings.auto
import typings.rollup.rollupStrings.default
import typings.rollup.rollupStrings.hidden
import typings.rollup.rollupStrings.named
import typings.rollup.rollupStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizedOutputOptions extends StObject {
  
  var amd: Id = js.native
  
  var assetFileNames: String | (js.Function1[/* chunkInfo */ PreRenderedAsset, String]) = js.native
  
  def banner(): String | js.Promise[String] = js.native
  
  var chunkFileNames: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String]) = js.native
  
  var compact: Boolean = js.native
  
  var dir: js.UndefOr[String] = js.native
  
  /** @deprecated Use the "renderDynamicImport" plugin hook instead. */
  var dynamicImportFunction: js.UndefOr[String] = js.native
  
  var entryFileNames: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String]) = js.native
  
  var esModule: Boolean = js.native
  
  var exports: default | named | none | auto = js.native
  
  var extend: Boolean = js.native
  
  var externalLiveBindings: Boolean = js.native
  
  var file: js.UndefOr[String] = js.native
  
  def footer(): String | js.Promise[String] = js.native
  
  var format: InternalModuleFormat = js.native
  
  var freeze: Boolean = js.native
  
  var globals: GlobalsOption = js.native
  
  var hoistTransitiveImports: Boolean = js.native
  
  var indent: `true` | String = js.native
  
  var inlineDynamicImports: Boolean = js.native
  
  def interop(): InteropType = js.native
  def interop(id: String): InteropType = js.native
  @JSName("interop")
  var interop_Original: GetInterop = js.native
  
  def intro(): String | js.Promise[String] = js.native
  
  var manualChunks: ManualChunksOption = js.native
  
  var minifyInternalExports: Boolean = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var namespaceToStringTag: Boolean = js.native
  
  var noConflict: Boolean = js.native
  
  def outro(): String | js.Promise[String] = js.native
  
  var paths: OptionsPaths = js.native
  
  var plugins: js.Array[OutputPlugin] = js.native
  
  var preferConst: Boolean = js.native
  
  var preserveModules: Boolean = js.native
  
  var preserveModulesRoot: js.UndefOr[String] = js.native
  
  var sourcemap: Boolean | `inline` | hidden = js.native
  
  var sourcemapExcludeSources: Boolean = js.native
  
  var sourcemapFile: js.UndefOr[String] = js.native
  
  var sourcemapPathTransform: js.UndefOr[SourcemapPathTransformOption] = js.native
  
  var strict: Boolean = js.native
  
  var systemNullSetters: Boolean = js.native
}
