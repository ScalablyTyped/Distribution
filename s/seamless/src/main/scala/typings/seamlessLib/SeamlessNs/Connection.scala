package typings
package seamlessLib.SeamlessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  var active: scala.Boolean = js.native
  var id: scala.Double = js.native
  var queue: js.Array[_] = js.native
  var target: java.lang.String = js.native
  var url: java.lang.String = js.native
  def receive(callback: Callback): scala.Unit = js.native
  def receive(`type`: java.lang.String, callback: Callback): scala.Unit = js.native
  def send(data: js.Any): scala.Unit = js.native
  def setActive(active: scala.Boolean): scala.Unit = js.native
}

