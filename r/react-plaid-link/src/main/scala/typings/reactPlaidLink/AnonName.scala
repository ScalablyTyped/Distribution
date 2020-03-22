package typings.reactPlaidLink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var institution_id: String | Null
  var name: String | Null
}

object AnonName {
  @scala.inline
  def apply(institution_id: String = null, name: String = null): AnonName = {
    val __obj = js.Dynamic.literal()
    if (institution_id != null) __obj.updateDynamic("institution_id")(institution_id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

