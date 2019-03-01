package typings
package atPulumiAwsLib.elasticbeanstalkGetHostedZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHostedZoneArgs extends js.Object {
  /**
    * The region you'd like the zone for. By default, fetches the current region.
    */
  val region: js.UndefOr[java.lang.String] = js.undefined
}

object GetHostedZoneArgs {
  @scala.inline
  def apply(region: java.lang.String = null): GetHostedZoneArgs = {
    val __obj = js.Dynamic.literal()
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[GetHostedZoneArgs]
  }
}

