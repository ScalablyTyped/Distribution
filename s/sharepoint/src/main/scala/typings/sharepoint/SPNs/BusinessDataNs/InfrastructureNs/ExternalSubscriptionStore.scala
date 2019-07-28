package typings.sharepoint.SPNs.BusinessDataNs.InfrastructureNs

import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.ClientRuntimeContext
import typings.sharepoint.SPNs.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.Infrastructure.ExternalSubscriptionStore")
@js.native
class ExternalSubscriptionStore protected () extends ClientObject {
  def this(context: ClientRuntimeContext, web: Web) = this()
  def indexStore(): Unit = js.native
}

/* static members */
@JSGlobal("SP.BusinessData.Infrastructure.ExternalSubscriptionStore")
@js.native
object ExternalSubscriptionStore extends js.Object {
  def newObject(context: ClientRuntimeContext, web: Web): ExternalSubscriptionStore = js.native
}

