package typings.reduxDashCablecar.reduxDashCablecarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CableCar extends js.Object {
  def changeChannel(channel: String): Unit = js.native
  def changeChannel(channel: String, options: Options): Unit = js.native
  def getChannel(): String = js.native
  def getParams(): js.Object = js.native
  def perform(method: String): Unit = js.native
  def perform(method: String, payload: js.Any): Unit = js.native
  def send(action: String): Unit = js.native
}

