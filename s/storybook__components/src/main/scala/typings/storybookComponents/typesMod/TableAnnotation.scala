package typings.storybookComponents.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableAnnotation extends js.Object {
  
  var category: js.UndefOr[String] = js.native
  
  var defaultValue: js.UndefOr[PropDefaultValue] = js.native
  
  var jsDocTags: js.UndefOr[JsDocTags] = js.native
  
  var `type`: PropType = js.native
}
object TableAnnotation {
  
  @scala.inline
  def apply(`type`: PropType): TableAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableAnnotation]
  }
  
  @scala.inline
  implicit class TableAnnotationOps[Self <: TableAnnotation] (val x: Self) extends AnyVal {
    
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
    def setType(value: PropType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: PropDefaultValue): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setJsDocTags(value: JsDocTags): Self = this.set("jsDocTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsDocTags: Self = this.set("jsDocTags", js.undefined)
  }
}
