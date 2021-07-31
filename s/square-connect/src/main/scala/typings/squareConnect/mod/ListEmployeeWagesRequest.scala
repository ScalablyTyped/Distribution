package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListEmployeeWagesRequest")
@js.native
class ListEmployeeWagesRequest () extends StObject {
  
  /**
    * Pointer to the next page of Employee Wage results to fetch.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Filter wages returned to only those that are associated with the specified employee.
    */
  var employee_id: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of Employee Wages to return per page. Can range between 1 and 200. The default is the maximum at
    * 200.
    */
  var limit: js.UndefOr[Double] = js.native
}
