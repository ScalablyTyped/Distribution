package typings.relayTestUtils.relayModernMockEnvironmentMod

import typings.relayTestUtils.anon.HandlerProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-test-utils/lib/RelayModernMockEnvironment", "createMockEnvironment")
@js.native
object createMockEnvironment extends js.Object {
  
  def apply(): RelayMockEnvironment = js.native
  def apply(config: HandlerProvider): RelayMockEnvironment = js.native
}
