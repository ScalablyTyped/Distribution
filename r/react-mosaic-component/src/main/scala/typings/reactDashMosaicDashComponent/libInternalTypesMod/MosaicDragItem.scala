package typings.reactDashMosaicDashComponent.libInternalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicDragItem extends js.Object {
  var hideTimer: Double
  var mosaicId: String
}

object MosaicDragItem {
  @scala.inline
  def apply(hideTimer: Double, mosaicId: String): MosaicDragItem = {
    val __obj = js.Dynamic.literal(hideTimer = hideTimer, mosaicId = mosaicId)
  
    __obj.asInstanceOf[MosaicDragItem]
  }
}

