package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AzDistributionClientSubnets extends js.Object {
  var azDistribution: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var clientSubnets: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var ebsVolumeSize: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var instanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var securityGroups: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
}

object Anon_AzDistributionClientSubnets {
  @scala.inline
  def apply(
    clientSubnets: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    ebsVolumeSize: atPulumiPulumiLib.outputMod.Input[scala.Double],
    instanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    securityGroups: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    azDistribution: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_AzDistributionClientSubnets = {
    val __obj = js.Dynamic.literal(clientSubnets = clientSubnets.asInstanceOf[js.Any], ebsVolumeSize = ebsVolumeSize.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any])
    if (azDistribution != null) __obj.updateDynamic("azDistribution")(azDistribution.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AzDistributionClientSubnets]
  }
}

