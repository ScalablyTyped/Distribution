package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyMerge[RouteName_1 /* <: String */] extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var merge: js.UndefOr[Boolean] = js.undefined
  
  var name: RouteName_1
  
  var params: js.UndefOr[js.Object] = js.undefined
}
object KeyMerge {
  
  inline def apply[RouteName_1 /* <: String */](name: RouteName_1): KeyMerge[RouteName_1] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMerge[RouteName_1]]
  }
  
  extension [Self <: KeyMerge[?], RouteName_1 /* <: String */](x: Self & KeyMerge[RouteName_1]) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    
    inline def setName(value: RouteName_1): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
