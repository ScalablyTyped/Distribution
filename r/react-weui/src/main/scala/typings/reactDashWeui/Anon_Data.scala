package typings.reactDashWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Array[_]
  var dataMap: Anon_Id
  var selected: js.Array[_]
  var show: Boolean
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Array[_], dataMap: Anon_Id, selected: js.Array[_], show: Boolean): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, dataMap = dataMap, selected = selected, show = show)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

