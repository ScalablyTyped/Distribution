package typings.rollup.mod

import typings.rollup.anon.AssetFileName
import typings.rollup.anon.AssetReferenceId
import typings.rollup.anon.ChunkId
import typings.rollup.anon.Code
import typings.rollup.anon.CustomResolution
import typings.rollup.anon.Left
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
  @JSName("resolveFileUrl")
  var resolveFileUrl_Original: ResolveFileUrlHook = js.native
  @JSName("resolveImportMeta")
  var resolveImportMeta_Original: ResolveImportMetaHook = js.native
  def augmentChunkHash(chunk: PreRenderedChunk): String | Unit = js.native
  def generateBundle(options: NormalizedOutputOptions, bundle: OutputBundle, isWrite: Boolean): Unit | js.Promise[Unit] = js.native
  def outputOptions(options: OutputOptions): js.UndefOr[OutputOptions | Null] = js.native
  def renderChunk(code: String, chunk: RenderedChunk, options: NormalizedOutputOptions): (js.Promise[Code | Null]) | Code | String | Null = js.native
  def renderDynamicImport(options: CustomResolution): js.UndefOr[Left | Null] = js.native
  def renderError(): js.Promise[Unit] | Unit = js.native
  def renderError(err: Error): js.Promise[Unit] | Unit = js.native
  def renderStart(outputOptions: NormalizedOutputOptions, inputOptions: NormalizedInputOptions): js.Promise[Unit] | Unit = js.native
  /** @deprecated Use `resolveFileUrl` instead */
  def resolveAssetUrl(options: AssetFileName): js.UndefOr[String | Null] = js.native
  def resolveFileUrl(options: AssetReferenceId): js.UndefOr[String | Null] = js.native
  def resolveImportMeta(prop: String, options: ChunkId): js.UndefOr[String | Null] = js.native
  def resolveImportMeta(prop: Null, options: ChunkId): js.UndefOr[String | Null] = js.native
  def writeBundle(options: NormalizedOutputOptions, bundle: OutputBundle): Unit | js.Promise[Unit] = js.native
}

