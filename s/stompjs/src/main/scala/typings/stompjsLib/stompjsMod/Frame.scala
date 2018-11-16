package typings
package stompjsLib.stompjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompjs", "Frame")
@js.native
class Frame protected () extends js.Object {
  def this(command: java.lang.String) = this()
  def this(command: java.lang.String, headers: js.Object) = this()
  def this(command: java.lang.String, headers: js.Object, body: java.lang.String) = this()
  var body: java.lang.String = js.native
  var command: java.lang.String = js.native
}

@JSImport("stompjs", "Frame")
@js.native
object Frame extends js.Object {
  def marshall(command: java.lang.String): js.Any = js.native
  def marshall(command: java.lang.String, headers: js.Object): js.Any = js.native
  def marshall(command: java.lang.String, headers: js.Object, body: java.lang.String): js.Any = js.native
  def sizeOfUTF8(s: java.lang.String): scala.Double = js.native
  def unmarshall(datas: js.Any): js.Any = js.native
}

