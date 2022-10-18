package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layer extends StObject {
  
  var allowedAccounts: js.UndefOr[js.Array[String]] = js.undefined
  
  var compatibleRuntimes: js.UndefOr[js.Array[String]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var licenseInfo: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var path: String
  
  var retain: js.UndefOr[Boolean] = js.undefined
}
object Layer {
  
  inline def apply(path: String): Layer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  extension [Self <: Layer](x: Self) {
    
    inline def setAllowedAccounts(value: js.Array[String]): Self = StObject.set(x, "allowedAccounts", value.asInstanceOf[js.Any])
    
    inline def setAllowedAccountsUndefined: Self = StObject.set(x, "allowedAccounts", js.undefined)
    
    inline def setAllowedAccountsVarargs(value: String*): Self = StObject.set(x, "allowedAccounts", js.Array(value*))
    
    inline def setCompatibleRuntimes(value: js.Array[String]): Self = StObject.set(x, "compatibleRuntimes", value.asInstanceOf[js.Any])
    
    inline def setCompatibleRuntimesUndefined: Self = StObject.set(x, "compatibleRuntimes", js.undefined)
    
    inline def setCompatibleRuntimesVarargs(value: String*): Self = StObject.set(x, "compatibleRuntimes", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLicenseInfo(value: String): Self = StObject.set(x, "licenseInfo", value.asInstanceOf[js.Any])
    
    inline def setLicenseInfoUndefined: Self = StObject.set(x, "licenseInfo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
    
    inline def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
  }
}
