package typings
package rollupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: scala.Double
  var file: js.UndefOr[java.lang.String] = js.undefined
  var line: scala.Double
}

object Anon_Column {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double, file: java.lang.String = null): Anon_Column = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("line")(line)
    if (file != null) __obj.updateDynamic("file")(file)
    __obj.asInstanceOf[Anon_Column]
  }
}

