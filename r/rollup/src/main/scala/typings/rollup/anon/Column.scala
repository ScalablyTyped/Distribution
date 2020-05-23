package typings.rollup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var column: Double
  var file: js.UndefOr[String] = js.undefined
  var line: Double
}

object Column {
  @scala.inline
  def apply(column: Double, line: Double, file: String = null): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

