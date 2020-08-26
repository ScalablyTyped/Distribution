package typings.rollup.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginHooks extends OutputPluginHooks {
  @JSName("load")
  var load_Original: LoadHook = js.native
  @JSName("resolveDynamicImport")
  var resolveDynamicImport_Original: ResolveDynamicImportHook = js.native
  @JSName("resolveId")
  var resolveId_Original: ResolveIdHook = js.native
  @JSName("transform")
  var transform_Original: TransformHook = js.native
  def buildEnd(): js.Promise[Unit] | Unit = js.native
  def buildEnd(err: Error): js.Promise[Unit] | Unit = js.native
  def buildStart(options: NormalizedInputOptions): js.Promise[Unit] | Unit = js.native
  def load(id: String): js.Promise[LoadResult] | LoadResult = js.native
  def options(options: InputOptions): js.UndefOr[InputOptions | Null] = js.native
  def resolveDynamicImport(specifier: String, importer: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveDynamicImport(specifier: AcornNode, importer: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveId(source: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveId(source: String, importer: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def transform(code: String, id: String): js.Promise[TransformResult] | TransformResult = js.native
  def watchChange(id: String): Unit = js.native
}

