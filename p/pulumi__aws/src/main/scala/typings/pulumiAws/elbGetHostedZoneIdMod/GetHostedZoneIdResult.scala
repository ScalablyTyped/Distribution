package typings.pulumiAws.elbGetHostedZoneIdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostedZoneIdResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val region: js.UndefOr[String] = js.native
}

object GetHostedZoneIdResult {
  @scala.inline
  def apply(id: String, region: String = null): GetHostedZoneIdResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedZoneIdResult]
  }
}

