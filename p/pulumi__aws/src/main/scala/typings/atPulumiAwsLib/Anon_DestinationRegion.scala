package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestinationRegion extends js.Object {
  var destinationRegion: java.lang.String
  var grantName: js.UndefOr[java.lang.String] = js.undefined
  var retentionPeriod: js.UndefOr[scala.Double] = js.undefined
}

object Anon_DestinationRegion {
  @scala.inline
  def apply(
    destinationRegion: java.lang.String,
    grantName: java.lang.String = null,
    retentionPeriod: scala.Int | scala.Double = null
  ): Anon_DestinationRegion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destinationRegion")(destinationRegion)
    if (grantName != null) __obj.updateDynamic("grantName")(grantName)
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DestinationRegion]
  }
}

