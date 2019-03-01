package typings
package sourceDashMapLib.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullableMappedPosition extends js.Object {
  var column: scala.Double | scala.Null
  var line: scala.Double | scala.Null
  var name: java.lang.String | scala.Null
  var source: java.lang.String | scala.Null
}

object NullableMappedPosition {
  @scala.inline
  def apply(
    column: scala.Int | scala.Double = null,
    line: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    source: java.lang.String = null
  ): NullableMappedPosition = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[NullableMappedPosition]
  }
}

