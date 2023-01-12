package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidManifestxmlMain extends StObject {
  
  @JSName("AndroidManifest.xml")
  var AndroidManifestDotxml: Any
  
  var main: ComSomeExampleMainjavaAny
}
object AndroidManifestxmlMain {
  
  inline def apply(AndroidManifestDotxml: Any, main: ComSomeExampleMainjavaAny): AndroidManifestxmlMain = {
    val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any])
    __obj.updateDynamic("AndroidManifest.xml")(AndroidManifestDotxml.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidManifestxmlMain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AndroidManifestxmlMain] (val x: Self) extends AnyVal {
    
    inline def setAndroidManifestDotxml(value: Any): Self = StObject.set(x, "AndroidManifest.xml", value.asInstanceOf[js.Any])
    
    inline def setMain(value: ComSomeExampleMainjavaAny): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
  }
}
