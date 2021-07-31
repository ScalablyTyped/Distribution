package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameParams[RouteName_4 /* <: String */] extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var name: RouteName_4
  
  var params: js.UndefOr[js.Object] = js.undefined
}
object NameParams {
  
  @scala.inline
  def apply[RouteName_4 /* <: String */](name: RouteName_4): NameParams[RouteName_4] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameParams[RouteName_4]]
  }
  
  @scala.inline
  implicit class NameParamsMutableBuilder[Self <: NameParams[?], RouteName_4 /* <: String */] (val x: Self & NameParams[RouteName_4]) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setName(value: RouteName_4): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
