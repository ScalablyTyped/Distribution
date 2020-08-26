package typings.reactTagAutocomplete.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactTagsProps extends js.Object {
  /**
    * Creates a tag from the current input value when focus on the input is lost. Default: false.
    */
  var addOnBlur: js.UndefOr[Boolean] = js.native
  /**
    * Disables ability to delete the selected tags when backspace is pressed while focussed on the text input. Default: true.
    */
  var allowBackspace: js.UndefOr[Boolean] = js.native
  /**
    * Allows users to add new (not suggested) tags. Default: false.
    */
  var allowNew: js.UndefOr[Boolean] = js.native
  /**
    * Boolean parameter to control whether the text-input should be autofocused on mount. Default: true.
    */
  var autofocus: js.UndefOr[Boolean] = js.native
  /**
    * Boolean parameter to control whether the text-input should be automatically resized to fit its value. Default: true.
    */
  var autoresize: js.UndefOr[Boolean] = js.native
  var classNames: js.UndefOr[ClassNames] = js.native
  /**
    * Clear the text input when a tag is deleted. Default: true.
    */
  var clearInputOnDelete: js.UndefOr[Boolean] = js.native
  /**
    * Array of characters matching keyboard event key values. This is useful when needing to support a specific character irrespective of the keyboard layout.
    * Note, that this list is separate from the one specified by the delimiters option, so you'll need to set the value there to [],
    * if you wish to disable those keys. Example usage: delimiterChars={[',', ' ']}. Default: []
    */
  var delimiterChars: js.UndefOr[js.Array[String]] = js.native
  /**
    * Array of integers matching keyboard event keyCode values. When a corresponding key is pressed, the preceding string is finalised as tag. Default: [9, 13] (Tab and return keys).
    */
  var delimiters: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Optional event handler when focus on the input is lost. Receives no arguments.
    */
  var handleBlur: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Optional event handler when the input receives focus. Receives no arguments.
    */
  var handleFocus: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Optional event handler when the input changes. Receives the current input value.
    */
  var handleInputChange: js.UndefOr[js.Function1[/* input */ String, Unit]] = js.native
  /**
    * Optional validation function that determines if tag should be added to tags. Receives a tag object. Should return a boolean.
    */
  var handleValidate: js.UndefOr[js.Function1[/* tag */ Tag, Boolean]] = js.native
  /**
    * An object containing additional attributes that will be applied to the underlying <input /> field.
    */
  var inputAttributes: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Maximum number of suggestions to display. Default: 6.
    */
  var maxSuggestionsLength: js.UndefOr[Double] = js.native
  /**
    * How many characters are needed for suggestions to appear. Default: 2.
    */
  var minQueryLength: js.UndefOr[Double] = js.native
  /**
    * Message shown if there are no matching suggestions. Default: null.
    */
  var noSuggestionsText: js.UndefOr[String] = js.native
  /**
    * The placeholder string shown for the input. Default: 'Add new tag'.
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * An array of suggestions that are used as basis for showing suggestions. Each suggestion must have an id and a name property and an optional disabled property. Default: []
    */
  var suggestions: js.UndefOr[js.Array[Tag]] = js.native
  /**
    * A callback function to filter suggestion items with. The callback receives two arguments; a suggestion and the current query and must return a boolean value.
    * If no function is supplied the default filter is applied. Default: null.
    */
  var suggestionsFilter: js.UndefOr[js.Function2[/* suggestion */ Tag, /* query */ String, Boolean]] = js.native
  /**
    * Provide a custom tag component to render. Default: null.
    */
  var tagComponent: js.UndefOr[SFC[TagComponentProps]] = js.native
  /**
    * An array of tags that are displayed as pre-selected. Each tag must have an id and a name property. Default: []
    */
  var tags: js.UndefOr[js.Array[Tag]] = js.native
  /**
    * Function called when the user wants to add a tag. Receives the tag
    */
  def handleAddition(tag: Tag): Unit = js.native
  /**
    * Function called when the user wants to delete a tag. Receives the tag index.
    */
  def handleDelete(index: Double): Unit = js.native
}

object ReactTagsProps {
  @scala.inline
  def apply(handleAddition: Tag => Unit, handleDelete: Double => Unit): ReactTagsProps = {
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
    def setHandleAddition(value: Tag => Unit): Self = this.set("handleAddition", js.Any.fromFunction1(value))
    @scala.inline
    def setHandleDelete(value: Double => Unit): Self = this.set("handleDelete", js.Any.fromFunction1(value))
    @scala.inline
    def setAddOnBlur(value: Boolean): Self = this.set("addOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddOnBlur: Self = this.set("addOnBlur", js.undefined)
    @scala.inline
    def setAllowBackspace(value: Boolean): Self = this.set("allowBackspace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowBackspace: Self = this.set("allowBackspace", js.undefined)
    @scala.inline
    def setAllowNew(value: Boolean): Self = this.set("allowNew", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowNew: Self = this.set("allowNew", js.undefined)
    @scala.inline
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutofocus: Self = this.set("autofocus", js.undefined)
    @scala.inline
    def setAutoresize(value: Boolean): Self = this.set("autoresize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoresize: Self = this.set("autoresize", js.undefined)
    @scala.inline
    def setClassNames(value: ClassNames): Self = this.set("classNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassNames: Self = this.set("classNames", js.undefined)
    @scala.inline
    def setClearInputOnDelete(value: Boolean): Self = this.set("clearInputOnDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearInputOnDelete: Self = this.set("clearInputOnDelete", js.undefined)
    @scala.inline
    def setDelimiterCharsVarargs(value: String*): Self = this.set("delimiterChars", js.Array(value :_*))
    @scala.inline
    def setDelimiterChars(value: js.Array[String]): Self = this.set("delimiterChars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiterChars: Self = this.set("delimiterChars", js.undefined)
    @scala.inline
    def setDelimitersVarargs(value: Double*): Self = this.set("delimiters", js.Array(value :_*))
    @scala.inline
    def setDelimiters(value: js.Array[Double]): Self = this.set("delimiters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiters: Self = this.set("delimiters", js.undefined)
    @scala.inline
    def setHandleBlur(value: () => Unit): Self = this.set("handleBlur", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHandleBlur: Self = this.set("handleBlur", js.undefined)
    @scala.inline
    def setHandleFocus(value: () => Unit): Self = this.set("handleFocus", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHandleFocus: Self = this.set("handleFocus", js.undefined)
    @scala.inline
    def setHandleInputChange(value: /* input */ String => Unit): Self = this.set("handleInputChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandleInputChange: Self = this.set("handleInputChange", js.undefined)
    @scala.inline
    def setHandleValidate(value: /* tag */ Tag => Boolean): Self = this.set("handleValidate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandleValidate: Self = this.set("handleValidate", js.undefined)
    @scala.inline
    def setInputAttributes(value: StringDictionary[js.Any]): Self = this.set("inputAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputAttributes: Self = this.set("inputAttributes", js.undefined)
    @scala.inline
    def setMaxSuggestionsLength(value: Double): Self = this.set("maxSuggestionsLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSuggestionsLength: Self = this.set("maxSuggestionsLength", js.undefined)
    @scala.inline
    def setMinQueryLength(value: Double): Self = this.set("minQueryLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinQueryLength: Self = this.set("minQueryLength", js.undefined)
    @scala.inline
    def setNoSuggestionsText(value: String): Self = this.set("noSuggestionsText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSuggestionsText: Self = this.set("noSuggestionsText", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setSuggestionsVarargs(value: Tag*): Self = this.set("suggestions", js.Array(value :_*))
    @scala.inline
    def setSuggestions(value: js.Array[Tag]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
    @scala.inline
    def setSuggestionsFilter(value: (/* suggestion */ Tag, /* query */ String) => Boolean): Self = this.set("suggestionsFilter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSuggestionsFilter: Self = this.set("suggestionsFilter", js.undefined)
    @scala.inline
    def setTagComponent(value: SFC[TagComponentProps]): Self = this.set("tagComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagComponent: Self = this.set("tagComponent", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

