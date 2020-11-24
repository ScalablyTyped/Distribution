package typings.showdown.mod

import typings.showdown.showdownStrings.boolean
import typings.showdown.showdownStrings.integer
import typings.showdown.showdownStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Showdown option description.
  */
@js.native
trait ShowdownOptionDescription extends js.Object {
  
  /**
    * The default value of option.
    */
  var defaultValue: js.UndefOr[Boolean] = js.native
  
  /**
    * The description of the option.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The type of the option value.
    */
  var `type`: js.UndefOr[boolean | string | integer] = js.native
}
object ShowdownOptionDescription {
  
  @scala.inline
  def apply(): ShowdownOptionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowdownOptionDescription]
  }
  
  @scala.inline
  implicit class ShowdownOptionDescriptionOps[Self <: ShowdownOptionDescription] (val x: Self) extends AnyVal {
    
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
    def setDefaultValue(value: Boolean): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setType(value: boolean | string | integer): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
