package typings.reactNavigationCore.anon

import typings.reactNavigationRouters.typesMod.NavigationAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Noop extends js.Object {
  
  /**
    * The action object which was dispatched.
    */
  var action: NavigationAction = js.native
  
  /**
    * Whether the action was a no-op, i.e. resulted any state changes.
    */
  var noop: Boolean = js.native
}
object Noop {
  
  @scala.inline
  def apply(action: NavigationAction, noop: Boolean): Noop = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], noop = noop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Noop]
  }
  
  @scala.inline
  implicit class NoopOps[Self <: Noop] (val x: Self) extends AnyVal {
    
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
    def setAction(value: NavigationAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoop(value: Boolean): Self = this.set("noop", value.asInstanceOf[js.Any])
  }
}
