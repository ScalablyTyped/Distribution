package typings.reactNavigation.anon

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Ref
import typings.reactNavigation.mod.NavigationFocusInjectedProps
import typings.reactNavigation.mod.NavigationParams
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`[T /* <: ComponentClass[P, ComponentState] */, P /* <: NavigationFocusInjectedProps[NavigationParams] */] extends StObject {
  
  var onRef: js.UndefOr[Ref[InstanceType[T]]] = js.undefined
}
object `4` {
  
  inline def apply[T /* <: ComponentClass[P, ComponentState] */, P /* <: NavigationFocusInjectedProps[NavigationParams] */](): `4`[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`[T, P]]
  }
  
  extension [Self <: `4`[?, ?], T /* <: ComponentClass[P, ComponentState] */, P /* <: NavigationFocusInjectedProps[NavigationParams] */](x: Self & (`4`[T, P])) {
    
    inline def setOnRef(value: Ref[InstanceType[T]]): Self = StObject.set(x, "onRef", value.asInstanceOf[js.Any])
    
    inline def setOnRefFunction1(value: /* instance */ InstanceType[T] | Null => Unit): Self = StObject.set(x, "onRef", js.Any.fromFunction1(value))
    
    inline def setOnRefNull: Self = StObject.set(x, "onRef", null)
    
    inline def setOnRefUndefined: Self = StObject.set(x, "onRef", js.undefined)
  }
}
