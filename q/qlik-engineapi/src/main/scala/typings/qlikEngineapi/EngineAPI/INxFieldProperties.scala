package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INxFieldProperties extends js.Object {
  
  var qOneAndOnlyOne: Boolean = js.native
}
object INxFieldProperties {
  
  @scala.inline
  def apply(qOneAndOnlyOne: Boolean): INxFieldProperties = {
    val __obj = js.Dynamic.literal(qOneAndOnlyOne = qOneAndOnlyOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxFieldProperties]
  }
  
  @scala.inline
  implicit class INxFieldPropertiesOps[Self <: INxFieldProperties] (val x: Self) extends AnyVal {
    
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
    def setQOneAndOnlyOne(value: Boolean): Self = this.set("qOneAndOnlyOne", value.asInstanceOf[js.Any])
  }
}
