package typings.steamUser.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductAccessTokens extends StObject {
  
  var appDeniedTokens: js.Array[Double]
  
  var appTokens: Record[String, String]
  
  var packageDeniedTokens: js.Array[Double]
  
  var packageTokens: Record[String, String]
}
object ProductAccessTokens {
  
  inline def apply(
    appDeniedTokens: js.Array[Double],
    appTokens: Record[String, String],
    packageDeniedTokens: js.Array[Double],
    packageTokens: Record[String, String]
  ): ProductAccessTokens = {
    val __obj = js.Dynamic.literal(appDeniedTokens = appDeniedTokens.asInstanceOf[js.Any], appTokens = appTokens.asInstanceOf[js.Any], packageDeniedTokens = packageDeniedTokens.asInstanceOf[js.Any], packageTokens = packageTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductAccessTokens]
  }
  
  extension [Self <: ProductAccessTokens](x: Self) {
    
    inline def setAppDeniedTokens(value: js.Array[Double]): Self = StObject.set(x, "appDeniedTokens", value.asInstanceOf[js.Any])
    
    inline def setAppDeniedTokensVarargs(value: Double*): Self = StObject.set(x, "appDeniedTokens", js.Array(value*))
    
    inline def setAppTokens(value: Record[String, String]): Self = StObject.set(x, "appTokens", value.asInstanceOf[js.Any])
    
    inline def setPackageDeniedTokens(value: js.Array[Double]): Self = StObject.set(x, "packageDeniedTokens", value.asInstanceOf[js.Any])
    
    inline def setPackageDeniedTokensVarargs(value: Double*): Self = StObject.set(x, "packageDeniedTokens", js.Array(value*))
    
    inline def setPackageTokens(value: Record[String, String]): Self = StObject.set(x, "packageTokens", value.asInstanceOf[js.Any])
  }
}
