package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessTokenMap extends StObject {
  
  var accessToken: String
  
  var accessTokenSource: js.UndefOr[String] = js.undefined
  
  var applicationID: String
  
  var dataAccessExpirationTime: Double
  
  var declinedPermissions: js.Array[Permissions]
  
  var expirationTime: Double
  
  var expiredPermissions: js.Array[Permissions]
  
  var lastRefreshTime: Double
  
  var permissions: js.Array[Permissions]
  
  var userID: String
}
object AccessTokenMap {
  
  inline def apply(
    accessToken: String,
    applicationID: String,
    dataAccessExpirationTime: Double,
    declinedPermissions: js.Array[Permissions],
    expirationTime: Double,
    expiredPermissions: js.Array[Permissions],
    lastRefreshTime: Double,
    permissions: js.Array[Permissions],
    userID: String
  ): AccessTokenMap = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], applicationID = applicationID.asInstanceOf[js.Any], dataAccessExpirationTime = dataAccessExpirationTime.asInstanceOf[js.Any], declinedPermissions = declinedPermissions.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], expiredPermissions = expiredPermissions.asInstanceOf[js.Any], lastRefreshTime = lastRefreshTime.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenMap]
  }
  
  extension [Self <: AccessTokenMap](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenSource(value: String): Self = StObject.set(x, "accessTokenSource", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenSourceUndefined: Self = StObject.set(x, "accessTokenSource", js.undefined)
    
    inline def setApplicationID(value: String): Self = StObject.set(x, "applicationID", value.asInstanceOf[js.Any])
    
    inline def setDataAccessExpirationTime(value: Double): Self = StObject.set(x, "dataAccessExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setDeclinedPermissions(value: js.Array[Permissions]): Self = StObject.set(x, "declinedPermissions", value.asInstanceOf[js.Any])
    
    inline def setDeclinedPermissionsVarargs(value: Permissions*): Self = StObject.set(x, "declinedPermissions", js.Array(value*))
    
    inline def setExpirationTime(value: Double): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpiredPermissions(value: js.Array[Permissions]): Self = StObject.set(x, "expiredPermissions", value.asInstanceOf[js.Any])
    
    inline def setExpiredPermissionsVarargs(value: Permissions*): Self = StObject.set(x, "expiredPermissions", js.Array(value*))
    
    inline def setLastRefreshTime(value: Double): Self = StObject.set(x, "lastRefreshTime", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: js.Array[Permissions]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: Permissions*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setUserID(value: String): Self = StObject.set(x, "userID", value.asInstanceOf[js.Any])
  }
}
