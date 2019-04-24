package typings
package atPulumiAwsLib.elasticbeanstalkGetHostedZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHostedZoneResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The region of the hosted zone.
    */
  val region: js.UndefOr[java.lang.String] = js.undefined
}

object GetHostedZoneResult {
  @scala.inline
  def apply(id: java.lang.String, region: java.lang.String = null): GetHostedZoneResult = {
    val __obj = js.Dynamic.literal(id = id)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[GetHostedZoneResult]
  }
}

