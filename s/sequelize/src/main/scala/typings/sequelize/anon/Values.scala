package typings.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Values extends js.Object {
  var values: String | js.Array[String]
}

object Values {
  @scala.inline
  def apply(values: String | js.Array[String]): Values = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values]
  }
}

