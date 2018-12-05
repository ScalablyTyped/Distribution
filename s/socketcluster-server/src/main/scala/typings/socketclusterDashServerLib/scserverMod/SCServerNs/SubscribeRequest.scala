package typings
package socketclusterDashServerLib.scserverMod.SCServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SubscribeRequest extends js.Object {
  var authTokenExpiredError: js.UndefOr[nodeLib.Error] = js.undefined
  var channel: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var socket: socketclusterDashServerLib.scserversocketMod.namespaced
  var waitForAuth: js.UndefOr[scala.Boolean] = js.undefined
}

