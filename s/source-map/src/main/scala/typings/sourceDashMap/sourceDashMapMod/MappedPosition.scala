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
    val __obj = js.Dynamic.literal(column = column, line = line, source = source)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MappedPosition]
  }
}

