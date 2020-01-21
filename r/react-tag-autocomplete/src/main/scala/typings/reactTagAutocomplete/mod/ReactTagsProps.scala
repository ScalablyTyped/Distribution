package typings.reactTagAutocomplete.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTagsProps extends js.Object {
  /**
    * Disables ability to delete the selected tags when backspace is pressed while focussed on the text input. Default: true.
    */
  var allowBackspace: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows users to add new (not suggested) tags. Default: false.
    */
  var allowNew: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean parameter to control whether the text-input should be autofocused on mount. Default: true.
    */
  var autofocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean parameter to control whether the text-input should be automatically resized to fit its value. Default: true.
    */
  var autoresize: js.UndefOr[Boolean] = js.undefined
  var classNames: js.UndefOr[ClassNames] = js.undefined
  /**
    * Array of characters matching keyboard event key values. This is useful when needing to support a specific character irrespective of the keyboard layout.
    * Note, that this list is separate from the one specified by the delimiters option, so you'll need to set the value there to [],
    * if you wish to disable those keys. Example usage: delimiterChars={[',', ' ']}. Default: []
    */
  var delimiterChars: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Array of integers matching keyboard event keyCode values. When a corresponding key is pressed, the preceding string is finalised as tag. Default: [9, 13] (Tab and return keys).
    */
  var delimiters: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Optional event handler when focus on the input is lost. Receives no arguments.
    */
  var handleBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Optional event handler when the input receives focus. Receives no arguments.
    */
  var handleFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Optional event handler when the input changes. Receives the current input value.
    */
  var handleInputChange: js.UndefOr[js.Function1[/* input */ String, Unit]] = js.undefined
  /**
    * Optional validation function that determines if tag should be added to tags. Receives a tag object. Should return a boolean.
    */
  var handleValidate: js.UndefOr[js.Function1[/* tag */ Tag, Boolean]] = js.undefined
  /**
    * An object containing additional attributes that will be applied to the underlying <input /> field.
    */
  var inputAttributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Maximum number of suggestions to display. Default: 6.
    */
  var maxSuggestionsLength: js.UndefOr[Double] = js.undefined
  /**
    * How many characters are needed for suggestions to appear. Default: 2.
    */
  var minQueryLength: js.UndefOr[Double] = js.undefined
  /**
    * The placeholder string shown for the input. Default: 'Add new tag'.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * An array of suggestions that are used as basis for showing suggestions. Each suggestion must have an id and a name property and an optional disabled property. Default: []
    */
  var suggestions: js.UndefOr[js.Array[Tag]] = js.undefined
  /**
    * Provide a custom tag component to render. Default: null.
    */
  var tagComponent: js.UndefOr[SFC[TagComponentProps]] = js.undefined
  /**
    * An array of tags that are displayed as pre-selected. Each tag must have an id and a name property. Default: []
    */
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
  /**
    * Function called when the user wants to add a tag. Receives the tag
    */
  def handleAddition(tag: Tag): Unit
  /**
    * Function called when the user wants to delete a tag. Receives the tag index.
    */
  def handleDelete(index: Double): Unit
}

object ReactTagsProps {
  @scala.inline
  def apply(
    handleAddition: Tag => Unit,
    handleDelete: Double => Unit,
    allowBackspace: js.UndefOr[Boolean] = js.undefined,
    allowNew: js.UndefOr[Boolean] = js.undefined,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    autoresize: js.UndefOr[Boolean] = js.undefined,
    classNames: ClassNames = null,
    delimiterChars: js.Array[String] = null,
    delimiters: js.Array[Double] = null,
    handleBlur: () => Unit = null,
    handleFocus: () => Unit = null,
    handleInputChange: /* input */ String => Unit = null,
    handleValidate: /* tag */ Tag => Boolean = null,
    inputAttributes: StringDictionary[js.Any] = null,
    maxSuggestionsLength: Int | Double = null,
    minQueryLength: Int | Double = null,
    placeholder: String = null,
    suggestions: js.Array[Tag] = null,
    tagComponent: SFC[TagComponentProps] = null,
    tags: js.Array[Tag] = null
  ): ReactTagsProps = {
    val __obj = js.Dynamic.literal(handleAddition = js.Any.fromFunction1(handleAddition), handleDelete = js.Any.fromFunction1(handleDelete))
    if (!js.isUndefined(allowBackspace)) __obj.updateDynamic("allowBackspace")(allowBackspace.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNew)) __obj.updateDynamic("allowNew")(allowNew.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (!js.isUndefined(autoresize)) __obj.updateDynamic("autoresize")(autoresize.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (delimiterChars != null) __obj.updateDynamic("delimiterChars")(delimiterChars.asInstanceOf[js.Any])
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters.asInstanceOf[js.Any])
    if (handleBlur != null) __obj.updateDynamic("handleBlur")(js.Any.fromFunction0(handleBlur))
    if (handleFocus != null) __obj.updateDynamic("handleFocus")(js.Any.fromFunction0(handleFocus))
    if (handleInputChange != null) __obj.updateDynamic("handleInputChange")(js.Any.fromFunction1(handleInputChange))
    if (handleValidate != null) __obj.updateDynamic("handleValidate")(js.Any.fromFunction1(handleValidate))
    if (inputAttributes != null) __obj.updateDynamic("inputAttributes")(inputAttributes.asInstanceOf[js.Any])
    if (maxSuggestionsLength != null) __obj.updateDynamic("maxSuggestionsLength")(maxSuggestionsLength.asInstanceOf[js.Any])
    if (minQueryLength != null) __obj.updateDynamic("minQueryLength")(minQueryLength.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (tagComponent != null) __obj.updateDynamic("tagComponent")(tagComponent.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactTagsProps]
  }
}

