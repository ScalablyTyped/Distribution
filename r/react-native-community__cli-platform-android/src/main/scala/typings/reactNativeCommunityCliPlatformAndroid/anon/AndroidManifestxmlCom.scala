package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidManifestxmlCom extends StObject {
  
  @JSName("AndroidManifest.xml")
  var AndroidManifestDotxml: Any
  
  @JSName("com")
  var com_ : SomeExampleMainjava
}
object AndroidManifestxmlCom {
  
  inline def apply(AndroidManifestDotxml: Any, com_ : SomeExampleMainjava): AndroidManifestxmlCom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AndroidManifest.xml")(AndroidManifestDotxml.asInstanceOf[js.Any])
    __obj.updateDynamic("com")(com_.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidManifestxmlCom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AndroidManifestxmlCom] (val x: Self) extends AnyVal {
    
    inline def setAndroidManifestDotxml(value: Any): Self = StObject.set(x, "AndroidManifest.xml", value.asInstanceOf[js.Any])
    
    inline def setCom_(value: SomeExampleMainjava): Self = StObject.set(x, "com", value.asInstanceOf[js.Any])
  }
}
