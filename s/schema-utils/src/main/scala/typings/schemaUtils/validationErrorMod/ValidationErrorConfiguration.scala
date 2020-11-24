package typings.schemaUtils.validationErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationErrorConfiguration extends js.Object {
  
  var baseDataPath: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var postFormatter: js.UndefOr[typings.schemaUtils.validateMod.PostFormatter] = js.native
}
object ValidationErrorConfiguration {
  
  @scala.inline
  def apply(): ValidationErrorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationErrorConfiguration]
  }
  
  @scala.inline
  implicit class ValidationErrorConfigurationOps[Self <: ValidationErrorConfiguration] (val x: Self) extends AnyVal {
    
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
    def setBaseDataPath(value: String): Self = this.set("baseDataPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseDataPath: Self = this.set("baseDataPath", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPostFormatter(
      value: (/* formattedError */ String, /* error */ typings.schemaUtils.validateMod.SchemaUtilErrorObject) => String
    ): Self = this.set("postFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePostFormatter: Self = this.set("postFormatter", js.undefined)
  }
}
