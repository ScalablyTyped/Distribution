package typings.reactPlayer.lazyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacebookConfig extends StObject {
  
  var appId: String = js.native
  
  var playerId: String = js.native
  
  var version: String = js.native
}
object FacebookConfig {
  
  @scala.inline
  def apply(appId: String, playerId: String, version: String): FacebookConfig = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], playerId = playerId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacebookConfig]
  }
  
  @scala.inline
  implicit class FacebookConfigMutableBuilder[Self <: FacebookConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerId(value: String): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
