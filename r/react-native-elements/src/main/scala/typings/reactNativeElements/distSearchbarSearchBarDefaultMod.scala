package typings.reactNativeElements

import typings.react.mod.Component
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.TextInput
import typings.reactNative.mod.TextInputFocusEventData
import typings.reactNative.mod.TextInputProps
import typings.reactNativeElements.anon.LightTheme
import typings.reactNativeElements.anon.PartialThemePropsSearchBaReplaceTheme
import typings.reactNativeElements.distSearchbarSearchBarMod.SearchBarBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSearchbarSearchBarDefaultMod {
  
  @JSImport("react-native-elements/dist/searchbar/SearchBar-default", JSImport.Default)
  @js.native
  open class default protected () extends SearchBar {
    def this(props: SearchBarDefaultProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-native-elements/dist/searchbar/SearchBar-default", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-native-elements/dist/searchbar/SearchBar-default", "default.defaultProps.lightTheme")
      @js.native
      def lightTheme: Boolean = js.native
      inline def lightTheme_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightTheme")(x.asInstanceOf[js.Any])
      
      inline def onBlur(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("onBlur")().asInstanceOf[Any]
      
      inline def onChangeText(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("onChangeText")().asInstanceOf[Any]
      
      inline def onClear(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("onClear")().asInstanceOf[Any]
      
      inline def onFocus(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("onFocus")().asInstanceOf[Any]
      
      @JSImport("react-native-elements/dist/searchbar/SearchBar-default", "default.defaultProps.round")
      @js.native
      def round: Boolean = js.native
      inline def round_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("round")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-elements/dist/searchbar/SearchBar-default", "default.defaultProps.showLoading")
      @js.native
      def showLoading: Boolean = js.native
      inline def showLoading_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showLoading")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-elements/dist/searchbar/SearchBar-default", "default.defaultProps.value")
      @js.native
      def value: String = js.native
      inline def value_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SearchBar extends Component[SearchBarDefaultProps & PartialThemePropsSearchBaReplaceTheme, SearchBarState, Any] {
    
    def blur(): Unit = js.native
    
    def clear(): Unit = js.native
    
    def focus(): Unit = js.native
    
    var input: TextInput = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], Unit]] = js.native
    
    def onChangeText(text: String): Unit = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], Unit]] = js.native
  }
  
  type SearchBarDefaultProps = LightTheme & SearchBarBaseProps & TextInputProps
  
  trait SearchBarState extends StObject {
    
    var isEmpty: Boolean
  }
  object SearchBarState {
    
    inline def apply(isEmpty: Boolean): SearchBarState = {
      val __obj = js.Dynamic.literal(isEmpty = isEmpty.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchBarState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchBarState] (val x: Self) extends AnyVal {
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
    }
  }
}
