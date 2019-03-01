package typings
package atPulumiAwsLib.lightsailDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainArgs extends js.Object {
  /**
    * The name of the Lightsail domain to manage
    */
  val domainName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object DomainArgs {
  @scala.inline
  def apply(domainName: atPulumiPulumiLib.outputMod.Input[java.lang.String]): DomainArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainArgs]
  }
}

