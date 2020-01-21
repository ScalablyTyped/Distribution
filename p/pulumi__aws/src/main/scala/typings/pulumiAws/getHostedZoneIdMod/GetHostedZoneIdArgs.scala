package typings.pulumiAws.getHostedZoneIdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostedZoneIdArgs extends js.Object {
  /**
    * Name of the region whose AWS ELB HostedZoneId is desired.
    * Defaults to the region from the AWS provider configuration.
    */
  val region: js.UndefOr[String] = js.native
}

object GetHostedZoneIdArgs {
  @scala.inline
  def apply(region: String = null): GetHostedZoneIdArgs = {
    val __obj = js.Dynamic.literal()
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedZoneIdArgs]
  }
}

