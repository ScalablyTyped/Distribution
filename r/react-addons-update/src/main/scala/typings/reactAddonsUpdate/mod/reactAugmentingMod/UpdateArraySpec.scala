package typings.reactAddonsUpdate.mod.reactAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateArraySpec extends UpdateSpecCommand {
  
  @JSName("$push")
  var $push: js.UndefOr[js.Array[_]] = js.native
  
  @JSName("$splice")
  var $splice: js.UndefOr[js.Array[js.Array[_]]] = js.native
  
  @JSName("$unshift")
  var $unshift: js.UndefOr[js.Array[_]] = js.native
}
object UpdateArraySpec {
  
  @scala.inline
  def apply(): UpdateArraySpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateArraySpec]
  }
  
  @scala.inline
  implicit class UpdateArraySpecOps[Self <: UpdateArraySpec] (val x: Self) extends AnyVal {
    
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
    def set$pushVarargs(value: js.Any*): Self = this.set("$push", js.Array(value :_*))
    
    @scala.inline
    def set$push(value: js.Array[_]): Self = this.set("$push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$push: Self = this.set("$push", js.undefined)
    
    @scala.inline
    def set$spliceVarargs(value: js.Array[js.Any]*): Self = this.set("$splice", js.Array(value :_*))
    
    @scala.inline
    def set$splice(value: js.Array[js.Array[_]]): Self = this.set("$splice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$splice: Self = this.set("$splice", js.undefined)
    
    @scala.inline
    def set$unshiftVarargs(value: js.Any*): Self = this.set("$unshift", js.Array(value :_*))
    
    @scala.inline
    def set$unshift(value: js.Array[_]): Self = this.set("$unshift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$unshift: Self = this.set("$unshift", js.undefined)
  }
}
