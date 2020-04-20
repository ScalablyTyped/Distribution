package typings.reactVirtualized.esGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerSizeAndOffset extends js.Object {
  var containerSize: Double
  var offset: Double
}

object ContainerSizeAndOffset {
  @scala.inline
  def apply(containerSize: Double, offset: Double): ContainerSizeAndOffset = {
    val __obj = js.Dynamic.literal(containerSize = containerSize.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerSizeAndOffset]
  }
}

