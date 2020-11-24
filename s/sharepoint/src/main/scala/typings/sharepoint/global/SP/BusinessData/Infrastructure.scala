package typings.sharepoint.global.SP.BusinessData

import typings.sharepoint.SP.ClientRuntimeContext
import typings.sharepoint.SP.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.BusinessData.Infrastructure")
@js.native
object Infrastructure extends js.Object {
  
  @js.native
  class ExternalSubscriptionStore protected ()
    extends typings.sharepoint.SP.BusinessData.Infrastructure.ExternalSubscriptionStore {
    def this(context: ClientRuntimeContext, web: Web) = this()
  }
  /* static members */
  @js.native
  object ExternalSubscriptionStore extends js.Object {
    
    def newObject(context: ClientRuntimeContext, web: Web): typings.sharepoint.SP.BusinessData.Infrastructure.ExternalSubscriptionStore = js.native
  }
}
