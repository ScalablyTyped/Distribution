package typings.reduxOrm.databaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryClause[Payload /* <: js.Object */] extends js.Object {
  
  var payload: Payload = js.native
  
  var `type`: QueryType = js.native
}
object QueryClause {
  
  @scala.inline
  def apply[Payload /* <: js.Object */](payload: Payload, `type`: QueryType): QueryClause[Payload] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryClause[Payload]]
  }
  
  @scala.inline
  implicit class QueryClauseOps[Self <: QueryClause[_], Payload /* <: js.Object */] (val x: Self with QueryClause[Payload]) extends AnyVal {
    
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
    def setPayload(value: Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: QueryType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
