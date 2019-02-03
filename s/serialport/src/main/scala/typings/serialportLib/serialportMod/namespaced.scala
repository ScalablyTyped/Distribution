package typings
package serialportLib.serialportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serialport", JSImport.Namespace)
@js.native
class namespaced protected () extends SerialPort {
  def this(path: java.lang.String) = this()
  def this(path: java.lang.String, callback: serialportLib.serialportMod.SerialPortNs.ErrorCallback) = this()
  def this(path: java.lang.String, options: serialportLib.serialportMod.SerialPortNs.OpenOptions) = this()
  def this(path: java.lang.String, options: serialportLib.serialportMod.SerialPortNs.OpenOptions, callback: serialportLib.serialportMod.SerialPortNs.ErrorCallback) = this()
}

/* static members */
@JSImport("serialport", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var Binding: serialportLib.serialportMod.SerialPortNs.BaseBinding = js.native
  def list(): js.Promise[js.Array[serialportLib.serialportMod.SerialPortNs.PortInfo]] = js.native
  def list(callback: serialportLib.serialportMod.SerialPortNs.ListCallback): js.Promise[js.Array[serialportLib.serialportMod.SerialPortNs.PortInfo]] = js.native
}

