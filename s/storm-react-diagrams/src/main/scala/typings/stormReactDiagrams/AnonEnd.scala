package typings.stormReactDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var end: AnonX
  var pathToEnd: js.Array[js.Array[Double]]
  var pathToStart: js.Array[js.Array[Double]]
  var start: AnonX
}

object AnonEnd {
  @scala.inline
  def apply(
    end: AnonX,
    pathToEnd: js.Array[js.Array[Double]],
    pathToStart: js.Array[js.Array[Double]],
    start: AnonX
  ): AnonEnd = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], pathToEnd = pathToEnd.asInstanceOf[js.Any], pathToStart = pathToStart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEnd]
  }
}

