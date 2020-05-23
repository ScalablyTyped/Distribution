package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerResult extends js.Object {
  var id: String
  var name: js.UndefOr[String] = js.undefined
  var proxy: Boolean
}

object ServerResult {
  @scala.inline
  def apply(id: String, proxy: Boolean, name: String = null): ServerResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerResult]
  }
}

