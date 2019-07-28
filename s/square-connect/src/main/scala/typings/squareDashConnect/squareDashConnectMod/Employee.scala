package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.EmployeeNs.StatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Employee")
@js.native
class Employee () extends js.Object {
  /**
    * A read-only timestamp in RFC 3339 format.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * Email of the employee
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Given (first) name of the employee.
    */
  var first_name: js.UndefOr[String] = js.native
  /**
    * UUID for this `Employee`.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Family (last) name of the employee
    */
  var last_name: js.UndefOr[String] = js.native
  /**
    * A list of location IDs where this employee has access.
    */
  var location_ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Phone number of the employee in E.164 format, i.e. "+12125554250"
    */
  var phone_number: js.UndefOr[String] = js.native
  /**
    * Specifies the status of the employee being fetched. See [EmployeeStatus](#type-employeestatus) for possible values.
    */
  var status: js.UndefOr[StatusEnum] = js.native
  /**
    * A read-only timestamp in RFC 3339 format.
    */
  var updated_at: js.UndefOr[String] = js.native
}

