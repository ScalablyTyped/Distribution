package typings.serialport.serialportMod

import typings.node.Buffer
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
  def open(path: String, options: OpenOptions): js.Promise[_] = js.native
  def read(data: Buffer, offset: Double, length: Double): js.Promise[_] = js.native
  def set(): js.Promise[_] = js.native
  def set(options: SetOptions): js.Promise[_] = js.native
  def update(): js.Promise[_] = js.native
  def update(options: UpdateOptions): js.Promise[_] = js.native
  def write(data: Buffer): js.Promise[_] = js.native
}

/* static members */
@JSImport("serialport", "BaseBinding")
@js.native
object BaseBinding extends js.Object {
  def list(): js.Promise[js.Array[PortInfo]] = js.native
}

