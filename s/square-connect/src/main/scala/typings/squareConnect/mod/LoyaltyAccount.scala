package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LoyaltyAccount")
@js.native
class LoyaltyAccount () extends StObject {
  
  /**
    * The available point balance in the loyalty account.
    * Your application should be able to handle loyalty accounts that have a negative point balance (`balance` is less than 0).
    * This might occur if a seller makes a manual adjustment or as a result of a refund or exchange.
    */
  var balance: js.UndefOr[Double] = js.native
  
  /**
    * The timestamp when the loyalty account was created, in RFC 3339 format.
    */
  var created_at: js.UndefOr[String] = js.native
  
  /**
    * The Square-assigned ID of the `customer` that is associated with the account.
    */
  var customer_id: js.UndefOr[String] = js.native
  
  /**
    * The timestamp when enrollment occurred, in RFC 3339 format.
    */
  var enrolled_at: js.UndefOr[String] = js.native
  
  /**
    * The Square-assigned ID of the loyalty account.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The total points accrued during the lifetime of the account.
    */
  var lifetime_points: js.UndefOr[Double] = js.native
  
  /**
    * The list of mappings that the account is associated with.
    * Currently, a buyer can only be mapped to a loyalty account using a phone number.
    * Therefore, the list can only have one mapping.
    */
  var mappings: js.Array[LoyaltyAccountMapping] = js.native
  
  /**
    * The Square-assigned ID of the `loyalty program` to which the account belongs.
    */
  var program_id: String = js.native
  
  /**
    * The timestamp when the loyalty account was last updated, in RFC 3339 format.
    */
  var updated_at: js.UndefOr[String] = js.native
}
