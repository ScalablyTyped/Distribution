package typings.atPulumiAws.sesDomainDkimMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainDkimArgs extends js.Object {
  /**
    * Verified domain name to generate DKIM tokens for.
    */
  val domain: Input[String]
}

object DomainDkimArgs {
  @scala.inline
  def apply(domain: Input[String]): DomainDkimArgs = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DomainDkimArgs]
  }
}

