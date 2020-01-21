package typings.pulumiAws.lightsailDomainMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainState extends js.Object {
  /**
    * The ARN of the Lightsail domain
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the Lightsail domain to manage
    */
  val domainName: js.UndefOr[Input[String]] = js.native
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

