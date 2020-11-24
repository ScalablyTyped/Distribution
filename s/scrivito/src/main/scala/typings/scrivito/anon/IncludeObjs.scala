package typings.scrivito.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeObjs extends js.Object {
  
  var includeObjs: Double = js.native
  
  var limit: Double = js.native
}
object IncludeObjs {
  
  @scala.inline
  def apply(includeObjs: Double, limit: Double): IncludeObjs = {
    val __obj = js.Dynamic.literal(includeObjs = includeObjs.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeObjs]
  }
  
  @scala.inline
  implicit class IncludeObjsOps[Self <: IncludeObjs] (val x: Self) extends AnyVal {
    
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
    def setIncludeObjs(value: Double): Self = this.set("includeObjs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
  }
}
