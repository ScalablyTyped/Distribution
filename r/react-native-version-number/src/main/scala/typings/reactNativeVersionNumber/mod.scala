package typings.reactNativeVersionNumber

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-version-number", JSImport.Default)
  @js.native
  val default: VersionNumber = js.native
  
  trait VersionNumber extends StObject {
    
    var appVersion: js.UndefOr[String] = js.undefined
    
    var buildVersion: js.UndefOr[String] = js.undefined
    
    var bundleIdentifier: js.UndefOr[String] = js.undefined
  }
  object VersionNumber {
    
    inline def apply(): VersionNumber = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VersionNumber]
    }
    
    extension [Self <: VersionNumber](x: Self) {
      
      inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      inline def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
      
      inline def setBuildVersion(value: String): Self = StObject.set(x, "buildVersion", value.asInstanceOf[js.Any])
      
      inline def setBuildVersionUndefined: Self = StObject.set(x, "buildVersion", js.undefined)
      
      inline def setBundleIdentifier(value: String): Self = StObject.set(x, "bundleIdentifier", value.asInstanceOf[js.Any])
      
      inline def setBundleIdentifierUndefined: Self = StObject.set(x, "bundleIdentifier", js.undefined)
    }
  }
  
  type _To = VersionNumber
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: VersionNumber = default
}
