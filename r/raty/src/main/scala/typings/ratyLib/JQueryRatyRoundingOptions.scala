package typings
package ratyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryRatyRoundingOptions extends js.Object {
  var down: scala.Double
  var full: scala.Double
  var up: scala.Double
}

object JQueryRatyRoundingOptions {
  @scala.inline
  def apply(down: scala.Double, full: scala.Double, up: scala.Double): JQueryRatyRoundingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("down")(down)
    __obj.updateDynamic("full")(full)
    __obj.updateDynamic("up")(up)
    __obj.asInstanceOf[JQueryRatyRoundingOptions]
  }
}

