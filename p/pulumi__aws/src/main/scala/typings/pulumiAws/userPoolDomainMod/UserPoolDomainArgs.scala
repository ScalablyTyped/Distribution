package typings.pulumiAws.userPoolDomainMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolDomainArgs extends js.Object {
  /**
    * The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
    */
  val certificateArn: js.UndefOr[Input[String]] = js.native
  /**
    * The domain string.
    */
  val domain: Input[String] = js.native
  /**
    * The user pool ID.
    */
  val userPoolId: Input[String] = js.native
}

object UserPoolDomainArgs {
  @scala.inline
  def apply(domain: Input[String], userPoolId: Input[String]): UserPoolDomainArgs = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolDomainArgs]
  }
  @scala.inline
  implicit class UserPoolDomainArgsOps[Self <: UserPoolDomainArgs] (val x: Self) extends AnyVal {
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
    def setDomain(value: Input[String]): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolId(value: Input[String]): Self = this.set("userPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateArn(value: Input[String]): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateArn: Self = this.set("certificateArn", js.undefined)
  }
  
}

