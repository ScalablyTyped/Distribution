package typings.reactTagAutocomplete

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.SFC
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-tag-autocomplete", JSImport.Default)
  @js.native
  class default ()
    extends Component[ReactTagsProps, js.Object, js.Any]
  
  @js.native
  trait ClassNames extends StObject {
    
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
    implicit class ClassNamesMutableBuilder[Self <: ClassNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootFocused(value: String): Self = StObject.set(x, "rootFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchInput(value: String): Self = StObject.set(x, "searchInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedTag(value: String): Self = StObject.set(x, "selectedTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedTagName(value: String): Self = StObject.set(x, "selectedTagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionActive(value: String): Self = StObject.set(x, "suggestionActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionDisabled(value: String): Self = StObject.set(x, "suggestionDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestions(value: String): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactTags = Component[ReactTagsProps, js.Object, js.Any]
  
  @js.native
  trait ReactTagsProps extends StObject {
    
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
      * Function called when the user wants to add a tag. Receives the tag
      */
    def handleAddition(tag: Tag): Unit = js.native
    
    /**
      * Optional event handler when focus on the input is lost. Receives no arguments.
      */
    var handleBlur: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Function called when the user wants to delete a tag. Receives the tag index.
      */
    def handleDelete(index: Double): Unit = js.native
    
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
  }
  object ReactTagsProps {
    
    @scala.inline
    def apply(handleAddition: Tag => Unit, handleDelete: Double => Unit): ReactTagsProps = {
      val __obj = js.Dynamic.literal(handleAddition = js.Any.fromFunction1(handleAddition), handleDelete = js.Any.fromFunction1(handleDelete))
      __obj.asInstanceOf[ReactTagsProps]
    }
    
    @scala.inline
    implicit class ReactTagsPropsMutableBuilder[Self <: ReactTagsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddOnBlur(value: Boolean): Self = StObject.set(x, "addOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddOnBlurUndefined: Self = StObject.set(x, "addOnBlur", js.undefined)
      
      @scala.inline
      def setAllowBackspace(value: Boolean): Self = StObject.set(x, "allowBackspace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowBackspaceUndefined: Self = StObject.set(x, "allowBackspace", js.undefined)
      
      @scala.inline
      def setAllowNew(value: Boolean): Self = StObject.set(x, "allowNew", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowNewUndefined: Self = StObject.set(x, "allowNew", js.undefined)
      
      @scala.inline
      def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
      
      @scala.inline
      def setAutoresize(value: Boolean): Self = StObject.set(x, "autoresize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoresizeUndefined: Self = StObject.set(x, "autoresize", js.undefined)
      
      @scala.inline
      def setClassNames(value: ClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setClearInputOnDelete(value: Boolean): Self = StObject.set(x, "clearInputOnDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearInputOnDeleteUndefined: Self = StObject.set(x, "clearInputOnDelete", js.undefined)
      
      @scala.inline
      def setDelimiterChars(value: js.Array[String]): Self = StObject.set(x, "delimiterChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterCharsUndefined: Self = StObject.set(x, "delimiterChars", js.undefined)
      
      @scala.inline
      def setDelimiterCharsVarargs(value: String*): Self = StObject.set(x, "delimiterChars", js.Array(value :_*))
      
      @scala.inline
      def setDelimiters(value: js.Array[Double]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      @scala.inline
      def setDelimitersVarargs(value: Double*): Self = StObject.set(x, "delimiters", js.Array(value :_*))
      
      @scala.inline
      def setHandleAddition(value: Tag => Unit): Self = StObject.set(x, "handleAddition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleBlur(value: () => Unit): Self = StObject.set(x, "handleBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandleBlurUndefined: Self = StObject.set(x, "handleBlur", js.undefined)
      
      @scala.inline
      def setHandleDelete(value: Double => Unit): Self = StObject.set(x, "handleDelete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleFocus(value: () => Unit): Self = StObject.set(x, "handleFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandleFocusUndefined: Self = StObject.set(x, "handleFocus", js.undefined)
      
      @scala.inline
      def setHandleInputChange(value: /* input */ String => Unit): Self = StObject.set(x, "handleInputChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleInputChangeUndefined: Self = StObject.set(x, "handleInputChange", js.undefined)
      
      @scala.inline
      def setHandleValidate(value: /* tag */ Tag => Boolean): Self = StObject.set(x, "handleValidate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleValidateUndefined: Self = StObject.set(x, "handleValidate", js.undefined)
      
      @scala.inline
      def setInputAttributes(value: StringDictionary[js.Any]): Self = StObject.set(x, "inputAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputAttributesUndefined: Self = StObject.set(x, "inputAttributes", js.undefined)
      
      @scala.inline
      def setMaxSuggestionsLength(value: Double): Self = StObject.set(x, "maxSuggestionsLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSuggestionsLengthUndefined: Self = StObject.set(x, "maxSuggestionsLength", js.undefined)
      
      @scala.inline
      def setMinQueryLength(value: Double): Self = StObject.set(x, "minQueryLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinQueryLengthUndefined: Self = StObject.set(x, "minQueryLength", js.undefined)
      
      @scala.inline
      def setNoSuggestionsText(value: String): Self = StObject.set(x, "noSuggestionsText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoSuggestionsTextUndefined: Self = StObject.set(x, "noSuggestionsText", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setSuggestions(value: js.Array[Tag]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsFilter(value: (/* suggestion */ Tag, /* query */ String) => Boolean): Self = StObject.set(x, "suggestionsFilter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSuggestionsFilterUndefined: Self = StObject.set(x, "suggestionsFilter", js.undefined)
      
      @scala.inline
      def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
      
      @scala.inline
      def setSuggestionsVarargs(value: Tag*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
      
      @scala.inline
      def setTagComponent(value: SFC[TagComponentProps]): Self = StObject.set(x, "tagComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagComponentUndefined: Self = StObject.set(x, "tagComponent", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Tag extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var id: String | Double = js.native
    
    var name: String = js.native
  }
  object Tag {
    
    @scala.inline
    def apply(id: String | Double, name: String): Tag = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TagComponentProps extends StObject {
    
    var classNames: ClassNames = js.native
    
    def onDelete(event: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit = js.native
    
    var tag: Tag = js.native
  }
  object TagComponentProps {
    
    @scala.inline
    def apply(
      classNames: ClassNames,
      onDelete: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit,
      tag: Tag
    ): TagComponentProps = {
      val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], onDelete = js.Any.fromFunction1(onDelete), tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagComponentProps]
    }
    
    @scala.inline
    implicit class TagComponentPropsMutableBuilder[Self <: TagComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNames(value: ClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDelete(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDelete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
}
