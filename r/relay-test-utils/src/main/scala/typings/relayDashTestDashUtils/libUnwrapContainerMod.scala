package typings.relayDashTestDashUtils

import typings.react.reactMod.ComponentType
import typings.reactDashRelay.reactDashRelayMod.RelayPaginationProp
import typings.reactDashRelay.reactDashRelayMod.RelayProp
import typings.reactDashRelay.reactDashRelayMod.RelayRefetchProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-test-utils/lib/unwrapContainer", JSImport.Namespace)
@js.native
object libUnwrapContainerMod extends js.Object {
  def unwrapContainer[Props](ComponentClass: ComponentType[Props | RelayProp | RelayPaginationProp | RelayRefetchProp]): ComponentType[Props] = js.native
}

