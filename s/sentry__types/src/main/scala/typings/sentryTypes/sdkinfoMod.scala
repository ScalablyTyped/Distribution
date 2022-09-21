package typings.sentryTypes

import typings.sentryTypes.packageMod.Package
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdkinfoMod {
  
  trait SdkInfo extends StObject {
    
    var integrations: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var packages: js.UndefOr[js.Array[Package]] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object SdkInfo {
    
    inline def apply(): SdkInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SdkInfo]
    }
    
    extension [Self <: SdkInfo](x: Self) {
      
      inline def setIntegrations(value: js.Array[String]): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      inline def setIntegrationsVarargs(value: String*): Self = StObject.set(x, "integrations", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPackages(value: js.Array[Package]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
      
      inline def setPackagesVarargs(value: Package*): Self = StObject.set(x, "packages", js.Array(value*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
