package typings
package atPulumiAwsLib.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeFrom extends js.Object {
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var sourceContainer: js.UndefOr[java.lang.String] = js.undefined
}

object VolumeFrom {
  @scala.inline
  def apply(readOnly: js.UndefOr[scala.Boolean] = js.undefined, sourceContainer: java.lang.String = null): VolumeFrom = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (sourceContainer != null) __obj.updateDynamic("sourceContainer")(sourceContainer)
    __obj.asInstanceOf[VolumeFrom]
  }
}

