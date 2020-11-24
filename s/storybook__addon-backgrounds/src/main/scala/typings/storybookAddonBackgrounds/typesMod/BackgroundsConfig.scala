package typings.storybookAddonBackgrounds.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundsConfig extends js.Object {
  
  var backgrounds: js.Array[Background] | Null = js.native
  
  var defaultBackgroundName: String | Null = js.native
  
  var disable: Boolean = js.native
  
  var selectedBackgroundName: String | Null = js.native
}
object BackgroundsConfig {
  
  @scala.inline
  def apply(disable: Boolean): BackgroundsConfig = {
    val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundsConfig]
  }
  
  @scala.inline
  implicit class BackgroundsConfigOps[Self <: BackgroundsConfig] (val x: Self) extends AnyVal {
    
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
    def setDisable(value: Boolean): Self = this.set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundsVarargs(value: Background*): Self = this.set("backgrounds", js.Array(value :_*))
    
    @scala.inline
    def setBackgrounds(value: js.Array[Background]): Self = this.set("backgrounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundsNull: Self = this.set("backgrounds", null)
    
    @scala.inline
    def setDefaultBackgroundName(value: String): Self = this.set("defaultBackgroundName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultBackgroundNameNull: Self = this.set("defaultBackgroundName", null)
    
    @scala.inline
    def setSelectedBackgroundName(value: String): Self = this.set("selectedBackgroundName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedBackgroundNameNull: Self = this.set("selectedBackgroundName", null)
  }
}
