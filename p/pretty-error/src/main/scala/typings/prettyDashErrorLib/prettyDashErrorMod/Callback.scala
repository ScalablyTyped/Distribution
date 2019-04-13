package typings
package prettyDashErrorLib.prettyDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  var lineNumber: scala.Double
  var traceLine: js.Object | js.Any
}

object Callback {
  @scala.inline
  def apply(lineNumber: scala.Double, traceLine: js.Object | js.Any): Callback = {
    val __obj = js.Dynamic.literal(lineNumber = lineNumber, traceLine = traceLine.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Callback]
  }
}

