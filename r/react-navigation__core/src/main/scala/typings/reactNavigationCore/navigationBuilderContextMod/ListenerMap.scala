package typings.reactNavigationCore.navigationBuilderContextMod

import typings.reactNavigationCore.anon.Handled
import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerMap extends js.Object {
  
  var action: ChildActionListener = js.native
  
  var focus: FocusedNavigationListener = js.native
}
object ListenerMap {
  
  @scala.inline
  def apply(
    action: (/* action */ NavigationAction, /* visitedNavigators */ js.UndefOr[Set[String]]) => Boolean,
    focus: /* callback */ FocusedNavigationCallback[js.Any] => Handled[js.Any]
  ): ListenerMap = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction2(action), focus = js.Any.fromFunction1(focus))
    __obj.asInstanceOf[ListenerMap]
  }
  
  @scala.inline
  implicit class ListenerMapOps[Self <: ListenerMap] (val x: Self) extends AnyVal {
    
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
    def setAction(value: (/* action */ NavigationAction, /* visitedNavigators */ js.UndefOr[Set[String]]) => Boolean): Self = this.set("action", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFocus(value: /* callback */ FocusedNavigationCallback[js.Any] => Handled[js.Any]): Self = this.set("focus", js.Any.fromFunction1(value))
  }
}
