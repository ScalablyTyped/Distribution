package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidManifestxmlCom extends StObject {
  
  @JSName("AndroidManifest.xml")
  var AndroidManifestDotxml: Any
  
  @JSName("com")
  var com_ : SomeExampleReactPackagejava
}
object AndroidManifestxmlCom {
  
  inline def apply(AndroidManifestDotxml: Any, com_ : SomeExampleReactPackagejava): AndroidManifestxmlCom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AndroidManifest.xml")(AndroidManifestDotxml.asInstanceOf[js.Any])
    __obj.updateDynamic("com")(com_.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidManifestxmlCom]
  }
  
  extension [Self <: AndroidManifestxmlCom](x: Self) {
    
    inline def setAndroidManifestDotxml(value: Any): Self = StObject.set(x, "AndroidManifest.xml", value.asInstanceOf[js.Any])
    
    inline def setCom_(value: SomeExampleReactPackagejava): Self = StObject.set(x, "com", value.asInstanceOf[js.Any])
  }
}
