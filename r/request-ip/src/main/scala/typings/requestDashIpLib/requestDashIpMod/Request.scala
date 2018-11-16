package typings
package requestDashIpLib.requestDashIpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Request extends js.Object {
  var connection: requestDashIpLib.Anon_Socket
  var headers: RequestHeaders
  var info: js.UndefOr[requestDashIpLib.Anon_RemoteAddress] = js.undefined
  var socket: js.UndefOr[requestDashIpLib.Anon_RemoteAddress] = js.undefined
}

