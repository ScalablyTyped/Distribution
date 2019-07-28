package typings.atPulumiAws.elasticbeanstalkGetHostedZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHostedZoneResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The region of the hosted zone.
    */
  val region: js.UndefOr[String] = js.undefined
}

object GetHostedZoneResult {
  @scala.inline
  def apply(id: String, region: String = null): GetHostedZoneResult = {
    val __obj = js.Dynamic.literal(id = id)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[GetHostedZoneResult]
  }
}

