package typings.pulumiAws.lightsailDomainMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainArgs extends js.Object {
  /**
    * The name of the Lightsail domain to manage
    */
  val domainName: Input[String] = js.native
}

object DomainArgs {
  @scala.inline
  def apply(domainName: Input[String]): DomainArgs = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainArgs]
  }
}

