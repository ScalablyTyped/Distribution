package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComSome0 extends StObject {
  
  @JSName("com")
  var com_ : Some0
}
object ComSome0 {
  
  inline def apply(com_ : Some0): ComSome0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("com")(com_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComSome0]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComSome0] (val x: Self) extends AnyVal {
    
    inline def setCom_(value: Some0): Self = StObject.set(x, "com", value.asInstanceOf[js.Any])
  }
}
