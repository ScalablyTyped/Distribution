package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ChargeRequestAdditionalRecipient")
@js.native
class ChargeRequestAdditionalRecipient () extends StObject {
  
  /**
    * The amount of money distributed to the recipient.
    */
  var amount_money: Money = js.native
  
  /**
    * The description of the additional recipient.
    */
  var description: String = js.native
  
  /**
    * The location ID for a recipient (other than the merchant) receiving a portion of the tender.
    */
  var location_id: String = js.native
}
