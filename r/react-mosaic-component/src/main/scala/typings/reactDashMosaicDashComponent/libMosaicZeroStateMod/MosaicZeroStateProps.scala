package typings.reactDashMosaicDashComponent.libMosaicZeroStateMod

import typings.reactDashMosaicDashComponent.libTypesMod.CreateNode
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicZeroStateProps[T /* <: MosaicKey */] extends js.Object {
  var createNode: js.UndefOr[CreateNode[T]] = js.undefined
}

object MosaicZeroStateProps {
  @scala.inline
  def apply[T /* <: MosaicKey */](createNode: CreateNode[T] = null): MosaicZeroStateProps[T] = {
    val __obj = js.Dynamic.literal()
    if (createNode != null) __obj.updateDynamic("createNode")(createNode)
    __obj.asInstanceOf[MosaicZeroStateProps[T]]
  }
}

