package typings.psi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Max extends js.Object {
  var max: Double
  var min: Double
  var proportion: Double
}

object Max {
  @scala.inline
  def apply(max: Double, min: Double, proportion: Double): Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], proportion = proportion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
}

