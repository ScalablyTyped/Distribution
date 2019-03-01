package typings
package reactDashFnsLib.distNetworkNetworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkProps extends js.Object {
  var offlineAt: js.UndefOr[stdLib.Date] = js.undefined
  var online: scala.Boolean
}

object NetworkProps {
  @scala.inline
  def apply(online: scala.Boolean, offlineAt: stdLib.Date = null): NetworkProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("online")(online)
    if (offlineAt != null) __obj.updateDynamic("offlineAt")(offlineAt)
    __obj.asInstanceOf[NetworkProps]
  }
}

