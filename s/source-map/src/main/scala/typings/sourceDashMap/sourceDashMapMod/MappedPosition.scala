package typings.sourceDashMap.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappedPosition extends js.Object {
  var column: Double
  var line: Double
  var name: js.UndefOr[String] = js.undefined
  var source: String
}

object MappedPosition {
  @scala.inline
  def apply(column: Double, line: Double, source: String, name: String = null): MappedPosition = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappedPosition]
  }
}

