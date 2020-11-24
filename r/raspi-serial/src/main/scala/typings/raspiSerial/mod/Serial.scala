package typings.raspiSerial.mod

import typings.node.Buffer
import typings.raspiPeripheral.mod.Peripheral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raspi-serial", "Serial")
@js.native
class Serial () extends Peripheral {
  def this(hasPortIdBaudRateDataBitsStopBitsParity: Options) = this()
  
  var _isOpen: js.Any = js.native
  
  var _options: js.Any = js.native
  
  var _portId: js.Any = js.native
  
  var _portInstance: js.Any = js.native
  
  val baudRate: Double = js.native
  
  def close(): Unit = js.native
  def close(cb: ErrorCallback): Unit = js.native
  
  val dataBits: Double = js.native
  
  def flush(): Unit = js.native
  def flush(cb: ErrorCallback): Unit = js.native
  
  def open(): Unit = js.native
  def open(cb: Callback): Unit = js.native
  
  val parity: String = js.native
  
  val port: String = js.native
  
  val stopBits: Double = js.native
  
  def write(data: String): Unit = js.native
  def write(data: String, cb: Callback): Unit = js.native
  def write(data: Buffer): Unit = js.native
  def write(data: Buffer, cb: Callback): Unit = js.native
}
