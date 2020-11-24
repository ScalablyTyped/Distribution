package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Through options for Include Options
  */
@js.native
trait IncludeThroughOptions extends js.Object {
  
  /**
    * A list of attributes to select from the join model for belongsToMany relations
    */
  var attributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Filter on the join model for belongsToMany relations
    */
  var where: js.UndefOr[AnyWhereOptions] = js.native
}
object IncludeThroughOptions {
  
  @scala.inline
  def apply(): IncludeThroughOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeThroughOptions]
  }
  
  @scala.inline
  implicit class IncludeThroughOptionsOps[Self <: IncludeThroughOptions] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setWhere(value: AnyWhereOptions): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
