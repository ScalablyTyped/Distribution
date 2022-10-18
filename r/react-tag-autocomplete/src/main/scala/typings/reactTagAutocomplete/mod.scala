package typings.reactTagAutocomplete

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-tag-autocomplete", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ReactTagsProps, js.Object, Any]
  
  trait ClassNames extends StObject {
    
    var root: String
    
    var rootFocused: String
    
    var search: String
    
    var searchInput: String
    
    var selected: String
    
    var selectedTag: String
    
    var selectedTagName: String
    
    var suggestionActive: String
    
    var suggestionDisabled: String
    
    var suggestions: String
  }
  object ClassNames {
    
    inline def apply(
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
    
    extension [Self <: ClassNames](x: Self) {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootFocused(value: String): Self = StObject.set(x, "rootFocused", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchInput(value: String): Self = StObject.set(x, "searchInput", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedTag(value: String): Self = StObject.set(x, "selectedTag", value.asInstanceOf[js.Any])
      
      inline def setSelectedTagName(value: String): Self = StObject.set(x, "selectedTagName", value.asInstanceOf[js.Any])
      
      inline def setSuggestionActive(value: String): Self = StObject.set(x, "suggestionActive", value.asInstanceOf[js.Any])
      
      inline def setSuggestionDisabled(value: String): Self = StObject.set(x, "suggestionDisabled", value.asInstanceOf[js.Any])
      
      inline def setSuggestions(value: String): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactTags = Component[ReactTagsProps, js.Object, Any]
  
  trait ReactTagsProps extends StObject {
    
    /**
      * Creates a tag from the current input value when focus on the input is lost. Default: false.
      */
    var addOnBlur: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disables ability to delete the selected tags when backspace is pressed while focussed on the text input.
      * Default: true.
      */
    var allowBackspace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows users to add new (not suggested) tags. Default: false.
      */
    var allowNew: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The aria-label string for the input. Defaults to placeholder string.
      */
    var ariaLabelText: js.UndefOr[String] = js.undefined
    
    /**
      * Boolean parameter to control whether the text-input should be autofocused on mount. Default: true.
      */
    var autofocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean parameter to control whether the text-input should be automatically resized to fit its value.
      * Default: true.
      */
    var autoresize: js.UndefOr[Boolean] = js.undefined
    
    var classNames: js.UndefOr[ClassNames] = js.undefined
    
    /**
      * Clear the text input when a tag is deleted. Default: true.
      */
    var clearInputOnDelete: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Array of integers matching keyboard event keyCode values. When a corresponding key is pressed,
      * the preceding string is finalised as tag. Default: [9, 13] (Tab and return keys).
      */
    var delimiters: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The ID attribute given to the listbox element. Default: ReactTags.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * An object containing additional attributes that will be applied to the underlying <input /> field.
      */
    var inputAttributes: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Maximum number of suggestions to display. Default: 6.
      */
    var maxSuggestionsLength: js.UndefOr[Double] = js.undefined
    
    /**
      * How many characters are needed for suggestions to appear. Default: 2.
      */
    var minQueryLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Enables users to show a prompt to add a new tag at the bottom of the suggestions list if allowNew is enabled.
      * Defaults to null.
      */
    var newTagText: js.UndefOr[String] = js.undefined
    
    /**
      * Message shown if there are no matching suggestions. Default: null.
      */
    var noSuggestionsText: js.UndefOr[String] = js.undefined
    
    /**
      * Function called when the user wants to add a tag. Receives the tag
      */
    def onAddition(tag: Tag): Unit
    
    /**
      * Optional event handler when focus on the input is lost. Receives no arguments.
      */
    var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Function called when the user wants to delete a tag. Receives the tag index.
      */
    def onDelete(index: Double): Unit
    
    /**
      * Optional event handler when the input receives focus. Receives no arguments.
      */
    var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Optional event handler when the input changes. Receives the current input value.
      */
    var onInput: js.UndefOr[js.Function1[/* input */ String, Unit]] = js.undefined
    
    /**
      * Optional validation function that determines if tag should be added to tags. Receives a tag object.
      * Should return a boolean.
      */
    var onValidate: js.UndefOr[js.Function1[/* tag */ Tag, Boolean]] = js.undefined
    
    /**
      * The placeholder string shown for the input. Default: 'Add new tag'.
      */
    var placeholderText: js.UndefOr[String] = js.undefined
    
    /**
      * The title text to add to the remove selected tag button. Default 'Click to remove tag'.
      */
    var removeButtonText: js.UndefOr[String] = js.undefined
    
    /**
      * Provide a custom suggestion component to render. Receives the suggestion and current query as props. Defaults to null.
      */
    var suggestionComponent: js.UndefOr[FC[SuggestionComponentProps]] = js.undefined
    
    /**
      * An array of suggestions that are used as basis for showing suggestions.
      * Each suggestion must have an id and a name property and an optional disabled property. Default: []
      */
    var suggestions: js.UndefOr[js.Array[Tag]] = js.undefined
    
    /**
      * A callback function to filter suggestion items with. The callback receives two arguments;
      * a suggestion and the current query and must return a boolean value.
      * If no function is supplied the default filter is applied. Default: null.
      */
    var suggestionsFilter: js.UndefOr[js.Function2[/* suggestion */ Tag, /* query */ String, Boolean]] = js.undefined
    
    /**
      * A callback function to apply a custom filter to the suggestions. The callback receives two arguments;
      * a query and the input suggestions and must return a new array of suggestion items.
      * Using this option you can filter and sort suggestions.
      */
    var suggestionsTransform: js.UndefOr[js.Function2[/* query */ String, /* suggestions */ js.Array[Tag], js.Array[Tag]]] = js.undefined
    
    /**
      * Provide a custom tag component to render. Default: null.
      */
    var tagComponent: js.UndefOr[FC[TagComponentProps]] = js.undefined
    
    /**
      * An array of tags that are displayed as pre-selected. Each tag must have an id and a name property. Default: []
      */
    var tags: js.UndefOr[js.Array[Tag]] = js.undefined
  }
  object ReactTagsProps {
    
    inline def apply(onAddition: Tag => Unit, onDelete: Double => Unit): ReactTagsProps = {
      val __obj = js.Dynamic.literal(onAddition = js.Any.fromFunction1(onAddition), onDelete = js.Any.fromFunction1(onDelete))
      __obj.asInstanceOf[ReactTagsProps]
    }
    
    extension [Self <: ReactTagsProps](x: Self) {
      
      inline def setAddOnBlur(value: Boolean): Self = StObject.set(x, "addOnBlur", value.asInstanceOf[js.Any])
      
      inline def setAddOnBlurUndefined: Self = StObject.set(x, "addOnBlur", js.undefined)
      
      inline def setAllowBackspace(value: Boolean): Self = StObject.set(x, "allowBackspace", value.asInstanceOf[js.Any])
      
      inline def setAllowBackspaceUndefined: Self = StObject.set(x, "allowBackspace", js.undefined)
      
      inline def setAllowNew(value: Boolean): Self = StObject.set(x, "allowNew", value.asInstanceOf[js.Any])
      
      inline def setAllowNewUndefined: Self = StObject.set(x, "allowNew", js.undefined)
      
      inline def setAriaLabelText(value: String): Self = StObject.set(x, "ariaLabelText", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelTextUndefined: Self = StObject.set(x, "ariaLabelText", js.undefined)
      
      inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
      
      inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
      
      inline def setAutoresize(value: Boolean): Self = StObject.set(x, "autoresize", value.asInstanceOf[js.Any])
      
      inline def setAutoresizeUndefined: Self = StObject.set(x, "autoresize", js.undefined)
      
      inline def setClassNames(value: ClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setClearInputOnDelete(value: Boolean): Self = StObject.set(x, "clearInputOnDelete", value.asInstanceOf[js.Any])
      
      inline def setClearInputOnDeleteUndefined: Self = StObject.set(x, "clearInputOnDelete", js.undefined)
      
      inline def setDelimiters(value: js.Array[String]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      inline def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      inline def setDelimitersVarargs(value: String*): Self = StObject.set(x, "delimiters", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputAttributes(value: StringDictionary[Any]): Self = StObject.set(x, "inputAttributes", value.asInstanceOf[js.Any])
      
      inline def setInputAttributesUndefined: Self = StObject.set(x, "inputAttributes", js.undefined)
      
      inline def setMaxSuggestionsLength(value: Double): Self = StObject.set(x, "maxSuggestionsLength", value.asInstanceOf[js.Any])
      
      inline def setMaxSuggestionsLengthUndefined: Self = StObject.set(x, "maxSuggestionsLength", js.undefined)
      
      inline def setMinQueryLength(value: Double): Self = StObject.set(x, "minQueryLength", value.asInstanceOf[js.Any])
      
      inline def setMinQueryLengthUndefined: Self = StObject.set(x, "minQueryLength", js.undefined)
      
      inline def setNewTagText(value: String): Self = StObject.set(x, "newTagText", value.asInstanceOf[js.Any])
      
      inline def setNewTagTextUndefined: Self = StObject.set(x, "newTagText", js.undefined)
      
      inline def setNoSuggestionsText(value: String): Self = StObject.set(x, "noSuggestionsText", value.asInstanceOf[js.Any])
      
      inline def setNoSuggestionsTextUndefined: Self = StObject.set(x, "noSuggestionsText", js.undefined)
      
      inline def setOnAddition(value: Tag => Unit): Self = StObject.set(x, "onAddition", js.Any.fromFunction1(value))
      
      inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnDelete(value: Double => Unit): Self = StObject.set(x, "onDelete", js.Any.fromFunction1(value))
      
      inline def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: /* input */ String => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnValidate(value: /* tag */ Tag => Boolean): Self = StObject.set(x, "onValidate", js.Any.fromFunction1(value))
      
      inline def setOnValidateUndefined: Self = StObject.set(x, "onValidate", js.undefined)
      
      inline def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
      
      inline def setRemoveButtonText(value: String): Self = StObject.set(x, "removeButtonText", value.asInstanceOf[js.Any])
      
      inline def setRemoveButtonTextUndefined: Self = StObject.set(x, "removeButtonText", js.undefined)
      
      inline def setSuggestionComponent(value: FC[SuggestionComponentProps]): Self = StObject.set(x, "suggestionComponent", value.asInstanceOf[js.Any])
      
      inline def setSuggestionComponentUndefined: Self = StObject.set(x, "suggestionComponent", js.undefined)
      
      inline def setSuggestions(value: js.Array[Tag]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsFilter(value: (/* suggestion */ Tag, /* query */ String) => Boolean): Self = StObject.set(x, "suggestionsFilter", js.Any.fromFunction2(value))
      
      inline def setSuggestionsFilterUndefined: Self = StObject.set(x, "suggestionsFilter", js.undefined)
      
      inline def setSuggestionsTransform(value: (/* query */ String, /* suggestions */ js.Array[Tag]) => js.Array[Tag]): Self = StObject.set(x, "suggestionsTransform", js.Any.fromFunction2(value))
      
      inline def setSuggestionsTransformUndefined: Self = StObject.set(x, "suggestionsTransform", js.undefined)
      
      inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
      
      inline def setSuggestionsVarargs(value: Tag*): Self = StObject.set(x, "suggestions", js.Array(value*))
      
      inline def setTagComponent(value: FC[TagComponentProps]): Self = StObject.set(x, "tagComponent", value.asInstanceOf[js.Any])
      
      inline def setTagComponentUndefined: Self = StObject.set(x, "tagComponent", js.undefined)
      
      inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait SuggestionComponentProps extends StObject {
    
    var item: Tag
    
    var query: String
  }
  object SuggestionComponentProps {
    
    inline def apply(item: Tag, query: String): SuggestionComponentProps = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuggestionComponentProps]
    }
    
    extension [Self <: SuggestionComponentProps](x: Self) {
      
      inline def setItem(value: Tag): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tag extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: String | Double
    
    var name: String
  }
  object Tag {
    
    inline def apply(id: String | Double, name: String): Tag = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    extension [Self <: Tag](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TagComponentProps extends StObject {
    
    var classNames: ClassNames
    
    def onDelete(event: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit
    
    var removeButtonText: String
    
    var tag: Tag
  }
  object TagComponentProps {
    
    inline def apply(
      classNames: ClassNames,
      onDelete: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit,
      removeButtonText: String,
      tag: Tag
    ): TagComponentProps = {
      val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], onDelete = js.Any.fromFunction1(onDelete), removeButtonText = removeButtonText.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagComponentProps]
    }
    
    extension [Self <: TagComponentProps](x: Self) {
      
      inline def setClassNames(value: ClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setOnDelete(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDelete", js.Any.fromFunction1(value))
      
      inline def setRemoveButtonText(value: String): Self = StObject.set(x, "removeButtonText", value.asInstanceOf[js.Any])
      
      inline def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
}
