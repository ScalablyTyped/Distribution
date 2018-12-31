package typings
package requestDashIpLib.requestDashIpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestHeaders
  extends nodeLib.httpMod.IncomingHttpHeaders {
  var `forwarded-for`: js.UndefOr[java.lang.String] = js.undefined
  var `x-client-ip`: js.UndefOr[java.lang.String] = js.undefined
  var `x-cluster-client-ip`: js.UndefOr[java.lang.String] = js.undefined
  var `x-forwarded`: js.UndefOr[java.lang.String] = js.undefined
  var `x-forwarded-for`: js.UndefOr[java.lang.String] = js.undefined
  var `x-real-ip`: js.UndefOr[java.lang.String] = js.undefined
}

