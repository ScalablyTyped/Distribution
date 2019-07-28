package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineColumn extends js.Object {
  var column: Double
  var line: Double
}

object LineColumn {
  @scala.inline
  def apply(column: Double, line: Double): LineColumn = {
    val __obj = js.Dynamic.literal(column = column, line = line)
  
    __obj.asInstanceOf[LineColumn]
  }
}

