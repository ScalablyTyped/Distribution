package typings.requireHacker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalHookOptions extends js.Object {
  
  /**
    * Set the `require` interception behavior:
    * - `true` Intercept all `require` calls before they are passed to the Node.js `require` loader.
    * - `false` Intercept only those `require` calls which failed to be resolved by the Node.js `require`
    * loader.
    */
  var precede_node_loader: js.UndefOr[Boolean] = js.native
}
object GlobalHookOptions {
  
  @scala.inline
  def apply(): GlobalHookOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalHookOptions]
  }
  
  @scala.inline
  implicit class GlobalHookOptionsOps[Self <: GlobalHookOptions] (val x: Self) extends AnyVal {
    
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
    def setPrecede_node_loader(value: Boolean): Self = this.set("precede_node_loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecede_node_loader: Self = this.set("precede_node_loader", js.undefined)
  }
}
