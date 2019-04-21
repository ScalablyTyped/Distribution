package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertStatic extends js.Object {
  def alert(title: java.lang.String): scala.Unit = js.native
  def alert(title: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def alert(title: java.lang.String, message: java.lang.String, buttons: js.Array[AlertButton]): scala.Unit = js.native
  def alert(
    title: java.lang.String,
    message: java.lang.String,
    buttons: js.Array[AlertButton],
    options: AlertOptions
  ): scala.Unit = js.native
}

