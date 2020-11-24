package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "InvoiceSort")
@js.native
class InvoiceSort () extends js.Object {
  
  /**
    * The field to sort on. See [InvoiceSortField](#type-invoicesortfield) for possible values.
    */
  var field: String = js.native
  
  /**
    * The order to use for sorting the results. See [SortOrder](#type-sortorder) for possible values.
    */
  var order: js.UndefOr[String] = js.native
}
