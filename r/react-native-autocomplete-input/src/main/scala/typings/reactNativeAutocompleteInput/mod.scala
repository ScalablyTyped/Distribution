package typings.reactNativeAutocompleteInput

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.reactNative.mod.FlatListProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextInputProps
import typings.reactNative.mod.ViewStyle
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-autocomplete-input", JSImport.Default)
  @js.native
  val default: FC[AutocompleteProps[Any]] = js.native
  
  @JSImport("react-native-autocomplete-input", "AutocompleteInput")
  @js.native
  val AutocompleteInput: FC[AutocompleteProps[Any]] = js.native
  
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
      * onShowResults will be called when the autocomplete suggestions appear or disappear.
      */
    var onShowResults: js.UndefOr[js.Function1[/* showResults */ Boolean, Unit]] = js.undefined
    
    /**
      * function
      * render custom result list. Can be used to replace FlatList. All props passed to this function.
      */
    var renderResultList: js.UndefOr[js.Function1[/* props */ AutocompleteProps[T], ReactNode]] = js.undefined
    
    /**
      * function
      * render custom TextInput. All props passed to this function.
      */
    var renderTextInput: js.UndefOr[js.Function1[/* props */ AutocompleteProps[T], ReactNode]] = js.undefined
  }
  object AutocompleteProps {
    
    inline def apply[T](data: js.Array[T]): AutocompleteProps[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutocompleteProps[?], T] (val x: Self & AutocompleteProps[T]) extends AnyVal {
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFlatListProps(value: Partial[FlatListProps[T]]): Self = StObject.set(x, "flatListProps", value.asInstanceOf[js.Any])
      
      inline def setFlatListPropsUndefined: Self = StObject.set(x, "flatListProps", js.undefined)
      
      inline def setHideResults(value: Boolean): Self = StObject.set(x, "hideResults", value.asInstanceOf[js.Any])
      
      inline def setHideResultsUndefined: Self = StObject.set(x, "hideResults", js.undefined)
      
      inline def setInputContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inputContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setInputContainerStyleNull: Self = StObject.set(x, "inputContainerStyle", null)
      
      inline def setInputContainerStyleUndefined: Self = StObject.set(x, "inputContainerStyle", js.undefined)
      
      inline def setListContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "listContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setListContainerStyleNull: Self = StObject.set(x, "listContainerStyle", null)
      
      inline def setListContainerStyleUndefined: Self = StObject.set(x, "listContainerStyle", js.undefined)
      
      inline def setListStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleNull: Self = StObject.set(x, "listStyle", null)
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      inline def setOnShowResults(value: /* showResults */ Boolean => Unit): Self = StObject.set(x, "onShowResults", js.Any.fromFunction1(value))
      
      inline def setOnShowResultsUndefined: Self = StObject.set(x, "onShowResults", js.undefined)
      
      inline def setRenderResultList(value: /* props */ AutocompleteProps[T] => ReactNode): Self = StObject.set(x, "renderResultList", js.Any.fromFunction1(value))
      
      inline def setRenderResultListUndefined: Self = StObject.set(x, "renderResultList", js.undefined)
      
      inline def setRenderTextInput(value: /* props */ AutocompleteProps[T] => ReactNode): Self = StObject.set(x, "renderTextInput", js.Any.fromFunction1(value))
      
      inline def setRenderTextInputUndefined: Self = StObject.set(x, "renderTextInput", js.undefined)
    }
  }
  
  type _To = FC[AutocompleteProps[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[AutocompleteProps[Any]] = default
}
