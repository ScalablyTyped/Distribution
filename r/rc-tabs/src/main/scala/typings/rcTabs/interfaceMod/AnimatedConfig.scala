package typings.rcTabs.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimatedConfig extends js.Object {
  var inkBar: js.UndefOr[Boolean] = js.undefined
  var tabPane: js.UndefOr[Boolean] = js.undefined
}

object AnimatedConfig {
  @scala.inline
  def apply(inkBar: js.UndefOr[Boolean] = js.undefined, tabPane: js.UndefOr[Boolean] = js.undefined): AnimatedConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inkBar)) __obj.updateDynamic("inkBar")(inkBar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabPane)) __obj.updateDynamic("tabPane")(tabPane.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedConfig]
  }
}

