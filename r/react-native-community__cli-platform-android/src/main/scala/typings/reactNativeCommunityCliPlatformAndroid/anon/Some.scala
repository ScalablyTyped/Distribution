package typings.reactNativeCommunityCliPlatformAndroid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Some extends StObject {
  
  var some: Example
}
object Some {
  
  inline def apply(some: Example): Some = {
    val __obj = js.Dynamic.literal(some = some.asInstanceOf[js.Any])
    __obj.asInstanceOf[Some]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Some] (val x: Self) extends AnyVal {
    
    inline def setSome(value: Example): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
  }
}
