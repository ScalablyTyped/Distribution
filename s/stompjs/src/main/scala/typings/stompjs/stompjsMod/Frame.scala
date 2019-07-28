package typings.stompjs.stompjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompjs", "Frame")
@js.native
class Frame protected () extends js.Object {
  def this(command: String) = this()
  def this(command: String, headers: js.Object) = this()
  def this(command: String, headers: js.Object, body: String) = this()
  var body: String = js.native
  var command: String = js.native
}

/* static members */
@JSImport("stompjs", "Frame")
@js.native
object Frame extends js.Object {
  def marshall(command: String): js.Any = js.native
  def marshall(command: String, headers: js.Object): js.Any = js.native
  def marshall(command: String, headers: js.Object, body: String): js.Any = js.native
  def sizeOfUTF8(s: String): Double = js.native
  def unmarshall(datas: js.Any): js.Any = js.native
}

