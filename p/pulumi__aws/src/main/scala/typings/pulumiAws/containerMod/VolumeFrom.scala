package typings.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeFrom extends js.Object {
  var readOnly: js.UndefOr[Boolean] = js.native
  var sourceContainer: js.UndefOr[String] = js.native
}

object VolumeFrom {
  @scala.inline
  def apply(readOnly: js.UndefOr[Boolean] = js.undefined, sourceContainer: String = null): VolumeFrom = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (sourceContainer != null) __obj.updateDynamic("sourceContainer")(sourceContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeFrom]
  }
}

