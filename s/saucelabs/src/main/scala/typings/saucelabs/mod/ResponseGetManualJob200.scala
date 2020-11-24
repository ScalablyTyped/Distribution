package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseGetManualJob200
  extends /* key */ StringDictionary[js.Any] {
  
  var browser: String = js.native
  
  var members: js.Array[String] = js.native
  
  var os: String = js.native
  
  var owner: String = js.native
  
  var resolution: String = js.native
  
  var tunnel: js.UndefOr[Unit] = js.native
  
  var url: String = js.native
  
  var version: String = js.native
}
object ResponseGetManualJob200 {
  
  @scala.inline
  def apply(
    browser: String,
    members: js.Array[String],
    os: String,
    owner: String,
    resolution: String,
    url: String,
    version: String
  ): ResponseGetManualJob200 = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseGetManualJob200]
  }
  
  @scala.inline
  implicit class ResponseGetManualJob200Ops[Self <: ResponseGetManualJob200] (val x: Self) extends AnyVal {
    
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
    def setBrowser(value: String): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: String*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[String]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolution(value: String): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnel(value: Unit): Self = this.set("tunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnel: Self = this.set("tunnel", js.undefined)
  }
}
