package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNativeElements.anon.ClearIcon
import typings.reactNativeElements.anon.PartialThemePropsSearchBaUpdateTheme
import typings.reactNativeElements.anon.Pickplatformiosandroiddef
import typings.reactNativeElements.anon.TypeofTextInput
import typings.reactNativeElements.anon.platformiosandroiddefault
import typings.reactNativeElements.distSearchbarSearchBarAndroidMod.SearchBarAndroidProps
import typings.reactNativeElements.distSearchbarSearchBarDefaultMod.SearchBarDefaultProps
import typings.reactNativeElements.distSearchbarSearchBarIosMod.SearchBarIosProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSearchbarSearchBarMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/searchbar/SearchBar", JSImport.Default)
  @js.native
  val default: FunctionComponent[Pickplatformiosandroiddef] | ForwardRefExoticComponent[platformiosandroiddefault] = js.native
  
  @JSImport("react-native-elements/dist/searchbar/SearchBar", "SearchBar")
  @js.native
  open class SearchBar protected ()
    extends Component[SearchBarProps & PartialThemePropsSearchBaUpdateTheme, js.Object, Any] {
    def this(props: SearchBarProps & PartialThemePropsSearchBaUpdateTheme) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SearchBarProps & PartialThemePropsSearchBaUpdateTheme, context: Any) = this()
    
    def blur(): Unit = js.native
    
    def cancel(): Unit = js.native
    
    def clear(): Unit = js.native
    
    def focus(): Unit = js.native
    
    var searchbar: typings.reactNativeElements.distSearchbarSearchBarIosMod.default = js.native
  }
  object SearchBar {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-native-elements/dist/searchbar/SearchBar", "SearchBar.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-native-elements/dist/searchbar/SearchBar", "SearchBar.defaultProps.platform")
      @js.native
      def platform: typings.reactNativeElements.reactNativeElementsStrings.default = js.native
      inline def platform_=(x: typings.reactNativeElements.reactNativeElementsStrings.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("platform")(x.asInstanceOf[js.Any])
    }
  }
  
  type SearchBarBaseProps = ComponentPropsWithRef[TypeofTextInput] & ClearIcon
  
  type SearchBarProps = SearchBarBaseProps & SearchBarDefaultProps & SearchBarAndroidProps & SearchBarIosProps
  
  type _To = FunctionComponent[Pickplatformiosandroiddef] | ForwardRefExoticComponent[platformiosandroiddefault]
  
  /* This means you don't have to write `default`, but can instead just say `distSearchbarSearchBarMod.foo` */
  override def _to: FunctionComponent[Pickplatformiosandroiddef] | ForwardRefExoticComponent[platformiosandroiddefault] = default
}
