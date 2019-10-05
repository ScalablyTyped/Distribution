package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.ShiftFilter.StatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ShiftFilter")
@js.native
class ShiftFilter () extends js.Object {
  /**
    * Fetch shifts for the specified employee.
    */
  var employee_id: js.UndefOr[js.Array[String]] = js.native
  /**
    * Fetch the `Shift`s that end in the time range - Inclusive.
    */
  var end: js.UndefOr[TimeRange] = js.native
  /**
    * Fetch shifts for the specified location.
    */
  var location_id: js.UndefOr[js.Array[String]] = js.native
  /**
    * Fetch `Shift`s that start in the time range - Inclusive.
    */
  var start: js.UndefOr[TimeRange] = js.native
  /**
    * Fetch a `Shift` instance by `Shift.status`. See [ShiftFilterStatus](#type-shiftfilterstatus) for possible values.
    */
  var status: js.UndefOr[StatusEnum] = js.native
  /**
    * Fetch the `Shift`s based on workday date range.
    */
  var workday: js.UndefOr[ShiftWorkday] = js.native
}

@JSImport("square-connect", "ShiftFilter")
@js.native
object ShiftFilter extends js.Object {
  @js.native
  sealed trait StatusEnum extends js.Object
  
  @js.native
  object StatusEnum extends js.Object {
    @js.native
    sealed trait CLOSED extends StatusEnum
    
    @js.native
    sealed trait OPEN extends StatusEnum
    
    /* "CLOSED" */ val CLOSED: typings.squareDashConnect.squareDashConnectMod.ShiftFilter.StatusEnum.CLOSED with String = js.native
    /* "OPEN" */ val OPEN: typings.squareDashConnect.squareDashConnectMod.ShiftFilter.StatusEnum.OPEN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StatusEnum with String] = js.native
  }
  
}

