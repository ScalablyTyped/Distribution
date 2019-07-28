package typings.sqlstring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ToSqlString extends js.Object {
  def toSqlString(): String
}

object Anon_ToSqlString {
  @scala.inline
  def apply(toSqlString: () => String): Anon_ToSqlString = {
    val __obj = js.Dynamic.literal(toSqlString = js.Any.fromFunction0(toSqlString))
  
    __obj.asInstanceOf[Anon_ToSqlString]
  }
}

