package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SomeExampleDictx extends StObject {
  
  var some: ExampleDictx
}
object SomeExampleDictx {
  
  inline def apply(some: ExampleDictx): SomeExampleDictx = {
    val __obj = js.Dynamic.literal(some = some.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeExampleDictx]
  }
  
  extension [Self <: SomeExampleDictx](x: Self) {
    
    inline def setSome(value: ExampleDictx): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
  }
}
