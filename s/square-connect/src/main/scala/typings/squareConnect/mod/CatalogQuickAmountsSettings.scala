package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogQuickAmountsSettings")
@js.native
class CatalogQuickAmountsSettings () extends StObject {
  
  /**
    * Represents a set of Quick Amounts at this location.
    */
  var amounts: js.UndefOr[js.Array[CatalogQuickAmount]] = js.native
  
  /**
    * Represents location's eligibility for auto amounts The boolean should be consistent with whether there are AUTO amounts in the `amounts`.
    */
  var eligible_for_auto_amounts: js.UndefOr[Boolean] = js.native
  
  /**
    * Represents the option seller currently uses on Quick Amounts.
    * See [CatalogQuickAmountsSettingsOption](#type-catalogquickamountssettingsoption) for possible values
    */
  var option: String = js.native
}
