package typings
package atPulumiAwsLib.sesDomainIdentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainIdentityState extends js.Object {
  /**
    * The ARN of the domain identity.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The domain name to assign to SES
    */
  val domain: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A code which when added to the domain as a TXT record
    * will signal to SES that the owner of the domain has authorised SES to act on
    * their behalf. The domain identity will be in state "verification pending"
    * until this is done. See below for an example of how this might be achieved
    * when the domain is hosted in Route 53 and managed by Terraform.  Find out
    * more about verifying domains in Amazon SES in the [AWS SES
    * docs](http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html).
    */
  val verificationToken: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

