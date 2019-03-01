package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CidrBlocksDescription extends js.Object {
  var cidrBlocks: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var fromPort: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var ipv6CidrBlocks: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var prefixListIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var protocol: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var securityGroups: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var self: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var toPort: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object Anon_CidrBlocksDescription {
  @scala.inline
  def apply(
    fromPort: atPulumiPulumiLib.outputMod.Input[scala.Double],
    protocol: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    toPort: atPulumiPulumiLib.outputMod.Input[scala.Double],
    cidrBlocks: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ipv6CidrBlocks: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    prefixListIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    securityGroups: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    self: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_CidrBlocksDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromPort")(fromPort.asInstanceOf[js.Any])
    __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.updateDynamic("toPort")(toPort.asInstanceOf[js.Any])
    if (cidrBlocks != null) __obj.updateDynamic("cidrBlocks")(cidrBlocks.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ipv6CidrBlocks != null) __obj.updateDynamic("ipv6CidrBlocks")(ipv6CidrBlocks.asInstanceOf[js.Any])
    if (prefixListIds != null) __obj.updateDynamic("prefixListIds")(prefixListIds.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CidrBlocksDescription]
  }
}

