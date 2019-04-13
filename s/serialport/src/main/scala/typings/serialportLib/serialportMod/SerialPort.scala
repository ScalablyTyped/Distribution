package typings
package serialportLib.serialportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerialPort
  extends nodeLib.streamMod.Duplex {
  val baudRate: scala.Double = js.native
  val binding: BaseBinding = js.native
  val isOpen: scala.Boolean = js.native
  val path: java.lang.String = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def drain(): scala.Unit = js.native
  def drain(callback: ErrorCallback): scala.Unit = js.native
  def flush(): scala.Unit = js.native
  def flush(callback: ErrorCallback): scala.Unit = js.native
  def get(): scala.Unit = js.native
  def get(callback: ModemBitsCallback): scala.Unit = js.native
  def open(): scala.Unit = js.native
  def open(callback: ErrorCallback): scala.Unit = js.native
  def set(options: SetOptions): scala.Unit = js.native
  def set(options: SetOptions, callback: ErrorCallback): scala.Unit = js.native
  def update(options: UpdateOptions): scala.Unit = js.native
  def update(options: UpdateOptions, callback: ErrorCallback): scala.Unit = js.native
  def write(buffer: java.lang.String | js.Array[scala.Double] | nodeLib.Buffer): scala.Boolean = js.native
  def write(
    buffer: java.lang.String | js.Array[scala.Double] | nodeLib.Buffer,
    encoding: serialportLib.serialportLibStrings.ascii | serialportLib.serialportLibStrings.utf8 | serialportLib.serialportLibStrings.utf16le | serialportLib.serialportLibStrings.ucs2 | serialportLib.serialportLibStrings.base64 | serialportLib.serialportLibStrings.binary | serialportLib.serialportLibStrings.hex
  ): scala.Boolean = js.native
  def write(
    buffer: java.lang.String | js.Array[scala.Double] | nodeLib.Buffer,
    encoding: serialportLib.serialportLibStrings.ascii | serialportLib.serialportLibStrings.utf8 | serialportLib.serialportLibStrings.utf16le | serialportLib.serialportLibStrings.ucs2 | serialportLib.serialportLibStrings.base64 | serialportLib.serialportLibStrings.binary | serialportLib.serialportLibStrings.hex,
    callback: js.Function2[/* error */ js.Any, /* bytesWritten */ scala.Double, scala.Unit]
  ): scala.Boolean = js.native
  def write(data: java.lang.String): scala.Boolean = js.native
  def write(
    data: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* bytesWritten */ scala.Double, scala.Unit]
  ): scala.Boolean = js.native
  def write(data: js.Array[scala.Double]): scala.Boolean = js.native
  def write(
    data: js.Array[scala.Double],
    callback: js.Function2[/* error */ js.Any, /* bytesWritten */ scala.Double, scala.Unit]
  ): scala.Boolean = js.native
  def write(data: nodeLib.Buffer): scala.Boolean = js.native
  def write(
    data: nodeLib.Buffer,
    callback: js.Function2[/* error */ js.Any, /* bytesWritten */ scala.Double, scala.Unit]
  ): scala.Boolean = js.native
}

