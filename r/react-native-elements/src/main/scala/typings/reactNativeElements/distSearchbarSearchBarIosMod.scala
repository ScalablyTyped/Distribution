package typings.reactNativeElements

import typings.react.mod.Component
import typings.reactNative.mod.TextInput
import typings.reactNativeElements.anon.CancelButtonProps
import typings.reactNativeElements.anon.CancelButtonTitle
import typings.reactNativeElements.anon.Name
import typings.reactNativeElements.anon.PartialThemePropsSearchBaTheme
import typings.reactNativeElements.distInputInputMod.InputProps
import typings.reactNativeElements.distSearchbarSearchBarMod.SearchBarBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSearchbarSearchBarIosMod {
  
  @JSImport("react-native-elements/dist/searchbar/SearchBar-ios", JSImport.Default)
  @js.native
  open class default protected () extends SearchBar {
    def this(props: SearchBarIosProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-native-elements/dist/searchbar/SearchBar-ios", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-native-elements/dist/searchbar/SearchBar-ios", "default.defaultProps.cancelButtonTitle")
      @js.native
      def cancelButtonTitle: String = js.native
      inline def cancelButtonTitle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonTitle")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-elements/dist/searchbar/SearchBar-ios", "default.defaultProps.clearIcon")
      @js.native
      def clearIcon: Name = js.native
      inline def clearIcon_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(x.asInstanceOf[js.Any])
      
      inline def onBlur(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("onBlur")().asInstanceOf[Any]
      
      inline def onCancel(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("onCancel")().asInstanceOf[Any]
      
      inline def onChangeText(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("onChangeText")().asInstanceOf[Any]
      
      inline def onClear(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("onClear")().asInstanceOf[Any]
      
      inline def onFocus(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("onFocus")().asInstanceOf[Any]
      
      @JSImport("react-native-elements/dist/searchbar/SearchBar-ios", "default.defaultProps.searchIcon")
      @js.native
      def searchIcon: Name = js.native
      inline def searchIcon_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("searchIcon")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-elements/dist/searchbar/SearchBar-ios", "default.defaultProps.showCancel")
      @js.native
      def showCancel: Boolean = js.native
      inline def showCancel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showCancel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-elements/dist/searchbar/SearchBar-ios", "default.defaultProps.showLoading")
      @js.native
      def showLoading: Boolean = js.native
      inline def showLoading_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showLoading")(x.asInstanceOf[js.Any])
      
      @JSImport("react-native-elements/dist/searchbar/SearchBar-ios", "default.defaultProps.value")
      @js.native
      def value: String = js.native
      inline def value_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SearchBar extends Component[SearchBarIosProps & PartialThemePropsSearchBaTheme, SearchBarState, Any] {
    
    def blur(): Unit = js.native
    
    def cancel(): Unit = js.native
    
    def clear(): Unit = js.native
    
    def focus(): Unit = js.native
    
    var input: TextInput = js.native
    
    var onBlur: /* import warning: importer.ImportType#apply Failed type conversion: react-native-elements.react-native-elements/dist/input/Input.InputProps['onBlur'] */ js.Any = js.native
    
    def onChangeText(text: String): Unit = js.native
    
    var onFocus: /* import warning: importer.ImportType#apply Failed type conversion: react-native-elements.react-native-elements/dist/input/Input.InputProps['onFocus'] */ js.Any = js.native
  }
  
  type SearchBarIosProps = InputProps & SearchBarBaseProps & CancelButtonProps & CancelButtonTitle
  
  trait SearchBarState extends StObject {
    
    var cancelButtonWidth: Double | Null
    
    var hasFocus: Boolean
    
    var isEmpty: Boolean
  }
  object SearchBarState {
    
    inline def apply(hasFocus: Boolean, isEmpty: Boolean): SearchBarState = {
      val __obj = js.Dynamic.literal(hasFocus = hasFocus.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], cancelButtonWidth = null)
      __obj.asInstanceOf[SearchBarState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchBarState] (val x: Self) extends AnyVal {
      
      inline def setCancelButtonWidth(value: Double): Self = StObject.set(x, "cancelButtonWidth", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonWidthNull: Self = StObject.set(x, "cancelButtonWidth", null)
      
      inline def setHasFocus(value: Boolean): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
    }
  }
}
