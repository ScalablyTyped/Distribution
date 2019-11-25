package typings.rollup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: Double
  var file: js.UndefOr[String] = js.undefined
  var line: Double
}

object Anon_Column {
  @scala.inline
  def apply(column: Double, line: Double, file: String = null): Anon_Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Column]
  }
}

