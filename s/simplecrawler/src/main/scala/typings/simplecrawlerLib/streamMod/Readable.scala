package typings
package simplecrawlerLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "Readable")
@js.native
class Readable ()
  extends Stream
     with simplecrawlerLib.NodeJSNs.ReadableStream {
  def this(opts: ReadableOptions) = this()
  def _read(size: scala.Double): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_data(
    event: simplecrawlerLib.simplecrawlerLibStrings.data,
    listener: js.Function1[/* chunk */ simplecrawlerLib.Buffer | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_end(event: simplecrawlerLib.simplecrawlerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_readable(event: simplecrawlerLib.simplecrawlerLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  @JSName("emit")
  def emit_close(event: simplecrawlerLib.simplecrawlerLibStrings.close): scala.Boolean = js.native
  @JSName("emit")
  def emit_data(event: simplecrawlerLib.simplecrawlerLibStrings.data, chunk: java.lang.String): scala.Boolean = js.native
  @JSName("emit")
  def emit_data(event: simplecrawlerLib.simplecrawlerLibStrings.data, chunk: simplecrawlerLib.Buffer): scala.Boolean = js.native
  @JSName("emit")
  def emit_end(event: simplecrawlerLib.simplecrawlerLibStrings.end): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: simplecrawlerLib.simplecrawlerLibStrings.error, err: simplecrawlerLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_readable(event: simplecrawlerLib.simplecrawlerLibStrings.readable): scala.Boolean = js.native
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
  def on_data(
    event: simplecrawlerLib.simplecrawlerLibStrings.data,
    listener: js.Function1[/* chunk */ simplecrawlerLib.Buffer | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_end(event: simplecrawlerLib.simplecrawlerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_readable(event: simplecrawlerLib.simplecrawlerLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_data(
    event: simplecrawlerLib.simplecrawlerLibStrings.data,
    listener: js.Function1[/* chunk */ simplecrawlerLib.Buffer | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_end(event: simplecrawlerLib.simplecrawlerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_readable(event: simplecrawlerLib.simplecrawlerLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: simplecrawlerLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: simplecrawlerLib.NodeJSNs.WritableStream */](destination: T, options: simplecrawlerLib.Anon_End): T = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_data(
    event: simplecrawlerLib.simplecrawlerLibStrings.data,
    listener: js.Function1[/* chunk */ simplecrawlerLib.Buffer | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: simplecrawlerLib.simplecrawlerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_readable(event: simplecrawlerLib.simplecrawlerLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_data(
    event: simplecrawlerLib.simplecrawlerLibStrings.data,
    listener: js.Function1[/* chunk */ simplecrawlerLib.Buffer | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: simplecrawlerLib.simplecrawlerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_readable(event: simplecrawlerLib.simplecrawlerLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  def push(chunk: js.Any): scala.Boolean = js.native
  def push(chunk: js.Any, encoding: java.lang.String): scala.Boolean = js.native
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
  def removeListener_data(
    event: simplecrawlerLib.simplecrawlerLibStrings.data,
    listener: js.Function1[/* chunk */ simplecrawlerLib.Buffer | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_end(event: simplecrawlerLib.simplecrawlerLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_readable(event: simplecrawlerLib.simplecrawlerLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  def unshift(chunk: js.Any): scala.Unit = js.native
}

