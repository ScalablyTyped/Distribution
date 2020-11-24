package typings.sentryTypes.dsnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DsnComponents extends js.Object {
  
  /** Hostname of the Sentry instance. */
  var host: String = js.native
  
  /** Private authorization key (deprecated, optional). */
  var pass: js.UndefOr[String] = js.native
  
  /** Sub path/ */
  var path: js.UndefOr[String] = js.native
  
  /** Port of the Sentry instance. */
  var port: js.UndefOr[String] = js.native
  
  /** Project ID */
  var projectId: String = js.native
  
  /** Protocol used to connect to Sentry. */
  var protocol: DsnProtocol = js.native
  
  /** Public authorization key. */
  var user: String = js.native
}
object DsnComponents {
  
  @scala.inline
  def apply(host: String, projectId: String, protocol: DsnProtocol, user: String): DsnComponents = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[DsnComponents]
  }
  
  @scala.inline
  implicit class DsnComponentsOps[Self <: DsnComponents] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: DsnProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPass(value: String): Self = this.set("pass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePass: Self = this.set("pass", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
