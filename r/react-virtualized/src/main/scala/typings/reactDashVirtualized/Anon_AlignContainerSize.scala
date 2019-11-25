package typings.reactDashVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignContainerSize extends js.Object {
  var align: String
  var containerSize: Double
  var currentOffset: Double
  var targetIndex: Double
}

object Anon_AlignContainerSize {
  @scala.inline
  def apply(align: String, containerSize: Double, currentOffset: Double, targetIndex: Double): Anon_AlignContainerSize = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], containerSize = containerSize.asInstanceOf[js.Any], currentOffset = currentOffset.asInstanceOf[js.Any], targetIndex = targetIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AlignContainerSize]
  }
}

