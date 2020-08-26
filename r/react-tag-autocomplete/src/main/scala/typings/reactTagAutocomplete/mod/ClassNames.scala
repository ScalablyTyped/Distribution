package typings.reactTagAutocomplete.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassNames extends js.Object {
  var root: String = js.native
  var rootFocused: String = js.native
  var search: String = js.native
  var searchInput: String = js.native
  var selected: String = js.native
  var selectedTag: String = js.native
  var selectedTagName: String = js.native
  var suggestionActive: String = js.native
  var suggestionDisabled: String = js.native
  var suggestions: String = js.native
}

object ClassNames {
  @scala.inline
  def apply(
    root: String,
    rootFocused: String,
    search: String,
    searchInput: String,
    selected: String,
    selectedTag: String,
    selectedTagName: String,
    suggestionActive: String,
    suggestionDisabled: String,
    suggestions: String
  ): ClassNames = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], rootFocused = rootFocused.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], searchInput = searchInput.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectedTag = selectedTag.asInstanceOf[js.Any], selectedTagName = selectedTagName.asInstanceOf[js.Any], suggestionActive = suggestionActive.asInstanceOf[js.Any], suggestionDisabled = suggestionDisabled.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNames]
  }
  @scala.inline
  implicit class ClassNamesOps[Self <: ClassNames] (val x: Self) extends AnyVal {
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
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootFocused(value: String): Self = this.set("rootFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchInput(value: String): Self = this.set("searchInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedTag(value: String): Self = this.set("selectedTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedTagName(value: String): Self = this.set("selectedTagName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestionActive(value: String): Self = this.set("suggestionActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestionDisabled(value: String): Self = this.set("suggestionDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestions(value: String): Self = this.set("suggestions", value.asInstanceOf[js.Any])
  }
  
}

