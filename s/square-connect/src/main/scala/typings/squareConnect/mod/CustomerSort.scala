package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CustomerSort")
@js.native
class CustomerSort () extends StObject {
  
  /**
    * Use one or more customer attributes as the sort key to sort searched customer profiles.
    * For example, use creation date (`created_at`) of customers or default attributes as the sort key.
    * Default: `DEFAULT`. See [CustomerSortField](#type-customersortfield) for possible values.
    */
  var field: js.UndefOr[String] = js.native
  
  /**
    * Indicates the order in which results should be sorted based on the sort field value.
    * Strings use standard alphabetic comparison to determine order. Strings representing numbers are sorted as strings.
    * Default: `ASC`. See [SortOrder](#type-sortorder) for possible values.
    */
  var order: js.UndefOr[SortOrderType] = js.native
}
