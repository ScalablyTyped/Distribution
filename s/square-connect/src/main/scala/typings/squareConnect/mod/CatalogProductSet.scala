package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogProductSet")
@js.native
open class CatalogProductSet () extends StObject {
  
  /**
    * If set to `true`, the product set will include every item in the catalog.
    * Only one of `product_ids_all`, `product_ids_any`, or `all_products` can be set.
    */
  var all_products: js.UndefOr[Boolean] = js.native
  
  /**
    * User-defined name for the product set. For example, "Clearance Items" or "Winter Sale Items".
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Unique IDs for any `CatalogObject` included in this product set. All objects in this set must be included in an
    * order for a pricing rule to apply. Only one of `product_ids_all`, `product_ids_any`, or `all_products` can be set.
    * Max: 500 catalog object IDs.
    */
  var product_ids_all: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Unique IDs for any `CatalogObject` included in this product set. Any number of these catalog objects can be in
    * an order for a pricing rule to apply. This can be used with `product_ids_all` in a parent `CatalogProductSet`
    * to match groups of products for a bulk discount, such as a discount for an entree and side combo.
    * Only one of `product_ids_all`, `product_ids_any`, or `all_products` can be set. Max: 500 catalog object IDs.
    */
  var product_ids_any: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If set, there must be exactly this many items from `products_any` or `products_all` in the cart for the discount to apply.
    * Cannot be combined with either `quantity_min` or `quantity_max`.
    */
  var quantity_exact: js.UndefOr[Double] = js.native
  
  /**
    * If set, the pricing rule will apply to a maximum of this many items from `products_any` or `products_all`.
    */
  var quantity_max: js.UndefOr[Double] = js.native
  
  /**
    * If set, there must be at least this many items from `products_any` or `products_all` in a cart for the discount to apply.
    * See `quantity_exact`. Defaults to 0 if `quantity_exact`, `quantity_min` and `quantity_max` are all unspecified.
    */
  var quantity_min: js.UndefOr[Double] = js.native
}
