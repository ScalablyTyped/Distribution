package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlExpression extends js.Object {
  // The name of a sql function
  var sql: js.UndefOr[String] = js.undefined
}

object SqlExpression {
  @scala.inline
  def apply(sql: String = null): SqlExpression = {
    val __obj = js.Dynamic.literal()
    if (sql != null) __obj.updateDynamic("sql")(sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlExpression]
  }
}

