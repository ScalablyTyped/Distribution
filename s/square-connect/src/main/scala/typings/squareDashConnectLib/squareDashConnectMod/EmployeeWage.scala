package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "EmployeeWage")
@js.native
class EmployeeWage () extends js.Object {
  /**
    * The `Employee` that this wage is assigned to.
    */
  var employee_id: java.lang.String = js.native
  /**
    * Can be a custom-set hourly wage or the calculated effective hourly wage based on annual wage and hours worked per
    * week.
    */
  var hourly_rate: js.UndefOr[Money] = js.native
  /**
    * UUID for this object.
    */
  var id: js.UndefOr[java.lang.String] = js.native
  /**
    * The job title that this wage relates to.
    */
  var title: js.UndefOr[java.lang.String] = js.native
}

