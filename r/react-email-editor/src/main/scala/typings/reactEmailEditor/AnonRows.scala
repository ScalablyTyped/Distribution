package typings.reactEmailEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRows extends js.Object {
  val rows: js.Array[js.Object]
  val values: js.UndefOr[js.Object] = js.undefined
}

object AnonRows {
  @scala.inline
  def apply(rows: js.Array[js.Object], values: js.Object = null): AnonRows = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRows]
  }
}

