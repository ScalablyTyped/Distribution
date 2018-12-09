package typings
package serialportLib.serialportMod.SerialPortNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Binding Type Def
@js.native
trait BaseBinding extends js.Object {
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

