package typings.scratchEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A menu item for which the label and value can differ. */
@js.native
trait ExtensionMenuItemComplex extends js.Object {
  
  /** The human-readable label of this menu item in the menu. */
  var text: String = js.native
  
  /** The value of the block argument when this menu item is selected. */
  var value: js.Any = js.native
}
object ExtensionMenuItemComplex {
  
  @scala.inline
  def apply(text: String, value: js.Any): ExtensionMenuItemComplex = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionMenuItemComplex]
  }
  
  @scala.inline
  implicit class ExtensionMenuItemComplexOps[Self <: ExtensionMenuItemComplex] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
