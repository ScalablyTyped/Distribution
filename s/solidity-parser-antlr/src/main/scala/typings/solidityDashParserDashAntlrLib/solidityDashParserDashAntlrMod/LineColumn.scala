package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineColumn extends js.Object {
  var column: scala.Double
  var line: scala.Double
}

object LineColumn {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double): LineColumn = {
    val __obj = js.Dynamic.literal(column = column, line = line)
  
    __obj.asInstanceOf[LineColumn]
  }
}

