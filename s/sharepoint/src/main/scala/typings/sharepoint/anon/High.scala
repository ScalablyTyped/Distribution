package typings.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait High extends js.Object {
  var High: Double
  var Low: Double
}

object High {
  @scala.inline
  def apply(High: Double, Low: Double): High = {
    val __obj = js.Dynamic.literal(High = High.asInstanceOf[js.Any], Low = Low.asInstanceOf[js.Any])
    __obj.asInstanceOf[High]
  }
}

