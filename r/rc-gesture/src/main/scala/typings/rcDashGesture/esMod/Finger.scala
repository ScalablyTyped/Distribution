package typings.rcDashGesture.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Finger extends js.Object {
  var x: Double
  var y: Double
}

object Finger {
  @scala.inline
  def apply(x: Double, y: Double): Finger = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Finger]
  }
}

