package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spacing extends js.Object {
  var bottom: Double
  var left: Double
  var right: Double
  var top: Double
}

object Spacing {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): Spacing = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Spacing]
  }
}

