package typings
package reactDashMosaicDashComponentLib.libInternalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicDragItem extends js.Object {
  var hideTimer: scala.Double
  var mosaicId: java.lang.String
}

object MosaicDragItem {
  @scala.inline
  def apply(hideTimer: scala.Double, mosaicId: java.lang.String): MosaicDragItem = {
    val __obj = js.Dynamic.literal(hideTimer = hideTimer, mosaicId = mosaicId)
  
    __obj.asInstanceOf[MosaicDragItem]
  }
}

