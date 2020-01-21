package typings.pulumiAws.getIpRangesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIpRangesResult extends js.Object {
  /**
    * The lexically ordered list of CIDR blocks.
    */
  val cidrBlocks: js.Array[String] = js.native
  /**
    * The publication time of the IP ranges (e.g. `2016-08-03-23-46-05`).
    */
  val createDate: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The lexically ordered list of IPv6 CIDR blocks.
    */
  val ipv6CidrBlocks: js.Array[String] = js.native
  val regions: js.UndefOr[js.Array[String]] = js.native
  val services: js.Array[String] = js.native
  /**
    * The publication time of the IP ranges, in Unix epoch time format
    * (e.g. `1470267965`).
    */
  val syncToken: Double = js.native
  val url: js.UndefOr[String] = js.native
}

object GetIpRangesResult {
  @scala.inline
  def apply(
    cidrBlocks: js.Array[String],
    createDate: String,
    id: String,
    ipv6CidrBlocks: js.Array[String],
    services: js.Array[String],
    syncToken: Double,
    regions: js.Array[String] = null,
    url: String = null
  ): GetIpRangesResult = {
    val __obj = js.Dynamic.literal(cidrBlocks = cidrBlocks.asInstanceOf[js.Any], createDate = createDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ipv6CidrBlocks = ipv6CidrBlocks.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], syncToken = syncToken.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIpRangesResult]
  }
}

