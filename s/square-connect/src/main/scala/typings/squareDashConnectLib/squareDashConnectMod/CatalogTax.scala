package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogTax")
@js.native
class CatalogTax () extends js.Object {
  /**
    * If `true`, the fee applies to custom amounts entered into the Square Point of Sale app that are not associated
    * with a particular [CatalogItem](#type-catalogitem).
    */
  var applies_to_custom_amounts: js.UndefOr[scala.Boolean] = js.native
  /**
    * Whether the tax is calculated based on a payment's subtotal or total. See
    * [TaxCalculationPhase](#type-taxcalculationphase) for all possible values.
    */
  var calculation_phase: js.UndefOr[squareDashConnectLib.squareDashConnectMod.CatalogTaxNs.CalculationPhaseEnum] = js.native
  /**
    * If `true`, the tax will be shown as enabled in the Square Point of Sale app.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.native
  /**
    * Whether the tax is `ADDITIVE` or `INCLUSIVE`. See [TaxInclusionType](#type-taxinclusiontype) for all possible
    * values.
    */
  var inclusion_type: js.UndefOr[squareDashConnectLib.squareDashConnectMod.CatalogTaxNs.InclusionTypeEnum] = js.native
  /**
    * The tax's name. Searchable. This field has max length of 255 Unicode code points.
    */
  var name: js.UndefOr[java.lang.String] = js.native
  /**
    * The percentage of the tax in decimal form, using a `'.'` as the decimal separator and without a `'%'` sign. A
    * value of `7.5` corresponds to 7.5%.
    */
  var percentage: js.UndefOr[java.lang.String] = js.native
}

