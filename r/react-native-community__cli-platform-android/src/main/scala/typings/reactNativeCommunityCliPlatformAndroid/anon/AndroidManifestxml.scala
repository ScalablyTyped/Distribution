package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidManifestxml extends StObject {
  
  @JSName("AndroidManifest.xml")
  var AndroidManifestDotxml: Any
  
  var main: Com
}
object AndroidManifestxml {
  
  inline def apply(AndroidManifestDotxml: Any, main: Com): AndroidManifestxml = {
    val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any])
    __obj.updateDynamic("AndroidManifest.xml")(AndroidManifestDotxml.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidManifestxml]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AndroidManifestxml] (val x: Self) extends AnyVal {
    
    inline def setAndroidManifestDotxml(value: Any): Self = StObject.set(x, "AndroidManifest.xml", value.asInstanceOf[js.Any])
    
    inline def setMain(value: Com): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
  }
}
