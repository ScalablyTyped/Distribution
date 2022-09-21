package typings.reactNativeCommunityCliDoctor.anon

import typings.ora.mod.Ora
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  var component: String
  
  var downloadUrl: String
  
  var installPath: String
  
  var loader: Ora
}
object Component {
  
  inline def apply(component: String, downloadUrl: String, installPath: String, loader: Ora): Component = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], downloadUrl = downloadUrl.asInstanceOf[js.Any], installPath = installPath.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    inline def setInstallPath(value: String): Self = StObject.set(x, "installPath", value.asInstanceOf[js.Any])
    
    inline def setLoader(value: Ora): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
  }
}
