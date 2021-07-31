package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "GetEmployeeWageResponse")
@js.native
class GetEmployeeWageResponse () extends StObject {
  
  /**
    * The requested `EmployeeWage` object.
    */
  var employee_wage: js.UndefOr[EmployeeWage] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}
