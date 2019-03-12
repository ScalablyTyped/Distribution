package typings
package reactDashTagDashInputLib.reactDashTagDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTagsProps extends js.Object {
  var allowDeleteFromEmptyInput: js.UndefOr[scala.Boolean] = js.undefined
  var allowDragDrop: js.UndefOr[scala.Boolean] = js.undefined
  var allowUnique: js.UndefOr[scala.Boolean] = js.undefined
  var autocomplete: js.UndefOr[scala.Boolean | reactDashTagDashInputLib.reactDashTagDashInputLibNumbers.`1`] = js.undefined
  var autofocus: js.UndefOr[scala.Boolean] = js.undefined
  var classNames: js.UndefOr[reactDashTagDashInputLib.Anon_ActiveSuggestion] = js.undefined
  var delimiters: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var handleDrag: js.UndefOr[
    js.Function3[
      /* tag */ reactDashTagDashInputLib.Anon_Id, 
      /* currPos */ scala.Double, 
      /* newPos */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var handleFilterSuggestions: js.UndefOr[
    js.Function2[
      /* textInputValue */ java.lang.String, 
      /* possibleSuggestionsArray */ js.Array[reactDashTagDashInputLib.Anon_Id], 
      js.Array[reactDashTagDashInputLib.Anon_Id]
    ]
  ] = js.undefined
  var handleInputBlur: js.UndefOr[js.Function1[/* textInputValue */ java.lang.String, scala.Unit]] = js.undefined
  var handleInputChange: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var handleInputFocus: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var handleTagClick: js.UndefOr[js.Function1[/* i */ scala.Double, scala.Unit]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var labelField: js.UndefOr[java.lang.String] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var minQueryLength: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var removeComponent: js.UndefOr[reactLib.reactMod.Component[_, _, _]] = js.undefined
  var suggestions: js.UndefOr[js.Array[reactDashTagDashInputLib.Anon_Id]] = js.undefined
  var tags: js.UndefOr[js.Array[reactDashTagDashInputLib.Anon_Id]] = js.undefined
  def handleAddition(tag: reactDashTagDashInputLib.Anon_Id): scala.Unit
  def handleDelete(i: scala.Double): scala.Unit
}

object ReactTagsProps {
  @scala.inline
  def apply(
    handleAddition: reactDashTagDashInputLib.Anon_Id => scala.Unit,
    handleDelete: scala.Double => scala.Unit,
    allowDeleteFromEmptyInput: js.UndefOr[scala.Boolean] = js.undefined,
    allowDragDrop: js.UndefOr[scala.Boolean] = js.undefined,
    allowUnique: js.UndefOr[scala.Boolean] = js.undefined,
    autocomplete: scala.Boolean | reactDashTagDashInputLib.reactDashTagDashInputLibNumbers.`1` = null,
    autofocus: js.UndefOr[scala.Boolean] = js.undefined,
    classNames: reactDashTagDashInputLib.Anon_ActiveSuggestion = null,
    delimiters: js.Array[scala.Double] = null,
    handleDrag: (/* tag */ reactDashTagDashInputLib.Anon_Id, /* currPos */ scala.Double, /* newPos */ scala.Double) => scala.Unit = null,
    handleFilterSuggestions: (/* textInputValue */ java.lang.String, /* possibleSuggestionsArray */ js.Array[reactDashTagDashInputLib.Anon_Id]) => js.Array[reactDashTagDashInputLib.Anon_Id] = null,
    handleInputBlur: /* textInputValue */ java.lang.String => scala.Unit = null,
    handleInputChange: /* value */ java.lang.String => scala.Unit = null,
    handleInputFocus: /* value */ java.lang.String => scala.Unit = null,
    handleTagClick: /* i */ scala.Double => scala.Unit = null,
    id: java.lang.String = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    labelField: java.lang.String = null,
    maxLength: scala.Int | scala.Double = null,
    minQueryLength: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    placeholder: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    removeComponent: reactLib.reactMod.Component[_, _, _] = null,
    suggestions: js.Array[reactDashTagDashInputLib.Anon_Id] = null,
    tags: js.Array[reactDashTagDashInputLib.Anon_Id] = null
  ): ReactTagsProps = {
    val __obj = js.Dynamic.literal(handleAddition = js.Any.fromFunction1(handleAddition), handleDelete = js.Any.fromFunction1(handleDelete))
    if (!js.isUndefined(allowDeleteFromEmptyInput)) __obj.updateDynamic("allowDeleteFromEmptyInput")(allowDeleteFromEmptyInput)
    if (!js.isUndefined(allowDragDrop)) __obj.updateDynamic("allowDragDrop")(allowDragDrop)
    if (!js.isUndefined(allowUnique)) __obj.updateDynamic("allowUnique")(allowUnique)
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus)
    if (classNames != null) __obj.updateDynamic("classNames")(classNames)
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters)
    if (handleDrag != null) __obj.updateDynamic("handleDrag")(js.Any.fromFunction3(handleDrag))
    if (handleFilterSuggestions != null) __obj.updateDynamic("handleFilterSuggestions")(js.Any.fromFunction2(handleFilterSuggestions))
    if (handleInputBlur != null) __obj.updateDynamic("handleInputBlur")(js.Any.fromFunction1(handleInputBlur))
    if (handleInputChange != null) __obj.updateDynamic("handleInputChange")(js.Any.fromFunction1(handleInputChange))
    if (handleInputFocus != null) __obj.updateDynamic("handleInputFocus")(js.Any.fromFunction1(handleInputFocus))
    if (handleTagClick != null) __obj.updateDynamic("handleTagClick")(js.Any.fromFunction1(handleTagClick))
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (labelField != null) __obj.updateDynamic("labelField")(labelField)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minQueryLength != null) __obj.updateDynamic("minQueryLength")(minQueryLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (removeComponent != null) __obj.updateDynamic("removeComponent")(removeComponent)
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ReactTagsProps]
  }
}

