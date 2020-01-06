package typings.atPulumiAws.sesDomainIdentityMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainIdentityArgs extends js.Object {
  /**
    * The domain name to assign to SES
    */
  val domain: Input[String] = js.native
}

object DomainIdentityArgs {
  @scala.inline
  def apply(domain: Input[String]): DomainIdentityArgs = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DomainIdentityArgs]
  }
}

