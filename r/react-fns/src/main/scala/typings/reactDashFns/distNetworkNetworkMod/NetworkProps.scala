package typings.reactDashFns.distNetworkNetworkMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkProps extends js.Object {
  var offlineAt: js.UndefOr[Date] = js.undefined
  var online: Boolean
}

object NetworkProps {
  @scala.inline
  def apply(online: Boolean, offlineAt: Date = null): NetworkProps = {
    val __obj = js.Dynamic.literal(online = online.asInstanceOf[js.Any])
    if (offlineAt != null) __obj.updateDynamic("offlineAt")(offlineAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkProps]
  }
}

