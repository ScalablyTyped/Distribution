package typings
package atPulumiAwsLib.cognitoUserPoolDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolDomainArgs extends js.Object {
  /**
    * The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
    */
  val certificateArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The domain string.
    */
  val domain: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The user pool ID.
    */
  val userPoolId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

