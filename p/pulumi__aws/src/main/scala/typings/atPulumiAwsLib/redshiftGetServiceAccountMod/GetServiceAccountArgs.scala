package typings
package atPulumiAwsLib.redshiftGetServiceAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceAccountArgs extends js.Object {
  /**
    * Name of the region whose AWS Redshift account ID is desired.
    * Defaults to the region from the AWS provider configuration.
    */
  val region: js.UndefOr[java.lang.String] = js.undefined
}

object GetServiceAccountArgs {
  @scala.inline
  def apply(region: java.lang.String = null): GetServiceAccountArgs = {
    val __obj = js.Dynamic.literal()
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[GetServiceAccountArgs]
  }
}

