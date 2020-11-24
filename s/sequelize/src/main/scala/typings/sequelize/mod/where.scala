package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait where extends js.Object {
  
  var attribute: js.Object = js.native
  
  var comparator: js.UndefOr[String] = js.native
  
  var logic: String | js.Object = js.native
}
object where {
  
  @scala.inline
  def apply(attribute: js.Object, logic: String | js.Object): where = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], logic = logic.asInstanceOf[js.Any])
    __obj.asInstanceOf[where]
  }
  
  @scala.inline
  implicit class whereOps[Self <: where] (val x: Self) extends AnyVal {
    
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
    def setAttribute(value: js.Object): Self = this.set("attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogic(value: String | js.Object): Self = this.set("logic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparator(value: String): Self = this.set("comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
  }
}
