package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleDataTable extends js.Object {
  def get_rows(): js.Array[_]
}

object SimpleDataTable {
  @scala.inline
  def apply(get_rows: () => js.Array[_]): SimpleDataTable = {
    val __obj = js.Dynamic.literal(get_rows = js.Any.fromFunction0(get_rows))
    __obj.asInstanceOf[SimpleDataTable]
  }
}

