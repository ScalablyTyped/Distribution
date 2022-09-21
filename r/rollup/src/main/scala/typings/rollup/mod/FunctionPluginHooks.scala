package typings.rollup.mod

import typings.rollup.anon.AssetFileName
import typings.rollup.anon.AssetReferenceId
import typings.rollup.anon.Ast
import typings.rollup.anon.ChunkId
import typings.rollup.anon.Code
import typings.rollup.anon.CustomResolution
import typings.rollup.anon.Event
import typings.rollup.anon.IsEntry
import typings.rollup.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionPluginHooks extends StObject {
  
  def augmentChunkHash(chunk: PreRenderedChunk): String | Unit = js.native
  
  def buildEnd(): Unit = js.native
  def buildEnd(err: js.Error): Unit = js.native
  
  def buildStart(options: NormalizedInputOptions): Unit = js.native
  
  def closeBundle(): Unit = js.native
  
  def closeWatcher(): Unit = js.native
  
  def generateBundle(options: NormalizedOutputOptions, bundle: OutputBundle, isWrite: Boolean): Unit = js.native
  
  def load(id: String): LoadResult = js.native
  @JSName("load")
  var load_Original: LoadHook = js.native
  
  def moduleParsed(info: ModuleInfo): Unit = js.native
  @JSName("moduleParsed")
  var moduleParsed_Original: ModuleParsedHook = js.native
  
  def options(options: InputOptions): InputOptions | Null | Unit = js.native
  
  def outputOptions(options: OutputOptions): OutputOptions | Null | Unit = js.native
  
  def renderChunk(code: String, chunk: RenderedChunk, options: NormalizedOutputOptions): js.UndefOr[Code | String | Null] = js.native
  @JSName("renderChunk")
  var renderChunk_Original: RenderChunkHook = js.native
  
  def renderDynamicImport(options: CustomResolution): Left | Null | Unit = js.native
  
  def renderError(): Unit = js.native
  def renderError(err: js.Error): Unit = js.native
  
  def renderStart(outputOptions: NormalizedOutputOptions, inputOptions: NormalizedInputOptions): Unit = js.native
  
  /** @deprecated Use `resolveFileUrl` instead */
  def resolveAssetUrl(options: AssetFileName): String | Null | Unit = js.native
  /** @deprecated Use `resolveFileUrl` instead */
  @JSName("resolveAssetUrl")
  var resolveAssetUrl_Original: ResolveAssetUrlHook = js.native
  
  def resolveDynamicImport(specifier: String, importer: String): ResolveIdResult = js.native
  def resolveDynamicImport(specifier: AcornNode, importer: String): ResolveIdResult = js.native
  @JSName("resolveDynamicImport")
  var resolveDynamicImport_Original: ResolveDynamicImportHook = js.native
  
  def resolveFileUrl(options: AssetReferenceId): String | Null | Unit = js.native
  @JSName("resolveFileUrl")
  var resolveFileUrl_Original: ResolveFileUrlHook = js.native
  
  def resolveId(source: String, importer: String, options: IsEntry): ResolveIdResult = js.native
  def resolveId(source: String, importer: Unit, options: IsEntry): ResolveIdResult = js.native
  @JSName("resolveId")
  var resolveId_Original: ResolveIdHook = js.native
  
  def resolveImportMeta(prop: String, options: ChunkId): String | Null | Unit = js.native
  def resolveImportMeta(prop: Null, options: ChunkId): String | Null | Unit = js.native
  @JSName("resolveImportMeta")
  var resolveImportMeta_Original: ResolveImportMetaHook = js.native
  
  def shouldTransformCachedModule(options: Ast): Boolean = js.native
  @JSName("shouldTransformCachedModule")
  var shouldTransformCachedModule_Original: ShouldTransformCachedModuleHook = js.native
  
  def transform(code: String, id: String): TransformResult = js.native
  @JSName("transform")
  var transform_Original: TransformHook = js.native
  
  def watchChange(id: String, change: Event): Unit = js.native
  @JSName("watchChange")
  var watchChange_Original: WatchChangeHook = js.native
  
  def writeBundle(options: NormalizedOutputOptions, bundle: OutputBundle): Unit = js.native
}
