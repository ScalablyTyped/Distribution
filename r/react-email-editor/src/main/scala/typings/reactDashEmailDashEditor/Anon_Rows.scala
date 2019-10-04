package typings.reactDashEmailDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rows extends js.Object {
  val rows: js.Array[js.Object]
  val values: js.UndefOr[js.Object] = js.undefined
}

object Anon_Rows {
  @scala.inline
  def apply(rows: js.Array[js.Object], values: js.Object = null): Anon_Rows = {
    val __obj = js.Dynamic.literal(rows = rows)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Anon_Rows]
  }
}

