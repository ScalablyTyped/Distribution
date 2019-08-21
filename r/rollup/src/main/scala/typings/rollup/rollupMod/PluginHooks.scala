package typings.rollup.rollupMod

import typings.estree.estreeMod.Node
import typings.rollup.Anon_AssetFileName
import typings.rollup.Anon_AssetReferenceId
import typings.rollup.Anon_ChunkId
import typings.rollup.Anon_Code
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginHooks extends js.Object {
  @JSName("load")
  var load_Original: LoadHook = js.native
  @JSName("renderChunk")
  var renderChunk_Original: RenderChunkHook = js.native
  /** @deprecated Use `resolveFileUrl` instead */
  @JSName("resolveAssetUrl")
  var resolveAssetUrl_Original: ResolveAssetUrlHook = js.native
  @JSName("resolveDynamicImport")
  var resolveDynamicImport_Original: ResolveDynamicImportHook = js.native
  @JSName("resolveFileUrl")
  var resolveFileUrl_Original: ResolveFileUrlHook = js.native
  @JSName("resolveId")
  var resolveId_Original: ResolveIdHook = js.native
  @JSName("resolveImportMeta")
  var resolveImportMeta_Original: ResolveImportMetaHook = js.native
  /** @deprecated Use `renderChunk` instead */
  @JSName("transformBundle")
  var transformBundle_Original: TransformChunkHook = js.native
  /** @deprecated Use `renderChunk` instead */
  @JSName("transformChunk")
  var transformChunk_Original: TransformChunkHook = js.native
  @JSName("transform")
  var transform_Original: TransformHook = js.native
  def augmentChunkHash(`this`: PluginContext, chunk: PreRenderedChunk): String | Unit = js.native
  def buildEnd(`this`: PluginContext): js.Promise[Unit] | Unit = js.native
  def buildEnd(`this`: PluginContext, err: Error): js.Promise[Unit] | Unit = js.native
  def buildStart(`this`: PluginContext, options: InputOptions): js.Promise[Unit] | Unit = js.native
  def generateBundle(`this`: PluginContext, options: OutputOptions, bundle: OutputBundle, isWrite: Boolean): Unit | js.Promise[Unit] = js.native
  def load(`this`: PluginContext, id: String): (js.Promise[SourceDescription | String | Null]) | SourceDescription | String | Null = js.native
  /** @deprecated Use `generateBundle` instead */
  def ongenerate(`this`: PluginContext, options: OnGenerateOptions, chunk: OutputChunk): Unit | js.Promise[Unit] = js.native
  /** @deprecated Use `writeBundle` instead */
  def onwrite(`this`: PluginContext, options: OnWriteOptions, chunk: OutputChunk): Unit | js.Promise[Unit] = js.native
  def options(`this`: MinimalPluginContext, options: InputOptions): js.UndefOr[InputOptions | Null] = js.native
  def outputOptions(`this`: PluginContext, options: OutputOptions): js.UndefOr[OutputOptions | Null] = js.native
  def renderChunk(`this`: PluginContext, code: String, chunk: RenderedChunk, options: OutputOptions): (js.Promise[Anon_Code | Null]) | Anon_Code | String | Null = js.native
  def renderError(`this`: PluginContext): js.Promise[Unit] | Unit = js.native
  def renderError(`this`: PluginContext, err: Error): js.Promise[Unit] | Unit = js.native
  def renderStart(`this`: PluginContext): js.Promise[Unit] | Unit = js.native
  /** @deprecated Use `resolveFileUrl` instead */
  def resolveAssetUrl(`this`: PluginContext, options: Anon_AssetFileName): js.UndefOr[String | Null] = js.native
  def resolveDynamicImport(`this`: PluginContext, specifier: String, importer: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveDynamicImport(`this`: PluginContext, specifier: Node, importer: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveFileUrl(`this`: PluginContext, options: Anon_AssetReferenceId): js.UndefOr[String | Null] = js.native
  def resolveId(`this`: PluginContext, source: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveId(`this`: PluginContext, source: String, importer: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveImportMeta(`this`: PluginContext, prop: String, options: Anon_ChunkId): js.UndefOr[String | Null] = js.native
  def resolveImportMeta(`this`: PluginContext, prop: Null, options: Anon_ChunkId): js.UndefOr[String | Null] = js.native
  def transform(`this`: PluginContext, code: String, id: String): js.Promise[TransformResult] | TransformResult = js.native
  /** @deprecated Use `renderChunk` instead */
  def transformBundle(`this`: PluginContext, code: String, options: OutputOptions): js.UndefOr[(js.Promise[js.UndefOr[Anon_Code | Null]]) | Anon_Code | Null] = js.native
  /** @deprecated Use `renderChunk` instead */
  def transformChunk(`this`: PluginContext, code: String, options: OutputOptions): js.UndefOr[(js.Promise[js.UndefOr[Anon_Code | Null]]) | Anon_Code | Null] = js.native
  def watchChange(id: String): Unit = js.native
  def writeBundle(`this`: PluginContext, bundle: OutputBundle): Unit | js.Promise[Unit] = js.native
}

