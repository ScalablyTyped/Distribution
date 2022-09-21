package typings.reactNativeCommunityCliDoctor

import typings.reactNativeCommunityCliDoctor.typesMod.Loader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object installMod {
  
  @JSImport("@react-native-community/cli-doctor/build/tools/install", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def install(hasPkgLabelUrlLoader: InstallArgs): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(hasPkgLabelUrlLoader.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait InstallArgs extends StObject {
    
    var label: String
    
    var loader: Loader
    
    var pkg: String
    
    var url: String
  }
  object InstallArgs {
    
    inline def apply(label: String, loader: Loader, pkg: String, url: String): InstallArgs = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], pkg = pkg.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallArgs]
    }
    
    extension [Self <: InstallArgs](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLoader(value: Loader): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setPkg(value: String): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
