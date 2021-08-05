package typings.reactNativeAutocompleteInput

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactNative.mod.FlatListProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextInputProperties
import typings.reactNative.mod.TextInputProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeAutocompleteInput.anon.Index
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-autocomplete-input", JSImport.Default)
  @js.native
  class default[T] ()
    extends Component[AutocompleteProps[T], js.Object, js.Any]
  
  type Autocomplete[T] = Component[AutocompleteProps[T], js.Object, js.Any]
  
  trait AutocompleteProps[T]
    extends StObject
       with TextInputProps {
    
    /**
      * style
      * These styles will be applied to the container which surrounds the autocomplete component.
      */
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * array
      * An array with suggestion items to be rendered in renderItem({ item, index }). Any array with length > 0 will open the suggestion list and any array with length < 1 will hide the list.
      */
    var data: js.Array[T]
    
    /**
      * object
      * Props to pass on to the underlying FlatList.
      */
    var flatListProps: js.UndefOr[Partial[FlatListProps[T]]] = js.undefined
    
    /**
      * bool
      * Set to true to hide the suggestion list.
      */
    var hideResults: js.UndefOr[Boolean] = js.undefined
    
    /**
      * style
      * These styles will be applied to the container which surrounds the textInput component.
      */
    var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * function
      * keyExtractor will be called to get key for each item. It's up to you which string to return as a key.
      */
    var keyExtractor: js.UndefOr[js.Function2[/* item */ T, /* i */ Double, String]] = js.undefined
    
    /**
      * style
      * These styles will be applied to the container which surrounds the result list.
      */
    var listContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * style
      * These style will be applied to the result list.
      */
    var listStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * function
      * onShowResult will be called when the autocomplete suggestions appear or disappear.
      */
    var onShowResult: js.UndefOr[js.Function1[/* showResults */ Boolean, Unit]] = js.undefined
    
    /**
      * function
      * renderItem will be called to render the data objects which will be displayed in the result view below the text input.
      */
    def renderItem(itemWithIndex: Index[T]): ReactNode
    
    /**
      * function
      * renderSeparator will be called to render the list separators which will be displayed between the list elements in the result view below the text input.
      */
    var renderSeparator: js.UndefOr[
        js.Function3[
          /* sectionID */ String | Double, 
          /* rowID */ String | Double, 
          /* adjacentRowHighlighted */ js.UndefOr[Boolean], 
          ReactElement
        ]
      ] = js.undefined
    
    /**
      * function
      * render custom TextInput. All props passed to this function.
      */
    var renderTextInput: js.UndefOr[js.Function1[/* props */ TextInputProperties, ReactNode]] = js.undefined
  }
  object AutocompleteProps {
    
    inline def apply[T](data: js.Array[T], renderItem: Index[T] => ReactNode): AutocompleteProps[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem))
      __obj.asInstanceOf[AutocompleteProps[T]]
    }
    
    extension [Self <: AutocompleteProps[?], T](x: Self & AutocompleteProps[T]) {
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setFlatListProps(value: Partial[FlatListProps[T]]): Self = StObject.set(x, "flatListProps", value.asInstanceOf[js.Any])
      
      inline def setFlatListPropsUndefined: Self = StObject.set(x, "flatListProps", js.undefined)
      
      inline def setHideResults(value: Boolean): Self = StObject.set(x, "hideResults", value.asInstanceOf[js.Any])
      
      inline def setHideResultsUndefined: Self = StObject.set(x, "hideResults", js.undefined)
      
      inline def setInputContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inputContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setInputContainerStyleNull: Self = StObject.set(x, "inputContainerStyle", null)
      
      inline def setInputContainerStyleUndefined: Self = StObject.set(x, "inputContainerStyle", js.undefined)
      
      inline def setKeyExtractor(value: (/* item */ T, /* i */ Double) => String): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction2(value))
      
      inline def setKeyExtractorUndefined: Self = StObject.set(x, "keyExtractor", js.undefined)
      
      inline def setListContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "listContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setListContainerStyleNull: Self = StObject.set(x, "listContainerStyle", null)
      
      inline def setListContainerStyleUndefined: Self = StObject.set(x, "listContainerStyle", js.undefined)
      
      inline def setListStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleNull: Self = StObject.set(x, "listStyle", null)
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      inline def setOnShowResult(value: /* showResults */ Boolean => Unit): Self = StObject.set(x, "onShowResult", js.Any.fromFunction1(value))
      
      inline def setOnShowResultUndefined: Self = StObject.set(x, "onShowResult", js.undefined)
      
      inline def setRenderItem(value: Index[T] => ReactNode): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      
      inline def setRenderSeparator(
        value: (/* sectionID */ String | Double, /* rowID */ String | Double, /* adjacentRowHighlighted */ js.UndefOr[Boolean]) => ReactElement
      ): Self = StObject.set(x, "renderSeparator", js.Any.fromFunction3(value))
      
      inline def setRenderSeparatorUndefined: Self = StObject.set(x, "renderSeparator", js.undefined)
      
      inline def setRenderTextInput(value: /* props */ TextInputProperties => ReactNode): Self = StObject.set(x, "renderTextInput", js.Any.fromFunction1(value))
      
      inline def setRenderTextInputUndefined: Self = StObject.set(x, "renderTextInput", js.undefined)
    }
  }
}
