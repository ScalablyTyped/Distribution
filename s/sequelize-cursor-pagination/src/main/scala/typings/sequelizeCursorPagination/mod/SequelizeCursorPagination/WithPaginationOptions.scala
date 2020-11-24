package typings.sequelizeCursorPagination.mod.SequelizeCursorPagination

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithPaginationOptions[MethodName /* <: String */] extends js.Object {
  
  var methodName: js.UndefOr[MethodName] = js.native
  
   // [default: 'paginate']
  var primaryKeyField: js.UndefOr[String] = js.native
}
object WithPaginationOptions {
  
  @scala.inline
  def apply[MethodName /* <: String */](): WithPaginationOptions[MethodName] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithPaginationOptions[MethodName]]
  }
  
  @scala.inline
  implicit class WithPaginationOptionsOps[Self <: WithPaginationOptions[_], MethodName /* <: String */] (val x: Self with WithPaginationOptions[MethodName]) extends AnyVal {
    
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
    def setMethodName(value: MethodName): Self = this.set("methodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethodName: Self = this.set("methodName", js.undefined)
    
    @scala.inline
    def setPrimaryKeyField(value: String): Self = this.set("primaryKeyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryKeyField: Self = this.set("primaryKeyField", js.undefined)
  }
}
