package typings.sentryHub.anon

import typings.sentryTypes.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@sentry/types.@sentry/types.SessionContext, 'started' | 'status'> */
@js.native
trait OmitSessionContextstarted extends js.Object {
  
  var did: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var environment: js.UndefOr[String] = js.native
  
  var errors: js.UndefOr[Double] = js.native
  
  var ipAddress: js.UndefOr[String] = js.native
  
  var release: js.UndefOr[String] = js.native
  
  var sid: js.UndefOr[String] = js.native
  
  var timestamp: js.UndefOr[Double] = js.native
  
  var user: js.UndefOr[User | Null] = js.native
  
  var userAgent: js.UndefOr[String] = js.native
}
object OmitSessionContextstarted {
  
  @scala.inline
  def apply(): OmitSessionContextstarted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitSessionContextstarted]
  }
  
  @scala.inline
  implicit class OmitSessionContextstartedOps[Self <: OmitSessionContextstarted] (val x: Self) extends AnyVal {
    
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
    def setDid(value: String): Self = this.set("did", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDid: Self = this.set("did", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEnvironment(value: String): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setErrors(value: Double): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setRelease(value: String): Self = this.set("release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelease: Self = this.set("release", js.undefined)
    
    @scala.inline
    def setSid(value: String): Self = this.set("sid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSid: Self = this.set("sid", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    
    @scala.inline
    def setUserNull: Self = this.set("user", null)
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
  }
}
