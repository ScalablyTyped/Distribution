package typings
package reactDashDataDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdxName extends js.Object {
  var idx: scala.Double
  var name: java.lang.String
  var rowIdx: scala.Double
}

object Anon_IdxName {
  @scala.inline
  def apply(idx: scala.Double, name: java.lang.String, rowIdx: scala.Double): Anon_IdxName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("idx")(idx)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("rowIdx")(rowIdx)
    __obj.asInstanceOf[Anon_IdxName]
  }
}

