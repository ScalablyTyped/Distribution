package typings.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var height: Double
  var width: Double
}

object Size {
  @scala.inline
  def apply(height: Double, width: Double): Size = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[Size]
  }
}

