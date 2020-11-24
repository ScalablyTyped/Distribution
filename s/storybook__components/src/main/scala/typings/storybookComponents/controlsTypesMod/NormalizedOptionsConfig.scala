package typings.storybookComponents.controlsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizedOptionsConfig extends js.Object {
  
  var options: OptionsObject = js.native
}
object NormalizedOptionsConfig {
  
  @scala.inline
  def apply(options: OptionsObject): NormalizedOptionsConfig = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedOptionsConfig]
  }
  
  @scala.inline
  implicit class NormalizedOptionsConfigOps[Self <: NormalizedOptionsConfig] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: OptionsObject): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
