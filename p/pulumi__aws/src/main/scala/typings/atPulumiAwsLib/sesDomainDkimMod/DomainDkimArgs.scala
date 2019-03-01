package typings
package atPulumiAwsLib.sesDomainDkimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainDkimArgs extends js.Object {
  /**
    * Verified domain name to generate DKIM tokens for.
    */
  val domain: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object DomainDkimArgs {
  @scala.inline
  def apply(domain: atPulumiPulumiLib.outputMod.Input[java.lang.String]): DomainDkimArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDkimArgs]
  }
}

