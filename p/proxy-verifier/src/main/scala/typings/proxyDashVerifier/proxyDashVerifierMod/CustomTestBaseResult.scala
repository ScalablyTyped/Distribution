package typings.proxyDashVerifier.proxyDashVerifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTestBaseResult extends js.Object {
  var data: String
  var headers: Headers
  var status: Double
}

object CustomTestBaseResult {
  @scala.inline
  def apply(data: String, headers: Headers, status: Double): CustomTestBaseResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomTestBaseResult]
  }
}

