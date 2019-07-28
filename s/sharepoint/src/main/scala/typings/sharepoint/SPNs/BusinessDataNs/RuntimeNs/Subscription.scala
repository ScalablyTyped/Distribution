package typings.sharepoint.SPNs.BusinessDataNs.RuntimeNs

import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.ClientRuntimeContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.Runtime.Subscription")
@js.native
class Subscription protected () extends ClientObject {
  def this(context: ClientRuntimeContext, id: js.Any, hash: String) = this()
  def get_hash(): String = js.native
  def get_iD(): js.Any = js.native
}

/* static members */
@JSGlobal("SP.BusinessData.Runtime.Subscription")
@js.native
object Subscription extends js.Object {
  def newObject(context: ClientRuntimeContext, id: js.Any, hash: String): Subscription = js.native
}

