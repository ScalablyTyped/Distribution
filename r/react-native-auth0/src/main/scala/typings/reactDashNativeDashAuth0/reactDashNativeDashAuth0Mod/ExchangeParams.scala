package typings.reactDashNativeDashAuth0.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExchangeParams extends js.Object {
  var code: String
  var redirectUri: String
  var verifier: String
}

object ExchangeParams {
  @scala.inline
  def apply(code: String, redirectUri: String, verifier: String): ExchangeParams = {
    val __obj = js.Dynamic.literal(code = code, redirectUri = redirectUri, verifier = verifier)
  
    __obj.asInstanceOf[ExchangeParams]
  }
}

