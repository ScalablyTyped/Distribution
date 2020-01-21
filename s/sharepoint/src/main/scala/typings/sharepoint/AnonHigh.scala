package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHigh extends js.Object {
  var High: Double
  var Low: Double
}

object AnonHigh {
  @scala.inline
  def apply(High: Double, Low: Double): AnonHigh = {
    val __obj = js.Dynamic.literal(High = High.asInstanceOf[js.Any], Low = Low.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHigh]
  }
}

