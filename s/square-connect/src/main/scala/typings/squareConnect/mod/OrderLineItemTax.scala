package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderLineItemTax")
@js.native
class OrderLineItemTax () extends js.Object {
  /**
    * The amount of the money applied by the tax in the order.
    */
  var applied_money: js.UndefOr[Money] = js.native
  /**
    * The catalog object id referencing [CatalogTax](#type-catalogtax).
    */
  var catalog_object_id: js.UndefOr[String] = js.native
  /**
    * The tax's name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The percentage of the tax, as a string representation of a decimal number.
    * For example, a value of "7.25" corresponds to a percentage of 7.25%.
    */
  var percentage: js.UndefOr[String] = js.native
  /**
    * Indicates the level at which the tax applies. For `ORDER` scoped taxes, Square generates references in
    * `applied_taxes` on all order line items that do not have them. For `LINE_ITEM` scoped taxes, the tax will only
    * apply to line items with references in their `applied_taxes` field. This field is immutable.
    * To change the scope, you must delete the tax and re-add it as a new tax.
    * See [OrderLineItemTaxScope](#type-orderlineitemtaxscope) for possible values.
    */
  var scope: js.UndefOr[TaxApplicationScopeType] = js.native
  /**
    * Indicates the calculation method used to apply the tax.
    * See [OrderLineItemTaxType](#type-orderlineitemtaxtype) for possible values.
    */
  var `type`: js.UndefOr[TaxType] = js.native
  /**
    * Unique ID that identifies the tax only within this order.
    */
  var uid: js.UndefOr[String] = js.native
}

