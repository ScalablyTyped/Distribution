package typings.sharepoint.SPClientFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientForms.ClientFormManager")
@js.native
class ClientFormManager () extends js.Object

/* static members */
@JSGlobal("SPClientForms.ClientFormManager")
@js.native
object ClientFormManager extends js.Object {
  def GetClientForm(qualifier: String): ClientForm = js.native
  def RegisterClientForm(qualifier: String): Unit = js.native
  def SubmitClientForm(qualifier: String): Boolean = js.native
}

