package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EbsEnabled extends js.Object {
  var ebsEnabled: scala.Boolean
  var iops: js.UndefOr[scala.Double] = js.undefined
  var volumeSize: js.UndefOr[scala.Double] = js.undefined
  var volumeType: java.lang.String
}

object Anon_EbsEnabled {
  @scala.inline
  def apply(
    ebsEnabled: scala.Boolean,
    volumeType: java.lang.String,
    iops: scala.Int | scala.Double = null,
    volumeSize: scala.Int | scala.Double = null
  ): Anon_EbsEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ebsEnabled")(ebsEnabled)
    __obj.updateDynamic("volumeType")(volumeType)
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (volumeSize != null) __obj.updateDynamic("volumeSize")(volumeSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EbsEnabled]
  }
}

