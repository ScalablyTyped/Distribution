package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhoamiUser
  extends /* key */ StringDictionary[js.Any] {
  
  var access_key: js.UndefOr[String] = js.native
  
  var ancestor_concurrency_limit: js.UndefOr[ConcurrencyLimit] = js.native
  
  var can_run_manual: js.UndefOr[Boolean] = js.native
  
  var concurrency_limit: js.UndefOr[ConcurrencyLimit] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var first_name: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var last_name: js.UndefOr[String] = js.native
  
  var manual_minutes: js.UndefOr[Double] = js.native
  
  var minutes: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var parent: js.UndefOr[js.Object] = js.native
  
  var subscribed: js.UndefOr[Boolean] = js.native
  
  var user_type: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
  
  var verified: js.UndefOr[Boolean] = js.native
}
object WhoamiUser {
  
  @scala.inline
  def apply(): WhoamiUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhoamiUser]
  }
  
  @scala.inline
  implicit class WhoamiUserMutableBuilder[Self <: WhoamiUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_key(value: String): Self = StObject.set(x, "access_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_keyUndefined: Self = StObject.set(x, "access_key", js.undefined)
    
    @scala.inline
    def setAncestor_concurrency_limit(value: ConcurrencyLimit): Self = StObject.set(x, "ancestor_concurrency_limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAncestor_concurrency_limitUndefined: Self = StObject.set(x, "ancestor_concurrency_limit", js.undefined)
    
    @scala.inline
    def setCan_run_manual(value: Boolean): Self = StObject.set(x, "can_run_manual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_run_manualUndefined: Self = StObject.set(x, "can_run_manual", js.undefined)
    
    @scala.inline
    def setConcurrency_limit(value: ConcurrencyLimit): Self = StObject.set(x, "concurrency_limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrency_limitUndefined: Self = StObject.set(x, "concurrency_limit", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    @scala.inline
    def setManual_minutes(value: Double): Self = StObject.set(x, "manual_minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManual_minutesUndefined: Self = StObject.set(x, "manual_minutes", js.undefined)
    
    @scala.inline
    def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParent(value: js.Object): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribedUndefined: Self = StObject.set(x, "subscribed", js.undefined)
    
    @scala.inline
    def setUser_type(value: String): Self = StObject.set(x, "user_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_typeUndefined: Self = StObject.set(x, "user_type", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    @scala.inline
    def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
  }
}
