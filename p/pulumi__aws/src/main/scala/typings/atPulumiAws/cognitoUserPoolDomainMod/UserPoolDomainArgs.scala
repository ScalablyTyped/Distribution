package typings.atPulumiAws.cognitoUserPoolDomainMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolDomainArgs extends js.Object {
  /**
    * The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
    */
  val certificateArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The domain string.
    */
  val domain: Input[String]
  /**
    * The user pool ID.
    */
  val userPoolId: Input[String]
}

object UserPoolDomainArgs {
  @scala.inline
  def apply(domain: Input[String], userPoolId: Input[String], certificateArn: Input[String] = null): UserPoolDomainArgs = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolDomainArgs]
  }
}

