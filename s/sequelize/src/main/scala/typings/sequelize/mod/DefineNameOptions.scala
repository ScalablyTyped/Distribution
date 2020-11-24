package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for name property in DefineOptions
  *
  * @see DefineOptions
  */
@js.native
trait DefineNameOptions extends js.Object {
  
  /**
    * Plural model name
    */
  var plural: js.UndefOr[String] = js.native
  
  /**
    * Singular model name
    */
  var singular: js.UndefOr[String] = js.native
}
object DefineNameOptions {
  
  @scala.inline
  def apply(): DefineNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineNameOptions]
  }
  
  @scala.inline
  implicit class DefineNameOptionsOps[Self <: DefineNameOptions] (val x: Self) extends AnyVal {
    
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
    def setPlural(value: String): Self = this.set("plural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlural: Self = this.set("plural", js.undefined)
    
    @scala.inline
    def setSingular(value: String): Self = this.set("singular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingular: Self = this.set("singular", js.undefined)
  }
}
