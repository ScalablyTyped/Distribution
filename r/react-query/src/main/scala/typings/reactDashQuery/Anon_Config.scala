package typings.reactDashQuery

import typings.reactDashQuery.reactDashQueryMod.ReactQueryProviderConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var config: js.UndefOr[ReactQueryProviderConfig] = js.undefined
}

object Anon_Config {
  @scala.inline
  def apply(config: ReactQueryProviderConfig = null): Anon_Config = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[Anon_Config]
  }
}

