package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlexaSmartHome extends StObject {
  
  var appId: String = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
}
object AlexaSmartHome {
  
  @scala.inline
  def apply(appId: String): AlexaSmartHome = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlexaSmartHome]
  }
  
  @scala.inline
  implicit class AlexaSmartHomeMutableBuilder[Self <: AlexaSmartHome] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
