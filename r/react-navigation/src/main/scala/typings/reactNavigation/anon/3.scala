package typings.reactNavigation.anon

import typings.react.mod.Component
import typings.react.mod.Ref
import typings.reactNavigation.mod.NavigationInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3`[T, P] extends js.Object {
  
  var onRef: js.UndefOr[Ref[Component[T with NavigationInjectedProps[P], js.Object, _]]] = js.native
}
object `3` {
  
  @scala.inline
  def apply[T, P](): `3`[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`[T, P]]
  }
  
  @scala.inline
  implicit class `3Ops`[Self <: `3`[_, _], T, P] (val x: Self with (`3`[T, P])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnRefFunction1(value: /* instance */ (Component[T with NavigationInjectedProps[P], js.Object, _]) | Null => Unit): Self = this.set("onRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRef(value: Ref[Component[T with NavigationInjectedProps[P], js.Object, _]]): Self = this.set("onRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRef: Self = this.set("onRef", js.undefined)
    
    @scala.inline
    def setOnRefNull: Self = this.set("onRef", null)
  }
}
