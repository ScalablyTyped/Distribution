package typings.reactQuery

import typings.reactQuery.mod.ReactQueryProviderConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfigReactQueryProviderConfig extends js.Object {
  var config: js.UndefOr[ReactQueryProviderConfig] = js.undefined
}

object AnonConfigReactQueryProviderConfig {
  @scala.inline
  def apply(config: ReactQueryProviderConfig = null): AnonConfigReactQueryProviderConfig = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfigReactQueryProviderConfig]
  }
}

