package typings.reactDashConfirm.reactDashConfirmMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactConfirmProps extends js.Object {
  var confirmation: String | ReactElement = js.native
  var show: Boolean = js.native
  def cancel(): Unit = js.native
  def cancel(value: String): Unit = js.native
  def dismiss(): Unit = js.native
  def proceed(): Unit = js.native
  def proceed(value: String): Unit = js.native
}

