package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResult extends js.Object {
  var created: scala.Double
}

object CreateResult {
  @scala.inline
  def apply(created: scala.Double): CreateResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("created")(created)
    __obj.asInstanceOf[CreateResult]
  }
}

