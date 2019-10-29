package typings.stellarDashSdk

import typings.stellarDashSdk.libCallUnderscoreBuilderMod.CallBuilder
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.AccountRecord
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/account_call_builder", JSImport.Namespace)
@js.native
object libAccountUnderscoreCallUnderscoreBuilderMod extends js.Object {
  @js.native
  class AccountCallBuilder protected () extends CallBuilder[AccountRecord] {
    def this(serverUrl: URI) = this()
    def accountId(id: String): this.type = js.native
  }
  
}

