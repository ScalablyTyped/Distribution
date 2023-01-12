package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Android extends StObject {
  
  var android: Buildgradle
}
object Android {
  
  inline def apply(android: Buildgradle): Android = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any])
    __obj.asInstanceOf[Android]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Android] (val x: Self) extends AnyVal {
    
    inline def setAndroid(value: Buildgradle): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
  }
}
