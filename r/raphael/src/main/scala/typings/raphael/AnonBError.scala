package typings.raphael

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBError extends js.Object {
  var b: Double
  var error: Boolean
  var g: Double
  var hex: String
  var r: Double
}

object AnonBError {
  @scala.inline
  def apply(b: Double, error: Boolean, g: Double, hex: String, r: Double): AnonBError = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBError]
  }
}

