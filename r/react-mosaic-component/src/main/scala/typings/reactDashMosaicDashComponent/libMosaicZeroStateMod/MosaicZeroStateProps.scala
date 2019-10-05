package typings.reactDashMosaicDashComponent.libMosaicZeroStateMod

import typings.reactDashMosaicDashComponent.libTypesMod.CreateNode
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicKey
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicZeroStateProps[T /* <: MosaicKey */] extends js.Object {
  var createNode: js.UndefOr[CreateNode[T]] = js.undefined
}

object MosaicZeroStateProps {
  @scala.inline
  def apply[T /* <: MosaicKey */](createNode: /* repeated */ js.Any => js.Promise[MosaicNode[T]] | MosaicNode[T] = null): MosaicZeroStateProps[T] = {
    val __obj = js.Dynamic.literal()
    if (createNode != null) __obj.updateDynamic("createNode")(js.Any.fromFunction1(createNode))
    __obj.asInstanceOf[MosaicZeroStateProps[T]]
  }
}

