package typings
package sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlBricksParam extends js.Object {
  var text: java.lang.String
  var values: js.Array[_]
}

object SqlBricksParam {
  @scala.inline
  def apply(text: java.lang.String, values: js.Array[_]): SqlBricksParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[SqlBricksParam]
  }
}

