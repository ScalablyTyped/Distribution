package typings.snapsvg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alpha extends js.Object {
  var alpha: Double
  var x: Double
  var y: Double
}

object Alpha {
  @scala.inline
  def apply(alpha: Double, x: Double, y: Double): Alpha = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alpha]
  }
}

