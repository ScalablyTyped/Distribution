package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message
  extends reactDashNativeLib.reactDashNativeMod.ShareContent {
  var message: java.lang.String
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Message {
  @scala.inline
  def apply(message: java.lang.String, title: java.lang.String = null): Anon_Message = {
    val __obj = js.Dynamic.literal(message = message)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Message]
  }
}

