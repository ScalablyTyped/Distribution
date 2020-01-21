package typings.pulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnFile extends js.Object {
  var column: Double
  var file: String
  var line: Double
}

object AnonColumnFile {
  @scala.inline
  def apply(column: Double, file: String, line: Double): AnonColumnFile = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumnFile]
  }
}

