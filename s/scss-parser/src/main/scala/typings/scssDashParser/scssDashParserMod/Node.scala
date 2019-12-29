package typings.scssDashParser.scssDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var end: js.UndefOr[InputStreamPosition] = js.undefined
  var start: js.UndefOr[InputStreamPosition] = js.undefined
  var `type`: String
  var value: String | js.Array[Node]
}

object Node {
  @scala.inline
  def apply(
    `type`: String,
    value: String | js.Array[Node],
    end: InputStreamPosition = null,
    start: InputStreamPosition = null
  ): Node = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

