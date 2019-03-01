package typings
package proxyDashVerifierLib.proxyDashVerifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTestBaseResult extends js.Object {
  var data: java.lang.String
  var headers: Headers
  var status: scala.Double
}

object CustomTestBaseResult {
  @scala.inline
  def apply(data: java.lang.String, headers: Headers, status: scala.Double): CustomTestBaseResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[CustomTestBaseResult]
  }
}

