package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchOrdersDateTimeFilter")
@js.native
class SearchOrdersDateTimeFilter () extends StObject {
  
  /**
    * Time range for filtering on the `closed_at` timestamp.
    * If you use this value, you must also set the `sort_field` in the OrdersSearchSort object to `CLOSED_AT`.
    */
  var closed_at: js.UndefOr[TimeRange] = js.native
  
  /**
    * Time range for filtering on the `created_at` timestamp.
    * If you use this value, you must also set the `sort_field` in the OrdersSearchSort object to `CREATED_AT`.
    */
  var created_at: js.UndefOr[TimeRange] = js.native
  
  /**
    * Time range for filtering on the `updated_at` timestamp.
    * If you use this value, you must also set the `sort_field` in the OrdersSearchSort object to `UPDATED_AT`.
    */
  var updated_at: js.UndefOr[TimeRange] = js.native
}
