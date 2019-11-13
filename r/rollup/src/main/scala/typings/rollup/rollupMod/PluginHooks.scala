package typings.rollup.rollupMod

import typings.rollup.Anon_ChunkId
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginHooks extends OutputPluginHooks {
  @JSName("load")
  var load_Original: LoadHook = js.native
  @JSName("resolveId")
  var resolveId_Original: ResolveIdHook = js.native
  @JSName("resolveImportMeta")
  var resolveImportMeta_Original: ResolveImportMetaHook = js.native
  @JSName("transform")
  var transform_Original: TransformHook = js.native
  def buildEnd(`this`: PluginContext): js.Promise[Unit] | Unit = js.native
  def buildEnd(`this`: PluginContext, err: Error): js.Promise[Unit] | Unit = js.native
  def buildStart(`this`: PluginContext, options: InputOptions): js.Promise[Unit] | Unit = js.native
  def load(`this`: PluginContext, id: String): (js.Promise[SourceDescription | String | Null]) | SourceDescription | String | Null = js.native
  def options(`this`: MinimalPluginContext, options: InputOptions): js.UndefOr[InputOptions | Null] = js.native
  def resolveId(`this`: PluginContext, source: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveId(`this`: PluginContext, source: String, importer: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveImportMeta(`this`: PluginContext, prop: String, options: Anon_ChunkId): js.UndefOr[String | Null] = js.native
  def resolveImportMeta(`this`: PluginContext, prop: Null, options: Anon_ChunkId): js.UndefOr[String | Null] = js.native
  def transform(`this`: PluginContext, code: String, id: String): js.Promise[TransformResult] | TransformResult = js.native
  def watchChange(id: String): Unit = js.native
}

