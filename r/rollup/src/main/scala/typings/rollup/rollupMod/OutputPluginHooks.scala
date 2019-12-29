package typings.rollup.rollupMod

import typings.estree.estreeMod.Node
import typings.rollup.Anon_AssetFileName
import typings.rollup.Anon_AssetReferenceId
import typings.rollup.Anon_Code
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputPluginHooks extends js.Object {
  @JSName("renderChunk")
  var renderChunk_Original: RenderChunkHook = js.native
  /** @deprecated Use `resolveFileUrl` instead */
  @JSName("resolveAssetUrl")
  var resolveAssetUrl_Original: ResolveAssetUrlHook = js.native
  @JSName("resolveDynamicImport")
  var resolveDynamicImport_Original: ResolveDynamicImportHook = js.native
  @JSName("resolveFileUrl")
  var resolveFileUrl_Original: ResolveFileUrlHook = js.native
  /** @deprecated Use `renderChunk` instead */
  @JSName("transformBundle")
  var transformBundle_Original: TransformChunkHook = js.native
  /** @deprecated Use `renderChunk` instead */
  @JSName("transformChunk")
  var transformChunk_Original: TransformChunkHook = js.native
  def augmentChunkHash(chunk: PreRenderedChunk): String | Unit = js.native
  def generateBundle(options: OutputOptions, bundle: OutputBundle, isWrite: Boolean): Unit | js.Promise[Unit] = js.native
  /** @deprecated Use `generateBundle` instead */
  def ongenerate(options: OnGenerateOptions, chunk: OutputChunk): Unit | js.Promise[Unit] = js.native
  /** @deprecated Use `writeBundle` instead */
  def onwrite(options: OnWriteOptions, chunk: OutputChunk): Unit | js.Promise[Unit] = js.native
  def outputOptions(options: OutputOptions): js.UndefOr[OutputOptions | Null] = js.native
  def renderChunk(code: String, chunk: RenderedChunk, options: OutputOptions): (js.Promise[Anon_Code | Null]) | Anon_Code | String | Null = js.native
  def renderError(): js.Promise[Unit] | Unit = js.native
  def renderError(err: Error): js.Promise[Unit] | Unit = js.native
  def renderStart(outputOptions: OutputOptions, inputOptions: InputOptions): js.Promise[Unit] | Unit = js.native
  /** @deprecated Use `resolveFileUrl` instead */
  def resolveAssetUrl(options: Anon_AssetFileName): js.UndefOr[String | Null] = js.native
  def resolveDynamicImport(specifier: String, importer: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveDynamicImport(specifier: Node, importer: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveFileUrl(options: Anon_AssetReferenceId): js.UndefOr[String | Null] = js.native
  /** @deprecated Use `renderChunk` instead */
  def transformBundle(code: String, options: OutputOptions): js.UndefOr[(js.Promise[js.UndefOr[Anon_Code | Null]]) | Anon_Code | Null] = js.native
  /** @deprecated Use `renderChunk` instead */
  def transformChunk(code: String, options: OutputOptions): js.UndefOr[(js.Promise[js.UndefOr[Anon_Code | Null]]) | Anon_Code | Null] = js.native
  def writeBundle(bundle: OutputBundle): Unit | js.Promise[Unit] = js.native
}

