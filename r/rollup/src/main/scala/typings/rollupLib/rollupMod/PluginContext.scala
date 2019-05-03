package typings
package rollupLib.rollupMod

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
  /** @deprecated */
  @JSName("isExternal")
  var isExternal_Original: IsExternal = js.native
  var moduleIds: stdLib.IterableIterator[java.lang.String] = js.native
  /** @deprecated */
  var watcher: nodeLib.eventsMod.EventEmitter = js.native
  def addWatchFile(id: java.lang.String): scala.Unit = js.native
  def emitAsset(name: java.lang.String): java.lang.String = js.native
  def emitAsset(name: java.lang.String, source: java.lang.String): java.lang.String = js.native
  def emitAsset(name: java.lang.String, source: nodeLib.Buffer): java.lang.String = js.native
  def emitChunk(name: java.lang.String): java.lang.String = js.native
  def emitChunk(name: java.lang.String, options: rollupLib.Anon_Name): java.lang.String = js.native
  def error(err: java.lang.String): scala.Unit = js.native
  def error(err: java.lang.String, pos: rollupLib.Anon_ColumnLine): scala.Unit = js.native
  def error(err: RollupError): scala.Unit = js.native
  def error(err: RollupError, pos: rollupLib.Anon_ColumnLine): scala.Unit = js.native
  def getAssetFileName(assetReferenceId: java.lang.String): java.lang.String = js.native
  def getChunkFileName(chunkReferenceId: java.lang.String): java.lang.String = js.native
  def getModuleInfo(moduleId: java.lang.String): rollupLib.Anon_Id = js.native
  /** @deprecated */
  def isExternal(source: java.lang.String, importer: java.lang.String, isResolved: scala.Boolean): scala.Boolean | scala.Unit = js.native
  def parse(input: java.lang.String, options: js.Any): estreeLib.estreeMod.Program = js.native
  def resolve(source: java.lang.String, importer: java.lang.String): js.Promise[ResolvedId | scala.Null] = js.native
  /** @deprecated */
  def resolveId(source: java.lang.String, importer: java.lang.String): js.Promise[java.lang.String | scala.Null] = js.native
  def setAssetSource(assetReferenceId: java.lang.String, source: java.lang.String): scala.Unit = js.native
  def setAssetSource(assetReferenceId: java.lang.String, source: nodeLib.Buffer): scala.Unit = js.native
  def warn(warning: java.lang.String): scala.Unit = js.native
  def warn(warning: java.lang.String, pos: rollupLib.Anon_ColumnLine): scala.Unit = js.native
  def warn(warning: RollupWarning): scala.Unit = js.native
  def warn(warning: RollupWarning, pos: rollupLib.Anon_ColumnLine): scala.Unit = js.native
}

