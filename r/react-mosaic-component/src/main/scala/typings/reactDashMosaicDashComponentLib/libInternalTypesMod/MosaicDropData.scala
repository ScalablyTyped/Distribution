package typings
package reactDashMosaicDashComponentLib.libInternalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicDropData extends js.Object {
  var path: js.UndefOr[reactDashMosaicDashComponentLib.libTypesMod.MosaicPath] = js.undefined
  var position: js.UndefOr[MosaicDropTargetPosition] = js.undefined
}

object MosaicDropData {
  @scala.inline
  def apply(
    path: reactDashMosaicDashComponentLib.libTypesMod.MosaicPath = null,
    position: MosaicDropTargetPosition = null
  ): MosaicDropData = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[MosaicDropData]
  }
}

