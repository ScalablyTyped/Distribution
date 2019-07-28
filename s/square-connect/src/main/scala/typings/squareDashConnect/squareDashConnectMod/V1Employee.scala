package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1EmployeeNs.StatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Employee")
@js.native
class V1Employee () extends js.Object {
  /**
    * The IDs of the locations the employee is allowed to clock in at.
    */
  var authorized_location_ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * The time when the employee entity was created, in ISO 8601 format.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The employee's email address.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * An ID the merchant can set to associate the employee with an entity in another system.
    */
  var external_id: js.UndefOr[String] = js.native
  /**
    * The employee's first name.
    */
  var first_name: String = js.native
  /**
    * The employee's unique ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The employee's last name.
    */
  var last_name: String = js.native
  /**
    * The ids of the employee's associated roles. Currently, you can specify only one or zero roles per employee.
    */
  var role_ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * CWhether the employee is ACTIVE or INACTIVE. Inactive employees cannot sign in to Square Register.Merchants
    * update this field from the Square Dashboard. See [V1EmployeeStatus](#type-v1employeestatus) for possible values.
    */
  var status: js.UndefOr[StatusEnum] = js.native
  /**
    * The time when the employee entity was most recently updated, in ISO 8601 format.
    */
  var updated_at: js.UndefOr[String] = js.native
}

