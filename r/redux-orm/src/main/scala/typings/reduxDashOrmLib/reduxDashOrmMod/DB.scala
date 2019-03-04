package typings
package reduxDashOrmLib.reduxDashOrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DB extends js.Object {
  var describe: js.Any
  var getEmptyState: js.Any
  var query: js.Any
  var update: js.Any
}

object DB {
  @scala.inline
  def apply(describe: js.Any, getEmptyState: js.Any, query: js.Any, update: js.Any): DB = {
    val __obj = js.Dynamic.literal(describe = describe, getEmptyState = getEmptyState, query = query, update = update)
  
    __obj.asInstanceOf[DB]
  }
}

