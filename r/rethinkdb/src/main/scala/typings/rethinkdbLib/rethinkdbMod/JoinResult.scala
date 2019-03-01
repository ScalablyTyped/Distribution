package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinResult extends js.Object {
  var left: js.Any
  var right: js.Any
}

object JoinResult {
  @scala.inline
  def apply(left: js.Any, right: js.Any): JoinResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[JoinResult]
  }
}

