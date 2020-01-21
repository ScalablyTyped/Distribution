package typings.pulumiAws.getServiceAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceAccountArgs extends js.Object {
  /**
    * Name of the region whose AWS CloudTrail account ID is desired.
    * Defaults to the region from the AWS provider configuration.
    */
  val region: js.UndefOr[String] = js.native
}

object GetServiceAccountArgs {
  @scala.inline
  def apply(region: String = null): GetServiceAccountArgs = {
    val __obj = js.Dynamic.literal()
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceAccountArgs]
  }
}

