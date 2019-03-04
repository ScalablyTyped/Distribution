package typings
package reactDashTagDashAutocompleteLib.reactDashTagDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTagsProps extends js.Object {
  /**
    * Disables ability to delete the selected tags when backspace is pressed while focussed on the text input. Default: true.
    */
  var allowBackspace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allows users to add new (not suggested) tags. Default: false.
    */
  var allowNew: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Boolean parameter to control whether the text-input should be autofocused on mount. Default: true.
    */
  var autofocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Boolean parameter to control whether the text-input should be automatically resized to fit its value. Default: true.
    */
  var autoresize: js.UndefOr[scala.Boolean] = js.undefined
  var classNames: js.UndefOr[ClassNames] = js.undefined
  /**
    * Array of characters matching keyboard event key values. This is useful when needing to support a specific character irrespective of the keyboard layout.
    * Note, that this list is separate from the one specified by the delimiters option, so you'll need to set the value there to [],
    * if you wish to disable those keys. Example usage: delimiterChars={[',', ' ']}. Default: []
    */
  var delimiterChars: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Array of integers matching keyboard event keyCode values. When a corresponding key is pressed, the preceding string is finalised as tag. Default: [9, 13] (Tab and return keys).
    */
  var delimiters: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Optional event handler when focus on the input is lost. Receives no arguments.
    */
  var handleBlur: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Optional event handler when the input receives focus. Receives no arguments.
    */
  var handleFocus: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Optional event handler when the input changes. Receives the current input value.
    */
  var handleInputChange: js.UndefOr[js.Function1[/* input */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * An object containing additional attributes that will be applied to the underlying <input /> field.
    */
  var inputAttributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * Maximum number of suggestions to display. Default: 6.
    */
  var maxSuggestionsLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * How many characters are needed for suggestions to appear. Default: 2.
    */
  var minQueryLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * The placeholder string shown for the input. Default: 'Add new tag'.
    */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of suggestions that are used as basis for showing suggestions. Each suggestion must have an id and a name property and an optional disabled property. Default: []
    */
  var suggestions: js.UndefOr[js.Array[Tag]] = js.undefined
  /**
    * Provide a custom tag component to render. Default: null.
    */
  var tagComponent: js.UndefOr[reactLib.reactMod.ReactNs.SFC[TagComponentProps]] = js.undefined
  /**
    * An array of tags that are displayed as pre-selected. Each tag must have an id and a name property. Default: []
    */
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
  /**
    * Function called when the user wants to add a tag. Receives the tag
    */
  def handleAddition(tag: Tag): scala.Unit
  /**
    * Function called when the user wants to delete a tag. Receives the tag index.
    */
  def handleDelete(index: scala.Double): scala.Unit
}

object ReactTagsProps {
  @scala.inline
  def apply(
    handleAddition: js.Function1[Tag, scala.Unit],
    handleDelete: js.Function1[scala.Double, scala.Unit],
    allowBackspace: js.UndefOr[scala.Boolean] = js.undefined,
    allowNew: js.UndefOr[scala.Boolean] = js.undefined,
    autofocus: js.UndefOr[scala.Boolean] = js.undefined,
    autoresize: js.UndefOr[scala.Boolean] = js.undefined,
    classNames: ClassNames = null,
    delimiterChars: js.Array[java.lang.String] = null,
    delimiters: js.Array[scala.Double] = null,
    handleBlur: js.Function0[scala.Unit] = null,
    handleFocus: js.Function0[scala.Unit] = null,
    handleInputChange: js.Function1[/* input */ java.lang.String, scala.Unit] = null,
    inputAttributes: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    maxSuggestionsLength: scala.Int | scala.Double = null,
    minQueryLength: scala.Int | scala.Double = null,
    placeholder: java.lang.String = null,
    suggestions: js.Array[Tag] = null,
    tagComponent: reactLib.reactMod.ReactNs.SFC[TagComponentProps] = null,
    tags: js.Array[Tag] = null
  ): ReactTagsProps = {
    val __obj = js.Dynamic.literal(handleAddition = handleAddition, handleDelete = handleDelete)
    if (!js.isUndefined(allowBackspace)) __obj.updateDynamic("allowBackspace")(allowBackspace)
    if (!js.isUndefined(allowNew)) __obj.updateDynamic("allowNew")(allowNew)
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus)
    if (!js.isUndefined(autoresize)) __obj.updateDynamic("autoresize")(autoresize)
    if (classNames != null) __obj.updateDynamic("classNames")(classNames)
    if (delimiterChars != null) __obj.updateDynamic("delimiterChars")(delimiterChars)
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters)
    if (handleBlur != null) __obj.updateDynamic("handleBlur")(handleBlur)
    if (handleFocus != null) __obj.updateDynamic("handleFocus")(handleFocus)
    if (handleInputChange != null) __obj.updateDynamic("handleInputChange")(handleInputChange)
    if (inputAttributes != null) __obj.updateDynamic("inputAttributes")(inputAttributes)
    if (maxSuggestionsLength != null) __obj.updateDynamic("maxSuggestionsLength")(maxSuggestionsLength.asInstanceOf[js.Any])
    if (minQueryLength != null) __obj.updateDynamic("minQueryLength")(minQueryLength.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions)
    if (tagComponent != null) __obj.updateDynamic("tagComponent")(tagComponent)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ReactTagsProps]
  }
}

