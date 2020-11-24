package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicColorIOSTuple extends js.Object {
  
  var dark: ColorValue = js.native
  
  var light: ColorValue = js.native
}
object DynamicColorIOSTuple {
  
  @scala.inline
  def apply(dark: ColorValue, light: ColorValue): DynamicColorIOSTuple = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicColorIOSTuple]
  }
  
  @scala.inline
  implicit class DynamicColorIOSTupleOps[Self <: DynamicColorIOSTuple] (val x: Self) extends AnyVal {
    
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
    def setDark(value: ColorValue): Self = this.set("dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: ColorValue): Self = this.set("light", value.asInstanceOf[js.Any])
  }
}
