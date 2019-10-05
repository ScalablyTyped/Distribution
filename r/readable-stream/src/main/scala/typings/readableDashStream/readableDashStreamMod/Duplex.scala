package typings.readableDashStream.readableDashStreamMod

import typings.node.BufferEncoding
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.nodeStrings.data
import typings.node.nodeStrings.end
import typings.node.nodeStrings.readable
import typings.readableDashStream.Anon_End
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.node.eventsMod.internal because Already inherited
- typings.node.eventsMod.EventEmitter because Already inherited
- typings.node.childUnderscoreProcessMod.StdioNull because Already inherited
- typings.node.streamMod.internal because Already inherited
- typings.node.streamMod.Stream because Already inherited
- typings.node.streamMod.Readable because Inheritance from two classes. Inlined readableHighWaterMark, readableLength, readableObjectMode, _destroy, _destroy, _read, addListener, addListener, addListener_close, addListener_data, addListener_end, addListener_error, addListener_readable, emit, emit, emit_close, emit_data, emit_end, emit_error, emit_readable, eventNames, getMaxListeners, listenerCount, listenerCount, listeners, listeners, off, off, on, on, on_close, on_data, on_end, on_error, on_readable, once, once, once_close, once_data, once_end, once_error, once_readable, pipe, pipe, prependListener, prependListener, prependListener_close, prependListener_data, prependListener_end, prependListener_error, prependListener_readable, prependOnceListener, prependOnceListener, prependOnceListener_close, prependOnceListener_data, prependOnceListener_end, prependOnceListener_error, prependOnceListener_readable, push, push, rawListeners, rawListeners, removeAllListeners, removeAllListeners, removeAllListeners, removeListener, removeListener, removeListener_close, removeListener_data, removeListener_end, removeListener_error, removeListener_readable, setMaxListeners, unshift, unshift
- typings.node.streamMod.Duplex because Inheritance from two classes. Inlined _final, _write, addListener_drain, addListener_finish, addListener_pipe, addListener_unpipe, cork, emit_drain, emit_finish, emit_pipe, emit_unpipe, end, end, end, end, end, end, on_drain, on_finish, on_pipe, on_unpipe, once_drain, once_finish, once_pipe, once_unpipe, prependListener_drain, prependListener_finish, prependListener_pipe, prependListener_unpipe, prependOnceListener_drain, prependOnceListener_finish, prependOnceListener_pipe, prependOnceListener_unpipe, removeListener_drain, removeListener_finish, removeListener_pipe, removeListener_unpipe, setDefaultEncoding, uncork, write, write, write, write
- typings.readableDashStream.readableDashStreamMod._Readable because Inheritance from two classes. Inlined _readableState, destroy, destroy, destroy, _undestroy */ @JSImport("readable-stream", "Duplex")
@js.native
// end-Readable
class Duplex ()
  extends Writable
     with ReadableStream {
  def this(options: DuplexOptions) = this()
  var _readableState: ReadableState = js.native
  var allowHalfOpen: Boolean = js.native
  val readableHighWaterMark: Double = js.native
  val readableLength: Double = js.native
  val readableObjectMode: Boolean = js.native
  def _destroy(err: Error, callback: js.Function1[/* error */ Error | Null, Unit]): Unit = js.native
  def _read(): Unit = js.native
  def _read(size: Double): Unit = js.native
  /* InferMemberOverrides */
  override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def emit(event: String, args: js.Any*): Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, chunk: js.Any): Boolean = js.native
  @JSName("emit")
  def emit_end(event: end): Boolean = js.native
  @JSName("emit")
  def emit_readable(event: readable): Boolean = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: String): Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  def pipe[S /* <: WritableStream */](dest: S, pipeOpts: Anon_End): S = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: typings.node.Anon_End): T = js.native
  @JSName("pipe")
  def pipe_S_WritableStream_S[S /* <: WritableStream */](dest: S): S = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  def push(chunk: js.Any): Boolean = js.native
  def push(chunk: js.Any, encoding: String): Boolean = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: Double): this.type = js.native
  def unshift(chunk: js.Any): Boolean = js.native
  def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
  @JSName("unshift")
  def unshift_Unit(chunk: js.Any): Unit = js.native
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

