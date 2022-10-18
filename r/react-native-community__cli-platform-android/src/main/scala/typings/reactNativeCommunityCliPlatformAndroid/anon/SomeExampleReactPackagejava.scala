package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SomeExampleReactPackagejava extends StObject {
  
  var some: ExampleReactPackagejava
}
object SomeExampleReactPackagejava {
  
  inline def apply(some: ExampleReactPackagejava): SomeExampleReactPackagejava = {
    val __obj = js.Dynamic.literal(some = some.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeExampleReactPackagejava]
  }
  
  extension [Self <: SomeExampleReactPackagejava](x: Self) {
    
    inline def setSome(value: ExampleReactPackagejava): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
  }
}
