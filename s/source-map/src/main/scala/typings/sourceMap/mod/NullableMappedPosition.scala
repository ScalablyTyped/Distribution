package typings.sourceMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullableMappedPosition extends js.Object {
  var column: Double | Null
  var line: Double | Null
  var name: String | Null
  var source: String | Null
}

object NullableMappedPosition {
  @scala.inline
  def apply(column: Int | Double = null, line: Int | Double = null, name: String = null, source: String = null): NullableMappedPosition = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableMappedPosition]
  }
}

