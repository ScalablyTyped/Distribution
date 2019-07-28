package typings.rollup.rollupMod

import typings.estree.estreeMod.Program
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.rollup.Anon_ColumnLine
import typings.rollup.Anon_HasModuleSideEffects
import typings.rollup.Anon_Name
import typings.rollup.Anon_SkipSelf
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginContext extends MinimalPluginContext {
  var cache: PluginCache = js.native
  @JSName("emitAsset")
  var emitAsset_Original: EmitAsset = js.native
  @JSName("emitChunk")
  var emitChunk_Original: EmitChunk = js.native
  /** @deprecated Use `this.resolve` instead */
  @JSName("isExternal")
  var isExternal_Original: IsExternal = js.native
  var moduleIds: IterableIterator[String] = js.native
  /** @deprecated Use `this.addWatchFile` and the `watchChange` hook instead  */
  var watcher: EventEmitter = js.native
  def addWatchFile(id: String): Unit = js.native
  def emitAsset(name: String): String = js.native
  def emitAsset(name: String, source: String): String = js.native
  def emitAsset(name: String, source: Buffer): String = js.native
  def emitChunk(name: String): String = js.native
  def emitChunk(name: String, options: Anon_Name): String = js.native
  def error(err: String): scala.Nothing = js.native
  def error(err: String, pos: Double): scala.Nothing = js.native
  def error(err: String, pos: Anon_ColumnLine): scala.Nothing = js.native
  def error(err: RollupError): scala.Nothing = js.native
  def error(err: RollupError, pos: Double): scala.Nothing = js.native
  def error(err: RollupError, pos: Anon_ColumnLine): scala.Nothing = js.native
  def getAssetFileName(assetReferenceId: String): String = js.native
  def getChunkFileName(chunkReferenceId: String): String = js.native
  def getModuleInfo(moduleId: String): Anon_HasModuleSideEffects = js.native
  /** @deprecated Use `this.resolve` instead */
  def isExternal(source: String, importer: String, isResolved: Boolean): js.UndefOr[Boolean | Null] = js.native
  def parse(input: String, options: js.Any): Program = js.native
  def resolve(source: String, importer: String): js.Promise[ResolvedId | Null] = js.native
  def resolve(source: String, importer: String, options: Anon_SkipSelf): js.Promise[ResolvedId | Null] = js.native
  /** @deprecated Use `this.resolve` instead */
  def resolveId(source: String, importer: String): js.Promise[String | Null] = js.native
  def setAssetSource(assetReferenceId: String, source: String): Unit = js.native
  def setAssetSource(assetReferenceId: String, source: Buffer): Unit = js.native
  def warn(warning: String): Unit = js.native
  def warn(warning: String, pos: Double): Unit = js.native
  def warn(warning: String, pos: Anon_ColumnLine): Unit = js.native
  def warn(warning: RollupWarning): Unit = js.native
  def warn(warning: RollupWarning, pos: Double): Unit = js.native
  def warn(warning: RollupWarning, pos: Anon_ColumnLine): Unit = js.native
}

