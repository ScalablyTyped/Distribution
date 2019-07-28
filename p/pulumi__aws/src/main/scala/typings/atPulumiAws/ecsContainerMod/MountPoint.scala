package typings.atPulumiAws.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountPoint extends js.Object {
  var containerPath: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var sourceVolume: js.UndefOr[String] = js.undefined
}

object MountPoint {
  @scala.inline
  def apply(
    containerPath: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    sourceVolume: String = null
  ): MountPoint = {
    val __obj = js.Dynamic.literal()
    if (containerPath != null) __obj.updateDynamic("containerPath")(containerPath)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (sourceVolume != null) __obj.updateDynamic("sourceVolume")(sourceVolume)
    __obj.asInstanceOf[MountPoint]
  }
}

