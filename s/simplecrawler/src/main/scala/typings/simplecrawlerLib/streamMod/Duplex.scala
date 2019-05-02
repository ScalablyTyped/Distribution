package typings
package simplecrawlerLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- simplecrawlerLib.streamMod.Writable because Inheritance from two classes. Inlined writable, _write, write, write, write, write, setDefaultEncoding, end, end, end, end, end, end, addListener, addListener_close, addListener_drain, addListener_error, addListener_finish, addListener_pipe, addListener_unpipe, emit, emit, emit_close, emit_drain, emit_drain, emit_error, emit_finish, emit_pipe, emit_unpipe, on, on_close, on_drain, on_error, on_finish, on_pipe, on_unpipe, once, once_close, once_drain, once_error, once_finish, once_pipe, once_unpipe, prependListener, prependListener_close, prependListener_drain, prependListener_error, prependListener_finish, prependListener_pipe, prependListener_unpipe, prependOnceListener, prependOnceListener_close, prependOnceListener_drain, prependOnceListener_error, prependOnceListener_finish, prependOnceListener_pipe, prependOnceListener_unpipe, removeListener, removeListener_close, removeListener_drain, removeListener_error, removeListener_finish, removeListener_pipe, removeListener_unpipe */ @JSImport("stream", "Duplex")
@js.native
class Duplex () extends Readable {
  def this(opts: DuplexOptions) = this()
  var writable: scala.Boolean = js.native
  def _write(chunk: js.Any, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
  @JSName("addListener")
  def addListener_drain(event: simplecrawlerLib.simplecrawlerLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_finish(event: simplecrawlerLib.simplecrawlerLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pipe(
    event: simplecrawlerLib.simplecrawlerLibStrings.pipe,
    listener: js.Function1[/* src */ Readable, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_unpipe(
    event: simplecrawlerLib.simplecrawlerLibStrings.unpipe,
    listener: js.Function1[/* src */ Readable, scala.Unit]
  ): this.type = js.native
  @JSName("emit")
  def emit_drain(event: simplecrawlerLib.simplecrawlerLibStrings.drain, chunk: java.lang.String): scala.Boolean = js.native
  @JSName("emit")
  def emit_drain(event: simplecrawlerLib.simplecrawlerLibStrings.drain, chunk: simplecrawlerLib.Buffer): scala.Boolean = js.native
  @JSName("emit")
  def emit_finish(event: simplecrawlerLib.simplecrawlerLibStrings.finish): scala.Boolean = js.native
  @JSName("emit")
  def emit_pipe(event: simplecrawlerLib.simplecrawlerLibStrings.pipe, src: Readable): scala.Boolean = js.native
  @JSName("emit")
  def emit_unpipe(event: simplecrawlerLib.simplecrawlerLibStrings.unpipe, src: Readable): scala.Boolean = js.native
  def end(): scala.Unit = js.native
  def end(cb: js.Function): scala.Unit = js.native
  def end(chunk: js.Any): scala.Unit = js.native
  def end(chunk: js.Any, cb: js.Function): scala.Unit = js.native
  def end(chunk: js.Any, encoding: java.lang.String): scala.Unit = js.native
  def end(chunk: js.Any, encoding: java.lang.String, cb: js.Function): scala.Unit = js.native
  @JSName("on")
  def on_drain(event: simplecrawlerLib.simplecrawlerLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: simplecrawlerLib.simplecrawlerLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(
    event: simplecrawlerLib.simplecrawlerLibStrings.pipe,
    listener: js.Function1[/* src */ Readable, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_unpipe(
    event: simplecrawlerLib.simplecrawlerLibStrings.unpipe,
    listener: js.Function1[/* src */ Readable, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_drain(event: simplecrawlerLib.simplecrawlerLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_finish(event: simplecrawlerLib.simplecrawlerLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_pipe(
    event: simplecrawlerLib.simplecrawlerLibStrings.pipe,
    listener: js.Function1[/* src */ Readable, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_unpipe(
    event: simplecrawlerLib.simplecrawlerLibStrings.unpipe,
    listener: js.Function1[/* src */ Readable, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_drain(event: simplecrawlerLib.simplecrawlerLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_finish(event: simplecrawlerLib.simplecrawlerLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pipe(
    event: simplecrawlerLib.simplecrawlerLibStrings.pipe,
    listener: js.Function1[/* src */ Readable, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_unpipe(
    event: simplecrawlerLib.simplecrawlerLibStrings.unpipe,
    listener: js.Function1[/* src */ Readable, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_drain(event: simplecrawlerLib.simplecrawlerLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_finish(event: simplecrawlerLib.simplecrawlerLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pipe(
    event: simplecrawlerLib.simplecrawlerLibStrings.pipe,
    listener: js.Function1[/* src */ Readable, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_unpipe(
    event: simplecrawlerLib.simplecrawlerLibStrings.unpipe,
    listener: js.Function1[/* src */ Readable, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_drain(event: simplecrawlerLib.simplecrawlerLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_finish(event: simplecrawlerLib.simplecrawlerLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pipe(
    event: simplecrawlerLib.simplecrawlerLibStrings.pipe,
    listener: js.Function1[/* src */ Readable, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_unpipe(
    event: simplecrawlerLib.simplecrawlerLibStrings.unpipe,
    listener: js.Function1[/* src */ Readable, scala.Unit]
  ): this.type = js.native
  def setDefaultEncoding(encoding: java.lang.String): this.type = js.native
  def write(chunk: js.Any): scala.Boolean = js.native
  def write(chunk: js.Any, cb: js.Function): scala.Boolean = js.native
  def write(chunk: js.Any, encoding: java.lang.String): scala.Boolean = js.native
  def write(chunk: js.Any, encoding: java.lang.String, cb: js.Function): scala.Boolean = js.native
}

