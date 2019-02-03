package typings
package sharepointLib.SPNs.UINs.ApplicationPagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.ApplicationPages.PeoplePickerWebServiceInterface")
@js.native
class PeoplePickerWebServiceInterface () extends js.Object

/* static members */
@JSGlobal("SP.UI.ApplicationPages.PeoplePickerWebServiceInterface")
@js.native
object PeoplePickerWebServiceInterface extends js.Object {
  def getSearchResults(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    searchPattern: java.lang.String,
    providerID: java.lang.String,
    hierarchyNodeID: java.lang.String,
    entityTypes: java.lang.String
  ): sharepointLib.SPNs.StringResult = js.native
  def getSearchResultsByHierarchy(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    providerID: java.lang.String,
    hierarchyNodeID: java.lang.String,
    entityTypes: java.lang.String,
    contextUrl: java.lang.String
  ): sharepointLib.SPNs.StringResult = js.native
}

