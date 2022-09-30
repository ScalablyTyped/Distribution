package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.color.mod.Color
import typings.color.mod.ColorConstructor
import typings.color.mod.ColorParam
import typings.react.mod.FunctionComponent
import typings.reactNativeElements.iconMod.IconType
import typings.reactNativeElements.reactNativeElementsStrings.ansi16
import typings.reactNativeElements.reactNativeElementsStrings.ansi256
import typings.reactNativeElements.reactNativeElementsStrings.apple
import typings.reactNativeElements.reactNativeElementsStrings.cmyk
import typings.reactNativeElements.reactNativeElementsStrings.gray
import typings.reactNativeElements.reactNativeElementsStrings.hcg
import typings.reactNativeElements.reactNativeElementsStrings.hex
import typings.reactNativeElements.reactNativeElementsStrings.hsl
import typings.reactNativeElements.reactNativeElementsStrings.hsv
import typings.reactNativeElements.reactNativeElementsStrings.hwb
import typings.reactNativeElements.reactNativeElementsStrings.keyword
import typings.reactNativeElements.reactNativeElementsStrings.lab
import typings.reactNativeElements.reactNativeElementsStrings.lch
import typings.reactNativeElements.reactNativeElementsStrings.onClear
import typings.reactNativeElements.reactNativeElementsStrings.replaceTheme
import typings.reactNativeElements.reactNativeElementsStrings.rgb
import typings.reactNativeElements.reactNativeElementsStrings.updateTheme
import typings.reactNativeElements.reactNativeElementsStrings.xyz
import typings.reactNativeElements.themeProviderMod.ThemeProps
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("react-native-elements/dist/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-elements/dist/helpers", "ScreenHeight")
  @js.native
  val ScreenHeight: Double = js.native
  
  @JSImport("react-native-elements/dist/helpers", "ScreenWidth")
  @js.native
  val ScreenWidth: Double = js.native
  
  object color extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-elements/dist/helpers", "color")
    @js.native
    open class ^[T /* <: ColorParam */] ()
      extends StObject
         with Color[T] {
      def this(obj: T) = this()
      def this(
        obj: T,
        model: /* keyof color.anon.Typeofconvert */ rgb | xyz | hcg | ansi256 | ansi16 | hex | lch | cmyk | hsl | keyword | gray | hsv | apple | hwb | lab
      ) = this()
      def this(
        obj: Unit,
        model: /* keyof color.anon.Typeofconvert */ rgb | xyz | hcg | ansi256 | ansi16 | hex | lch | cmyk | hsl | keyword | gray | hsv | apple | hwb | lab
      ) = this()
    }
    
    @JSImport("react-native-elements/dist/helpers", "color")
    @js.native
    val ^ : js.Object & ColorConstructor = js.native
    
    type _To = js.Object & ColorConstructor
    
    /* This means you don't have to write `^`, but can instead just say `color.foo` */
    override def _to: js.Object & ColorConstructor = ^
  }
  
  inline def getIconType(`type`: IconType): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("react-native-elements/dist/helpers", "isIOS")
  @js.native
  val isIOS: Boolean = js.native
  
  inline def normalizeText(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeText")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def normalizeText(number: Double, factor: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeText")(number.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def patchWebProps[T /* <: Record[Any, Any] */](hasUpdateThemeReplaceThemeOnClearRest: T): Pick[T, Exclude[/* keyof T */ String, updateTheme | replaceTheme | onClear]] = ^.asInstanceOf[js.Dynamic].applyDynamic("patchWebProps")(hasUpdateThemeReplaceThemeOnClearRest.asInstanceOf[js.Any]).asInstanceOf[Pick[T, Exclude[/* keyof T */ String, updateTheme | replaceTheme | onClear]]]
  
  inline def renderNode(Component: Any, content: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renderNode")(Component.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def renderNode(Component: Any, content: Any, defaultProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renderNode")(Component.asInstanceOf[js.Any], content.asInstanceOf[js.Any], defaultProps.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type RneFunctionComponent[T] = FunctionComponent[T & Partial[ThemeProps[T]]]
}
