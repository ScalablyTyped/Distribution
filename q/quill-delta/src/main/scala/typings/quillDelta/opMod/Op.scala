package typings.quillDelta.opMod

import typings.quillDelta.mod.AttributeMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Op extends js.Object {
  
  var attributes: js.UndefOr[AttributeMap] = js.native
  
  var delete: js.UndefOr[Double] = js.native
  
  var insert: js.UndefOr[String | js.Object] = js.native
  
  var retain: js.UndefOr[Double] = js.native
}
object Op {
  
  @scala.inline
  def apply(): Op = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Op]
  }
  
  @scala.inline
  implicit class OpOps[Self <: Op] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: AttributeMap): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setDelete(value: Double): Self = this.set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    
    @scala.inline
    def setInsert(value: String | js.Object): Self = this.set("insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    
    @scala.inline
    def setRetain(value: Double): Self = this.set("retain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetain: Self = this.set("retain", js.undefined)
  }
}
