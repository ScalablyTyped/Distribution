package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "EmployeesApi")
@js.native
class EmployeesApi () extends js.Object {
  /**
    * Gets a list of `Employee` objects for a business.
    */
  def listEmployees(params: ListEmployeesRequest): js.Promise[ListEmployeesResponse] = js.native
  /**
    * Gets an `Employee` by Square-assigned employee `ID` (UUID).
    */
  def retrieveEmployee(id: String): js.Promise[RetrieveEmployeeResponse] = js.native
}

