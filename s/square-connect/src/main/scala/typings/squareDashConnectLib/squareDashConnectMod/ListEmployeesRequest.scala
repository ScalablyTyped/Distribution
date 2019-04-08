package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListEmployeesRequest")
@js.native
class ListEmployeesRequest () extends js.Object {
  /**
    * The token required to retrieve the specified page of results.
    */
  var cursor: js.UndefOr[java.lang.String] = js.native
  /**
    * The number of employees to be returned on each page.
    */
  var limit: js.UndefOr[scala.Double] = js.native
  /**
    * Filter employees returned to only those that are associated with the specified location.
    */
  var location_id: js.UndefOr[java.lang.String] = js.native
  /**
    * Specifies the EmployeeStatus to filter the employee by.
    */
  var status: js.UndefOr[squareDashConnectLib.squareDashConnectMod.ListEmployeesRequestNs.StatusEnum] = js.native
}

