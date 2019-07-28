package typings.rethinkdb.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitResult extends js.Object {
  var ready: Double
}

object WaitResult {
  @scala.inline
  def apply(ready: Double): WaitResult = {
    val __obj = js.Dynamic.literal(ready = ready)
  
    __obj.asInstanceOf[WaitResult]
  }
}

