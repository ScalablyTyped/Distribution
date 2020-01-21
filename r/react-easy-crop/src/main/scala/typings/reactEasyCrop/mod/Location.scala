package typings.reactEasyCrop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var x: Double
  var y: Double
}

object Location {
  @scala.inline
  def apply(x: Double, y: Double): Location = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Location]
  }
}

