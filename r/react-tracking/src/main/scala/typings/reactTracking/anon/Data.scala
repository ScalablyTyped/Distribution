package typings.reactTracking.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.UndefOr[js.Object] = js.undefined
}

object Data {
  @scala.inline
  def apply(data: js.Object = null): Data = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

