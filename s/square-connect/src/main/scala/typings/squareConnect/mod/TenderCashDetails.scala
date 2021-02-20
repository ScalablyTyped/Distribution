package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "TenderCashDetails")
@js.native
class TenderCashDetails () extends StObject {
  
  /**
    * The total amount of cash provided by the buyer, before change is given.
    */
  var buyer_tendered_money: js.UndefOr[Money] = js.native
  
  /**
    * The amount of change returned to the buyer.
    */
  var change_back_money: js.UndefOr[Money] = js.native
}
