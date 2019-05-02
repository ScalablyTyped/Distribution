package typings
package simplecrawlerLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "Writable")
@js.native
class Writable ()
  extends Stream
     with simplecrawlerLib.NodeJSNs.WritableStream {
  def this(opts: WritableOptions) = this()
  def _write(chunk: js.Any, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_drain(event: simplecrawlerLib.simplecrawlerLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
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
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  @JSName("emit")
  def emit_close(event: simplecrawlerLib.simplecrawlerLibStrings.close): scala.Boolean = js.native
  @JSName("emit")
  def emit_drain(event: simplecrawlerLib.simplecrawlerLibStrings.drain, chunk: java.lang.String): scala.Boolean = js.native
  @JSName("emit")
  def emit_drain(event: simplecrawlerLib.simplecrawlerLibStrings.drain, chunk: simplecrawlerLib.Buffer): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: simplecrawlerLib.simplecrawlerLibStrings.error, err: simplecrawlerLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_finish(event: simplecrawlerLib.simplecrawlerLibStrings.finish): scala.Boolean = js.native
  @JSName("emit")
  def emit_pipe(event: simplecrawlerLib.simplecrawlerLibStrings.pipe, src: Readable): scala.Boolean = js.native
  @JSName("emit")
  def emit_unpipe(event: simplecrawlerLib.simplecrawlerLibStrings.unpipe, src: Readable): scala.Boolean = js.native
  def end(chunk: js.Any): scala.Unit = js.native
  def end(chunk: js.Any, cb: js.Function): scala.Unit = js.native
  def end(chunk: js.Any, encoding: java.lang.String): scala.Unit = js.native
  def end(chunk: js.Any, encoding: java.lang.String, cb: js.Function): scala.Unit = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: simplecrawlerLib.simplecrawlerLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
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
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_drain(event: simplecrawlerLib.simplecrawlerLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
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
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_drain(event: simplecrawlerLib.simplecrawlerLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
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
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_drain(event: simplecrawlerLib.simplecrawlerLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
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
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_drain(event: simplecrawlerLib.simplecrawlerLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
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
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  def write(chunk: js.Any): scala.Boolean = js.native
  def write(chunk: js.Any, cb: js.Function): scala.Boolean = js.native
  def write(chunk: js.Any, encoding: java.lang.String): scala.Boolean = js.native
  def write(chunk: js.Any, encoding: java.lang.String, cb: js.Function): scala.Boolean = js.native
}

