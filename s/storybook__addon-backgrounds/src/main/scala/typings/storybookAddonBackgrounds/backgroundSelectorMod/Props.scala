package typings.storybookAddonBackgrounds.backgroundSelectorMod

import typings.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var api: API
}

object Props {
  @scala.inline
  def apply(api: API): Props = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

