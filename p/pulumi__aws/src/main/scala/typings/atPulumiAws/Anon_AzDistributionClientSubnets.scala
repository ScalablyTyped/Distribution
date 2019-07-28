package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AzDistributionClientSubnets extends js.Object {
  var azDistribution: js.UndefOr[Input[String]] = js.undefined
  var clientSubnets: Input[js.Array[Input[String]]]
  var ebsVolumeSize: Input[Double]
  var instanceType: Input[String]
  var securityGroups: Input[js.Array[Input[String]]]
}

object Anon_AzDistributionClientSubnets {
  @scala.inline
  def apply(
    clientSubnets: Input[js.Array[Input[String]]],
    ebsVolumeSize: Input[Double],
    instanceType: Input[String],
    securityGroups: Input[js.Array[Input[String]]],
    azDistribution: Input[String] = null
  ): Anon_AzDistributionClientSubnets = {
    val __obj = js.Dynamic.literal(clientSubnets = clientSubnets.asInstanceOf[js.Any], ebsVolumeSize = ebsVolumeSize.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any])
    if (azDistribution != null) __obj.updateDynamic("azDistribution")(azDistribution.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AzDistributionClientSubnets]
  }
}

