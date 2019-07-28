package typings.squareDashConnect.squareDashConnectMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "GetEmployeeWageResponse")
@js.native
class GetEmployeeWageResponse () extends js.Object {
  /**
    * The requested `EmployeeWage` object.
    */
  var employee_wage: js.UndefOr[EmployeeWage] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}

