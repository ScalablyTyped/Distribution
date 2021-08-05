package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.saucelabsStrings.marketing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var access_key: js.UndefOr[String] = js.undefined
  
  var ancestor_allows_subaccounts: js.UndefOr[Boolean] = js.undefined
  
  var ancestor_concurrency_limit: js.UndefOr[ConcurrencyLimit] = js.undefined
  
  var can_run_manual: js.UndefOr[Boolean] = js.undefined
  
  var concurrency_limit: js.UndefOr[ConcurrencyLimit] = js.undefined
  
  var creation_time: js.UndefOr[String] = js.undefined
  
  var domain: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var entity_type: js.UndefOr[String] = js.undefined
  
  var first_name: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var is_admin: js.UndefOr[String] = js.undefined
  
  var is_sso: js.UndefOr[Boolean] = js.undefined
  
  var last_name: js.UndefOr[String] = js.undefined
  
  var manual_minutes: js.UndefOr[Double] = js.undefined
  
  var minutes: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var parent: js.UndefOr[String] = js.undefined
  
  var prevent_emails: js.UndefOr[js.Array[marketing]] = js.undefined
  
  var subscribed: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var user_type: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
  
  var verified: js.UndefOr[Boolean] = js.undefined
  
  var vm_lockdown: js.UndefOr[Boolean] = js.undefined
}
object User {
  
  inline def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setAccess_key(value: String): Self = StObject.set(x, "access_key", value.asInstanceOf[js.Any])
    
    inline def setAccess_keyUndefined: Self = StObject.set(x, "access_key", js.undefined)
    
    inline def setAncestor_allows_subaccounts(value: Boolean): Self = StObject.set(x, "ancestor_allows_subaccounts", value.asInstanceOf[js.Any])
    
    inline def setAncestor_allows_subaccountsUndefined: Self = StObject.set(x, "ancestor_allows_subaccounts", js.undefined)
    
    inline def setAncestor_concurrency_limit(value: ConcurrencyLimit): Self = StObject.set(x, "ancestor_concurrency_limit", value.asInstanceOf[js.Any])
    
    inline def setAncestor_concurrency_limitUndefined: Self = StObject.set(x, "ancestor_concurrency_limit", js.undefined)
    
    inline def setCan_run_manual(value: Boolean): Self = StObject.set(x, "can_run_manual", value.asInstanceOf[js.Any])
    
    inline def setCan_run_manualUndefined: Self = StObject.set(x, "can_run_manual", js.undefined)
    
    inline def setConcurrency_limit(value: ConcurrencyLimit): Self = StObject.set(x, "concurrency_limit", value.asInstanceOf[js.Any])
    
    inline def setConcurrency_limitUndefined: Self = StObject.set(x, "concurrency_limit", js.undefined)
    
    inline def setCreation_time(value: String): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
    
    inline def setCreation_timeUndefined: Self = StObject.set(x, "creation_time", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEntity_type(value: String): Self = StObject.set(x, "entity_type", value.asInstanceOf[js.Any])
    
    inline def setEntity_typeUndefined: Self = StObject.set(x, "entity_type", js.undefined)
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIs_admin(value: String): Self = StObject.set(x, "is_admin", value.asInstanceOf[js.Any])
    
    inline def setIs_adminUndefined: Self = StObject.set(x, "is_admin", js.undefined)
    
    inline def setIs_sso(value: Boolean): Self = StObject.set(x, "is_sso", value.asInstanceOf[js.Any])
    
    inline def setIs_ssoUndefined: Self = StObject.set(x, "is_sso", js.undefined)
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    inline def setManual_minutes(value: Double): Self = StObject.set(x, "manual_minutes", value.asInstanceOf[js.Any])
    
    inline def setManual_minutesUndefined: Self = StObject.set(x, "manual_minutes", js.undefined)
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPrevent_emails(value: js.Array[marketing]): Self = StObject.set(x, "prevent_emails", value.asInstanceOf[js.Any])
    
    inline def setPrevent_emailsUndefined: Self = StObject.set(x, "prevent_emails", js.undefined)
    
    inline def setPrevent_emailsVarargs(value: marketing*): Self = StObject.set(x, "prevent_emails", js.Array(value :_*))
    
    inline def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
    
    inline def setSubscribedUndefined: Self = StObject.set(x, "subscribed", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUser_type(value: String): Self = StObject.set(x, "user_type", value.asInstanceOf[js.Any])
    
    inline def setUser_typeUndefined: Self = StObject.set(x, "user_type", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    inline def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
    
    inline def setVm_lockdown(value: Boolean): Self = StObject.set(x, "vm_lockdown", value.asInstanceOf[js.Any])
    
    inline def setVm_lockdownUndefined: Self = StObject.set(x, "vm_lockdown", js.undefined)
  }
}
