package typings.rollup.mod

import typings.rollup.AnonChunkId
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
  def buildEnd(): js.Promise[Unit] | Unit = js.native
  def buildEnd(err: Error): js.Promise[Unit] | Unit = js.native
  def buildStart(options: InputOptions): js.Promise[Unit] | Unit = js.native
  def load(id: String): js.Promise[LoadResult] | LoadResult = js.native
  def options(options: InputOptions): js.UndefOr[InputOptions | Null] = js.native
  def resolveId(source: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveId(source: String, importer: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveImportMeta(prop: String, options: AnonChunkId): js.UndefOr[String | Null] = js.native
  def resolveImportMeta(prop: Null, options: AnonChunkId): js.UndefOr[String | Null] = js.native
  def transform(code: String, id: String): js.Promise[TransformResult] | TransformResult = js.native
  def watchChange(id: String): Unit = js.native
}

