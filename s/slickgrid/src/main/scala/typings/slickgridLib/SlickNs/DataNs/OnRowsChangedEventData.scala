package typings
package slickgridLib.SlickNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnRowsChangedEventData extends js.Object {
  var rows: js.Array[scala.Double]
}

object OnRowsChangedEventData {
  @scala.inline
  def apply(rows: js.Array[scala.Double]): OnRowsChangedEventData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[OnRowsChangedEventData]
  }
}

