package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComSomeExampleMainjavaAny extends StObject {
  
  @JSName("com")
  var com_ : SomeExampleMainjavaAny
}
object ComSomeExampleMainjavaAny {
  
  inline def apply(com_ : SomeExampleMainjavaAny): ComSomeExampleMainjavaAny = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("com")(com_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComSomeExampleMainjavaAny]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComSomeExampleMainjavaAny] (val x: Self) extends AnyVal {
    
    inline def setCom_(value: SomeExampleMainjavaAny): Self = StObject.set(x, "com", value.asInstanceOf[js.Any])
  }
}
