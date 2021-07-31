package typings.reactNavigation.anon

import typings.react.mod.Component
import typings.react.mod.Ref
import typings.reactNavigation.mod.NavigationFocusInjectedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`[T, P] extends StObject {
  
  var onRef: js.UndefOr[Ref[Component[T & NavigationFocusInjectedProps[P], js.Object, js.Any]]] = js.undefined
}
object `4` {
  
  @scala.inline
  def apply[T, P](): `4`[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`[T, P]]
  }
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`[?, ?], T, P] (val x: Self & (`4`[T, P])) extends AnyVal {
    
    @scala.inline
    def setOnRef(value: Ref[Component[T & NavigationFocusInjectedProps[P], js.Object, js.Any]]): Self = StObject.set(x, "onRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRefFunction1(
      value: /* instance */ (Component[T & NavigationFocusInjectedProps[P], js.Object, js.Any]) | Null => Unit
    ): Self = StObject.set(x, "onRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRefNull: Self = StObject.set(x, "onRef", null)
    
    @scala.inline
    def setOnRefUndefined: Self = StObject.set(x, "onRef", js.undefined)
  }
}
