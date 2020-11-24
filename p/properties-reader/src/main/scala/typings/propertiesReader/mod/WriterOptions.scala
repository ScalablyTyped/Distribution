package typings.propertiesReader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriterOptions extends js.Object {
  
  var saveSections: Boolean = js.native
}
object WriterOptions {
  
  @scala.inline
  def apply(saveSections: Boolean): WriterOptions = {
    val __obj = js.Dynamic.literal(saveSections = saveSections.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriterOptions]
  }
  
  @scala.inline
  implicit class WriterOptionsOps[Self <: WriterOptions] (val x: Self) extends AnyVal {
    
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
    def setSaveSections(value: Boolean): Self = this.set("saveSections", value.asInstanceOf[js.Any])
  }
}
