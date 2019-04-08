package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CreateOrderRequestTax")
@js.native
class CreateOrderRequestTax () extends js.Object {
  /**
    * Only used for catalog taxes. The catalog object ID of an existing [CatalogTax](#type-catalogtax).  Do not provide
    * a value for this field if you provide values in other fields for an ad hoc tax.
    */
  var catalog_object_id: js.UndefOr[java.lang.String] = js.native
  /**
    * Only used for ad hoc taxes. The tax's name.  Do not provide a value for this field if you set
    * `catalog_object_id`.
    */
  var name: js.UndefOr[java.lang.String] = js.native
  /**
    * Only used for ad hoc taxes. The percentage of the tax, as a string representation of a decimal number.  A value
    * of `7.25` corresponds to a percentage of 7.25%. This value range between 0.0 up to 100.0
    */
  var percentage: js.UndefOr[java.lang.String] = js.native
  /**
    * Only used for ad hoc taxes. Indicates the calculation method used to apply the line item tax.  Default:
    * `ADDITIVE`; See [OrderLineItemTaxType](#type-orderlineitemtaxtype) for possible values.
    */
  var `type`: js.UndefOr[squareDashConnectLib.squareDashConnectMod.CreateOrderRequestTaxNs.TypeEnum] = js.native
}

