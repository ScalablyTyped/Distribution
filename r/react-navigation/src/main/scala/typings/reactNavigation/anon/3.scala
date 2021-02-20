package typings.reactNavigation.anon

import typings.react.mod.Component
import typings.react.mod.Ref
import typings.reactNavigation.mod.NavigationInjectedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3`[T, P] extends StObject {
  
  var onRef: js.UndefOr[Ref[Component[T with NavigationInjectedProps[P], js.Object, _]]] = js.native
}
object `3` {
  
  @scala.inline
  def apply[T, P](): `3`[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`[T, P]]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`[_, _], T, P] (val x: Self with (`3`[T, P])) extends AnyVal {
    
    @scala.inline
    def setOnRef(value: Ref[Component[T with NavigationInjectedProps[P], js.Object, _]]): Self = StObject.set(x, "onRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRefFunction1(value: /* instance */ (Component[T with NavigationInjectedProps[P], js.Object, _]) | Null => Unit): Self = StObject.set(x, "onRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRefNull: Self = StObject.set(x, "onRef", null)
    
    @scala.inline
    def setOnRefUndefined: Self = StObject.set(x, "onRef", js.undefined)
  }
}
