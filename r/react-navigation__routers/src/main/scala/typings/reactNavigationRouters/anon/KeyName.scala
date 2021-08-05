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
}
object KeyName {
  
  inline def apply[RouteName /* <: String */](key: String, name: RouteName): KeyName[RouteName] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyName[RouteName]]
  }
  
  extension [Self <: KeyName[?], RouteName /* <: String */](x: Self & KeyName[RouteName]) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: RouteName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
