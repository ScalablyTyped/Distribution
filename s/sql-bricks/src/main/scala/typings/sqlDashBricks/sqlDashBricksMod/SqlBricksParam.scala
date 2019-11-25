package typings.sqlDashBricks.sqlDashBricksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlBricksParam extends js.Object {
  var text: String
  var values: js.Array[_]
}

object SqlBricksParam {
  @scala.inline
  def apply(text: String, values: js.Array[_]): SqlBricksParam = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SqlBricksParam]
  }
}

