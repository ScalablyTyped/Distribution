package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturningOptions extends js.Object {
  
  /**
    * Append RETURNING * to get back auto generated values (Postgres only)
    */
  var returning: js.UndefOr[Boolean] = js.native
}
object ReturningOptions {
  
  @scala.inline
  def apply(): ReturningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturningOptions]
  }
  
  @scala.inline
  implicit class ReturningOptionsOps[Self <: ReturningOptions] (val x: Self) extends AnyVal {
    
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
    def setReturning(value: Boolean): Self = this.set("returning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturning: Self = this.set("returning", js.undefined)
  }
}
