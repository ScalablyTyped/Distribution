package typings.reactIcons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconsManifestMod {
  
  @JSImport("react-icons/lib/esm/iconsManifest", "icons")
  @js.native
  val icons: IconManifest = js.native
  
  @js.native
  trait IconManifest extends StObject {
    
    var id: String = js.native
    
    var license: String = js.native
    
    var licenseUrl: String = js.native
    
    var name: String = js.native
    
    var projectUrl: String = js.native
  }
  object IconManifest {
    
    @scala.inline
    def apply(id: String, license: String, licenseUrl: String, name: String, projectUrl: String): IconManifest = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], licenseUrl = licenseUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectUrl = projectUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconManifest]
    }
    
    @scala.inline
    implicit class IconManifestMutableBuilder[Self <: IconManifest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseUrl(value: String): Self = StObject.set(x, "licenseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUrl(value: String): Self = StObject.set(x, "projectUrl", value.asInstanceOf[js.Any])
    }
  }
}
