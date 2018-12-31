package typings
package proxyDashVerifierLib.proxyDashVerifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proxy extends js.Object {
  /**
  	 * Proxy-Authorization header
  	 */
  var auth: js.UndefOr[java.lang.String] = js.undefined
  var ipAddress: java.lang.String
  var port: scala.Double
  var protocol: js.UndefOr[Protocol] = js.undefined
  var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
}

