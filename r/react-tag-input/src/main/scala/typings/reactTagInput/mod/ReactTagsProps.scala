package typings.reactTagInput.mod

import typings.react.mod.Component
import typings.react.mod.ReactChild
import typings.reactTagInput.AnonActiveSuggestion
import typings.reactTagInput.AnonId
import typings.reactTagInput.reactTagInputNumbers.`1`
import typings.reactTagInput.reactTagInputStrings.`inline`
import typings.reactTagInput.reactTagInputStrings.bottom
import typings.reactTagInput.reactTagInputStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTagsProps extends js.Object {
  var allowAdditionFromPaste: js.UndefOr[Boolean] = js.undefined
  var allowDeleteFromEmptyInput: js.UndefOr[Boolean] = js.undefined
  var allowDragDrop: js.UndefOr[Boolean] = js.undefined
  var allowUnique: js.UndefOr[Boolean] = js.undefined
  var autocomplete: js.UndefOr[Boolean | `1`] = js.undefined
  var autofocus: js.UndefOr[Boolean] = js.undefined
  var classNames: js.UndefOr[AnonActiveSuggestion] = js.undefined
  var delimiters: js.UndefOr[js.Array[Double]] = js.undefined
  var handleDrag: js.UndefOr[js.Function3[/* tag */ AnonId, /* currPos */ Double, /* newPos */ Double, Unit]] = js.undefined
  var handleFilterSuggestions: js.UndefOr[
    js.Function2[
      /* textInputValue */ String, 
      /* possibleSuggestionsArray */ js.Array[Tag], 
      js.Array[Tag]
    ]
  ] = js.undefined
  var handleInputBlur: js.UndefOr[js.Function1[/* textInputValue */ String, Unit]] = js.undefined
  var handleInputChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var handleInputFocus: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var handleTagClick: js.UndefOr[js.Function1[/* i */ Double, Unit]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var inputFieldPosition: js.UndefOr[top | bottom | `inline`] = js.undefined
  var inputValue: js.UndefOr[String] = js.undefined
  var labelField: js.UndefOr[String] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var minQueryLength: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var removeComponent: js.UndefOr[Component[_, _, _]] = js.undefined
  var renderSuggestion: js.UndefOr[js.Function2[/* tag */ Tag, /* query */ String, ReactChild | Unit]] = js.undefined
  var resetInputOnDelete: js.UndefOr[Boolean] = js.undefined
  var shouldRenderSuggestions: js.UndefOr[js.Function1[/* query */ String, Boolean]] = js.undefined
  var suggestions: js.UndefOr[js.Array[Tag]] = js.undefined
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
  def handleAddition(tag: AnonId): Unit
  def handleDelete(i: Double): Unit
}

object ReactTagsProps {
  @scala.inline
  def apply(
    handleAddition: AnonId => Unit,
    handleDelete: Double => Unit,
    allowAdditionFromPaste: js.UndefOr[Boolean] = js.undefined,
    allowDeleteFromEmptyInput: js.UndefOr[Boolean] = js.undefined,
    allowDragDrop: js.UndefOr[Boolean] = js.undefined,
    allowUnique: js.UndefOr[Boolean] = js.undefined,
    autocomplete: Boolean | `1` = null,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    classNames: AnonActiveSuggestion = null,
    delimiters: js.Array[Double] = null,
    handleDrag: (/* tag */ AnonId, /* currPos */ Double, /* newPos */ Double) => Unit = null,
    handleFilterSuggestions: (/* textInputValue */ String, /* possibleSuggestionsArray */ js.Array[Tag]) => js.Array[Tag] = null,
    handleInputBlur: /* textInputValue */ String => Unit = null,
    handleInputChange: /* value */ String => Unit = null,
    handleInputFocus: /* value */ String => Unit = null,
    handleTagClick: /* i */ Double => Unit = null,
    id: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    inputFieldPosition: top | bottom | `inline` = null,
    inputValue: String = null,
    labelField: String = null,
    maxLength: Int | Double = null,
    minQueryLength: Int | Double = null,
    name: String = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    removeComponent: Component[_, _, _] = null,
    renderSuggestion: (/* tag */ Tag, /* query */ String) => ReactChild | Unit = null,
    resetInputOnDelete: js.UndefOr[Boolean] = js.undefined,
    shouldRenderSuggestions: /* query */ String => Boolean = null,
    suggestions: js.Array[Tag] = null,
    tags: js.Array[Tag] = null
  ): ReactTagsProps = {
    val __obj = js.Dynamic.literal(handleAddition = js.Any.fromFunction1(handleAddition), handleDelete = js.Any.fromFunction1(handleDelete))
    if (!js.isUndefined(allowAdditionFromPaste)) __obj.updateDynamic("allowAdditionFromPaste")(allowAdditionFromPaste.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDeleteFromEmptyInput)) __obj.updateDynamic("allowDeleteFromEmptyInput")(allowDeleteFromEmptyInput.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDragDrop)) __obj.updateDynamic("allowDragDrop")(allowDragDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUnique)) __obj.updateDynamic("allowUnique")(allowUnique.asInstanceOf[js.Any])
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters.asInstanceOf[js.Any])
    if (handleDrag != null) __obj.updateDynamic("handleDrag")(js.Any.fromFunction3(handleDrag))
    if (handleFilterSuggestions != null) __obj.updateDynamic("handleFilterSuggestions")(js.Any.fromFunction2(handleFilterSuggestions))
    if (handleInputBlur != null) __obj.updateDynamic("handleInputBlur")(js.Any.fromFunction1(handleInputBlur))
    if (handleInputChange != null) __obj.updateDynamic("handleInputChange")(js.Any.fromFunction1(handleInputChange))
    if (handleInputFocus != null) __obj.updateDynamic("handleInputFocus")(js.Any.fromFunction1(handleInputFocus))
    if (handleTagClick != null) __obj.updateDynamic("handleTagClick")(js.Any.fromFunction1(handleTagClick))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (inputFieldPosition != null) __obj.updateDynamic("inputFieldPosition")(inputFieldPosition.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (labelField != null) __obj.updateDynamic("labelField")(labelField.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minQueryLength != null) __obj.updateDynamic("minQueryLength")(minQueryLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (removeComponent != null) __obj.updateDynamic("removeComponent")(removeComponent.asInstanceOf[js.Any])
    if (renderSuggestion != null) __obj.updateDynamic("renderSuggestion")(js.Any.fromFunction2(renderSuggestion))
    if (!js.isUndefined(resetInputOnDelete)) __obj.updateDynamic("resetInputOnDelete")(resetInputOnDelete.asInstanceOf[js.Any])
    if (shouldRenderSuggestions != null) __obj.updateDynamic("shouldRenderSuggestions")(js.Any.fromFunction1(shouldRenderSuggestions))
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactTagsProps]
  }
}

