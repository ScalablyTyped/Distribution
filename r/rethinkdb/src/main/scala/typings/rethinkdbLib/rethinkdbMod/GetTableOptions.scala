package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableOptions extends js.Object {
  var useOutdated: scala.Boolean
}

object GetTableOptions {
  @scala.inline
  def apply(useOutdated: scala.Boolean): GetTableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("useOutdated")(useOutdated)
    __obj.asInstanceOf[GetTableOptions]
  }
}

