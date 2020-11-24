package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
//  Model
// ~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/model.js
//
/**
  * Options to pass to Model on drop
  */
@js.native
trait DropOptions extends LoggingOptions {
  
  /**
    * Also drop all objects depending on this table, such as views. Only works in postgres
    */
  var cascade: js.UndefOr[Boolean] = js.native
}
object DropOptions {
  
  @scala.inline
  def apply(): DropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropOptions]
  }
  
  @scala.inline
  implicit class DropOptionsOps[Self <: DropOptions] (val x: Self) extends AnyVal {
    
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
    def setCascade(value: Boolean): Self = this.set("cascade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCascade: Self = this.set("cascade", js.undefined)
  }
}
