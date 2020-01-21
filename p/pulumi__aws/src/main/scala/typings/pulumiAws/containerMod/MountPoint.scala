package typings.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MountPoint extends js.Object {
  var containerPath: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var sourceVolume: js.UndefOr[String] = js.native
}

object MountPoint {
  @scala.inline
  def apply(
    containerPath: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    sourceVolume: String = null
  ): MountPoint = {
    val __obj = js.Dynamic.literal()
    if (containerPath != null) __obj.updateDynamic("containerPath")(containerPath.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (sourceVolume != null) __obj.updateDynamic("sourceVolume")(sourceVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountPoint]
  }
}

