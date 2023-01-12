package typings.reactNavigationRouters.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyName[RouteName /* <: String */] extends StObject {
  
  /**
    * Unique key for the route.
    */
  var key: String
  
  /**
    * User-provided name for the route.
    */
  var name: RouteName
  
  /**
    * Path associated with the route.
    * Usually present when the screen was opened from a deep link.
    */
  var path: js.UndefOr[String] = js.undefined
}
object KeyName {
  
  inline def apply[RouteName /* <: String */](key: String, name: RouteName): KeyName[RouteName] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyName[RouteName]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyName[?], RouteName /* <: String */] (val x: Self & KeyName[RouteName]) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: RouteName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
