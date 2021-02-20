package typings.squareConnect.mod

import typings.squareConnect.squareConnectStrings.CATEGORY
import typings.squareConnect.squareConnectStrings.DISCOUNT
import typings.squareConnect.squareConnectStrings.IMAGE
import typings.squareConnect.squareConnectStrings.ITEM
import typings.squareConnect.squareConnectStrings.ITEM_VARIATION
import typings.squareConnect.squareConnectStrings.MODIFIER
import typings.squareConnect.squareConnectStrings.MODIFIER_LIST
import typings.squareConnect.squareConnectStrings.TAX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListCatalogRequest")
@js.native
class ListCatalogRequest () extends StObject {
  
  /**
    * TThe pagination cursor returned in the previous response. Leave unset for an initial request.
    * See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * An optional case-insensitive, comma-separated list of object types to retrieve, for example `ITEM,ITEM_VARIATION,CATEGORY,IMAGE`.
    */
  var types: js.UndefOr[
    ITEM | ITEM_VARIATION | CATEGORY | DISCOUNT | TAX | MODIFIER | MODIFIER_LIST | IMAGE
  ] = js.native
}
