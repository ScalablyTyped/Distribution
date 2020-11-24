package typings.reactNative.anon

import typings.reactNative.mod.ColorValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait False extends js.Object {
  
  var `false`: ColorValue = js.native
  
  var `true`: ColorValue = js.native
}
object False {
  
  @scala.inline
  def apply(`false`: ColorValue, `true`: ColorValue): False = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("false")(`false`.asInstanceOf[js.Any])
    __obj.updateDynamic("true")(`true`.asInstanceOf[js.Any])
    __obj.asInstanceOf[False]
  }
  
  @scala.inline
  implicit class FalseOps[Self <: False] (val x: Self) extends AnyVal {
    
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
    def setFalse(value: ColorValue): Self = this.set("false", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrue(value: ColorValue): Self = this.set("true", value.asInstanceOf[js.Any])
  }
}
