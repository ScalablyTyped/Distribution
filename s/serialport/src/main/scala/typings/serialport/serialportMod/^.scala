package typings.serialport.serialportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serialport", JSImport.Namespace)
@js.native
class ^ protected () extends SerialPort {
  def this(path: String) = this()
  def this(path: String, callback: ErrorCallback) = this()
  def this(path: String, options: OpenOptions) = this()
  def this(path: String, options: OpenOptions, callback: ErrorCallback) = this()
}

@JSImport("serialport", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Binding: BaseBinding = js.native
  def list(): js.Promise[js.Array[PortInfo]] = js.native
  def list(callback: ListCallback): js.Promise[js.Array[PortInfo]] = js.native
}

