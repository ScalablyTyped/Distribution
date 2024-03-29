package typings.reactNavigation.anon

import typings.react.mod.Component
import typings.react.mod.Ref
import typings.reactNavigation.mod.NavigationInjectedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`[T, P] extends StObject {
  
  var onRef: js.UndefOr[Ref[Component[T & NavigationInjectedProps[P], js.Object, Any]]] = js.undefined
}
object `2` {
  
  inline def apply[T, P](): `2`[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[T, P]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`[?, ?], T, P] (val x: Self & (`2`[T, P])) extends AnyVal {
    
    inline def setOnRef(value: Ref[Component[T & NavigationInjectedProps[P], js.Object, Any]]): Self = StObject.set(x, "onRef", value.asInstanceOf[js.Any])
    
    inline def setOnRefFunction1(value: /* instance */ (Component[T & NavigationInjectedProps[P], js.Object, Any]) | Null => Unit): Self = StObject.set(x, "onRef", js.Any.fromFunction1(value))
    
    inline def setOnRefNull: Self = StObject.set(x, "onRef", null)
    
    inline def setOnRefUndefined: Self = StObject.set(x, "onRef", js.undefined)
  }
}
