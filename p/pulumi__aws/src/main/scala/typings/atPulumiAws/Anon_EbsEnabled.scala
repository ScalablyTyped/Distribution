package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EbsEnabled extends js.Object {
  var ebsEnabled: Boolean
  var iops: js.UndefOr[Double] = js.undefined
  var volumeSize: js.UndefOr[Double] = js.undefined
  var volumeType: String
}

object Anon_EbsEnabled {
  @scala.inline
  def apply(
    ebsEnabled: Boolean,
    volumeType: String,
    iops: Int | Double = null,
    volumeSize: Int | Double = null
  ): Anon_EbsEnabled = {
    val __obj = js.Dynamic.literal(ebsEnabled = ebsEnabled, volumeType = volumeType)
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (volumeSize != null) __obj.updateDynamic("volumeSize")(volumeSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EbsEnabled]
  }
}

