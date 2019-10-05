package typings.sharepoint.SP.UI.ApplicationPages

import typings.sharepoint.SP.ClientRuntimeContext
import typings.sharepoint.SP.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.ApplicationPages.ClientPeoplePickerWebServiceInterface")
@js.native
class ClientPeoplePickerWebServiceInterface () extends js.Object

/* static members */
@JSGlobal("SP.UI.ApplicationPages.ClientPeoplePickerWebServiceInterface")
@js.native
object ClientPeoplePickerWebServiceInterface extends js.Object {
  def clientPeoplePickerResolveUser(context: ClientRuntimeContext, queryParams: ClientPeoplePickerQueryParameters): StringResult = js.native
  def clientPeoplePickerSearchUser(context: ClientRuntimeContext, queryParams: ClientPeoplePickerQueryParameters): StringResult = js.native
}

