package typings
package serialportLib.serialportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Binding Type Def
@JSImport("serialport", "BaseBinding")
@js.native
class BaseBinding protected () extends js.Object {
  def this(options: js.Any) = this()
  def close(): js.Promise[_] = js.native
  def drain(): js.Promise[_] = js.native
  def flush(): js.Promise[_] = js.native
  def get(): js.Promise[_] = js.native
  def open(path: java.lang.String, options: OpenOptions): js.Promise[_] = js.native
  def read(data: nodeLib.Buffer, offset: scala.Double, length: scala.Double): js.Promise[_] = js.native
  def set(): js.Promise[_] = js.native
  def set(options: SetOptions): js.Promise[_] = js.native
  def update(): js.Promise[_] = js.native
  def update(options: UpdateOptions): js.Promise[_] = js.native
  def write(data: nodeLib.Buffer): js.Promise[_] = js.native
}

/* static members */
@JSImport("serialport", "BaseBinding")
@js.native
object BaseBinding extends js.Object {
  def list(): js.Promise[js.Array[serialportLib.serialportMod.PortInfo]] = js.native
}

