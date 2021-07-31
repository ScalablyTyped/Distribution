package typings.reactTagInput

import typings.react.mod.Component
import typings.react.mod.ReactChild
import typings.reactTagInput.anon.ActiveSuggestion
import typings.reactTagInput.anon.Id
import typings.reactTagInput.reactTagInputNumbers.`1`
import typings.reactTagInput.reactTagInputStrings.`inline`
import typings.reactTagInput.reactTagInputStrings.bottom
import typings.reactTagInput.reactTagInputStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-tag-input", JSImport.Default)
  @js.native
  class default protected () extends WithContext {
    def this(props: ReactTagsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactTagsProps, context: js.Any) = this()
  }
  
  @JSImport("react-tag-input", "WithContext")
  @js.native
  class WithContext protected ()
    extends Component[ReactTagsProps, js.Object, js.Any] {
    def this(props: ReactTagsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactTagsProps, context: js.Any) = this()
  }
  
  @JSImport("react-tag-input", "WithOutContext")
  @js.native
  class WithOutContext protected ()
    extends Component[ReactTagsProps, js.Object, js.Any] {
    def this(props: ReactTagsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactTagsProps, context: js.Any) = this()
  }
  
  trait ReactTagsProps extends StObject {
    
    var allowAdditionFromPaste: js.UndefOr[Boolean] = js.undefined
    
    var allowDeleteFromEmptyInput: js.UndefOr[Boolean] = js.undefined
    
    var allowDragDrop: js.UndefOr[Boolean] = js.undefined
    
    var allowUnique: js.UndefOr[Boolean] = js.undefined
    
    var autocomplete: js.UndefOr[Boolean | `1`] = js.undefined
    
    var autofocus: js.UndefOr[Boolean] = js.undefined
    
    var classNames: js.UndefOr[ActiveSuggestion] = js.undefined
    
    var delimiters: js.UndefOr[js.Array[Double]] = js.undefined
    
    def handleAddition(tag: Id): Unit
    
    def handleDelete(i: Double): Unit
    
    var handleDrag: js.UndefOr[js.Function3[/* tag */ Id, /* currPos */ Double, /* newPos */ Double, Unit]] = js.undefined
    
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
    
    var removeComponent: js.UndefOr[Component[js.Any, js.Any, js.Any]] = js.undefined
    
    var renderSuggestion: js.UndefOr[js.Function2[/* tag */ Tag, /* query */ String, ReactChild | Unit]] = js.undefined
    
    var resetInputOnDelete: js.UndefOr[Boolean] = js.undefined
    
    var shouldRenderSuggestions: js.UndefOr[js.Function1[/* query */ String, Boolean]] = js.undefined
    
    var suggestions: js.UndefOr[js.Array[Tag]] = js.undefined
    
    var tags: js.UndefOr[js.Array[Tag]] = js.undefined
  }
  object ReactTagsProps {
    
    @scala.inline
    def apply(handleAddition: Id => Unit, handleDelete: Double => Unit): ReactTagsProps = {
      val __obj = js.Dynamic.literal(handleAddition = js.Any.fromFunction1(handleAddition), handleDelete = js.Any.fromFunction1(handleDelete))
      __obj.asInstanceOf[ReactTagsProps]
    }
    
    @scala.inline
    implicit class ReactTagsPropsMutableBuilder[Self <: ReactTagsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowAdditionFromPaste(value: Boolean): Self = StObject.set(x, "allowAdditionFromPaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowAdditionFromPasteUndefined: Self = StObject.set(x, "allowAdditionFromPaste", js.undefined)
      
      @scala.inline
      def setAllowDeleteFromEmptyInput(value: Boolean): Self = StObject.set(x, "allowDeleteFromEmptyInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDeleteFromEmptyInputUndefined: Self = StObject.set(x, "allowDeleteFromEmptyInput", js.undefined)
      
      @scala.inline
      def setAllowDragDrop(value: Boolean): Self = StObject.set(x, "allowDragDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDragDropUndefined: Self = StObject.set(x, "allowDragDrop", js.undefined)
      
      @scala.inline
      def setAllowUnique(value: Boolean): Self = StObject.set(x, "allowUnique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUniqueUndefined: Self = StObject.set(x, "allowUnique", js.undefined)
      
      @scala.inline
      def setAutocomplete(value: Boolean | `1`): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      @scala.inline
      def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
      
      @scala.inline
      def setClassNames(value: ActiveSuggestion): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setDelimiters(value: js.Array[Double]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      @scala.inline
      def setDelimitersVarargs(value: Double*): Self = StObject.set(x, "delimiters", js.Array(value :_*))
      
      @scala.inline
      def setHandleAddition(value: Id => Unit): Self = StObject.set(x, "handleAddition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleDelete(value: Double => Unit): Self = StObject.set(x, "handleDelete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleDrag(value: (/* tag */ Id, /* currPos */ Double, /* newPos */ Double) => Unit): Self = StObject.set(x, "handleDrag", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHandleDragUndefined: Self = StObject.set(x, "handleDrag", js.undefined)
      
      @scala.inline
      def setHandleFilterSuggestions(
        value: (/* textInputValue */ String, /* possibleSuggestionsArray */ js.Array[Tag]) => js.Array[Tag]
      ): Self = StObject.set(x, "handleFilterSuggestions", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHandleFilterSuggestionsUndefined: Self = StObject.set(x, "handleFilterSuggestions", js.undefined)
      
      @scala.inline
      def setHandleInputBlur(value: /* textInputValue */ String => Unit): Self = StObject.set(x, "handleInputBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleInputBlurUndefined: Self = StObject.set(x, "handleInputBlur", js.undefined)
      
      @scala.inline
      def setHandleInputChange(value: /* value */ String => Unit): Self = StObject.set(x, "handleInputChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleInputChangeUndefined: Self = StObject.set(x, "handleInputChange", js.undefined)
      
      @scala.inline
      def setHandleInputFocus(value: /* value */ String => Unit): Self = StObject.set(x, "handleInputFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleInputFocusUndefined: Self = StObject.set(x, "handleInputFocus", js.undefined)
      
      @scala.inline
      def setHandleTagClick(value: /* i */ Double => Unit): Self = StObject.set(x, "handleTagClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleTagClickUndefined: Self = StObject.set(x, "handleTagClick", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setInputFieldPosition(value: top | bottom | `inline`): Self = StObject.set(x, "inputFieldPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputFieldPositionUndefined: Self = StObject.set(x, "inputFieldPosition", js.undefined)
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      @scala.inline
      def setLabelField(value: String): Self = StObject.set(x, "labelField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFieldUndefined: Self = StObject.set(x, "labelField", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMinQueryLength(value: Double): Self = StObject.set(x, "minQueryLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinQueryLengthUndefined: Self = StObject.set(x, "minQueryLength", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRemoveComponent(value: Component[js.Any, js.Any, js.Any]): Self = StObject.set(x, "removeComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveComponentUndefined: Self = StObject.set(x, "removeComponent", js.undefined)
      
      @scala.inline
      def setRenderSuggestion(value: (/* tag */ Tag, /* query */ String) => ReactChild | Unit): Self = StObject.set(x, "renderSuggestion", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderSuggestionUndefined: Self = StObject.set(x, "renderSuggestion", js.undefined)
      
      @scala.inline
      def setResetInputOnDelete(value: Boolean): Self = StObject.set(x, "resetInputOnDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetInputOnDeleteUndefined: Self = StObject.set(x, "resetInputOnDelete", js.undefined)
      
      @scala.inline
      def setShouldRenderSuggestions(value: /* query */ String => Boolean): Self = StObject.set(x, "shouldRenderSuggestions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldRenderSuggestionsUndefined: Self = StObject.set(x, "shouldRenderSuggestions", js.undefined)
      
      @scala.inline
      def setSuggestions(value: js.Array[Tag]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
      
      @scala.inline
      def setSuggestionsVarargs(value: Tag*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  trait Tag extends StObject {
    
    var id: String
    
    var text: String
  }
  object Tag {
    
    @scala.inline
    def apply(id: String, text: String): Tag = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
