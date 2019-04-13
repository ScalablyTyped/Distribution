package typings
package serialportLib.serialportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serialport", JSImport.Namespace)
@js.native
class ^ protected () extends SerialPort {
  def this(path: java.lang.String) = this()
  def this(path: java.lang.String, callback: ErrorCallback) = this()
  def this(path: java.lang.String, options: OpenOptions) = this()
  def this(path: java.lang.String, options: OpenOptions, callback: ErrorCallback) = this()
}

@JSImport("serialport", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Binding: BaseBinding = js.native
  def list(): js.Promise[js.Array[PortInfo]] = js.native
  def list(callback: ListCallback): js.Promise[js.Array[PortInfo]] = js.native
}

