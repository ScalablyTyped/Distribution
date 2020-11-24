package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReqlType extends js.Object {
  
  @JSName("$reql_type$")
  var Dollarreql_typeDollar: String = js.native
}
object ReqlType {
  
  @scala.inline
  def apply(Dollarreql_typeDollar: String): ReqlType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$reql_type$")(Dollarreql_typeDollar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReqlType]
  }
  
  @scala.inline
  implicit class ReqlTypeOps[Self <: ReqlType] (val x: Self) extends AnyVal {
    
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
    def setDollarreql_typeDollar(value: String): Self = this.set("$reql_type$", value.asInstanceOf[js.Any])
  }
}
