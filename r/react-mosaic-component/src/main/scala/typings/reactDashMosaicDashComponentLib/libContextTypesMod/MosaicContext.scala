package typings
package reactDashMosaicDashComponentLib.libContextTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicContext[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */] extends js.Object {
  var mosaicActions: MosaicRootActions[T]
  var mosaicId: java.lang.String
}

object MosaicContext {
  @scala.inline
  def apply[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](mosaicActions: MosaicRootActions[T], mosaicId: java.lang.String): MosaicContext[T] = {
    val __obj = js.Dynamic.literal(mosaicActions = mosaicActions, mosaicId = mosaicId)
  
    __obj.asInstanceOf[MosaicContext[T]]
  }
}

