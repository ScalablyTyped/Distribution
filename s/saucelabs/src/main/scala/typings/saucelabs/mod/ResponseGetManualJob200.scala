package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseGetManualJob200
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var browser: String
  
  var members: js.Array[String]
  
  var os: String
  
  var owner: String
  
  var resolution: String
  
  var tunnel: js.UndefOr[Unit] = js.undefined
  
  var url: String
  
  var version: String
}
object ResponseGetManualJob200 {
  
  inline def apply(
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
  
  extension [Self <: ResponseGetManualJob200](x: Self) {
    
    inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setTunnel(value: Unit): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
    
    inline def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
