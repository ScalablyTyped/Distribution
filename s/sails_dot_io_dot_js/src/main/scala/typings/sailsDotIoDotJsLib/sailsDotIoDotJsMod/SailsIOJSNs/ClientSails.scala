package typings
package sailsDotIoDotJsLib.sailsDotIoDotJsMod.SailsIOJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientSails extends js.Object {
  var autoConnect: js.UndefOr[scala.Boolean] = js.native
  // All logs are disabled when `io.sails.environment = 'production'`
  var environment: js.UndefOr[sailsDotIoDotJsLib.sailsDotIoDotJsLibStrings.production | java.lang.String] = js.native
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.native
  var initialConnectionHeaders: js.UndefOr[InitialConnectionHeaders] = js.native
  var path: js.UndefOr[java.lang.String] = js.native
  var query: js.UndefOr[java.lang.String] = js.native
  var reconnection: js.UndefOr[scala.Boolean] = js.native
  var reconnectionAttempts: js.UndefOr[scala.Double] = js.native
  var reconnectionDelay: js.UndefOr[scala.Double] = js.native
  var reconnectionDelayMax: js.UndefOr[scala.Double] = js.native
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.native
  var sdk: js.UndefOr[SDKInfo] = js.native
  var strict: js.UndefOr[scala.Boolean] = js.native
  var transports: js.UndefOr[
    js.Array[
      sailsDotIoDotJsLib.sailsDotIoDotJsLibStrings.websocket | sailsDotIoDotJsLib.sailsDotIoDotJsLibStrings.polling
    ]
  ] = js.native
  var url: js.UndefOr[java.lang.String] = js.native
  var useCORSRouteToGetCookie: js.UndefOr[scala.Boolean] = js.native
  def connect(): Socket = js.native
  def connect(url: java.lang.String): Socket = js.native
  def connect(url: java.lang.String, config: ConnectConfig): Socket = js.native
}

