package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Nested where Postgre Statement
  */
trait WherePGStatement extends js.Object {
  @JSName("$all")
  var $all: js.Array[java.lang.String | scala.Double]
  @JSName("$any")
  var $any: js.Array[java.lang.String | scala.Double]
}

object WherePGStatement {
  @scala.inline
  def apply($all: js.Array[java.lang.String | scala.Double], $any: js.Array[java.lang.String | scala.Double]): WherePGStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$all")($all)
    __obj.updateDynamic("$any")($any)
    __obj.asInstanceOf[WherePGStatement]
  }
}

