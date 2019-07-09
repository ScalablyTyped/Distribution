package typings
package reactDashMosaicDashComponentLib.libMosaicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicState[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */] extends js.Object {
  var currentNode: reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null
  var lastInitialValue: reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] | scala.Null
  var mosaicId: java.lang.String
}

object MosaicState {
  @scala.inline
  def apply[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](
    mosaicId: java.lang.String,
    currentNode: reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] = null,
    lastInitialValue: reactDashMosaicDashComponentLib.libTypesMod.MosaicNode[T] = null
  ): MosaicState[T] = {
    val __obj = js.Dynamic.literal(mosaicId = mosaicId)
    if (currentNode != null) __obj.updateDynamic("currentNode")(currentNode.asInstanceOf[js.Any])
    if (lastInitialValue != null) __obj.updateDynamic("lastInitialValue")(lastInitialValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MosaicState[T]]
  }
}

