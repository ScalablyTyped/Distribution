package typings
package remoteDashOriginDashUrlLib.remoteDashOriginDashUrlMod.remoteOriginUrlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(path: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Options]
  }
}

