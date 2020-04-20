package typings.reactWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.Array[_]
  var dataMap: AnonId
  var selected: js.Array[_]
  var show: Boolean
}

object AnonData {
  @scala.inline
  def apply(data: js.Array[_], dataMap: AnonId, selected: js.Array[_], show: Boolean): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataMap = dataMap.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

