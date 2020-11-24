package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListLoyaltyProgramsResponse")
@js.native
class ListLoyaltyProgramsResponse () extends js.Object {
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * A list of `LoyaltyProgram` for the merchant.
    */
  var programs: js.UndefOr[js.Array[LoyaltyProgram]] = js.native
}
