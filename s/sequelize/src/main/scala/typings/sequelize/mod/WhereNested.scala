package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Where Complex nested query
  */
@js.native
trait WhereNested extends js.Object {
  
  @JSName("$and")
  var $and: js.Array[AnyWhereOptions | WhereLogic] = js.native
  
  @JSName("$or")
  var $or: js.Array[AnyWhereOptions | WhereLogic] = js.native
}
object WhereNested {
  
  @scala.inline
  def apply($and: js.Array[AnyWhereOptions | WhereLogic], $or: js.Array[AnyWhereOptions | WhereLogic]): WhereNested = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any], $or = $or.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhereNested]
  }
  
  @scala.inline
  implicit class WhereNestedOps[Self <: WhereNested] (val x: Self) extends AnyVal {
    
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
    def set$andVarargs(value: (AnyWhereOptions | WhereLogic)*): Self = this.set("$and", js.Array(value :_*))
    
    @scala.inline
    def set$and(value: js.Array[AnyWhereOptions | WhereLogic]): Self = this.set("$and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$orVarargs(value: (AnyWhereOptions | WhereLogic)*): Self = this.set("$or", js.Array(value :_*))
    
    @scala.inline
    def set$or(value: js.Array[AnyWhereOptions | WhereLogic]): Self = this.set("$or", value.asInstanceOf[js.Any])
  }
}
