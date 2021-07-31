package typings.reactNavigation.anon

import typings.react.mod.Component
import typings.react.mod.Ref
import typings.reactNavigation.mod.NavigationInjectedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`[T, P] extends StObject {
  
  var onRef: js.UndefOr[Ref[Component[T & NavigationInjectedProps[P], js.Object, js.Any]]] = js.undefined
}
object `2` {
  
  @scala.inline
  def apply[T, P](): `2`[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[T, P]]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`[?, ?], T, P] (val x: Self & (`2`[T, P])) extends AnyVal {
    
    @scala.inline
    def setOnRef(value: Ref[Component[T & NavigationInjectedProps[P], js.Object, js.Any]]): Self = StObject.set(x, "onRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRefFunction1(
      value: /* instance */ (Component[T & NavigationInjectedProps[P], js.Object, js.Any]) | Null => Unit
    ): Self = StObject.set(x, "onRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRefNull: Self = StObject.set(x, "onRef", null)
    
    @scala.inline
    def setOnRefUndefined: Self = StObject.set(x, "onRef", js.undefined)
  }
}
