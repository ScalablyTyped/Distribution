package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerResult extends js.Object {
  var id: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var proxy: scala.Boolean
}

object ServerResult {
  @scala.inline
  def apply(id: java.lang.String, proxy: scala.Boolean, name: java.lang.String = null): ServerResult = {
    val __obj = js.Dynamic.literal(id = id, proxy = proxy)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ServerResult]
  }
}

