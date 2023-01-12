package typings.reactNativeNavigation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Store extends StObject {
  
  var store: typings.reactNativeNavigation.libDistSrcComponentsStoreMod.Store
}
object Store {
  
  inline def apply(store: typings.reactNativeNavigation.libDistSrcComponentsStoreMod.Store): Store = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Store] (val x: Self) extends AnyVal {
    
    inline def setStore(value: typings.reactNativeNavigation.libDistSrcComponentsStoreMod.Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
  }
}
