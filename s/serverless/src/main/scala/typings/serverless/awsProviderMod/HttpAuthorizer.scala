package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpAuthorizer extends js.Object {
  var arn: js.UndefOr[String] = js.native
  var identitySource: js.UndefOr[String] = js.native
  var identityValidationExpression: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var resultTtlInSeconds: js.UndefOr[Double | String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object HttpAuthorizer {
  @scala.inline
  def apply(): HttpAuthorizer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpAuthorizer]
  }
  @scala.inline
  implicit class HttpAuthorizerOps[Self <: HttpAuthorizer] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setIdentitySource(value: String): Self = this.set("identitySource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentitySource: Self = this.set("identitySource", js.undefined)
    @scala.inline
    def setIdentityValidationExpression(value: String): Self = this.set("identityValidationExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityValidationExpression: Self = this.set("identityValidationExpression", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setResultTtlInSeconds(value: Double | String): Self = this.set("resultTtlInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultTtlInSeconds: Self = this.set("resultTtlInSeconds", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

