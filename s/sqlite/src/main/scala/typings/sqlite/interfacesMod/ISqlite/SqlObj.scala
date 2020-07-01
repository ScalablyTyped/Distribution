package typings.sqlite.interfacesMod.ISqlite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlObj extends js.Object {
  var params: js.UndefOr[js.Array[_]] = js.undefined
  var sql: String
}

object SqlObj {
  @scala.inline
  def apply(sql: String, params: js.Array[_] = null): SqlObj = {
    val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlObj]
  }
}

