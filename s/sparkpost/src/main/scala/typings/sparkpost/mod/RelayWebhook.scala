package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelayWebhook extends StObject {
  
  /** Authentication token to present in the X-MessageSystems-Webhook-Token header of POST requests to target */
  var auth_token: js.UndefOr[String] = js.undefined
  
  /** Restrict which inbound messages will be relayed to the target */
  var `match`: Match
  
  /** User-friendly name  no  example: Inbound Customer Replies */
  var name: js.UndefOr[String] = js.undefined
  
  /** URL of the target to which to POST relay batches */
  var target: String
}
object RelayWebhook {
  
  inline def apply(`match`: Match, target: String): RelayWebhook = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayWebhook]
  }
  
  extension [Self <: RelayWebhook](x: Self) {
    
    inline def setAuth_token(value: String): Self = StObject.set(x, "auth_token", value.asInstanceOf[js.Any])
    
    inline def setAuth_tokenUndefined: Self = StObject.set(x, "auth_token", js.undefined)
    
    inline def setMatch(value: Match): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
