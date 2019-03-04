package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignContainerSize extends js.Object {
  var align: java.lang.String
  var containerSize: scala.Double
  var currentOffset: scala.Double
  var targetIndex: scala.Double
}

object Anon_AlignContainerSize {
  @scala.inline
  def apply(
    align: java.lang.String,
    containerSize: scala.Double,
    currentOffset: scala.Double,
    targetIndex: scala.Double
  ): Anon_AlignContainerSize = {
    val __obj = js.Dynamic.literal(align = align, containerSize = containerSize, currentOffset = currentOffset, targetIndex = targetIndex)
  
    __obj.asInstanceOf[Anon_AlignContainerSize]
  }
}

