package typings.reactNavigationCore.typesMod

import typings.reactNavigationCore.anon.Data7
import typings.reactNavigationCore.anon.DataNoop
import typings.reactNavigationCore.anon.DataOptionsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationContainerEventMap extends js.Object {
  
  /**
    * Event which fires when an action is dispatched.
    * Only intended for debugging purposes, don't use it for app logic.
    * This event will be emitted before state changes have been applied.
    */
  var __unsafe_action__ : DataNoop = js.native
  
  /**
    * Event which fires when current options changes.
    */
  var options: DataOptionsObject = js.native
  
  /**
    * Event which fires when the navigation state changes.
    */
  var state: Data7 = js.native
}
object NavigationContainerEventMap {
  
  @scala.inline
  def apply(__unsafe_action__ : DataNoop, options: DataOptionsObject, state: Data7): NavigationContainerEventMap = {
    val __obj = js.Dynamic.literal(__unsafe_action__ = __unsafe_action__.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationContainerEventMap]
  }
  
  @scala.inline
  implicit class NavigationContainerEventMapOps[Self <: NavigationContainerEventMap] (val x: Self) extends AnyVal {
    
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
    def set__unsafe_action__(value: DataNoop): Self = this.set("__unsafe_action__", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: DataOptionsObject): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Data7): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
