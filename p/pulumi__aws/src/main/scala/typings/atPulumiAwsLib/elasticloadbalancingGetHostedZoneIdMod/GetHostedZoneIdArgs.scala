package typings
package atPulumiAwsLib.elasticloadbalancingGetHostedZoneIdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHostedZoneIdArgs extends js.Object {
  /**
    * Name of the region whose AWS ELB HostedZoneId is desired.
    * Defaults to the region from the AWS provider configuration.
    */
  val region: js.UndefOr[java.lang.String] = js.undefined
}

object GetHostedZoneIdArgs {
  @scala.inline
  def apply(region: java.lang.String = null): GetHostedZoneIdArgs = {
    val __obj = js.Dynamic.literal()
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[GetHostedZoneIdArgs]
  }
}

