package typings
package reactDashMosaicDashComponentLib.libContextTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicWindowContext[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */] extends MosaicContext[T] {
  var mosaicWindowActions: MosaicWindowActions
}

object MosaicWindowContext {
  @scala.inline
  def apply[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](
    mosaicActions: MosaicRootActions[T],
    mosaicId: java.lang.String,
    mosaicWindowActions: MosaicWindowActions
  ): MosaicWindowContext[T] = {
    val __obj = js.Dynamic.literal(mosaicActions = mosaicActions, mosaicId = mosaicId, mosaicWindowActions = mosaicWindowActions)
  
    __obj.asInstanceOf[MosaicWindowContext[T]]
  }
}

