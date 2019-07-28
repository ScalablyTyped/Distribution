package typings.recharts.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerSize extends js.Object {
  var containerHeight: Double
  var containerWidth: Double
}

object ContainerSize {
  @scala.inline
  def apply(containerHeight: Double, containerWidth: Double): ContainerSize = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight, containerWidth = containerWidth)
  
    __obj.asInstanceOf[ContainerSize]
  }
}

