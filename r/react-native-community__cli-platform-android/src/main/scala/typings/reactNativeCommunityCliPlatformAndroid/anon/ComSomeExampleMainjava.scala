package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComSomeExampleMainjava extends StObject {
  
  @JSName("com")
  var com_ : SomeExampleMainjava
}
object ComSomeExampleMainjava {
  
  inline def apply(com_ : SomeExampleMainjava): ComSomeExampleMainjava = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("com")(com_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComSomeExampleMainjava]
  }
  
  extension [Self <: ComSomeExampleMainjava](x: Self) {
    
    inline def setCom_(value: SomeExampleMainjava): Self = StObject.set(x, "com", value.asInstanceOf[js.Any])
  }
}
