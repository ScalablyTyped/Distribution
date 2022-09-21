package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "TipSettings")
@js.native
open class TipSettings () extends StObject {
  
  /**
    * Indicates whether tipping is enabled for this checkout. Defaults to false.
    */
  var allow_tipping: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether custom tip amounts are allowed during the checkout flow. Defaults to false.
    */
  var custom_tip_field: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether tip options should be presented on their own screen before presenting the signature
    * screen during card payment. Defaults to false.
    */
  var separate_tip_screen: js.UndefOr[Boolean] = js.native
}
