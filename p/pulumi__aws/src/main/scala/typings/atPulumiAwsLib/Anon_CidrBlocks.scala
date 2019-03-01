package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CidrBlocks extends js.Object {
  var cidrBlocks: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var fromPort: scala.Double
  var ipv6CidrBlocks: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var prefixListIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var protocol: java.lang.String
  var securityGroups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var self: js.UndefOr[scala.Boolean] = js.undefined
  var toPort: scala.Double
}

object Anon_CidrBlocks {
  @scala.inline
  def apply(
    fromPort: scala.Double,
    protocol: java.lang.String,
    toPort: scala.Double,
    cidrBlocks: js.Array[java.lang.String] = null,
    description: java.lang.String = null,
    ipv6CidrBlocks: js.Array[java.lang.String] = null,
    prefixListIds: js.Array[java.lang.String] = null,
    securityGroups: js.Array[java.lang.String] = null,
    self: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CidrBlocks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromPort")(fromPort)
    __obj.updateDynamic("protocol")(protocol)
    __obj.updateDynamic("toPort")(toPort)
    if (cidrBlocks != null) __obj.updateDynamic("cidrBlocks")(cidrBlocks)
    if (description != null) __obj.updateDynamic("description")(description)
    if (ipv6CidrBlocks != null) __obj.updateDynamic("ipv6CidrBlocks")(ipv6CidrBlocks)
    if (prefixListIds != null) __obj.updateDynamic("prefixListIds")(prefixListIds)
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups)
    if (!js.isUndefined(self)) __obj.updateDynamic("self")(self)
    __obj.asInstanceOf[Anon_CidrBlocks]
  }
}

