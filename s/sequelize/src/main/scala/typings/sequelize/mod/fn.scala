package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
//  Utils
// ~~~~~~~
@js.native
trait fn extends js.Object {
  
  @JSName("clone")
  var clone_Ffn: fnStatic = js.native
}
object fn {
  
  @scala.inline
  def apply(clone: fnStatic): fn = {
    val __obj = js.Dynamic.literal(clone = clone.asInstanceOf[js.Any])
    __obj.asInstanceOf[fn]
  }
  
  @scala.inline
  implicit class fnOps[Self <: fn] (val x: Self) extends AnyVal {
    
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
    def setClone(value: fnStatic): Self = this.set("clone", value.asInstanceOf[js.Any])
  }
}
