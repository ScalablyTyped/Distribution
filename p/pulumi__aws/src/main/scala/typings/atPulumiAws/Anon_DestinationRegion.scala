package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestinationRegion extends js.Object {
  var destinationRegion: String
  var grantName: js.UndefOr[String] = js.undefined
  var retentionPeriod: js.UndefOr[Double] = js.undefined
}

object Anon_DestinationRegion {
  @scala.inline
  def apply(destinationRegion: String, grantName: String = null, retentionPeriod: Int | Double = null): Anon_DestinationRegion = {
    val __obj = js.Dynamic.literal(destinationRegion = destinationRegion)
    if (grantName != null) __obj.updateDynamic("grantName")(grantName)
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DestinationRegion]
  }
}

