package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveMarkOperation extends Operation {
  var length: scala.Double
  var mark: Mark
  var offset: scala.Double
  var path: js.Array[scala.Double]
  var `type`: slateLib.slateLibStrings.remove_mark
}

object RemoveMarkOperation {
  @scala.inline
  def apply(
    length: scala.Double,
    mark: Mark,
    offset: scala.Double,
    path: js.Array[scala.Double],
    `type`: slateLib.slateLibStrings.remove_mark
  ): RemoveMarkOperation = {
    val __obj = js.Dynamic.literal(length = length, mark = mark, offset = offset, path = path)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RemoveMarkOperation]
  }
}

