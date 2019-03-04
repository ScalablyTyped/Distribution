package typings
package sourceDashMapLib.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappedPosition extends js.Object {
  var column: scala.Double
  var line: scala.Double
  var name: js.UndefOr[java.lang.String] = js.undefined
  var source: java.lang.String
}

object MappedPosition {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double, source: java.lang.String, name: java.lang.String = null): MappedPosition = {
    val __obj = js.Dynamic.literal(column = column, line = line, source = source)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MappedPosition]
  }
}

