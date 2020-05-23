package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitResult extends js.Object {
  var ready: Double
}

object WaitResult {
  @scala.inline
  def apply(ready: Double): WaitResult = {
    val __obj = js.Dynamic.literal(ready = ready.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitResult]
  }
}

