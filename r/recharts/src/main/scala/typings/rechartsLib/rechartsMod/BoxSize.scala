package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxSize extends js.Object {
  var boxHeight: scala.Double
  var boxWidth: scala.Double
}

object BoxSize {
  @scala.inline
  def apply(boxHeight: scala.Double, boxWidth: scala.Double): BoxSize = {
    val __obj = js.Dynamic.literal(boxHeight = boxHeight, boxWidth = boxWidth)
  
    __obj.asInstanceOf[BoxSize]
  }
}

