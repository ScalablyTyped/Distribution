package typings
package serialportLib.serialportMod.SerialPortNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Binding Type Def
@js.native
trait BaseBinding extends js.Object {
  def close(): stdLib.Promise[_] = js.native
  def drain(): stdLib.Promise[_] = js.native
  def flush(): stdLib.Promise[_] = js.native
  def get(): stdLib.Promise[_] = js.native
  def open(path: java.lang.String, options: OpenOptions): stdLib.Promise[_] = js.native
  def read(data: nodeLib.Buffer, offset: scala.Double, length: scala.Double): stdLib.Promise[_] = js.native
  def set(): stdLib.Promise[_] = js.native
  def set(options: SetOptions): stdLib.Promise[_] = js.native
  def update(): stdLib.Promise[_] = js.native
  def update(options: UpdateOptions): stdLib.Promise[_] = js.native
  def write(data: nodeLib.Buffer): stdLib.Promise[_] = js.native
}

