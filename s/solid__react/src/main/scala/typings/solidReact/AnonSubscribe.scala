package typings.solidReact

import typings.solidReact.solidReactStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSubscribe extends js.Object {
  var subscribe: js.UndefOr[Asterisk | String | js.Array[String]] = js.undefined
}

object AnonSubscribe {
  @scala.inline
  def apply(subscribe: Asterisk | String | js.Array[String] = null): AnonSubscribe = {
    val __obj = js.Dynamic.literal()
    if (subscribe != null) __obj.updateDynamic("subscribe")(subscribe.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubscribe]
  }
}

