package typings.serialport.mod

import typings.node.Buffer
import typings.node.streamMod.Duplex
import typings.serialport.serialportStrings.ascii
import typings.serialport.serialportStrings.base64
import typings.serialport.serialportStrings.binary
import typings.serialport.serialportStrings.hex
import typings.serialport.serialportStrings.ucs2
import typings.serialport.serialportStrings.utf16le
import typings.serialport.serialportStrings.utf8
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerialPort extends Duplex {
  val baudRate: Double = js.native
  val binding: BaseBinding = js.native
  val isOpen: Boolean = js.native
  val path: String = js.native
  def close(): Unit = js.native
  def close(callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  def drain(): Unit = js.native
  def drain(callback: ErrorCallback): Unit = js.native
  def flush(): Unit = js.native
  def flush(callback: ErrorCallback): Unit = js.native
  def get(): Unit = js.native
  def get(callback: ModemBitsCallback): Unit = js.native
  def open(): Unit = js.native
  def open(callback: ErrorCallback): Unit = js.native
  def set(options: SetOptions): Unit = js.native
  def set(options: SetOptions, callback: ErrorCallback): Unit = js.native
  def update(options: UpdateOptions): Unit = js.native
  def update(options: UpdateOptions, callback: ErrorCallback): Unit = js.native
  def write(
    buffer: String,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  def write(
    buffer: js.Array[Double],
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  def write(
    buffer: Buffer,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  def write(data: String): Boolean = js.native
  def write(
    data: String,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  def write(data: js.Array[Double]): Boolean = js.native
  def write(
    data: js.Array[Double],
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  def write(data: Buffer): Boolean = js.native
  def write(
    data: Buffer,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_ascii(buffer: String, encoding: ascii): Boolean = js.native
  @JSName("write")
  def write_ascii(
    buffer: String,
    encoding: ascii,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_ascii(buffer: js.Array[Double], encoding: ascii): Boolean = js.native
  @JSName("write")
  def write_ascii(
    buffer: js.Array[Double],
    encoding: ascii,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_ascii(buffer: Buffer, encoding: ascii): Boolean = js.native
  @JSName("write")
  def write_ascii(
    buffer: Buffer,
    encoding: ascii,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_base64(buffer: String, encoding: base64): Boolean = js.native
  @JSName("write")
  def write_base64(
    buffer: String,
    encoding: base64,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_base64(buffer: js.Array[Double], encoding: base64): Boolean = js.native
  @JSName("write")
  def write_base64(
    buffer: js.Array[Double],
    encoding: base64,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_base64(buffer: Buffer, encoding: base64): Boolean = js.native
  @JSName("write")
  def write_base64(
    buffer: Buffer,
    encoding: base64,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_binary(buffer: String, encoding: binary): Boolean = js.native
  @JSName("write")
  def write_binary(
    buffer: String,
    encoding: binary,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_binary(buffer: js.Array[Double], encoding: binary): Boolean = js.native
  @JSName("write")
  def write_binary(
    buffer: js.Array[Double],
    encoding: binary,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_binary(buffer: Buffer, encoding: binary): Boolean = js.native
  @JSName("write")
  def write_binary(
    buffer: Buffer,
    encoding: binary,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_hex(buffer: String, encoding: hex): Boolean = js.native
  @JSName("write")
  def write_hex(
    buffer: String,
    encoding: hex,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_hex(buffer: js.Array[Double], encoding: hex): Boolean = js.native
  @JSName("write")
  def write_hex(
    buffer: js.Array[Double],
    encoding: hex,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_hex(buffer: Buffer, encoding: hex): Boolean = js.native
  @JSName("write")
  def write_hex(
    buffer: Buffer,
    encoding: hex,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_ucs2(buffer: String, encoding: ucs2): Boolean = js.native
  @JSName("write")
  def write_ucs2(
    buffer: String,
    encoding: ucs2,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_ucs2(buffer: js.Array[Double], encoding: ucs2): Boolean = js.native
  @JSName("write")
  def write_ucs2(
    buffer: js.Array[Double],
    encoding: ucs2,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_ucs2(buffer: Buffer, encoding: ucs2): Boolean = js.native
  @JSName("write")
  def write_ucs2(
    buffer: Buffer,
    encoding: ucs2,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_utf16le(buffer: String, encoding: utf16le): Boolean = js.native
  @JSName("write")
  def write_utf16le(
    buffer: String,
    encoding: utf16le,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_utf16le(buffer: js.Array[Double], encoding: utf16le): Boolean = js.native
  @JSName("write")
  def write_utf16le(
    buffer: js.Array[Double],
    encoding: utf16le,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_utf16le(buffer: Buffer, encoding: utf16le): Boolean = js.native
  @JSName("write")
  def write_utf16le(
    buffer: Buffer,
    encoding: utf16le,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_utf8(buffer: String, encoding: utf8): Boolean = js.native
  @JSName("write")
  def write_utf8(
    buffer: String,
    encoding: utf8,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_utf8(buffer: js.Array[Double], encoding: utf8): Boolean = js.native
  @JSName("write")
  def write_utf8(
    buffer: js.Array[Double],
    encoding: utf8,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  @JSName("write")
  def write_utf8(buffer: Buffer, encoding: utf8): Boolean = js.native
  @JSName("write")
  def write_utf8(
    buffer: Buffer,
    encoding: utf8,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
}

