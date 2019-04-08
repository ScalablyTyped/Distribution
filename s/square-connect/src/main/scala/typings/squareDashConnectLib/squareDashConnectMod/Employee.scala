package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Employee")
@js.native
class Employee () extends js.Object {
  /**
    * A read-only timestamp in RFC 3339 format.
    */
  var created_at: js.UndefOr[java.lang.String] = js.native
  /**
    * Given (first) name of the employee.
    */
  var first_name: js.UndefOr[java.lang.String] = js.native
  /**
    * UUID for this `Employee`.
    */
  var id: js.UndefOr[java.lang.String] = js.native
  /**
    * Family (last) name of the employee
    */
  var last_name: js.UndefOr[java.lang.String] = js.native
  /**
    * A list of location IDs where this employee has access.
    */
  var location_ids: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * Specifies the status of the employee being fetched.
    */
  var status: js.UndefOr[squareDashConnectLib.squareDashConnectMod.EmployeeNs.StatusEnum] = js.native
  /**
    * A read-only timestamp in RFC 3339 format.
    */
  var updated_at: js.UndefOr[java.lang.String] = js.native
}

