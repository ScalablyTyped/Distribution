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

trait `3`[T /* <: ComponentClass[P, ComponentState] */, P /* <: NavigationFocusInjectedProps[NavigationParams] */] extends StObject {
  
  var onRef: js.UndefOr[Ref[InstanceType[T]]] = js.undefined
}
object `3` {
  
  @scala.inline
  def apply[T /* <: ComponentClass[P, ComponentState] */, P /* <: NavigationFocusInjectedProps[NavigationParams] */](): `3`[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`[T, P]]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`[?, ?], T /* <: ComponentClass[P, ComponentState] */, P /* <: NavigationFocusInjectedProps[NavigationParams] */] (val x: Self & (`3`[T, P])) extends AnyVal {
    
    @scala.inline
    def setOnRef(value: Ref[InstanceType[T]]): Self = StObject.set(x, "onRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRefFunction1(value: /* instance */ InstanceType[T] | Null => Unit): Self = StObject.set(x, "onRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRefNull: Self = StObject.set(x, "onRef", null)
    
    @scala.inline
    def setOnRefUndefined: Self = StObject.set(x, "onRef", js.undefined)
  }
}
