package typings.stellarDashSdk

import typings.stellarDashSdk.libCallUnderscoreBuilderMod.CallBuilder
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/friendbot_builder", JSImport.Namespace)
@js.native
object libFriendbotUnderscoreBuilderMod extends js.Object {
  @js.native
  class FriendbotBuilder protected ()
    extends CallBuilder[js.Any] {
    def this(serverUrl: URI, address: String) = this()
  }
  
}

