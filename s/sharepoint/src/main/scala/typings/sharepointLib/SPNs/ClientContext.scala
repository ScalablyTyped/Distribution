package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientContext")
@js.native
class ClientContext () extends ClientRuntimeContext {
  def this(serverRelativeUrlOrFullUrl: java.lang.String) = this()
  def get_serverVersion(): java.lang.String = js.native
  def get_site(): Site = js.native
  def get_web(): Web = js.native
}

@JSGlobal("SP.ClientContext")
@js.native
object ClientContext extends js.Object {
  def get_current(): sharepointLib.SPNs.ClientContext = js.native
}

