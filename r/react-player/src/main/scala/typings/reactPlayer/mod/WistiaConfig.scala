package typings.reactPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WistiaConfig extends js.Object {
  var options: js.UndefOr[js.Object] = js.undefined
}

object WistiaConfig {
  @scala.inline
  def apply(options: js.Object = null): WistiaConfig = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[WistiaConfig]
  }
}

