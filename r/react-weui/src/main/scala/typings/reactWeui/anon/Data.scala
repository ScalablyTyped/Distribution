package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.Array[_]
  var dataMap: Id
  var selected: js.Array[_]
  var show: Boolean
}

object Data {
  @scala.inline
  def apply(data: js.Array[_], dataMap: Id, selected: js.Array[_], show: Boolean): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataMap = dataMap.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

