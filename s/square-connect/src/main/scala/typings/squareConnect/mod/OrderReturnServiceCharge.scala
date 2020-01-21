package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderReturnServiceCharge")
@js.native
class OrderReturnServiceCharge () extends js.Object {
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
    * The list of references to `OrderReturnTax` entities applied to the `OrderReturnServiceCharge`.
    * Each `OrderLineItemAppliedTax` has a `tax_uid` that references the `uid` of a top-level `OrderReturnTax` that
    * is being applied to the `OrderReturnServiceCharge`. On reads, the amount applied is populated.
    */
  var applied_taxes: js.UndefOr[js.Array[OrderLineItemAppliedTax]] = js.native
  /**
    * The calculation phase after which to apply the service charge.
    * See [OrderServiceChargeCalculationPhase](#type-orderservicechargecalculationphase) for possible values.
    */
  var calculation_phase: js.UndefOr[String] = js.native
  /**
    * The catalog object ID of the associated [CatalogServiceCharge](#type-catalogservicecharge).
    */
  var catalog_object_id: js.UndefOr[String] = js.native
  /**
    * The name of the service charge.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The percentage of the service charge, as a string representation of a decimal number.
    * For example, a value of "7.25" corresponds to a percentage of 7.25%.
    * Exactly one of `percentage` or `amount_money` should be set.
    */
  var percentage: js.UndefOr[String] = js.native
  /**
    * Taxes applied to the `OrderReturnServiceCharge`. By default, return-level taxes apply to `OrderReturnServiceCharge`s
    * calculated in the `SUBTOTAL_PHASE` if `taxable` is set to `true`. On read or retrieve, this list includes both
    * item-level taxes and any return-level taxes apportioned to this item.
    * This field has been deprecated in favour of `applied_taxes`.
    */
  var return_taxes: js.UndefOr[js.Array[OrderReturnTax]] = js.native
  /**
    * `uid` of the Service Charge from the Order containing the original charge of the service charge.
    * `source_service_charge_uid` is `null` for unlinked returns.
    */
  var source_service_charge_uid: js.UndefOr[String] = js.native
  /**
    * Indicates whether the surcharge can be taxed. Service charges calculated in the `TOTAL_PHASE` cannot be marked as taxable.
    */
  var taxable: js.UndefOr[Boolean] = js.native
  /**
    * The total amount of money to collect for the service charge.
    * @note if an inclusive tax is applied to the service charge, `total_money` does not equal `applied_money`
    * plus `total_tax_money` since the inclusive tax amount will already be included in both `applied_money`
    * and `total_tax_money`.
    */
  var total_money: js.UndefOr[Money] = js.native
  /**
    * The total amount of tax money to collect for the service charge.
    */
  var total_tax_money: js.UndefOr[Money] = js.native
  /**
    * Unique ID that identifies the return service charge only within this order.
    */
  var uid: js.UndefOr[String] = js.native
}

