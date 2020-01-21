package typings.pulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumn extends js.Object {
  var column: js.Any
  var file: String
  var line: js.Any
}

object AnonColumn {
  @scala.inline
  def apply(column: js.Any, file: String, line: js.Any): AnonColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumn]
  }
}

