package typings.prettier.mod.doc.builders

import typings.prettier.prettierStrings.`break-parent`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreakParent_ extends _Doc {
  
  var `type`: `break-parent` = js.native
}
object BreakParent_ {
  
  @scala.inline
  def apply(`type`: `break-parent`): BreakParent_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakParent_]
  }
  
  @scala.inline
  implicit class BreakParent_Ops[Self <: BreakParent_] (val x: Self) extends AnyVal {
    
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
    def setType(value: `break-parent`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
