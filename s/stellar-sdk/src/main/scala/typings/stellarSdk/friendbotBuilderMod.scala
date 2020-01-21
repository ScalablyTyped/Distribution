package typings.stellarSdk

import typings.stellarSdk.callBuilderMod.CallBuilder
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/friendbot_builder", JSImport.Namespace)
@js.native
object friendbotBuilderMod extends js.Object {
  @js.native
  class FriendbotBuilder protected ()
    extends CallBuilder[js.Any] {
    def this(serverUrl: URI, address: String) = this()
  }
  
}

