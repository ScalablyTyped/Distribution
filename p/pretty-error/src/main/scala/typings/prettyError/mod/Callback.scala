package typings.prettyError.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  var lineNumber: Double
  var traceLine: js.Object | js.Any
}

object Callback {
  @scala.inline
  def apply(lineNumber: Double, traceLine: js.Object | js.Any): Callback = {
    val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any], traceLine = traceLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
}

