package typings
package atPulumiAwsLib.getIpRangesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIpRangesResult extends js.Object {
  /**
    * The lexically ordered list of CIDR blocks.
    */
  val cidrBlocks: js.Array[java.lang.String]
  /**
    * The publication time of the IP ranges (e.g. `2016-08-03-23-46-05`).
    */
  val createDate: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The lexically ordered list of IPv6 CIDR blocks.
    */
  val ipv6CidrBlocks: js.Array[java.lang.String]
  val regions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  val services: js.Array[java.lang.String]
  /**
    * The publication time of the IP ranges, in Unix epoch time format
    * (e.g. `1470267965`).
    */
  val syncToken: scala.Double
  val url: js.UndefOr[java.lang.String] = js.undefined
}

object GetIpRangesResult {
  @scala.inline
  def apply(
    cidrBlocks: js.Array[java.lang.String],
    createDate: java.lang.String,
    id: java.lang.String,
    ipv6CidrBlocks: js.Array[java.lang.String],
    services: js.Array[java.lang.String],
    syncToken: scala.Double,
    regions: js.Array[java.lang.String] = null,
    url: java.lang.String = null
  ): GetIpRangesResult = {
    val __obj = js.Dynamic.literal(cidrBlocks = cidrBlocks, createDate = createDate, id = id, ipv6CidrBlocks = ipv6CidrBlocks, services = services, syncToken = syncToken)
    if (regions != null) __obj.updateDynamic("regions")(regions)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GetIpRangesResult]
  }
}

