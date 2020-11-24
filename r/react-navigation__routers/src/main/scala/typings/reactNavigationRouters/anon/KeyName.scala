package typings.reactNavigationRouters.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyName[RouteName /* <: String */] extends js.Object {
  
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
  implicit class KeyNameOps[Self <: KeyName[_], RouteName /* <: String */] (val x: Self with KeyName[RouteName]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: RouteName): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
