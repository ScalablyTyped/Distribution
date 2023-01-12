package typings.reactNavigation.anon

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Ref
import typings.reactNavigation.mod.NavigationInjectedProps
import typings.reactNavigation.mod.NavigationParams
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnRef[T /* <: ComponentClass[P, ComponentState] */, P /* <: NavigationInjectedProps[NavigationParams] */] extends StObject {
  
  var onRef: js.UndefOr[Ref[InstanceType[T]]] = js.undefined
}
object OnRef {
  
  inline def apply[T /* <: ComponentClass[P, ComponentState] */, P /* <: NavigationInjectedProps[NavigationParams] */](): OnRef[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnRef[T, P]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnRef[?, ?], T /* <: ComponentClass[P, ComponentState] */, P /* <: NavigationInjectedProps[NavigationParams] */] (val x: Self & (OnRef[T, P])) extends AnyVal {
    
    inline def setOnRef(value: Ref[InstanceType[T]]): Self = StObject.set(x, "onRef", value.asInstanceOf[js.Any])
    
    inline def setOnRefFunction1(value: /* instance */ InstanceType[T] | Null => Unit): Self = StObject.set(x, "onRef", js.Any.fromFunction1(value))
    
    inline def setOnRefNull: Self = StObject.set(x, "onRef", null)
    
    inline def setOnRefUndefined: Self = StObject.set(x, "onRef", js.undefined)
  }
}
