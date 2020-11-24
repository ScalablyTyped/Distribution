package typings.rbx.titleTitleMod

import typings.rbx.rbxNumbers.`1`
import typings.rbx.rbxNumbers.`2`
import typings.rbx.rbxNumbers.`3`
import typings.rbx.rbxNumbers.`4`
import typings.rbx.rbxNumbers.`5`
import typings.rbx.rbxNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TitleVariablesDefaults extends js.Object {
  
  var sizes: `1` | `2` | `3` | `4` | `5` | `6` = js.native
}
object TitleVariablesDefaults {
  
  @scala.inline
  def apply(sizes: `1` | `2` | `3` | `4` | `5` | `6`): TitleVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleVariablesDefaults]
  }
  
  @scala.inline
  implicit class TitleVariablesDefaultsOps[Self <: TitleVariablesDefaults] (val x: Self) extends AnyVal {
    
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
    def setSizes(value: `1` | `2` | `3` | `4` | `5` | `6`): Self = this.set("sizes", value.asInstanceOf[js.Any])
  }
}
