package typings.sentryTypes

import typings.sentryTypes.packageMod.Package
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdkinfoMod {
  
  trait SdkInfo extends StObject {
    
    var integrations: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: String
    
    var packages: js.UndefOr[js.Array[Package]] = js.undefined
    
    var version: String
  }
  object SdkInfo {
    
    inline def apply(name: String, version: String): SdkInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SdkInfo]
    }
    
    extension [Self <: SdkInfo](x: Self) {
      
      inline def setIntegrations(value: js.Array[String]): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      inline def setIntegrationsVarargs(value: String*): Self = StObject.set(x, "integrations", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPackages(value: js.Array[Package]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
      
      inline def setPackagesVarargs(value: Package*): Self = StObject.set(x, "packages", js.Array(value :_*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
