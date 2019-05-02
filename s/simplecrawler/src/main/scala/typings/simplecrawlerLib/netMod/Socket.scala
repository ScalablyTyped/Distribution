package typings
package simplecrawlerLib.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket
  extends simplecrawlerLib.streamMod.Duplex {
  var bufferSize: scala.Double = js.native
  var bytesRead: scala.Double = js.native
  var bytesWritten: scala.Double = js.native
  var connecting: scala.Boolean = js.native
  var destroyed: scala.Boolean = js.native
  var localAddress: java.lang.String = js.native
  var localPort: scala.Double = js.native
  var remoteAddress: java.lang.String = js.native
  var remoteFamily: java.lang.String = js.native
  var remotePort: scala.Double = js.native
  @JSName("addListener")
  def addListener_close(
    event: simplecrawlerLib.simplecrawlerLibStrings.close,
    listener: js.Function1[/* had_error */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_connect(event: simplecrawlerLib.simplecrawlerLibStrings.connect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_lookup(
    event: simplecrawlerLib.simplecrawlerLibStrings.lookup,
    listener: js.Function4[
      /* err */ simplecrawlerLib.Error, 
      /* address */ java.lang.String, 
      /* family */ java.lang.String | scala.Double, 
      /* host */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_timeout(event: simplecrawlerLib.simplecrawlerLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  def address(): simplecrawlerLib.Anon_Address = js.native
  def connect(path: java.lang.String): scala.Unit = js.native
  def connect(path: java.lang.String, connectionListener: js.Function): scala.Unit = js.native
  def connect(port: scala.Double): scala.Unit = js.native
  def connect(port: scala.Double, host: java.lang.String): scala.Unit = js.native
  def connect(port: scala.Double, host: java.lang.String, connectionListener: js.Function): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def destroy(err: js.Any): scala.Unit = js.native
  @JSName("emit")
  def emit_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, had_error: scala.Boolean): scala.Boolean = js.native
  @JSName("emit")
  def emit_connect(event: simplecrawlerLib.simplecrawlerLibStrings.connect): scala.Boolean = js.native
  @JSName("emit")
  def emit_drain(event: simplecrawlerLib.simplecrawlerLibStrings.drain): scala.Boolean = js.native
  @JSName("emit")
  def emit_lookup(
    event: simplecrawlerLib.simplecrawlerLibStrings.lookup,
    err: simplecrawlerLib.Error,
    address: java.lang.String,
    family: java.lang.String,
    host: java.lang.String
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_lookup(
    event: simplecrawlerLib.simplecrawlerLibStrings.lookup,
    err: simplecrawlerLib.Error,
    address: java.lang.String,
    family: scala.Double,
    host: java.lang.String
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_timeout(event: simplecrawlerLib.simplecrawlerLibStrings.timeout): scala.Boolean = js.native
  def end(buffer: simplecrawlerLib.Buffer): scala.Unit = js.native
  def end(buffer: simplecrawlerLib.Buffer, cb: js.Function): scala.Unit = js.native
  def end(str: java.lang.String): scala.Unit = js.native
  def end(str: java.lang.String, cb: js.Function): scala.Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String, cb: js.Function): scala.Unit = js.native
  @JSName("on")
  def on_close(
    event: simplecrawlerLib.simplecrawlerLibStrings.close,
    listener: js.Function1[/* had_error */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connect(event: simplecrawlerLib.simplecrawlerLibStrings.connect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_lookup(
    event: simplecrawlerLib.simplecrawlerLibStrings.lookup,
    listener: js.Function4[
      /* err */ simplecrawlerLib.Error, 
      /* address */ java.lang.String, 
      /* family */ java.lang.String | scala.Double, 
      /* host */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_timeout(event: simplecrawlerLib.simplecrawlerLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_close(
    event: simplecrawlerLib.simplecrawlerLibStrings.close,
    listener: js.Function1[/* had_error */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_connect(event: simplecrawlerLib.simplecrawlerLibStrings.connect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_lookup(
    event: simplecrawlerLib.simplecrawlerLibStrings.lookup,
    listener: js.Function4[
      /* err */ simplecrawlerLib.Error, 
      /* address */ java.lang.String, 
      /* family */ java.lang.String | scala.Double, 
      /* host */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_timeout(event: simplecrawlerLib.simplecrawlerLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(
    event: simplecrawlerLib.simplecrawlerLibStrings.close,
    listener: js.Function1[/* had_error */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_connect(event: simplecrawlerLib.simplecrawlerLibStrings.connect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_lookup(
    event: simplecrawlerLib.simplecrawlerLibStrings.lookup,
    listener: js.Function4[
      /* err */ simplecrawlerLib.Error, 
      /* address */ java.lang.String, 
      /* family */ java.lang.String | scala.Double, 
      /* host */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_timeout(event: simplecrawlerLib.simplecrawlerLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(
    event: simplecrawlerLib.simplecrawlerLibStrings.close,
    listener: js.Function1[/* had_error */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connect(event: simplecrawlerLib.simplecrawlerLibStrings.connect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_lookup(
    event: simplecrawlerLib.simplecrawlerLibStrings.lookup,
    listener: js.Function4[
      /* err */ simplecrawlerLib.Error, 
      /* address */ java.lang.String, 
      /* family */ java.lang.String | scala.Double, 
      /* host */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_timeout(event: simplecrawlerLib.simplecrawlerLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  def ref(): scala.Unit = js.native
  def setKeepAlive(): this.type = js.native
  def setKeepAlive(enable: scala.Boolean): this.type = js.native
  def setKeepAlive(enable: scala.Boolean, initialDelay: scala.Double): this.type = js.native
  def setNoDelay(): this.type = js.native
  def setNoDelay(noDelay: scala.Boolean): this.type = js.native
  def setTimeout(timeout: scala.Double): this.type = js.native
  def setTimeout(timeout: scala.Double, callback: js.Function): this.type = js.native
  def unref(): scala.Unit = js.native
  // Extended base methods
  def write(buffer: simplecrawlerLib.Buffer): scala.Boolean = js.native
  def write(buffer: simplecrawlerLib.Buffer, cb: js.Function): scala.Boolean = js.native
  def write(str: java.lang.String): scala.Boolean = js.native
  def write(str: java.lang.String, cb: js.Function): scala.Boolean = js.native
  def write(str: java.lang.String, encoding: java.lang.String): scala.Boolean = js.native
  def write(str: java.lang.String, encoding: java.lang.String, cb: js.Function): scala.Boolean = js.native
  def write(str: java.lang.String, encoding: java.lang.String, fd: java.lang.String): scala.Boolean = js.native
}

@JSImport("net", "Socket")
@js.native
class SocketCls () extends Socket {
  def this(options: simplecrawlerLib.Anon_AllowHalfOpen) = this()
}

@JSImport("net", "Socket")
@js.native
object Socket
  extends org.scalablytyped.runtime.Instantiable0[Socket]
     with org.scalablytyped.runtime.Instantiable1[/* options */ simplecrawlerLib.Anon_AllowHalfOpen, Socket]

