package typings.rollup.mod

import typings.rollup.anon.AssertionsRecord
import typings.rollup.anon.Ast
import typings.rollup.anon.ChunkId
import typings.rollup.anon.Chunks
import typings.rollup.anon.Code
import typings.rollup.anon.Custom
import typings.rollup.anon.CustomResolution
import typings.rollup.anon.Event
import typings.rollup.anon.FileName
import typings.rollup.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionPluginHooks extends StObject {
  
  def augmentChunkHash(chunk: RenderedChunk): String | Unit = js.native
  
  def buildEnd(): Unit = js.native
  def buildEnd(error: js.Error): Unit = js.native
  
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
  
  def onLog(level: LogLevel, log: RollupLog): Boolean | NullValue = js.native
  
  def options(options: InputOptions): InputOptions | NullValue = js.native
  
  def outputOptions(options: OutputOptions): OutputOptions | NullValue = js.native
  
  def renderChunk(code: String, chunk: RenderedChunk, options: NormalizedOutputOptions, meta: Chunks): Code | String | NullValue = js.native
  @JSName("renderChunk")
  var renderChunk_Original: RenderChunkHook = js.native
  
  def renderDynamicImport(options: CustomResolution): Left | NullValue = js.native
  
  def renderError(): Unit = js.native
  def renderError(error: js.Error): Unit = js.native
  
  def renderStart(outputOptions: NormalizedOutputOptions, inputOptions: NormalizedInputOptions): Unit = js.native
  
  def resolveDynamicImport(specifier: String, importer: String, options: AssertionsRecord): ResolveIdResult = js.native
  def resolveDynamicImport(specifier: AcornNode, importer: String, options: AssertionsRecord): ResolveIdResult = js.native
  @JSName("resolveDynamicImport")
  var resolveDynamicImport_Original: ResolveDynamicImportHook = js.native
  
  def resolveFileUrl(options: FileName): String | NullValue = js.native
  @JSName("resolveFileUrl")
  var resolveFileUrl_Original: ResolveFileUrlHook = js.native
  
  def resolveId(source: String, importer: String, options: Custom): ResolveIdResult = js.native
  def resolveId(source: String, importer: Unit, options: Custom): ResolveIdResult = js.native
  @JSName("resolveId")
  var resolveId_Original: ResolveIdHook = js.native
  
  def resolveImportMeta(property: String, options: ChunkId): String | NullValue = js.native
  def resolveImportMeta(property: Null, options: ChunkId): String | NullValue = js.native
  @JSName("resolveImportMeta")
  var resolveImportMeta_Original: ResolveImportMetaHook = js.native
  
  def shouldTransformCachedModule(options: Ast): Boolean | NullValue = js.native
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
