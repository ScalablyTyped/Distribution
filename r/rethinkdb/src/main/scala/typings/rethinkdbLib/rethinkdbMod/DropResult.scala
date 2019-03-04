package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropResult extends js.Object {
  var dropped: scala.Double
}

object DropResult {
  @scala.inline
  def apply(dropped: scala.Double): DropResult = {
    val __obj = js.Dynamic.literal(dropped = dropped)
  
    __obj.asInstanceOf[DropResult]
  }
}

