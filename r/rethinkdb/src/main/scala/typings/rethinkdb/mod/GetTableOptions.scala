package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableOptions extends js.Object {
  var useOutdated: Boolean
}

object GetTableOptions {
  @scala.inline
  def apply(useOutdated: Boolean): GetTableOptions = {
    val __obj = js.Dynamic.literal(useOutdated = useOutdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableOptions]
  }
}

