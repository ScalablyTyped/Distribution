package typings
package readableDashStreamLib.readableDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- nodeLib.streamMod.Duplex because Inheritance from two classes. Inlined _final, _write, addListener_drain, addListener_finish, addListener_pipe, addListener_unpipe, cork, emit_drain, emit_finish, emit_pipe, emit_unpipe, end, end, end, end, end, end, on_drain, on_finish, on_pipe, on_unpipe, once_drain, once_finish, once_pipe, once_unpipe, prependListener_drain, prependListener_finish, prependListener_pipe, prependListener_unpipe, prependOnceListener_drain, prependOnceListener_finish, prependOnceListener_pipe, prependOnceListener_unpipe, removeListener_drain, removeListener_finish, removeListener_pipe, removeListener_unpipe, setDefaultEncoding, uncork, write, write, write, write- readableDashStreamLib.readableDashStreamMod._Readable because Inheritance from two classes. Inlined _readableState, destroy, destroy, destroy, _undestroy */ @JSImport("readable-stream", "Duplex")
@js.native
// end-Readable
class Duplex () extends Writable {
  def this(options: DuplexOptions) = this()
  var _readableState: ReadableState = js.native
  var allowHalfOpen: scala.Boolean = js.native
  // Readable
  var readable: scala.Boolean = js.native
  val readableHighWaterMark: scala.Double = js.native
  val readableLength: scala.Double = js.native
  def _destroy(err: stdLib.Error, callback: js.Function1[/* error */ stdLib.Error | scala.Null, scala.Unit]): scala.Unit = js.native
  def _read(): scala.Unit = js.native
  def _read(size: scala.Double): scala.Unit = js.native
  def isPaused(): scala.Boolean = js.native
  def pause(): this.type = js.native
  def pipe[S /* <: nodeLib.NodeJSNs.WritableStream */](dest: S, pipeOpts: readableDashStreamLib.Anon_End): S = js.native
  def push(chunk: js.Any): scala.Boolean = js.native
  def push(chunk: js.Any, encoding: java.lang.String): scala.Boolean = js.native
  def read(): js.Any = js.native
  def read(size: scala.Double): js.Any = js.native
  def resume(): this.type = js.native
  def setEncoding(enc: java.lang.String): this.type = js.native
  def unpipe(): this.type = js.native
  def unpipe(dest: nodeLib.NodeJSNs.WritableStream): this.type = js.native
  def unshift(chunk: js.Any): scala.Boolean = js.native
  def wrap(oldStream: nodeLib.NodeJSNs.ReadableStream): this.type = js.native
}

