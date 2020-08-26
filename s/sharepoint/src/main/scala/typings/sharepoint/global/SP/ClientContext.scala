package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientContext")
@js.native
class ClientContext ()
  extends typings.sharepoint.SP.ClientContext {
  def this(serverRelativeUrlOrFullUrl: String) = this()
}

/* static members */
@JSGlobal("SP.ClientContext")
@js.native
object ClientContext extends js.Object {
  def get_current(): typings.sharepoint.SP.ClientContext = js.native
}

