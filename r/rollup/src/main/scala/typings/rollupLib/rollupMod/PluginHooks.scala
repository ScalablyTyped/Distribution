package typings
package rollupLib.rollupMod

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
  def buildEnd(`this`: PluginContext): js.Promise[scala.Unit] | scala.Unit = js.native
  def buildEnd(`this`: PluginContext, err: stdLib.Error): js.Promise[scala.Unit] | scala.Unit = js.native
  def buildStart(`this`: PluginContext, options: InputOptions): js.Promise[scala.Unit] | scala.Unit = js.native
  def generateBundle(`this`: PluginContext, options: OutputOptions, bundle: OutputBundle, isWrite: scala.Boolean): scala.Unit | js.Promise[scala.Unit] = js.native
  def load(`this`: PluginContext, id: java.lang.String): (js.Promise[SourceDescription | java.lang.String | scala.Null]) | SourceDescription | java.lang.String | scala.Null = js.native
  /** @deprecated Use `generateBundle` instead */
  def ongenerate(`this`: PluginContext, options: OnGenerateOptions, chunk: OutputChunk): scala.Unit | js.Promise[scala.Unit] = js.native
  /** @deprecated Use `writeBundle` instead */
  def onwrite(`this`: PluginContext, options: OnWriteOptions, chunk: OutputChunk): scala.Unit | js.Promise[scala.Unit] = js.native
  def options(`this`: MinimalPluginContext, options: InputOptions): js.UndefOr[InputOptions | scala.Null] = js.native
  def outputOptions(`this`: PluginContext, options: OutputOptions): js.UndefOr[OutputOptions | scala.Null] = js.native
  def renderChunk(`this`: PluginContext, code: java.lang.String, chunk: RenderedChunk, options: OutputOptions): (js.Promise[rollupLib.Anon_Code | scala.Null]) | rollupLib.Anon_Code | java.lang.String | scala.Null = js.native
  def renderError(`this`: PluginContext): js.Promise[scala.Unit] | scala.Unit = js.native
  def renderError(`this`: PluginContext, err: stdLib.Error): js.Promise[scala.Unit] | scala.Unit = js.native
  def renderStart(`this`: PluginContext): js.Promise[scala.Unit] | scala.Unit = js.native
  /** @deprecated Use `resolveFileUrl` instead */
  def resolveAssetUrl(`this`: PluginContext, options: rollupLib.Anon_AssetFileName): js.UndefOr[java.lang.String | scala.Null] = js.native
  def resolveDynamicImport(`this`: PluginContext, specifier: estreeLib.estreeMod.Node, importer: java.lang.String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveDynamicImport(`this`: PluginContext, specifier: java.lang.String, importer: java.lang.String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveFileUrl(`this`: PluginContext, options: rollupLib.Anon_AssetReferenceId): js.UndefOr[java.lang.String | scala.Null] = js.native
  def resolveId(`this`: PluginContext, source: java.lang.String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveId(`this`: PluginContext, source: java.lang.String, importer: java.lang.String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveImportMeta(`this`: PluginContext, prop: java.lang.String, options: rollupLib.Anon_ChunkId): js.UndefOr[java.lang.String | scala.Null] = js.native
  def resolveImportMeta(`this`: PluginContext, prop: scala.Null, options: rollupLib.Anon_ChunkId): js.UndefOr[java.lang.String | scala.Null] = js.native
  def transform(`this`: PluginContext, code: java.lang.String, id: java.lang.String): js.Promise[TransformResult] | TransformResult = js.native
  /** @deprecated Use `renderChunk` instead */
  def transformBundle(`this`: PluginContext, code: java.lang.String, options: OutputOptions): js.UndefOr[
    (js.Promise[js.UndefOr[rollupLib.Anon_Code | scala.Null]]) | rollupLib.Anon_Code | scala.Null
  ] = js.native
  /** @deprecated Use `renderChunk` instead */
  def transformChunk(`this`: PluginContext, code: java.lang.String, options: OutputOptions): js.UndefOr[
    (js.Promise[js.UndefOr[rollupLib.Anon_Code | scala.Null]]) | rollupLib.Anon_Code | scala.Null
  ] = js.native
  def watchChange(id: java.lang.String): scala.Unit = js.native
  def writeBundle(`this`: PluginContext, bundle: OutputBundle): scala.Unit | js.Promise[scala.Unit] = js.native
}

