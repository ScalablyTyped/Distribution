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
  
  @js.native
  trait SearchBar
    extends Component[SearchBarProps & PartialThemePropsSearchBaUpdateTheme, js.Object, Any] {
    
    def blur(): Unit = js.native
    
    def cancel(): Unit = js.native
    
    def clear(): Unit = js.native
    
    def focus(): Unit = js.native
    
    var searchbar: typings.reactNativeElements.distSearchbarSearchBarIosMod.default = js.native
  }
  
  type SearchBarBaseProps = ComponentPropsWithRef[TypeofTextInput] & ClearIcon
  
  type SearchBarProps = SearchBarBaseProps & SearchBarDefaultProps & SearchBarAndroidProps & SearchBarIosProps
  
  type _To = FunctionComponent[Pickplatformiosandroiddef] | ForwardRefExoticComponent[platformiosandroiddefault]
  
  /* This means you don't have to write `default`, but can instead just say `distSearchbarSearchBarMod.foo` */
  override def _to: FunctionComponent[Pickplatformiosandroiddef] | ForwardRefExoticComponent[platformiosandroiddefault] = default
}
