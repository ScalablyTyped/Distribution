package typings.reactTagInput.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveSuggestion extends js.Object {
  
  var activeSuggestion: js.UndefOr[String] = js.native
  
  var remove: js.UndefOr[String] = js.native
  
  var selected: js.UndefOr[String] = js.native
  
  var suggestions: js.UndefOr[String] = js.native
  
  var tag: js.UndefOr[String] = js.native
  
  var tagInput: js.UndefOr[String] = js.native
  
  var tagInputField: js.UndefOr[String] = js.native
  
  var tags: js.UndefOr[String] = js.native
}
object ActiveSuggestion {
  
  @scala.inline
  def apply(): ActiveSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveSuggestion]
  }
  
  @scala.inline
  implicit class ActiveSuggestionOps[Self <: ActiveSuggestion] (val x: Self) extends AnyVal {
    
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
    def setActiveSuggestion(value: String): Self = this.set("activeSuggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveSuggestion: Self = this.set("activeSuggestion", js.undefined)
    
    @scala.inline
    def setRemove(value: String): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSuggestions(value: String): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setTagInput(value: String): Self = this.set("tagInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagInput: Self = this.set("tagInput", js.undefined)
    
    @scala.inline
    def setTagInputField(value: String): Self = this.set("tagInputField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagInputField: Self = this.set("tagInputField", js.undefined)
    
    @scala.inline
    def setTags(value: String): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
