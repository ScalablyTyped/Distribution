package typings.reactNativeFirebase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallApp extends StObject {
  
  var installApp: js.UndefOr[Boolean] = js.undefined
  
  var minimumVersion: js.UndefOr[String] = js.undefined
  
  var packageName: String
}
object InstallApp {
  
  @scala.inline
  def apply(packageName: String): InstallApp = {
    val __obj = js.Dynamic.literal(packageName = packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallApp]
  }
  
  @scala.inline
  implicit class InstallAppMutableBuilder[Self <: InstallApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstallApp(value: Boolean): Self = StObject.set(x, "installApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallAppUndefined: Self = StObject.set(x, "installApp", js.undefined)
    
    @scala.inline
    def setMinimumVersion(value: String): Self = StObject.set(x, "minimumVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumVersionUndefined: Self = StObject.set(x, "minimumVersion", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
  }
}
