package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "RetrieveMerchantResponse")
@js.native
class RetrieveMerchantResponse () extends StObject {
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * The requested `Merchant` object.
    */
  var merchant: js.UndefOr[Merchant] = js.native
}
