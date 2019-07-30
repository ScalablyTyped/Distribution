package typings.atPulumiAws.elbGetServiceAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceAccountArgs extends js.Object {
  /**
    * Name of the region whose AWS ELB account ID is desired.
    * Defaults to the region from the AWS provider configuration.
    */
  val region: js.UndefOr[String] = js.undefined
}

object GetServiceAccountArgs {
  @scala.inline
  def apply(region: String = null): GetServiceAccountArgs = {
    val __obj = js.Dynamic.literal()
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[GetServiceAccountArgs]
  }
}

