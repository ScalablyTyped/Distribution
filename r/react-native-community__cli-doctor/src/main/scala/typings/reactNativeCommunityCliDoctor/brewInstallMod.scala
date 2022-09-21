package typings.reactNativeCommunityCliDoctor

import typings.ora.mod.Ora
import typings.reactNativeCommunityCliDoctor.typesMod.Loader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object brewInstallMod {
  
  @JSImport("@react-native-community/cli-doctor/build/tools/brewInstall", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def brewInstall(hasPkgLabelLoaderOnSuccessOnFail: InstallArgs): js.Promise[Unit | Ora] = ^.asInstanceOf[js.Dynamic].applyDynamic("brewInstall")(hasPkgLabelLoaderOnSuccessOnFail.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit | Ora]]
  
  trait InstallArgs extends StObject {
    
    var label: js.UndefOr[String] = js.undefined
    
    var loader: Loader
    
    var onFail: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var pkg: String
  }
  object InstallArgs {
    
    inline def apply(loader: Loader, pkg: String): InstallArgs = {
      val __obj = js.Dynamic.literal(loader = loader.asInstanceOf[js.Any], pkg = pkg.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallArgs]
    }
    
    extension [Self <: InstallArgs](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLoader(value: Loader): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setOnFail(value: () => Unit): Self = StObject.set(x, "onFail", js.Any.fromFunction0(value))
      
      inline def setOnFailUndefined: Self = StObject.set(x, "onFail", js.undefined)
      
      inline def setOnSuccess(value: () => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction0(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setPkg(value: String): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
    }
  }
}
