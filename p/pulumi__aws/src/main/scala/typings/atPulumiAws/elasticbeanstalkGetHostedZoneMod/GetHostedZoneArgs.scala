package typings.atPulumiAws.elasticbeanstalkGetHostedZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostedZoneArgs extends js.Object {
  /**
    * The region you'd like the zone for. By default, fetches the current region.
    */
  val region: js.UndefOr[String] = js.native
}

object GetHostedZoneArgs {
  @scala.inline
  def apply(region: String = null): GetHostedZoneArgs = {
    val __obj = js.Dynamic.literal()
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedZoneArgs]
  }
}

