package typings.prismReactRenderer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultProps_ extends js.Object {
  
  var Prism: PrismLib = js.native
  
  var theme: PrismTheme = js.native
}
object DefaultProps_ {
  
  @scala.inline
  def apply(Prism: PrismLib, theme: PrismTheme): DefaultProps_ = {
    val __obj = js.Dynamic.literal(Prism = Prism.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProps_]
  }
  
  @scala.inline
  implicit class DefaultProps_Ops[Self <: DefaultProps_] (val x: Self) extends AnyVal {
    
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
    def setPrism(value: PrismLib): Self = this.set("Prism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: PrismTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
}
