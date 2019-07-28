package typings.reactDashMosaicDashComponent.libContextTypesMod

import typings.reactDashMosaicDashComponent.libTypesMod.MosaicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicContext[T /* <: MosaicKey */] extends js.Object {
  var mosaicActions: MosaicRootActions[T]
  var mosaicId: String
}

object MosaicContext {
  @scala.inline
  def apply[T /* <: MosaicKey */](mosaicActions: MosaicRootActions[T], mosaicId: String): MosaicContext[T] = {
    val __obj = js.Dynamic.literal(mosaicActions = mosaicActions, mosaicId = mosaicId)
  
    __obj.asInstanceOf[MosaicContext[T]]
  }
}

