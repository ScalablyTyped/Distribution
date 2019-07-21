package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerSize extends js.Object {
  var containerHeight: scala.Double
  var containerWidth: scala.Double
}

object ContainerSize {
  @scala.inline
  def apply(containerHeight: scala.Double, containerWidth: scala.Double): ContainerSize = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight, containerWidth = containerWidth)
  
    __obj.asInstanceOf[ContainerSize]
  }
}

