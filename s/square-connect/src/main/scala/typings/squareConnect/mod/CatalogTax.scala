package typings.squareConnect.mod

import typings.squareConnect.squareConnectStrings.TAX_SUBTOTAL_PHASE
import typings.squareConnect.squareConnectStrings.TAX_TOTAL_PHASE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogTax")
@js.native
open class CatalogTax () extends StObject {
  
  /**
    * If `true`, the fee applies to custom amounts entered into the Square Point of Sale app that are not associated
    * with a particular `CatalogItem`.
    */
  var applies_to_custom_amounts: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the tax is calculated based on a payment's subtotal or total.
    * See [TaxCalculationPhase](#type-taxcalculationphase) for possible values.
    */
  var calculation_phase: js.UndefOr[TAX_SUBTOTAL_PHASE | TAX_TOTAL_PHASE] = js.native
  
  /**
    * A Boolean flag to indicate whether the tax is displayed as enabled (`true`) in the Square Point of Sale app or not (`false`).
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the tax is `ADDITIVE` or `INCLUSIVE`. See [TaxInclusionType](#type-taxinclusiontype) for possible values.
    */
  var inclusion_type: js.UndefOr[TaxType] = js.native
  
  /**
    * The tax's name. This is a searchable attribute for use in applicable query filters, and its value length is of Unicode code points.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The percentage of the tax in decimal form, using a '.' as the decimal separator and without a '%' sign.
    * A value of `7.5` corresponds to 7.5%.
    */
  var percentage: js.UndefOr[String] = js.native
}
