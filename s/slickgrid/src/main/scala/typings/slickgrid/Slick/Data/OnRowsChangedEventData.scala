package typings.slickgrid.Slick.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnRowsChangedEventData extends js.Object {
  var rows: js.Array[Double]
}

object OnRowsChangedEventData {
  @scala.inline
  def apply(rows: js.Array[Double]): OnRowsChangedEventData = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnRowsChangedEventData]
  }
}

