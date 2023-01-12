package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Com extends StObject {
  
  @JSName("com")
  var com_ : Some
}
object Com {
  
  inline def apply(com_ : Some): Com = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("com")(com_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Com]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Com] (val x: Self) extends AnyVal {
    
    inline def setCom_(value: Some): Self = StObject.set(x, "com", value.asInstanceOf[js.Any])
  }
}
