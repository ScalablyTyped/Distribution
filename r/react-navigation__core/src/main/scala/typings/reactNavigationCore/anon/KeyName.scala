package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyName[RouteName_1 /* <: String */] extends StObject {
  
  var key: js.UndefOr[String] = js.native
  
  var name: RouteName_1 = js.native
  
  var params: js.UndefOr[js.Object] = js.native
}
object KeyName {
  
  @scala.inline
  def apply[RouteName_1 /* <: String */](name: RouteName_1): KeyName[RouteName_1] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyName[RouteName_1]]
  }
  
  @scala.inline
  implicit class KeyNameMutableBuilder[Self <: KeyName[_], RouteName_1 /* <: String */] (val x: Self with KeyName[RouteName_1]) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setName(value: RouteName_1): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
