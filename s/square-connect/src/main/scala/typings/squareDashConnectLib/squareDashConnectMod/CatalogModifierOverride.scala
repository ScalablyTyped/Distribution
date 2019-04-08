package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogModifierOverride")
@js.native
class CatalogModifierOverride () extends js.Object {
  /**
    * The ID of the [CatalogModifier](#type-catalogmodifier) whose default behavior is being overridden.
    */
  var modifier_id: java.lang.String = js.native
  /**
    * If `true`, this [CatalogModifier](#type-catalogmodifier) should be selected by default for this
    * [CatalogItem](#type-catalogitem).
    */
  var on_by_default: js.UndefOr[scala.Boolean] = js.native
}

