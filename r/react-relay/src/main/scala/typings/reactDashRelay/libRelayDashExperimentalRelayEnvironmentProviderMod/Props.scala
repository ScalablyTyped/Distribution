package typings.reactDashRelay.libRelayDashExperimentalRelayEnvironmentProviderMod

import typings.react.reactMod.ReactNode
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  var environment: Environment
}

object Props {
  @scala.inline
  def apply(environment: Environment, children: ReactNode = null): Props = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

