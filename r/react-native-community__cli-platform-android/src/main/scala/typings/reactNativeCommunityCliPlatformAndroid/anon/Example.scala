package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Example extends StObject {
  
  var example: Dictx
}
object Example {
  
  inline def apply(example: Dictx): Example = {
    val __obj = js.Dynamic.literal(example = example.asInstanceOf[js.Any])
    __obj.asInstanceOf[Example]
  }
  
  extension [Self <: Example](x: Self) {
    
    inline def setExample(value: Dictx): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
  }
}
