package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class ResponseGetManualJob200MutableBuilder[Self <: ResponseGetManualJob200] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnel(value: Unit): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
