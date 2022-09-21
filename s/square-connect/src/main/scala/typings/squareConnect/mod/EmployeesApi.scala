package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "EmployeesApi")
@js.native
/**
  * Constructs a new EmployeesApi.
  * @param apiClient Optional API client implementation to use, default to ApiClient.instance if unspecified.
  */
open class EmployeesApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  /**
    * Gets a list of `Employee` objects for a business.
    */
  def listEmployees(params: ListEmployeesRequest): js.Promise[ListEmployeesResponse] = js.native
  
  /**
    * Gets an `Employee` by Square-assigned employee `ID` (UUID).
    */
  def retrieveEmployee(id: String): js.Promise[RetrieveEmployeeResponse] = js.native
}
