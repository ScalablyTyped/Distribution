package typings.scssDashParser.scssDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputStreamPosition extends js.Object {
  var column: Double
  var cursor: Double
  var line: Double
}

object InputStreamPosition {
  @scala.inline
  def apply(column: Double, cursor: Double, line: Double): InputStreamPosition = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InputStreamPosition]
  }
}

