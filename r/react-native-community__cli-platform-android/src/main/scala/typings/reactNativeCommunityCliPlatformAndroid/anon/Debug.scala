package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Debug extends StObject {
  
  var debug: AndroidManifestxmlAny
  
  var main: AndroidManifestxmlCom
}
object Debug {
  
  inline def apply(debug: AndroidManifestxmlAny, main: AndroidManifestxmlCom): Debug = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any])
    __obj.asInstanceOf[Debug]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
    
    inline def setDebug(value: AndroidManifestxmlAny): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setMain(value: AndroidManifestxmlCom): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
  }
}
