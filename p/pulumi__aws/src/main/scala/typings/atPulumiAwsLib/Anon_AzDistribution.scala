package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AzDistribution extends js.Object {
  var azDistribution: js.UndefOr[java.lang.String] = js.undefined
  var clientSubnets: js.Array[java.lang.String]
  var ebsVolumeSize: scala.Double
  var instanceType: java.lang.String
  var securityGroups: js.Array[java.lang.String]
}

object Anon_AzDistribution {
  @scala.inline
  def apply(
    clientSubnets: js.Array[java.lang.String],
    ebsVolumeSize: scala.Double,
    instanceType: java.lang.String,
    securityGroups: js.Array[java.lang.String],
    azDistribution: java.lang.String = null
  ): Anon_AzDistribution = {
    val __obj = js.Dynamic.literal(clientSubnets = clientSubnets, ebsVolumeSize = ebsVolumeSize, instanceType = instanceType, securityGroups = securityGroups)
    if (azDistribution != null) __obj.updateDynamic("azDistribution")(azDistribution)
    __obj.asInstanceOf[Anon_AzDistribution]
  }
}

