package typings
package reactDashMosaicDashComponentLib.libMosaicZeroStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicZeroStateProps[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */] extends js.Object {
  var createNode: js.UndefOr[reactDashMosaicDashComponentLib.libTypesMod.CreateNode[T]] = js.undefined
}

object MosaicZeroStateProps {
  @scala.inline
  def apply[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](createNode: reactDashMosaicDashComponentLib.libTypesMod.CreateNode[T] = null): MosaicZeroStateProps[T] = {
    val __obj = js.Dynamic.literal()
    if (createNode != null) __obj.updateDynamic("createNode")(createNode)
    __obj.asInstanceOf[MosaicZeroStateProps[T]]
  }
}

