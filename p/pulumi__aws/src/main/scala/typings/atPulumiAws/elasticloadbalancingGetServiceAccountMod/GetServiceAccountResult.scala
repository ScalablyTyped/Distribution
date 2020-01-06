package typings.atPulumiAws.elasticloadbalancingGetServiceAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceAccountResult extends js.Object {
  /**
    * The ARN of the AWS ELB service account in the selected region.
    */
  val arn: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val region: js.UndefOr[String] = js.native
}

object GetServiceAccountResult {
  @scala.inline
  def apply(arn: String, id: String, region: String = null): GetServiceAccountResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceAccountResult]
  }
}

