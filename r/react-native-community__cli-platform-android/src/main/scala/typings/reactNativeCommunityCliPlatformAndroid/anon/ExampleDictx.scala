package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExampleDictx extends StObject {
  
  var example: Dictx
}
object ExampleDictx {
  
  inline def apply(example: Dictx): ExampleDictx = {
    val __obj = js.Dynamic.literal(example = example.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleDictx]
  }
  
  extension [Self <: ExampleDictx](x: Self) {
    
    inline def setExample(value: Dictx): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
  }
}
