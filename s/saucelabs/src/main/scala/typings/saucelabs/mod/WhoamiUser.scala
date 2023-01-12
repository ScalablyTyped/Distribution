package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhoamiUser
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var access_key: js.UndefOr[String] = js.undefined
  
  var ancestor_concurrency_limit: js.UndefOr[ConcurrencyLimit] = js.undefined
  
  var can_run_manual: js.UndefOr[Boolean] = js.undefined
  
  var concurrency_limit: js.UndefOr[ConcurrencyLimit] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var first_name: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var last_name: js.UndefOr[String] = js.undefined
  
  var manual_minutes: js.UndefOr[Double] = js.undefined
  
  var minutes: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var parent: js.UndefOr[js.Object] = js.undefined
  
  var subscribed: js.UndefOr[Boolean] = js.undefined
  
  var user_type: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
  
  var verified: js.UndefOr[Boolean] = js.undefined
}
object WhoamiUser {
  
  inline def apply(): WhoamiUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhoamiUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WhoamiUser] (val x: Self) extends AnyVal {
    
    inline def setAccess_key(value: String): Self = StObject.set(x, "access_key", value.asInstanceOf[js.Any])
    
    inline def setAccess_keyUndefined: Self = StObject.set(x, "access_key", js.undefined)
    
    inline def setAncestor_concurrency_limit(value: ConcurrencyLimit): Self = StObject.set(x, "ancestor_concurrency_limit", value.asInstanceOf[js.Any])
    
    inline def setAncestor_concurrency_limitUndefined: Self = StObject.set(x, "ancestor_concurrency_limit", js.undefined)
    
    inline def setCan_run_manual(value: Boolean): Self = StObject.set(x, "can_run_manual", value.asInstanceOf[js.Any])
    
    inline def setCan_run_manualUndefined: Self = StObject.set(x, "can_run_manual", js.undefined)
    
    inline def setConcurrency_limit(value: ConcurrencyLimit): Self = StObject.set(x, "concurrency_limit", value.asInstanceOf[js.Any])
    
    inline def setConcurrency_limitUndefined: Self = StObject.set(x, "concurrency_limit", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    inline def setManual_minutes(value: Double): Self = StObject.set(x, "manual_minutes", value.asInstanceOf[js.Any])
    
    inline def setManual_minutesUndefined: Self = StObject.set(x, "manual_minutes", js.undefined)
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: js.Object): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
    
    inline def setSubscribedUndefined: Self = StObject.set(x, "subscribed", js.undefined)
    
    inline def setUser_type(value: String): Self = StObject.set(x, "user_type", value.asInstanceOf[js.Any])
    
    inline def setUser_typeUndefined: Self = StObject.set(x, "user_type", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    inline def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
  }
}
