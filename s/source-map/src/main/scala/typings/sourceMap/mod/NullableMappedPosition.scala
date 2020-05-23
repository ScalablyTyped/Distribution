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
  def apply(
    column: Double = null.asInstanceOf[Double],
    line: Double = null.asInstanceOf[Double],
    name: String = null,
    source: String = null
  ): NullableMappedPosition = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableMappedPosition]
  }
}

