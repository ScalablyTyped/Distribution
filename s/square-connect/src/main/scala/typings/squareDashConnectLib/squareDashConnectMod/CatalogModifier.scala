package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogModifier")
@js.native
class CatalogModifier () extends js.Object {
  /**
    * The modifier's name. Searchable. This field has max length of 255 Unicode code points.
    */
  var name: js.UndefOr[java.lang.String] = js.native
  /**
    * The modifier's price.
    */
  var price_money: js.UndefOr[Money] = js.native
}

