package typings.reactTagInput.mod

import typings.react.mod.Component
import typings.react.mod.ReactChild
import typings.reactTagInput.anon.ActiveSuggestion
import typings.reactTagInput.anon.Id
import typings.reactTagInput.reactTagInputNumbers.`1`
import typings.reactTagInput.reactTagInputStrings.`inline`
import typings.reactTagInput.reactTagInputStrings.bottom
import typings.reactTagInput.reactTagInputStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactTagsProps extends js.Object {
  var allowAdditionFromPaste: js.UndefOr[Boolean] = js.native
  var allowDeleteFromEmptyInput: js.UndefOr[Boolean] = js.native
  var allowDragDrop: js.UndefOr[Boolean] = js.native
  var allowUnique: js.UndefOr[Boolean] = js.native
  var autocomplete: js.UndefOr[Boolean | `1`] = js.native
  var autofocus: js.UndefOr[Boolean] = js.native
  var classNames: js.UndefOr[ActiveSuggestion] = js.native
  var delimiters: js.UndefOr[js.Array[Double]] = js.native
  var handleDrag: js.UndefOr[js.Function3[/* tag */ Id, /* currPos */ Double, /* newPos */ Double, Unit]] = js.native
  var handleFilterSuggestions: js.UndefOr[
    js.Function2[
      /* textInputValue */ String, 
      /* possibleSuggestionsArray */ js.Array[Tag], 
      js.Array[Tag]
    ]
  ] = js.native
  var handleInputBlur: js.UndefOr[js.Function1[/* textInputValue */ String, Unit]] = js.native
  var handleInputChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var handleInputFocus: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var handleTagClick: js.UndefOr[js.Function1[/* i */ Double, Unit]] = js.native
  var id: js.UndefOr[String] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var inputFieldPosition: js.UndefOr[top | bottom | `inline`] = js.native
  var inputValue: js.UndefOr[String] = js.native
  var labelField: js.UndefOr[String] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var minQueryLength: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var removeComponent: js.UndefOr[Component[_, _, _]] = js.native
  var renderSuggestion: js.UndefOr[js.Function2[/* tag */ Tag, /* query */ String, ReactChild | Unit]] = js.native
  var resetInputOnDelete: js.UndefOr[Boolean] = js.native
  var shouldRenderSuggestions: js.UndefOr[js.Function1[/* query */ String, Boolean]] = js.native
  var suggestions: js.UndefOr[js.Array[Tag]] = js.native
  var tags: js.UndefOr[js.Array[Tag]] = js.native
  def handleAddition(tag: Id): Unit = js.native
  def handleDelete(i: Double): Unit = js.native
}

object ReactTagsProps {
  @scala.inline
  def apply(handleAddition: Id => Unit, handleDelete: Double => Unit): ReactTagsProps = {
    val __obj = js.Dynamic.literal(handleAddition = js.Any.fromFunction1(handleAddition), handleDelete = js.Any.fromFunction1(handleDelete))
    __obj.asInstanceOf[ReactTagsProps]
  }
  @scala.inline
  implicit class ReactTagsPropsOps[Self <: ReactTagsProps] (val x: Self) extends AnyVal {
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
    def setHandleAddition(value: Id => Unit): Self = this.set("handleAddition", js.Any.fromFunction1(value))
    @scala.inline
    def setHandleDelete(value: Double => Unit): Self = this.set("handleDelete", js.Any.fromFunction1(value))
    @scala.inline
    def setAllowAdditionFromPaste(value: Boolean): Self = this.set("allowAdditionFromPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowAdditionFromPaste: Self = this.set("allowAdditionFromPaste", js.undefined)
    @scala.inline
    def setAllowDeleteFromEmptyInput(value: Boolean): Self = this.set("allowDeleteFromEmptyInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDeleteFromEmptyInput: Self = this.set("allowDeleteFromEmptyInput", js.undefined)
    @scala.inline
    def setAllowDragDrop(value: Boolean): Self = this.set("allowDragDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDragDrop: Self = this.set("allowDragDrop", js.undefined)
    @scala.inline
    def setAllowUnique(value: Boolean): Self = this.set("allowUnique", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUnique: Self = this.set("allowUnique", js.undefined)
    @scala.inline
    def setAutocomplete(value: Boolean | `1`): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutocomplete: Self = this.set("autocomplete", js.undefined)
    @scala.inline
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutofocus: Self = this.set("autofocus", js.undefined)
    @scala.inline
    def setClassNames(value: ActiveSuggestion): Self = this.set("classNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassNames: Self = this.set("classNames", js.undefined)
    @scala.inline
    def setDelimitersVarargs(value: Double*): Self = this.set("delimiters", js.Array(value :_*))
    @scala.inline
    def setDelimiters(value: js.Array[Double]): Self = this.set("delimiters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiters: Self = this.set("delimiters", js.undefined)
    @scala.inline
    def setHandleDrag(value: (/* tag */ Id, /* currPos */ Double, /* newPos */ Double) => Unit): Self = this.set("handleDrag", js.Any.fromFunction3(value))
    @scala.inline
    def deleteHandleDrag: Self = this.set("handleDrag", js.undefined)
    @scala.inline
    def setHandleFilterSuggestions(
      value: (/* textInputValue */ String, /* possibleSuggestionsArray */ js.Array[Tag]) => js.Array[Tag]
    ): Self = this.set("handleFilterSuggestions", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHandleFilterSuggestions: Self = this.set("handleFilterSuggestions", js.undefined)
    @scala.inline
    def setHandleInputBlur(value: /* textInputValue */ String => Unit): Self = this.set("handleInputBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandleInputBlur: Self = this.set("handleInputBlur", js.undefined)
    @scala.inline
    def setHandleInputChange(value: /* value */ String => Unit): Self = this.set("handleInputChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandleInputChange: Self = this.set("handleInputChange", js.undefined)
    @scala.inline
    def setHandleInputFocus(value: /* value */ String => Unit): Self = this.set("handleInputFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandleInputFocus: Self = this.set("handleInputFocus", js.undefined)
    @scala.inline
    def setHandleTagClick(value: /* i */ Double => Unit): Self = this.set("handleTagClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandleTagClick: Self = this.set("handleTagClick", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setInputFieldPosition(value: top | bottom | `inline`): Self = this.set("inputFieldPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputFieldPosition: Self = this.set("inputFieldPosition", js.undefined)
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    @scala.inline
    def setLabelField(value: String): Self = this.set("labelField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelField: Self = this.set("labelField", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMinQueryLength(value: Double): Self = this.set("minQueryLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinQueryLength: Self = this.set("minQueryLength", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRemoveComponent(value: Component[_, _, _]): Self = this.set("removeComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveComponent: Self = this.set("removeComponent", js.undefined)
    @scala.inline
    def setRenderSuggestion(value: (/* tag */ Tag, /* query */ String) => ReactChild | Unit): Self = this.set("renderSuggestion", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRenderSuggestion: Self = this.set("renderSuggestion", js.undefined)
    @scala.inline
    def setResetInputOnDelete(value: Boolean): Self = this.set("resetInputOnDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetInputOnDelete: Self = this.set("resetInputOnDelete", js.undefined)
    @scala.inline
    def setShouldRenderSuggestions(value: /* query */ String => Boolean): Self = this.set("shouldRenderSuggestions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShouldRenderSuggestions: Self = this.set("shouldRenderSuggestions", js.undefined)
    @scala.inline
    def setSuggestionsVarargs(value: Tag*): Self = this.set("suggestions", js.Array(value :_*))
    @scala.inline
    def setSuggestions(value: js.Array[Tag]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

