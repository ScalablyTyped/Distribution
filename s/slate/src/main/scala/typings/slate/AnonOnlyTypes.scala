package typings.slate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnlyTypes extends js.Object {
  var onlyTypes: js.Array[String]
}

object AnonOnlyTypes {
  @scala.inline
  def apply(onlyTypes: js.Array[String]): AnonOnlyTypes = {
    val __obj = js.Dynamic.literal(onlyTypes = onlyTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOnlyTypes]
  }
}

