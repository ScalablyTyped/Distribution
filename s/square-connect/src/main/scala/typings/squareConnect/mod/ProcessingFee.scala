package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ProcessingFee")
@js.native
class ProcessingFee () extends StObject {
  
  /**
    * The fee amount assessed or adjusted by Square. May be negative.
    * Positive values represent funds being assessed, while negative values represent funds being returned.
    */
  var amount_money: js.UndefOr[Money] = js.native
  
  /**
    * Timestamp of when the fee takes effect, in RFC 3339 format.
    */
  var effective_at: js.UndefOr[String] = js.native
  
  /**
    * The type of fee assessed or adjusted. Can be one of: `INITIAL`, `ADJUSTMENT`.
    */
  var `type`: js.UndefOr[String] = js.native
}
