package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderLineItemTax")
@js.native
class OrderLineItemTax () extends js.Object {
  /**
    * The amount of the money applied by the tax in an order.
    */
  var applied_money: js.UndefOr[Money] = js.native
  /**
    * The catalog object id referencing [CatalogTax](#type-catalogtax).
    */
  var catalog_object_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The tax's name.
    */
  var name: js.UndefOr[java.lang.String] = js.native
  /**
    * The percentage of the tax, as a string representation of a decimal number.  A value of `7.25` corresponds to a
    * percentage of 7.25%.
    */
  var percentage: js.UndefOr[java.lang.String] = js.native
  /**
    * Indicates the level at which the tax applies. This field is set by the server. If set in a CreateOrder request,
    * it will be ignored on write. See [OrderLineItemTaxScope](#type-orderlineitemtaxscope) for possible values.
    */
  var scope: js.UndefOr[squareDashConnectLib.squareDashConnectMod.OrderLineItemTaxNs.ScopeEnum] = js.native
  /**
    * Indicates the calculation method used to apply the tax. See [OrderLineItemTaxType](#type-orderlineitemtaxtype)
    * for possible values.
    */
  var `type`: js.UndefOr[squareDashConnectLib.squareDashConnectMod.OrderLineItemTaxNs.TypeEnum] = js.native
}

