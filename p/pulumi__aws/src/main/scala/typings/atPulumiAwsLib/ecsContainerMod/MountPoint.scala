package typings
package atPulumiAwsLib.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountPoint extends js.Object {
  var containerPath: js.UndefOr[java.lang.String] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var sourceVolume: js.UndefOr[java.lang.String] = js.undefined
}

object MountPoint {
  @scala.inline
  def apply(
    containerPath: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    sourceVolume: java.lang.String = null
  ): MountPoint = {
    val __obj = js.Dynamic.literal()
    if (containerPath != null) __obj.updateDynamic("containerPath")(containerPath)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (sourceVolume != null) __obj.updateDynamic("sourceVolume")(sourceVolume)
    __obj.asInstanceOf[MountPoint]
  }
}

