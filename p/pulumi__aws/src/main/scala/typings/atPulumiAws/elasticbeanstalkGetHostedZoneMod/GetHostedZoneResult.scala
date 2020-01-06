package typings.atPulumiAws.elasticbeanstalkGetHostedZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostedZoneResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The region of the hosted zone.
    */
  val region: js.UndefOr[String] = js.native
}

object GetHostedZoneResult {
  @scala.inline
  def apply(id: String, region: String = null): GetHostedZoneResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedZoneResult]
  }
}

