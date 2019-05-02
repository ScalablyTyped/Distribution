package typings
package simplecrawlerLib.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket
  extends simplecrawlerLib.eventsMod.EventEmitter {
  @JSName("addListener")
  def addListener_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_listening(event: simplecrawlerLib.simplecrawlerLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function2[/* msg */ simplecrawlerLib.Buffer, /* rinfo */ AddressInfo, scala.Unit]
  ): this.type = js.native
  def addMembership(multicastAddress: java.lang.String): scala.Unit = js.native
  def addMembership(multicastAddress: java.lang.String, multicastInterface: java.lang.String): scala.Unit = js.native
  def address(): AddressInfo = js.native
  def bind(): scala.Unit = js.native
  def bind(options: BindOptions): scala.Unit = js.native
  def bind(options: BindOptions, callback: js.Function): scala.Unit = js.native
  def bind(port: scala.Double): scala.Unit = js.native
  def bind(port: scala.Double, address: java.lang.String): scala.Unit = js.native
  def bind(port: scala.Double, address: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def dropMembership(multicastAddress: java.lang.String): scala.Unit = js.native
  def dropMembership(multicastAddress: java.lang.String, multicastInterface: java.lang.String): scala.Unit = js.native
  @JSName("emit")
  def emit_close(event: simplecrawlerLib.simplecrawlerLibStrings.close): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: simplecrawlerLib.simplecrawlerLibStrings.error, err: simplecrawlerLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_listening(event: simplecrawlerLib.simplecrawlerLibStrings.listening): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    msg: simplecrawlerLib.Buffer,
    rinfo: AddressInfo
  ): scala.Boolean = js.native
  @JSName("on")
  def on_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_listening(event: simplecrawlerLib.simplecrawlerLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function2[/* msg */ simplecrawlerLib.Buffer, /* rinfo */ AddressInfo, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_listening(event: simplecrawlerLib.simplecrawlerLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function2[/* msg */ simplecrawlerLib.Buffer, /* rinfo */ AddressInfo, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_listening(event: simplecrawlerLib.simplecrawlerLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function2[/* msg */ simplecrawlerLib.Buffer, /* rinfo */ AddressInfo, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_listening(event: simplecrawlerLib.simplecrawlerLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function2[/* msg */ simplecrawlerLib.Buffer, /* rinfo */ AddressInfo, scala.Unit]
  ): this.type = js.native
  def ref(): this.type = js.native
  def send(
    msg: java.lang.String,
    offset: scala.Double,
    length: scala.Double,
    port: scala.Double,
    address: java.lang.String
  ): scala.Unit = js.native
  def send(
    msg: java.lang.String,
    offset: scala.Double,
    length: scala.Double,
    port: scala.Double,
    address: java.lang.String,
    callback: js.Function2[/* error */ simplecrawlerLib.Error, /* bytes */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def send(msg: java.lang.String, port: scala.Double, address: java.lang.String): scala.Unit = js.native
  def send(
    msg: java.lang.String,
    port: scala.Double,
    address: java.lang.String,
    callback: js.Function2[/* error */ simplecrawlerLib.Error, /* bytes */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def send(
    msg: js.Array[_],
    offset: scala.Double,
    length: scala.Double,
    port: scala.Double,
    address: java.lang.String
  ): scala.Unit = js.native
  def send(
    msg: js.Array[_],
    offset: scala.Double,
    length: scala.Double,
    port: scala.Double,
    address: java.lang.String,
    callback: js.Function2[/* error */ simplecrawlerLib.Error, /* bytes */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def send(msg: js.Array[_], port: scala.Double, address: java.lang.String): scala.Unit = js.native
  def send(
    msg: js.Array[_],
    port: scala.Double,
    address: java.lang.String,
    callback: js.Function2[/* error */ simplecrawlerLib.Error, /* bytes */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def send(
    msg: simplecrawlerLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    port: scala.Double,
    address: java.lang.String
  ): scala.Unit = js.native
  def send(
    msg: simplecrawlerLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    port: scala.Double,
    address: java.lang.String,
    callback: js.Function2[/* error */ simplecrawlerLib.Error, /* bytes */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def send(msg: simplecrawlerLib.Buffer, port: scala.Double, address: java.lang.String): scala.Unit = js.native
  def send(
    msg: simplecrawlerLib.Buffer,
    port: scala.Double,
    address: java.lang.String,
    callback: js.Function2[/* error */ simplecrawlerLib.Error, /* bytes */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def setBroadcast(flag: scala.Boolean): scala.Unit = js.native
  def setMulticastLoopback(flag: scala.Boolean): scala.Unit = js.native
  def setMulticastTTL(ttl: scala.Double): scala.Unit = js.native
  def setTTL(ttl: scala.Double): scala.Unit = js.native
  def unref(): this.type = js.native
}

