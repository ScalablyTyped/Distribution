package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogModifierOverride")
@js.native
class CatalogModifierOverride () extends js.Object {
  
  /**
    * The ID of the `CatalogModifier` whose default behavior is being overridden.
    */
  var modifier_id: String = js.native
  
  /**
    * If `true`, this `CatalogModifier` should be selected by default for this `CatalogItem`.
    */
  var on_by_default: js.UndefOr[Boolean] = js.native
}
