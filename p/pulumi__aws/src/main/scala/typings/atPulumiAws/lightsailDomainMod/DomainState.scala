package typings.atPulumiAws.lightsailDomainMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainState extends js.Object {
  /**
    * The ARN of the Lightsail domain
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the Lightsail domain to manage
    */
  val domainName: js.UndefOr[Input[String]] = js.undefined
}

object DomainState {
  @scala.inline
  def apply(arn: Input[String] = null, domainName: Input[String] = null): DomainState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainState]
  }
}

