package typings.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object Duration {
  @scala.inline
  def apply(duration: js.UndefOr[Double] = js.undefined): Duration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

