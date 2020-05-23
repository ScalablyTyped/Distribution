package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JwtAuthorizer extends js.Object {
  var audience: js.Array[String]
  var identitySource: String
  var issuerUrl: String
}

object JwtAuthorizer {
  @scala.inline
  def apply(audience: js.Array[String], identitySource: String, issuerUrl: String): JwtAuthorizer = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], identitySource = identitySource.asInstanceOf[js.Any], issuerUrl = issuerUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwtAuthorizer]
  }
}

