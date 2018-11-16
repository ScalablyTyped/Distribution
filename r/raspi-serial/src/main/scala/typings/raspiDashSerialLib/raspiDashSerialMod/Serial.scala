package typings
package raspiDashSerialLib.raspiDashSerialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raspi-serial", "Serial")
@js.native
class Serial ()
  extends raspiDashPeripheralLib.raspiDashPeripheralMod.Peripheral {
  def this(hasPortIdBaudRateDataBitsStopBitsParity: Options) = this()
  var _isOpen: js.Any = js.native
  var _options: js.Any = js.native
  var _portId: js.Any = js.native
  var _portInstance: js.Any = js.native
  val baudRate: scala.Double = js.native
  val dataBits: scala.Double = js.native
  val parity: java.lang.String = js.native
  val port: java.lang.String = js.native
  val stopBits: scala.Double = js.native
  def close(): scala.Unit = js.native
  def close(cb: ErrorCallback): scala.Unit = js.native
  def flush(): scala.Unit = js.native
  def flush(cb: ErrorCallback): scala.Unit = js.native
  def open(): scala.Unit = js.native
  def open(cb: Callback): scala.Unit = js.native
  def write(data: java.lang.String): scala.Unit = js.native
  def write(data: java.lang.String, cb: Callback): scala.Unit = js.native
  def write(data: nodeLib.Buffer): scala.Unit = js.native
  def write(data: nodeLib.Buffer, cb: Callback): scala.Unit = js.native
}

