package typings.scroller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeft extends js.Object {
  var left: Double
  var top: Double
  var zoom: Double
}

object AnonLeft {
  @scala.inline
  def apply(left: Double, top: Double, zoom: Double): AnonLeft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeft]
  }
}

