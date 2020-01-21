package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderServiceCharge")
@js.native
class OrderServiceCharge () extends js.Object {
  /**
    * The amount of a non-percentage based service charge. Exactly one of `percentage` or `amount_money` should be set.
    */
  var amount_money: js.UndefOr[Money] = js.native
  /**
    * The amount of money applied to the order by the service charge, including any inclusive tax amounts, as calculated by Square.
    * - For fixed-amount service charges, `applied_money` is equal to `amount_money`.
    * - For percentage-based service charges, `applied_money` is the money calculated using the percentage.
    */
  var applied_money: js.UndefOr[Money] = js.native
  /**
    * The list of references to taxes applied to this service charge.
    * Each `OrderLineItemAppliedTax` has a `tax_uid` that references the `uid` of a top-level `OrderLineItemTax` that
    * is being applied to this service charge. On reads, the amount applied is populated. An `OrderLineItemAppliedTax`
    * will be automatically created on every taxable service charge for all `ORDER` scoped taxes that are added to the order.
    * `OrderLineItemAppliedTax` records for `LINE_ITEM` scoped taxes must be added in requests for the tax to apply to
    * any taxable service charge. Taxable service charges have the `taxable` field set to true and calculated in
    * the `SUBTOTAL_PHASE`. To change the amount of a tax, modify the referenced top-level tax.
    */
  var applied_taxes: js.UndefOr[js.Array[OrderLineItemAppliedTax]] = js.native
  /**
    * The calculation phase at which to apply the service charge.
    * See [OrderServiceChargeCalculationPhase](#type-orderservicechargecalculationphase) for possible values.
    */
  var calculation_phase: js.UndefOr[String] = js.native
  /**
    * The catalog object ID referencing the service charge [CatalogObject](#type-catalogobject).
    */
  var catalog_object_id: js.UndefOr[String] = js.native
  /**
    * The name of the service charge.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The service charge percentage as a string representation of a decimal number.
    * For example, "7.25" indicates a service charge of 7.25%. Exactly 1 of `percentage` or `amount_money` should be set.
    */
  var percentage: js.UndefOr[String] = js.native
  /**
    * Indicates whether the service charge can be taxed. If set to `true`, order-level taxes automatically apply to
    * the service charge. Note that service charges calculated in the `TOTAL_PHASE` cannot be marked as taxable.
    */
  var taxable: js.UndefOr[Boolean] = js.native
  /**
    * A list of taxes applied to this service charge. On read or retrieve, this list includes both item-level taxes
    * and any order-level taxes apportioned to this service charge. When creating an Order, set your service charge-level
    * taxes in this list. By default, order-level taxes apply to service charges calculated in the `SUBTOTAL_PHASE`
    * if `taxable` is set to `true`. This field has been deprecated in favour of `applied_taxes`.
    * Usage of both this field and `applied_taxes` when creating an order will result in an error.
    * Usage of this field when sending requests to the UpdateOrder endpoint will result in an error.
    */
  var taxes: js.UndefOr[js.Array[OrderLineItemTax]] = js.native
  /**
    * The total amount of money to collect for the service charge.
    * @note if an inclusive tax is applied to the service charge, `total_money` __does not__ equal `applied_money` plus
    * `total_tax_money` since the inclusive tax amount will already be included in both `applied_money` and `total_tax_money`.
    */
  var total_money: js.UndefOr[Money] = js.native
  /**
    * The total amount of tax money to collect for the service charge.
    */
  var total_tax_money: js.UndefOr[Money] = js.native
  /**
    * Unique ID that identifies the service charge only within this order.
    */
  var uid: js.UndefOr[String] = js.native
}

