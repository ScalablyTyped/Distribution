package typings.sammy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var name: String
}

object Data {
  @scala.inline
  def apply(name: String, data: js.Any = null): Data = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

