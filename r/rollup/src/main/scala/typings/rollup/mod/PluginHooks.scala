package typings.rollup.mod

import typings.rollup.anon.Event
import typings.rollup.anon.`1`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginHooks extends OutputPluginHooks {
  
  def buildEnd(): js.Promise[Unit] | Unit = js.native
  def buildEnd(err: Error): js.Promise[Unit] | Unit = js.native
  
  def buildStart(options: NormalizedInputOptions): js.Promise[Unit] | Unit = js.native
  
  def closeWatcher(): Unit = js.native
  
  def load(id: String): js.Promise[LoadResult] | LoadResult = js.native
  @JSName("load")
  var load_Original: LoadHook = js.native
  
  def moduleParsed(info: ModuleInfo): js.Promise[Unit] | Unit = js.native
  @JSName("moduleParsed")
  var moduleParsed_Original: ModuleParsedHook = js.native
  
  def options(options: InputOptions): js.UndefOr[(js.Promise[js.UndefOr[InputOptions | Null]]) | InputOptions | Null] = js.native
  
  def resolveDynamicImport(specifier: String, importer: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveDynamicImport(specifier: AcornNode, importer: String): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  @JSName("resolveDynamicImport")
  var resolveDynamicImport_Original: ResolveDynamicImportHook = js.native
  
  def resolveId(source: String, importer: js.UndefOr[scala.Nothing], options: `1`): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  def resolveId(source: String, importer: String, options: `1`): js.Promise[ResolveIdResult] | ResolveIdResult = js.native
  @JSName("resolveId")
  var resolveId_Original: ResolveIdHook = js.native
  
  def transform(code: String, id: String): js.Promise[TransformResult] | TransformResult = js.native
  @JSName("transform")
  var transform_Original: TransformHook = js.native
  
  def watchChange(id: String, change: Event): Unit = js.native
  @JSName("watchChange")
  var watchChange_Original: WatchChangeHook = js.native
}
