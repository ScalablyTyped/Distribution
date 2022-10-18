package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComSomeExampleDictx extends StObject {
  
  @JSName("com")
  var com_ : SomeExampleDictx
}
object ComSomeExampleDictx {
  
  inline def apply(com_ : SomeExampleDictx): ComSomeExampleDictx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("com")(com_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComSomeExampleDictx]
  }
  
  extension [Self <: ComSomeExampleDictx](x: Self) {
    
    inline def setCom_(value: SomeExampleDictx): Self = StObject.set(x, "com", value.asInstanceOf[js.Any])
  }
}
