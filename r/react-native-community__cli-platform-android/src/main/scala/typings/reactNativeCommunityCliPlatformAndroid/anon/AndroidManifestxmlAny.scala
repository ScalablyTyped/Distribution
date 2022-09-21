package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidManifestxmlAny extends StObject {
  
  @JSName("AndroidManifest.xml")
  var AndroidManifestDotxml: Any
}
object AndroidManifestxmlAny {
  
  inline def apply(AndroidManifestDotxml: Any): AndroidManifestxmlAny = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AndroidManifest.xml")(AndroidManifestDotxml.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidManifestxmlAny]
  }
  
  extension [Self <: AndroidManifestxmlAny](x: Self) {
    
    inline def setAndroidManifestDotxml(value: Any): Self = StObject.set(x, "AndroidManifest.xml", value.asInstanceOf[js.Any])
  }
}
