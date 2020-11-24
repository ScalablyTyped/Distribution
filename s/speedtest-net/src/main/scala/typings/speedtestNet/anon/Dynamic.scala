package typings.speedtestNet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dynamic extends js.Object {
  
  var dynamic: Download = js.native
  
  var engine: IsUploadFirst = js.native
}
object Dynamic {
  
  @scala.inline
  def apply(dynamic: Download, engine: IsUploadFirst): Dynamic = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dynamic]
  }
  
  @scala.inline
  implicit class DynamicOps[Self <: Dynamic] (val x: Self) extends AnyVal {
    
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
    def setDynamic(value: Download): Self = this.set("dynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: IsUploadFirst): Self = this.set("engine", value.asInstanceOf[js.Any])
  }
}
