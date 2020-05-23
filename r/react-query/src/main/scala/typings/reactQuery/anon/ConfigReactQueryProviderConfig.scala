package typings.reactQuery.anon

import typings.reactQuery.mod.ReactQueryProviderConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigReactQueryProviderConfig extends js.Object {
  var config: js.UndefOr[ReactQueryProviderConfig] = js.undefined
}

object ConfigReactQueryProviderConfig {
  @scala.inline
  def apply(config: ReactQueryProviderConfig = null): ConfigReactQueryProviderConfig = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigReactQueryProviderConfig]
  }
}

