package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlExpression extends js.Object {
  // The name of a sql function
  var sql: js.UndefOr[java.lang.String] = js.undefined
}

object SqlExpression {
  @scala.inline
  def apply(sql: java.lang.String = null): SqlExpression = {
    val __obj = js.Dynamic.literal()
    if (sql != null) __obj.updateDynamic("sql")(sql)
    __obj.asInstanceOf[SqlExpression]
  }
}

