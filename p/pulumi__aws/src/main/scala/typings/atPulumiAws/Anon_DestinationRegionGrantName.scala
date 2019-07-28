package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestinationRegionGrantName extends js.Object {
  var destinationRegion: Input[String]
  var grantName: js.UndefOr[Input[String]] = js.undefined
  var retentionPeriod: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_DestinationRegionGrantName {
  @scala.inline
  def apply(
    destinationRegion: Input[String],
    grantName: Input[String] = null,
    retentionPeriod: Input[Double] = null
  ): Anon_DestinationRegionGrantName = {
    val __obj = js.Dynamic.literal(destinationRegion = destinationRegion.asInstanceOf[js.Any])
    if (grantName != null) __obj.updateDynamic("grantName")(grantName.asInstanceOf[js.Any])
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DestinationRegionGrantName]
  }
}

