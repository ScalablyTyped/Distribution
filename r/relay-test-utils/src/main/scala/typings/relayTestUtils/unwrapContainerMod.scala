package typings.relayTestUtils

import typings.react.mod.ComponentType
import typings.reactRelay.mod.RelayPaginationProp
import typings.reactRelay.mod.RelayProp
import typings.reactRelay.mod.RelayRefetchProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-test-utils/lib/unwrapContainer", JSImport.Namespace)
@js.native
object unwrapContainerMod extends js.Object {
  
  def unwrapContainer[Props](ComponentClass: ComponentType[Props | RelayProp | RelayPaginationProp | RelayRefetchProp]): ComponentType[Props] = js.native
}
