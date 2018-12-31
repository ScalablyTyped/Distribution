package typings
package sockjsLib.sockjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var disconnect_delay: js.UndefOr[scala.Double] = js.undefined
  var heartbeat_delay: js.UndefOr[scala.Double] = js.undefined
  var jsessionid: js.UndefOr[js.Any] = js.undefined
  var log: js.UndefOr[
    js.Function2[/* severity */ java.lang.String, /* message */ java.lang.String, scala.Unit]
  ] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var response_limit: js.UndefOr[scala.Double] = js.undefined
  var sockjs_url: js.UndefOr[java.lang.String] = js.undefined
  var websocket: js.UndefOr[scala.Boolean] = js.undefined
}

