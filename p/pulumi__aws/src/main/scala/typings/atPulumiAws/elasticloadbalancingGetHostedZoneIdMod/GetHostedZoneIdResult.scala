package typings.atPulumiAws.elasticloadbalancingGetHostedZoneIdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHostedZoneIdResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val region: js.UndefOr[String] = js.undefined
}

object GetHostedZoneIdResult {
  @scala.inline
  def apply(id: String, region: String = null): GetHostedZoneIdResult = {
    val __obj = js.Dynamic.literal(id = id)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[GetHostedZoneIdResult]
  }
}

