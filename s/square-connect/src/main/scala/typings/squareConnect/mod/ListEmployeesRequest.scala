package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListEmployeesRequest")
@js.native
class ListEmployeesRequest () extends js.Object {
  
  /**
    * The token required to retrieve the specified page of results.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The number of employees to be returned on each page.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Filter employees returned to only those that are associated with the specified location.
    */
  var location_id: js.UndefOr[String] = js.native
  
  /**
    * Specifies the EmployeeStatus to filter the employee by. See [EmployeeStatus](#type-employeestatus) for possible values.
    */
  var status: js.UndefOr[ActivityStatusType] = js.native
}
