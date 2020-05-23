package typings.splitpanes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait splitterTapsTypes extends js.Object {
  var splitter: Null | Double
  var timeoutId: Null | js.Object
}

object splitterTapsTypes {
  @scala.inline
  def apply(splitter: Double = null.asInstanceOf[Double], timeoutId: js.Object = null): splitterTapsTypes = {
    val __obj = js.Dynamic.literal(splitter = splitter.asInstanceOf[js.Any], timeoutId = timeoutId.asInstanceOf[js.Any])
    __obj.asInstanceOf[splitterTapsTypes]
  }
}

