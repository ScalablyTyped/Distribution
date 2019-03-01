package typings
package sqlstringLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ToSqlString extends js.Object {
  def toSqlString(): java.lang.String
}

object Anon_ToSqlString {
  @scala.inline
  def apply(toSqlString: js.Function0[java.lang.String]): Anon_ToSqlString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toSqlString")(toSqlString)
    __obj.asInstanceOf[Anon_ToSqlString]
  }
}

