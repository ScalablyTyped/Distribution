package typings.squareConnect.mod

import typings.squareConnect.squareConnectStrings.CREATED_AT
import typings.squareConnect.squareConnectStrings.END_AT
import typings.squareConnect.squareConnectStrings.START_AT
import typings.squareConnect.squareConnectStrings.UPDATED_AT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ShiftSort")
@js.native
class ShiftSort () extends StObject {
  
  /**
    * The field to sort on. See [ShiftSortField](#type-shiftsortfield) for possible values.
    */
  var field: js.UndefOr[START_AT | END_AT | CREATED_AT | UPDATED_AT] = js.native
  
  /**
    * The order in which results are returned. Defaults to DESC. See [SortOrder](#type-sortorder) for possible values.
    */
  var order: js.UndefOr[SortOrderType] = js.native
}
