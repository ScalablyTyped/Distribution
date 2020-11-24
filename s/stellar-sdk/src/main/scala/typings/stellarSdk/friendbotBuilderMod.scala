package typings.stellarSdk

import typings.stellarSdk.callBuilderMod.CallBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk/lib/friendbot_builder", JSImport.Namespace)
@js.native
object friendbotBuilderMod extends js.Object {
  
  @js.native
  class FriendbotBuilder protected ()
    extends CallBuilder[js.Any] {
    def this(
      serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URI */ js.Any,
      address: String
    ) = this()
  }
}
