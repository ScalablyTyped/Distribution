package typings.salesforceCanvasJsSdk.Sfdc.canvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// see https://developer.salesforce.com/docs/atlas.en-us.platform_connect.meta/platform_connect/client_object.htm
trait Client_ extends StObject {
  
  val instanceId: js.UndefOr[String | Null] = js.undefined
  
  val instanceUrl: js.UndefOr[String | Null] = js.undefined
  
  val oauthToken: js.UndefOr[String | Null] = js.undefined
  
  val refreshToken: js.UndefOr[String | Null] = js.undefined
  
  val targetOrigin: js.UndefOr[String | Null] = js.undefined
}
object Client_ {
  
  inline def apply(): Client_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Client_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Client_] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdNull: Self = StObject.set(x, "instanceId", null)
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setInstanceUrl(value: String): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
    
    inline def setInstanceUrlNull: Self = StObject.set(x, "instanceUrl", null)
    
    inline def setInstanceUrlUndefined: Self = StObject.set(x, "instanceUrl", js.undefined)
    
    inline def setOauthToken(value: String): Self = StObject.set(x, "oauthToken", value.asInstanceOf[js.Any])
    
    inline def setOauthTokenNull: Self = StObject.set(x, "oauthToken", null)
    
    inline def setOauthTokenUndefined: Self = StObject.set(x, "oauthToken", js.undefined)
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenNull: Self = StObject.set(x, "refreshToken", null)
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    inline def setTargetOrigin(value: String): Self = StObject.set(x, "targetOrigin", value.asInstanceOf[js.Any])
    
    inline def setTargetOriginNull: Self = StObject.set(x, "targetOrigin", null)
    
    inline def setTargetOriginUndefined: Self = StObject.set(x, "targetOrigin", js.undefined)
  }
}
