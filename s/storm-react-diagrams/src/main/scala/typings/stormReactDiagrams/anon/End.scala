package typings.stormReactDiagrams.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var end: X
  var pathToEnd: js.Array[js.Array[Double]]
  var pathToStart: js.Array[js.Array[Double]]
  var start: X
}

object End {
  @scala.inline
  def apply(end: X, pathToEnd: js.Array[js.Array[Double]], pathToStart: js.Array[js.Array[Double]], start: X): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], pathToEnd = pathToEnd.asInstanceOf[js.Any], pathToStart = pathToStart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

