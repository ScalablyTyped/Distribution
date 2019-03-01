package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestinationRegionGrantName extends js.Object {
  var destinationRegion: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var grantName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var retentionPeriod: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_DestinationRegionGrantName {
  @scala.inline
  def apply(
    destinationRegion: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    grantName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    retentionPeriod: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_DestinationRegionGrantName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destinationRegion")(destinationRegion.asInstanceOf[js.Any])
    if (grantName != null) __obj.updateDynamic("grantName")(grantName.asInstanceOf[js.Any])
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DestinationRegionGrantName]
  }
}

