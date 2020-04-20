package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Nested where Postgre Statement
  */
trait WherePGStatement extends js.Object {
  @JSName("$all")
  var $all: js.Array[String | Double]
  @JSName("$any")
  var $any: js.Array[String | Double]
}

object WherePGStatement {
  @scala.inline
  def apply($all: js.Array[String | Double], $any: js.Array[String | Double]): WherePGStatement = {
    val __obj = js.Dynamic.literal($all = $all.asInstanceOf[js.Any], $any = $any.asInstanceOf[js.Any])
    __obj.asInstanceOf[WherePGStatement]
  }
}

