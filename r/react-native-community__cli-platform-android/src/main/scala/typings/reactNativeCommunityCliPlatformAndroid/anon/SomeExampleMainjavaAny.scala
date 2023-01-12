package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SomeExampleMainjavaAny extends StObject {
  
  var some: ExampleMainjavaAny
}
object SomeExampleMainjavaAny {
  
  inline def apply(some: ExampleMainjavaAny): SomeExampleMainjavaAny = {
    val __obj = js.Dynamic.literal(some = some.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeExampleMainjavaAny]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SomeExampleMainjavaAny] (val x: Self) extends AnyVal {
    
    inline def setSome(value: ExampleMainjavaAny): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
  }
}
