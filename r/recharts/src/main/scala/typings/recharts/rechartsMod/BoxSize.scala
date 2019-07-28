package typings.recharts.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxSize extends js.Object {
  var boxHeight: Double
  var boxWidth: Double
}

object BoxSize {
  @scala.inline
  def apply(boxHeight: Double, boxWidth: Double): BoxSize = {
    val __obj = js.Dynamic.literal(boxHeight = boxHeight, boxWidth = boxWidth)
  
    __obj.asInstanceOf[BoxSize]
  }
}

