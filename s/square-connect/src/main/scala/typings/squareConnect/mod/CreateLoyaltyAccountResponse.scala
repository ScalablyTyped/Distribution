package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateLoyaltyAccountResponse")
@js.native
open class CreateLoyaltyAccountResponse () extends StObject {
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The newly created loyalty account.
    */
  var loyalty_account: js.UndefOr[LoyaltyAccount] = js.native
}
