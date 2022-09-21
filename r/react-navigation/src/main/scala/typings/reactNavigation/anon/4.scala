package typings.reactNavigation.anon

import typings.react.mod.Component
import typings.react.mod.Ref
import typings.reactNavigation.mod.NavigationFocusInjectedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`[T, P] extends StObject {
  
  var onRef: js.UndefOr[Ref[Component[T & NavigationFocusInjectedProps[P], js.Object, Any]]] = js.undefined
}
object `4` {
  
  inline def apply[T, P](): `4`[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`[T, P]]
  }
  
  extension [Self <: `4`[?, ?], T, P](x: Self & (`4`[T, P])) {
    
    inline def setOnRef(value: Ref[Component[T & NavigationFocusInjectedProps[P], js.Object, Any]]): Self = StObject.set(x, "onRef", value.asInstanceOf[js.Any])
    
    inline def setOnRefFunction1(
      value: /* instance */ (Component[T & NavigationFocusInjectedProps[P], js.Object, Any]) | Null => Unit
    ): Self = StObject.set(x, "onRef", js.Any.fromFunction1(value))
    
    inline def setOnRefNull: Self = StObject.set(x, "onRef", null)
    
    inline def setOnRefUndefined: Self = StObject.set(x, "onRef", js.undefined)
  }
}
