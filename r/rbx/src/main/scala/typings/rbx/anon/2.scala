package typings.rbx.anon

import typings.rbx.rbxNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends js.Object {
  
  var value: typings.rbx.rbxNumbers.`1` | typings.rbx.rbxNumbers.`2` | typings.rbx.rbxNumbers.`3` | typings.rbx.rbxNumbers.`4` | typings.rbx.rbxNumbers.`5` | typings.rbx.rbxNumbers.`6` | `7` = js.native
}
object `2` {
  
  @scala.inline
  def apply(
    value: typings.rbx.rbxNumbers.`1` | typings.rbx.rbxNumbers.`2` | typings.rbx.rbxNumbers.`3` | typings.rbx.rbxNumbers.`4` | typings.rbx.rbxNumbers.`5` | typings.rbx.rbxNumbers.`6` | `7`
  ): `2` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2Ops`[Self <: `2`] (val x: Self) extends AnyVal {
    
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
    def setValue(
      value: typings.rbx.rbxNumbers.`1` | typings.rbx.rbxNumbers.`2` | typings.rbx.rbxNumbers.`3` | typings.rbx.rbxNumbers.`4` | typings.rbx.rbxNumbers.`5` | typings.rbx.rbxNumbers.`6` | `7`
    ): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
