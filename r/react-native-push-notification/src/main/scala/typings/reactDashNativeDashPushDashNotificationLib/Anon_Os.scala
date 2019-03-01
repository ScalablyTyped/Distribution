package typings
package reactDashNativeDashPushDashNotificationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Os extends js.Object {
  var os: java.lang.String
  var token: java.lang.String
}

object Anon_Os {
  @scala.inline
  def apply(os: java.lang.String, token: java.lang.String): Anon_Os = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("os")(os)
    __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[Anon_Os]
  }
}

