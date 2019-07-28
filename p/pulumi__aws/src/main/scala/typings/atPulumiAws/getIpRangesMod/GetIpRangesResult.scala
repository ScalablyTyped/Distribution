package typings.atPulumiAws.getIpRangesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIpRangesResult extends js.Object {
  /**
    * The lexically ordered list of CIDR blocks.
    */
  val cidrBlocks: js.Array[String]
  /**
    * The publication time of the IP ranges (e.g. `2016-08-03-23-46-05`).
    */
  val createDate: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The lexically ordered list of IPv6 CIDR blocks.
    */
  val ipv6CidrBlocks: js.Array[String]
  val regions: js.UndefOr[js.Array[String]] = js.undefined
  val services: js.Array[String]
  /**
    * The publication time of the IP ranges, in Unix epoch time format
    * (e.g. `1470267965`).
    */
  val syncToken: Double
  val url: js.UndefOr[String] = js.undefined
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
    val __obj = js.Dynamic.literal(cidrBlocks = cidrBlocks, createDate = createDate, id = id, ipv6CidrBlocks = ipv6CidrBlocks, services = services, syncToken = syncToken)
    if (regions != null) __obj.updateDynamic("regions")(regions)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GetIpRangesResult]
  }
}

