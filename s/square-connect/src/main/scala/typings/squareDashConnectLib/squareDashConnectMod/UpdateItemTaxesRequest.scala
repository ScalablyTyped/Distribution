package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "UpdateItemTaxesRequest")
@js.native
class UpdateItemTaxesRequest () extends js.Object {
  /**
    * The [CatalogItem](#type-catalogitem)s whose enabled/disabled [CatalogTax](#type-catalogtax)es are being updated.
    */
  var item_ids: js.Array[java.lang.String] = js.native
  /**
    * The set of [CatalogTax](#type-catalogtax)es (referenced by ID) to disable for the
    * [CatalogItem](#type-catalogitem).
    */
  var taxes_to_disable: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * The set of [CatalogTax](#type-catalogtax)es (referenced by ID) to enable for the
    * [CatalogItem](#type-catalogitem).
    */
  var taxes_to_enable: js.UndefOr[js.Array[java.lang.String]] = js.native
}

