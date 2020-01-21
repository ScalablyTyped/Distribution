package typings.sqlstring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToSqlString extends js.Object {
  def toSqlString(): String
}

object AnonToSqlString {
  @scala.inline
  def apply(toSqlString: () => String): AnonToSqlString = {
    val __obj = js.Dynamic.literal(toSqlString = js.Any.fromFunction0(toSqlString))
  
    __obj.asInstanceOf[AnonToSqlString]
  }
}

