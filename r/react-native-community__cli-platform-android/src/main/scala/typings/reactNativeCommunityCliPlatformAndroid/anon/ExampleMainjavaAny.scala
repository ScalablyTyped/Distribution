package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExampleMainjavaAny extends StObject {
  
  var example: MainjavaAny
}
object ExampleMainjavaAny {
  
  inline def apply(example: MainjavaAny): ExampleMainjavaAny = {
    val __obj = js.Dynamic.literal(example = example.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleMainjavaAny]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExampleMainjavaAny] (val x: Self) extends AnyVal {
    
    inline def setExample(value: MainjavaAny): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
  }
}
