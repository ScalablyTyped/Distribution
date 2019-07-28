package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1FeeNs.AdjustmentTypeEnum
import typings.squareDashConnect.squareDashConnectMod.V1FeeNs.CalculationPhaseEnum
import typings.squareDashConnect.squareDashConnectMod.V1FeeNs.InclusionTypeEnum
import typings.squareDashConnect.squareDashConnectMod.V1FeeNs.TypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Fee")
@js.native
class V1Fee () extends js.Object {
  /**
    * The type of adjustment the fee applies to a payment. Currently, this value is TAX for all fees.
    * See [V1FeeAdjustmentType](#type-v1feeadjustmenttype) for possible values.
    */
  var adjustment_type: js.UndefOr[AdjustmentTypeEnum] = js.native
  /**
    * If true, the fee applies to custom amounts entered into Square Register that are not associated with a particular item.
    */
  var applies_to_custom_amounts: js.UndefOr[Boolean] = js.native
  /**
    * Forthcoming See [V1FeeCalculationPhase](#type-v1feecalculationphase) for possible values.
    */
  var calculation_phase: js.UndefOr[CalculationPhaseEnum] = js.native
  /**
    * If true, the fee is applied to all appropriate items. If false, the fee is not applied at all.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The fee's unique ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether the fee is ADDITIVE or INCLUSIVE. See [V1FeeInclusionType](#type-v1feeinclusiontype) for possible values.
    */
  var inclusion_type: js.UndefOr[InclusionTypeEnum] = js.native
  /**
    * The fee's name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The rate of the fee, as a string representation of a decimal number. A value of 0.07 corresponds to a rate of 7%.
    */
  var rate: js.UndefOr[String] = js.native
  /**
    * In countries with multiple classifications for sales taxes, indicates which classification the fee falls under.
    * Currently relevant only to Canadian merchants. See [V1FeeType](#type-v1feetype) for possible values.
    */
  var `type`: js.UndefOr[TypeEnum] = js.native
  /**
    * The ID of the CatalogObject in the Connect v2 API. Objects that are shared across multiple locations share the same v2 ID.
    */
  var v2_id: js.UndefOr[String] = js.native
}

