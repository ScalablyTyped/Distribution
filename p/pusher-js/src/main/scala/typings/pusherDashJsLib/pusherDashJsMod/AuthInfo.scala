package typings
package pusherDashJsLib.pusherDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthInfo extends js.Object {
  var auth: java.lang.String
  var channel_data: js.UndefOr[java.lang.String] = js.undefined
}

object AuthInfo {
  @scala.inline
  def apply(auth: java.lang.String, channel_data: java.lang.String = null): AuthInfo = {
    val __obj = js.Dynamic.literal(auth = auth)
    if (channel_data != null) __obj.updateDynamic("channel_data")(channel_data)
    __obj.asInstanceOf[AuthInfo]
  }
}

