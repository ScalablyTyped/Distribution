package typings.propertiesReader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppenderOptions extends js.Object {
  
  var allowDuplicateSections: Boolean = js.native
}
object AppenderOptions {
  
  @scala.inline
  def apply(allowDuplicateSections: Boolean): AppenderOptions = {
    val __obj = js.Dynamic.literal(allowDuplicateSections = allowDuplicateSections.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppenderOptions]
  }
  
  @scala.inline
  implicit class AppenderOptionsOps[Self <: AppenderOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowDuplicateSections(value: Boolean): Self = this.set("allowDuplicateSections", value.asInstanceOf[js.Any])
  }
}
