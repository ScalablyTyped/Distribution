package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebKitPoint extends js.Object {
  var x: Double
  var y: Double
}

object WebKitPoint {
  @scala.inline
  def apply(x: Double, y: Double): WebKitPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebKitPoint]
  }
}

