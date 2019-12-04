package typings.atPulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFile extends js.Object {
  var column: Double
  var file: String
  var line: Double
}

object Anon_ColumnFile {
  @scala.inline
  def apply(column: Double, file: String, line: Double): Anon_ColumnFile = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColumnFile]
  }
}

