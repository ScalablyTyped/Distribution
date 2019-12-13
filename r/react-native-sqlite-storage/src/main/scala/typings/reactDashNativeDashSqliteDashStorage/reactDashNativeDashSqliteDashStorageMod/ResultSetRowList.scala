package typings.reactDashNativeDashSqliteDashStorage.reactDashNativeDashSqliteDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSetRowList extends js.Object {
  var length: Double
  def item(index: Double): js.Any
  def raw(): js.Array[_]
}

object ResultSetRowList {
  @scala.inline
  def apply(item: Double => js.Any, length: Double, raw: () => js.Array[_]): ResultSetRowList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], raw = js.Any.fromFunction0(raw))
  
    __obj.asInstanceOf[ResultSetRowList]
  }
}

