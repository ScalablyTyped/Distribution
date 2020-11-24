package typings.restIo.authorizedResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMethodAccess extends js.Object {
  
  var create: js.Array[String] = js.native
  
  var del: js.Array[String] = js.native
  
  var getAll: js.Array[String] = js.native
  
  var getById: js.Array[String] = js.native
  
  var update: js.Array[String] = js.native
}
object IMethodAccess {
  
  @scala.inline
  def apply(
    create: js.Array[String],
    del: js.Array[String],
    getAll: js.Array[String],
    getById: js.Array[String],
    update: js.Array[String]
  ): IMethodAccess = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], getAll = getAll.asInstanceOf[js.Any], getById = getById.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMethodAccess]
  }
  
  @scala.inline
  implicit class IMethodAccessOps[Self <: IMethodAccess] (val x: Self) extends AnyVal {
    
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
    def setCreateVarargs(value: String*): Self = this.set("create", js.Array(value :_*))
    
    @scala.inline
    def setCreate(value: js.Array[String]): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelVarargs(value: String*): Self = this.set("del", js.Array(value :_*))
    
    @scala.inline
    def setDel(value: js.Array[String]): Self = this.set("del", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAllVarargs(value: String*): Self = this.set("getAll", js.Array(value :_*))
    
    @scala.inline
    def setGetAll(value: js.Array[String]): Self = this.set("getAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetByIdVarargs(value: String*): Self = this.set("getById", js.Array(value :_*))
    
    @scala.inline
    def setGetById(value: js.Array[String]): Self = this.set("getById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateVarargs(value: String*): Self = this.set("update", js.Array(value :_*))
    
    @scala.inline
    def setUpdate(value: js.Array[String]): Self = this.set("update", value.asInstanceOf[js.Any])
  }
}
