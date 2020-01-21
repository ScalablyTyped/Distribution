package typings.stellarSdk

import typings.stellarSdk.callBuilderMod.CallBuilder
import typings.stellarSdk.serverApiMod.ServerApi.AccountRecord
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/account_call_builder", JSImport.Namespace)
@js.native
object accountCallBuilderMod extends js.Object {
  @js.native
  class AccountCallBuilder protected () extends CallBuilder[AccountRecord] {
    def this(serverUrl: URI) = this()
    def accountId(id: String): this.type = js.native
  }
  
}

