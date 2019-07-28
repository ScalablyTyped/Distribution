package typings.reactDashMosaicDashComponent.libMosaicMod

import typings.reactDashMosaicDashComponent.libTypesMod.MosaicKey
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicState[T /* <: MosaicKey */] extends js.Object {
  var currentNode: MosaicNode[T] | Null
  var lastInitialValue: MosaicNode[T] | Null
  var mosaicId: String
}

object MosaicState {
  @scala.inline
  def apply[T /* <: MosaicKey */](mosaicId: String, currentNode: MosaicNode[T] = null, lastInitialValue: MosaicNode[T] = null): MosaicState[T] = {
    val __obj = js.Dynamic.literal(mosaicId = mosaicId)
    if (currentNode != null) __obj.updateDynamic("currentNode")(currentNode.asInstanceOf[js.Any])
    if (lastInitialValue != null) __obj.updateDynamic("lastInitialValue")(lastInitialValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MosaicState[T]]
  }
}

