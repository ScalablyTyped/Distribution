package typings.rollup.mod

import typings.estree.mod.Program
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.rollup.AnonHasModuleSideEffects
import typings.rollup.AnonLine
import typings.rollup.AnonName
import typings.rollup.AnonSkipSelf
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginContext extends MinimalPluginContext {
  var cache: PluginCache = js.native
  /** @deprecated Use `this.emitFile` instead */
  @JSName("emitAsset")
  var emitAsset_Original: EmitAsset = js.native
  /** @deprecated Use `this.emitFile` instead */
  @JSName("emitChunk")
  var emitChunk_Original: EmitChunk = js.native
  @JSName("emitFile")
  var emitFile_Original: EmitFile = js.native
  /** @deprecated Use `this.resolve` instead */
  @JSName("isExternal")
  var isExternal_Original: IsExternal = js.native
  var moduleIds: IterableIterator[String] = js.native
  /** @deprecated Use `this.addWatchFile` and the `watchChange` hook instead  */
  var watcher: EventEmitter = js.native
  def addWatchFile(id: String): Unit = js.native
  /** @deprecated Use `this.emitFile` instead */
  def emitAsset(name: String): String = js.native
  def emitAsset(name: String, source: String): String = js.native
  def emitAsset(name: String, source: Buffer): String = js.native
  /** @deprecated Use `this.emitFile` instead */
  def emitChunk(id: String): String = js.native
  def emitChunk(id: String, options: AnonName): String = js.native
  def emitFile(emittedFile: EmittedFile): String = js.native
  def error(err: String): scala.Nothing = js.native
  def error(err: String, pos: Double): scala.Nothing = js.native
  def error(err: String, pos: AnonLine): scala.Nothing = js.native
  def error(err: RollupError): scala.Nothing = js.native
  def error(err: RollupError, pos: Double): scala.Nothing = js.native
  def error(err: RollupError, pos: AnonLine): scala.Nothing = js.native
  /** @deprecated Use `this.getFileName` instead */
  def getAssetFileName(assetReferenceId: String): String = js.native
  /** @deprecated Use `this.getFileName` instead */
  def getChunkFileName(chunkReferenceId: String): String = js.native
  def getFileName(fileReferenceId: String): String = js.native
  def getModuleInfo(moduleId: String): AnonHasModuleSideEffects = js.native
  /** @deprecated Use `this.resolve` instead */
  def isExternal(source: String, importer: String, isResolved: Boolean): js.UndefOr[Boolean | Null] = js.native
  def parse(input: String, options: js.Any): Program = js.native
  def resolve(source: String, importer: String): js.Promise[ResolvedId | Null] = js.native
  def resolve(source: String, importer: String, options: AnonSkipSelf): js.Promise[ResolvedId | Null] = js.native
  /** @deprecated Use `this.resolve` instead */
  def resolveId(source: String, importer: String): js.Promise[String | Null] = js.native
  def setAssetSource(assetReferenceId: String, source: String): Unit = js.native
  def setAssetSource(assetReferenceId: String, source: Buffer): Unit = js.native
  def warn(warning: String): Unit = js.native
  def warn(warning: String, pos: Double): Unit = js.native
  def warn(warning: String, pos: AnonLine): Unit = js.native
  def warn(warning: RollupWarning): Unit = js.native
  def warn(warning: RollupWarning, pos: Double): Unit = js.native
  def warn(warning: RollupWarning, pos: AnonLine): Unit = js.native
}

