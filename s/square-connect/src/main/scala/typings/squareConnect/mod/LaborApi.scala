package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LaborApi")
@js.native
/**
  * Constructs a new LaborApi.
  * @param apiClient Optional API client implementation to use, default to ApiClient.instance if unspecified.
  */
class LaborApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  /**
    * Creates a new `BreakType`. A `BreakType` is a template for creating `Break` objects.
    * You must provide the following values in your request to this endpoint:
    * - `location_id` - `break_name` - `expected_duration` - `is_paid`
    * You can only have 3 `BreakType` instances per location. If you attempt to add a 4th `BreakType` for a location,
    * an `INVALID_REQUEST_ERROR` "Exceeded limit of 3 breaks per location." is returned.
    */
  def createBreakType(args: js.Any*): js.Promise[CreateBreakTypeResponse] = js.native
  
  /**
    * Creates a new `Shift`. A `Shift` represents a complete work day for a single employee.
    * You must provide the following values in your request to this endpoint:
    * - `location_id` - `employee_id` - `start_at`
    * An attempt to create a new `Shift` can result in a `BAD_REQUEST` error when: - The `status` of the new `Shift`
    * is `OPEN` and the employee has another shift with an `OPEN` status. - The `start_at` date is in the future - the
    * `start_at` or `end_at` overlaps another shift for the same employee - If `Break`s are set in the request, a break
    * `start_at` must not be before the `Shift.start_at`. A break `end_at` must not be after the `Shift.end_at`.
    */
  def createShift(args: js.Any*): js.Promise[CreateShiftResponse] = js.native
  
  /**
    * Deletes an existing `BreakType`. A `BreakType` can be deleted even if it is referenced from a `Shift`.
    */
  def deleteBreakType(args: js.Any*): js.Promise[DeleteBreakTypeResponse] = js.native
  
  /**
    * Deletes a `Shift`.
    */
  def deleteShift(args: js.Any*): js.Promise[DeleteShiftResponse] = js.native
  
  /**
    * Returns a single `BreakType` specified by id.
    */
  def getBreakType(args: js.Any*): js.Promise[GetBreakTypeResponse] = js.native
  
  /**
    * Returns a single `EmployeeWage` specified by id.
    */
  def getEmployeeWage(args: js.Any*): js.Promise[GetEmployeeWageResponse] = js.native
  
  /**
    * Returns a single `Shift` specified by id.
    */
  def getShift(args: js.Any*): js.Promise[GetShiftResponse] = js.native
  
  /**
    * Returns a paginated list of `BreakType` instances for a business.
    */
  def listBreakTypes(args: js.Any*): js.Promise[ListBreakTypesResponse] = js.native
  
  /**
    * Returns a paginated list of `EmployeeWage` instances for a business.
    */
  def listEmployeeWages(args: js.Any*): js.Promise[ListEmployeeWagesResponse] = js.native
  
  /**
    * Returns a list of `WorkweekConfig` instances for a business.
    */
  def listWorkweekConfigs(args: js.Any*): js.Promise[ListWorkweekConfigsResponse] = js.native
  
  /**
    * Returns a paginated list of `Shift` records for a business.
    * The list to be returned can be filtered by: - Location IDs **and** - employee IDs **and** - shift
    * status (`OPEN`, `CLOSED`) **and** - shift start **and** - shift end **and** - work day details.
    * The list can be sorted by: - `start_at` - `end_at` - `created_at` - `updated_at`.
    */
  def searchShifts(args: js.Any*): js.Promise[SearchShiftsResponse] = js.native
  
  /**
    * Updates an existing `BreakType`.
    */
  def updateBreakType(args: js.Any*): js.Promise[UpdateBreakTypeResponse] = js.native
  
  /**
    * Updates an existing `Shift`. When adding a `Break` to a `Shift`, any earlier `Breaks` in the `Shift` have
    * the `end_at` property set to a valid RFC-3339 datetime string. When closing a `Shift`, all `Break` instances
    * in the shift must be complete with `end_at` set on each `Break`.
    */
  def updateShift(args: js.Any*): js.Promise[UpdateShiftResponse] = js.native
  
  /**
    * Updates a `WorkweekConfig`.
    */
  def updateWorkweekConfig(args: js.Any*): js.Promise[UpdateWorkweekConfigResponse] = js.native
}
