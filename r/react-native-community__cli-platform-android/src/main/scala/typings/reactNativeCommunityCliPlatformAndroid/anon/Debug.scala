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
  
  extension [Self <: Debug](x: Self) {
    
    inline def setDebug(value: AndroidManifestxmlAny): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setMain(value: AndroidManifestxmlCom): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
  }
}
