package typings.readableDashStream.readableDashStreamMod

import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import typings.readableDashStream.Anon_End
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.node.streamMod.Duplex because Inheritance from two classes. Inlined _final, _write, addListener_drain, addListener_finish, addListener_pipe, addListener_unpipe, cork, emit_drain, emit_finish, emit_pipe, emit_unpipe, end, end, end, end, end, end, on_drain, on_finish, on_pipe, on_unpipe, once_drain, once_finish, once_pipe, once_unpipe, prependListener_drain, prependListener_finish, prependListener_pipe, prependListener_unpipe, prependOnceListener_drain, prependOnceListener_finish, prependOnceListener_pipe, prependOnceListener_unpipe, removeListener_drain, removeListener_finish, removeListener_pipe, removeListener_unpipe, setDefaultEncoding, uncork, write, write, write, write- typings.readableDashStream.readableDashStreamMod._Readable because Inheritance from two classes. Inlined _readableState, destroy, destroy, destroy, _undestroy */ @JSImport("readable-stream", "Duplex")
@js.native
// end-Readable
class Duplex () extends Writable {
  def this(options: DuplexOptions) = this()
  var _readableState: ReadableState = js.native
  var allowHalfOpen: Boolean = js.native
  // Readable
  var readable: Boolean = js.native
  val readableHighWaterMark: Double = js.native
  val readableLength: Double = js.native
  val readableObjectMode: Boolean = js.native
  def _destroy(err: Error, callback: js.Function1[/* error */ Error | Null, Unit]): Unit = js.native
  def _read(): Unit = js.native
  def _read(size: Double): Unit = js.native
  def isPaused(): Boolean = js.native
  def pause(): this.type = js.native
  def pipe[S /* <: WritableStream */](dest: S, pipeOpts: Anon_End): S = js.native
  def push(chunk: js.Any): Boolean = js.native
  def push(chunk: js.Any, encoding: String): Boolean = js.native
  def read(): js.Any = js.native
  def read(size: Double): js.Any = js.native
  def resume(): this.type = js.native
  def setEncoding(enc: String): this.type = js.native
  def unpipe(): this.type = js.native
  def unpipe(dest: WritableStream): this.type = js.native
  def unshift(chunk: js.Any): Boolean = js.native
  def wrap(oldStream: ReadableStream): this.type = js.native
}

/* static members */
@JSImport("readable-stream", "Duplex")
@js.native
object Duplex extends js.Object {
  /**
    * This is a dummy function required to retain type compatibility to node.
    * @deprecated DO NOT USE
    */
  def from(source: js.Any): js.Any = js.native
}

