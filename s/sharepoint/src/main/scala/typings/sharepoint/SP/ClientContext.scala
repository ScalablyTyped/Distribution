package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientContext")
@js.native
class ClientContext () extends ClientRuntimeContext {
  def this(serverRelativeUrlOrFullUrl: String) = this()
  def get_serverVersion(): String = js.native
  def get_site(): Site = js.native
  def get_web(): Web = js.native
}

/* static members */
@JSGlobal("SP.ClientContext")
@js.native
object ClientContext extends js.Object {
  def get_current(): ClientContext = js.native
}

