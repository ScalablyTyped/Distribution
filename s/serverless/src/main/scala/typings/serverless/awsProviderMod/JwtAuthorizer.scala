package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JwtAuthorizer extends js.Object {
  var audience: js.Array[String] = js.native
  var identitySource: String = js.native
  var issuerUrl: String = js.native
}

object JwtAuthorizer {
  @scala.inline
  def apply(audience: js.Array[String], identitySource: String, issuerUrl: String): JwtAuthorizer = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], identitySource = identitySource.asInstanceOf[js.Any], issuerUrl = issuerUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwtAuthorizer]
  }
  @scala.inline
  implicit class JwtAuthorizerOps[Self <: JwtAuthorizer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudienceVarargs(value: String*): Self = this.set("audience", js.Array(value :_*))
    @scala.inline
    def setAudience(value: js.Array[String]): Self = this.set("audience", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentitySource(value: String): Self = this.set("identitySource", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssuerUrl(value: String): Self = this.set("issuerUrl", value.asInstanceOf[js.Any])
  }
  
}

