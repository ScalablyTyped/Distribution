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
  
  extension [Self <: Com](x: Self) {
    
    inline def setCom_(value: Some): Self = StObject.set(x, "com", value.asInstanceOf[js.Any])
  }
}
