package typings.scrivito.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditingConfig extends js.Object {
  
  var attributes: js.UndefOr[EditingConfigAttributes] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var descriptionForContent: js.UndefOr[js.Function1[/* instance */ Obj | Widget, String]] = js.native
  
  var hideInSelectionDialogs: js.UndefOr[Boolean] = js.native
  
  var initialContent: js.UndefOr[Record[String, _]] = js.native
  
  var initializeCopy: js.UndefOr[js.Function1[/* originalInstance */ Obj, Unit]] = js.native
  
  var properties: js.UndefOr[js.Array[String]] = js.native
  
  var propertiesGroups: js.UndefOr[js.Array[PropertiesGroup]] = js.native
  
  var thumbnail: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleForContent: js.UndefOr[js.Function1[/* instance */ Obj | Widget, String | Unit]] = js.native
  
  var validations: js.UndefOr[js.Array[Validation]] = js.native
}
object EditingConfig {
  
  @scala.inline
  def apply(): EditingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditingConfig]
  }
  
  @scala.inline
  implicit class EditingConfigOps[Self <: EditingConfig] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: EditingConfigAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionForContent(value: /* instance */ Obj | Widget => String): Self = this.set("descriptionForContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDescriptionForContent: Self = this.set("descriptionForContent", js.undefined)
    
    @scala.inline
    def setHideInSelectionDialogs(value: Boolean): Self = this.set("hideInSelectionDialogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideInSelectionDialogs: Self = this.set("hideInSelectionDialogs", js.undefined)
    
    @scala.inline
    def setInitialContent(value: Record[String, _]): Self = this.set("initialContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialContent: Self = this.set("initialContent", js.undefined)
    
    @scala.inline
    def setInitializeCopy(value: /* originalInstance */ Obj => Unit): Self = this.set("initializeCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInitializeCopy: Self = this.set("initializeCopy", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: String*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setPropertiesGroupsVarargs(value: PropertiesGroup*): Self = this.set("propertiesGroups", js.Array(value :_*))
    
    @scala.inline
    def setPropertiesGroups(value: js.Array[PropertiesGroup]): Self = this.set("propertiesGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertiesGroups: Self = this.set("propertiesGroups", js.undefined)
    
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleForContent(value: /* instance */ Obj | Widget => String | Unit): Self = this.set("titleForContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTitleForContent: Self = this.set("titleForContent", js.undefined)
    
    @scala.inline
    def setValidationsVarargs(value: Validation*): Self = this.set("validations", js.Array(value :_*))
    
    @scala.inline
    def setValidations(value: js.Array[Validation]): Self = this.set("validations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidations: Self = this.set("validations", js.undefined)
  }
}
