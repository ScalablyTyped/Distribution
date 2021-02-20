package typings.reactNavigationRouters.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyName[RouteName /* <: String */] extends StObject {
  
  /**
    * Unique key for the route.
    */
  var key: String = js.native
  
  /**
    * User-provided name for the route.
    */
  var name: RouteName = js.native
}
object KeyName {
  
  @scala.inline
  def apply[RouteName /* <: String */](key: String, name: RouteName): KeyName[RouteName] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyName[RouteName]]
  }
  
  @scala.inline
  implicit class KeyNameMutableBuilder[Self <: KeyName[_], RouteName /* <: String */] (val x: Self with KeyName[RouteName]) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: RouteName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
