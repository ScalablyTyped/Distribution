package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AzDistribution extends js.Object {
  var azDistribution: js.UndefOr[String] = js.undefined
  var clientSubnets: js.Array[String]
  var ebsVolumeSize: Double
  var instanceType: String
  var securityGroups: js.Array[String]
}

object Anon_AzDistribution {
  @scala.inline
  def apply(
    clientSubnets: js.Array[String],
    ebsVolumeSize: Double,
    instanceType: String,
    securityGroups: js.Array[String],
    azDistribution: String = null
  ): Anon_AzDistribution = {
    val __obj = js.Dynamic.literal(clientSubnets = clientSubnets, ebsVolumeSize = ebsVolumeSize, instanceType = instanceType, securityGroups = securityGroups)
    if (azDistribution != null) __obj.updateDynamic("azDistribution")(azDistribution)
    __obj.asInstanceOf[Anon_AzDistribution]
  }
}

