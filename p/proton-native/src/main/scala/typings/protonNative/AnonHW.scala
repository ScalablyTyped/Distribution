package typings.protonNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHW extends js.Object {
  var h: Double
  var w: Double
}

object AnonHW {
  @scala.inline
  def apply(h: Double, w: Double): AnonHW = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHW]
  }
}

