package typings.qlik.mod

import typings.qlik.qlikStrings.add
import typings.qlik.qlikStrings.remove
import typings.qlik.qlikStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Patch extends js.Object {
  
  var qOp: add | remove | replace = js.native
  
  var qPath: String = js.native
  
  var qValue: String = js.native
}
object Patch {
  
  @scala.inline
  def apply(qOp: add | remove | replace, qPath: String, qValue: String): Patch = {
    val __obj = js.Dynamic.literal(qOp = qOp.asInstanceOf[js.Any], qPath = qPath.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Patch]
  }
  
  @scala.inline
  implicit class PatchOps[Self <: Patch] (val x: Self) extends AnyVal {
    
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
    def setQOp(value: add | remove | replace): Self = this.set("qOp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPath(value: String): Self = this.set("qPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValue(value: String): Self = this.set("qValue", value.asInstanceOf[js.Any])
  }
}
