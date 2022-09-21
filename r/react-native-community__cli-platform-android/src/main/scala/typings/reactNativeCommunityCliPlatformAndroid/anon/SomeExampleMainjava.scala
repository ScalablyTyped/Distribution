package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SomeExampleMainjava extends StObject {
  
  var some: ExampleMainjava
}
object SomeExampleMainjava {
  
  inline def apply(some: ExampleMainjava): SomeExampleMainjava = {
    val __obj = js.Dynamic.literal(some = some.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeExampleMainjava]
  }
  
  extension [Self <: SomeExampleMainjava](x: Self) {
    
    inline def setSome(value: ExampleMainjava): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
  }
}
