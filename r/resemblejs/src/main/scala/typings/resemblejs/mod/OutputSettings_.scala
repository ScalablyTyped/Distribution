package typings.resemblejs.mod

import typings.resemblejs.anon.Blue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputSettings_ extends js.Object {
  
  var errorColor: Blue = js.native
  
  var errorType: String = js.native
  
  var largeImageThreshold: Double = js.native
  
  var transparency: Double = js.native
}
object OutputSettings_ {
  
  @scala.inline
  def apply(errorColor: Blue, errorType: String, largeImageThreshold: Double, transparency: Double): OutputSettings_ = {
    val __obj = js.Dynamic.literal(errorColor = errorColor.asInstanceOf[js.Any], errorType = errorType.asInstanceOf[js.Any], largeImageThreshold = largeImageThreshold.asInstanceOf[js.Any], transparency = transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputSettings_]
  }
  
  @scala.inline
  implicit class OutputSettings_Ops[Self <: OutputSettings_] (val x: Self) extends AnyVal {
    
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
    def setErrorColor(value: Blue): Self = this.set("errorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorType(value: String): Self = this.set("errorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeImageThreshold(value: Double): Self = this.set("largeImageThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparency(value: Double): Self = this.set("transparency", value.asInstanceOf[js.Any])
  }
}
