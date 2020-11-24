package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
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
  implicit class WhoamiUserOps[Self <: WhoamiUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccess_key(value: String): Self = this.set("access_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_key: Self = this.set("access_key", js.undefined)
    
    @scala.inline
    def setAncestor_concurrency_limit(value: ConcurrencyLimit): Self = this.set("ancestor_concurrency_limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAncestor_concurrency_limit: Self = this.set("ancestor_concurrency_limit", js.undefined)
    
    @scala.inline
    def setCan_run_manual(value: Boolean): Self = this.set("can_run_manual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_run_manual: Self = this.set("can_run_manual", js.undefined)
    
    @scala.inline
    def setConcurrency_limit(value: ConcurrencyLimit): Self = this.set("concurrency_limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrency_limit: Self = this.set("concurrency_limit", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirst_name: Self = this.set("first_name", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_name: Self = this.set("last_name", js.undefined)
    
    @scala.inline
    def setManual_minutes(value: Double): Self = this.set("manual_minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManual_minutes: Self = this.set("manual_minutes", js.undefined)
    
    @scala.inline
    def setMinutes(value: Double): Self = this.set("minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParent(value: js.Object): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setSubscribed(value: Boolean): Self = this.set("subscribed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscribed: Self = this.set("subscribed", js.undefined)
    
    @scala.inline
    def setUser_type(value: String): Self = this.set("user_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_type: Self = this.set("user_type", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    
    @scala.inline
    def setVerified(value: Boolean): Self = this.set("verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerified: Self = this.set("verified", js.undefined)
  }
}
