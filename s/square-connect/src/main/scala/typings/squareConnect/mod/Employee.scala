package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "Employee")
@js.native
class Employee () extends StObject {
  
  /**
    * A read-only timestamp in RFC 3339 format.
    */
  var created_at: js.UndefOr[String] = js.native
  
  /**
    * The employee's email address
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The employee's first name.
    */
  var first_name: js.UndefOr[String] = js.native
  
  /**
    * UUID for this object.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Whether this employee is the owner of the merchant. Each merchant has one owner employee, and that employee has full authority over the account.
    */
  var is_owner: js.UndefOr[Boolean] = js.native
  
  /**
    * The employee's last name.
    */
  var last_name: js.UndefOr[String] = js.native
  
  /**
    * A list of location IDs where this employee has access to.
    */
  var location_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The employee's phone number in E.164 format, i.e. "+12125554250"
    */
  var phone_number: js.UndefOr[String] = js.native
  
  /**
    * Specifies the status of the employees being fetched. See [EmployeeStatus](#type-employeestatus) for possible values.
    */
  var status: js.UndefOr[ActivityStatusType] = js.native
  
  /**
    * A read-only timestamp in RFC 3339 format.
    */
  var updated_at: js.UndefOr[String] = js.native
}
