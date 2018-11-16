package typings
package serialportLib.serialportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Binding Type Def
@JSImport("serialport", "BaseBinding")
@js.native
class BaseBinding protected ()
  extends serialportLib.serialportMod.SerialPortNs.BaseBinding {
  def this(options: js.Any) = this()
}

// Binding Type Def
@JSImport("serialport", "BaseBinding")
@js.native
object BaseBinding extends js.Object {
  def list(): stdLib.Promise[js.Array[serialportLib.serialportMod.SerialPortNs.PortInfo]] = js.native
}

