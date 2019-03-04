package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitResult extends js.Object {
  var ready: scala.Double
}

object WaitResult {
  @scala.inline
  def apply(ready: scala.Double): WaitResult = {
    val __obj = js.Dynamic.literal(ready = ready)
  
    __obj.asInstanceOf[WaitResult]
  }
}

