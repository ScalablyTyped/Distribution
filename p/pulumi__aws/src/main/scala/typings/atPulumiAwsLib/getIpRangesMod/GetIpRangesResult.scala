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
  /**
    * The publication time of the IP ranges, in Unix epoch time format
    * (e.g. `1470267965`).
    */
  val syncToken: scala.Double
}

object GetIpRangesResult {
  @scala.inline
  def apply(
    cidrBlocks: js.Array[java.lang.String],
    createDate: java.lang.String,
    id: java.lang.String,
    ipv6CidrBlocks: js.Array[java.lang.String],
    syncToken: scala.Double
  ): GetIpRangesResult = {
    val __obj = js.Dynamic.literal(cidrBlocks = cidrBlocks, createDate = createDate, id = id, ipv6CidrBlocks = ipv6CidrBlocks, syncToken = syncToken)
  
    __obj.asInstanceOf[GetIpRangesResult]
  }
}

