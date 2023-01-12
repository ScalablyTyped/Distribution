package typings.reactIcons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmIconsManifestMod {
  
  @JSImport("react-icons/lib/esm/iconsManifest", "icons")
  @js.native
  val icons: IconManifest = js.native
  
  trait IconManifest extends StObject {
    
    var id: String
    
    var license: String
    
    var licenseUrl: String
    
    var name: String
    
    var projectUrl: String
  }
  object IconManifest {
    
    inline def apply(id: String, license: String, licenseUrl: String, name: String, projectUrl: String): IconManifest = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], licenseUrl = licenseUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectUrl = projectUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconManifest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconManifest] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseUrl(value: String): Self = StObject.set(x, "licenseUrl", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProjectUrl(value: String): Self = StObject.set(x, "projectUrl", value.asInstanceOf[js.Any])
    }
  }
}
