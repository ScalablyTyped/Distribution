package typings.reactBulmaComponents

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActive extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[ReactNode] = js.undefined
  var url: String
}

object AnonActive {
  @scala.inline
  def apply(url: String, active: js.UndefOr[Boolean] = js.undefined, name: ReactNode = null): AnonActive = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActive]
  }
}

