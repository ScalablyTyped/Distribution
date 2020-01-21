package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValues extends js.Object {
  var values: String | js.Array[String]
}

object AnonValues {
  @scala.inline
  def apply(values: String | js.Array[String]): AnonValues = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValues]
  }
}

