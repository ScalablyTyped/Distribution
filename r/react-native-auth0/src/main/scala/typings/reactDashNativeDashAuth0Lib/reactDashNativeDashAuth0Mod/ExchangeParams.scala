package typings
package reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExchangeParams extends js.Object {
  var code: java.lang.String
  var redirectUri: java.lang.String
  var verifier: java.lang.String
}

object ExchangeParams {
  @scala.inline
  def apply(code: java.lang.String, redirectUri: java.lang.String, verifier: java.lang.String): ExchangeParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("redirectUri")(redirectUri)
    __obj.updateDynamic("verifier")(verifier)
    __obj.asInstanceOf[ExchangeParams]
  }
}

