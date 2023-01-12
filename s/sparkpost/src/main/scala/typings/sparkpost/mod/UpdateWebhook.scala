package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWebhook extends StObject {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** Object containing credentials needed to make authorized POST requests to target */
  var auth_credentials: js.UndefOr[Any] = js.undefined
  
  /** Object containing details needed to request authorization credentials, as necessary */
  var auth_request_details: js.UndefOr[Any] = js.undefined
  
  /** Authentication token to present in the X-MessageSystems-Webhook-Token header of POST requests to target */
  var auth_token: js.UndefOr[String] = js.undefined
  
  /** Type of authentication to be used during POST requests to target */
  var auth_type: js.UndefOr[String] = js.undefined
  
  /** Array of event types this webhook will receive */
  var events: js.UndefOr[js.Array[String]] = js.undefined
  
  /** User-friendly name for webhook */
  var name: js.UndefOr[String] = js.undefined
  
  /** URL of the target to which to POST event batches */
  var target: js.UndefOr[String] = js.undefined
}
object UpdateWebhook {
  
  inline def apply(): UpdateWebhook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWebhook]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWebhook] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAuth_credentials(value: Any): Self = StObject.set(x, "auth_credentials", value.asInstanceOf[js.Any])
    
    inline def setAuth_credentialsUndefined: Self = StObject.set(x, "auth_credentials", js.undefined)
    
    inline def setAuth_request_details(value: Any): Self = StObject.set(x, "auth_request_details", value.asInstanceOf[js.Any])
    
    inline def setAuth_request_detailsUndefined: Self = StObject.set(x, "auth_request_details", js.undefined)
    
    inline def setAuth_token(value: String): Self = StObject.set(x, "auth_token", value.asInstanceOf[js.Any])
    
    inline def setAuth_tokenUndefined: Self = StObject.set(x, "auth_token", js.undefined)
    
    inline def setAuth_type(value: String): Self = StObject.set(x, "auth_type", value.asInstanceOf[js.Any])
    
    inline def setAuth_typeUndefined: Self = StObject.set(x, "auth_type", js.undefined)
    
    inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
