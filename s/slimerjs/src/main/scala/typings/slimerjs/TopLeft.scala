package typings.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopLeft extends js.Object {
  var left: Double
  var top: Double
}

object TopLeft {
  @scala.inline
  def apply(left: Double, top: Double): TopLeft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TopLeft]
  }
}

