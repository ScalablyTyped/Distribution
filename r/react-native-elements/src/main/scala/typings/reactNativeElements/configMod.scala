package typings.reactNativeElements

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ComponentType
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNative.mod.ImageBackground
import typings.reactNative.mod.StyleSheet.NamedStyles
import typings.reactNativeElements.anon.Black
import typings.reactNativeElements.anon.PartialFullTheme
import typings.reactNativeElements.anon.ThemeFullTheme
import typings.reactNativeElements.anon.ThemeUseDark
import typings.reactNativeElements.anon.TypeofImage
import typings.reactNativeElements.anon.UseDark
import typings.reactNativeElements.colorsMod.Colors
import typings.reactNativeElements.reactNativeElementsStrings.replaceTheme
import typings.reactNativeElements.reactNativeElementsStrings.theme
import typings.reactNativeElements.reactNativeElementsStrings.updateTheme
import typings.reactNativeElements.themeProviderMod.ThemeProps
import typings.reactNativeElements.themeProviderMod.ThemeProviderState
import typings.reactNativeElements.themeProviderMod.default
import typings.std.Omit
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("react-native-elements/dist/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-elements/dist/config", "BackgroundImage")
  @js.native
  val BackgroundImage: Instantiable0[ImageBackground] | TypeofImage = js.native
  
  @JSImport("react-native-elements/dist/config", "ThemeConsumer")
  @js.native
  val ThemeConsumer: Consumer[ThemeProps[js.Object]] = js.native
  
  @JSImport("react-native-elements/dist/config", "ThemeContext")
  @js.native
  val ThemeContext: Context[ThemeProps[js.Object]] = js.native
  
  @JSImport("react-native-elements/dist/config", "ThemeProvider")
  @js.native
  open class ThemeProvider protected () extends default {
    def this(props: ThemeUseDark) = this()
  }
  /* static members */
  object ThemeProvider {
    
    @JSImport("react-native-elements/dist/config", "ThemeProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-elements/dist/config", "ThemeProvider.defaultProps")
    @js.native
    def defaultProps: UseDark = js.native
    inline def defaultProps_=(x: UseDark): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: ThemeUseDark, state: ThemeProviderState): ThemeFullTheme = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ThemeFullTheme]
  }
  
  @JSImport("react-native-elements/dist/config", "colors")
  @js.native
  val colors: Colors = js.native
  
  @JSImport("react-native-elements/dist/config", "colorsDark")
  @js.native
  val colorsDark: Colors = js.native
  
  object fonts {
    
    @JSImport("react-native-elements/dist/config", "fonts")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-elements/dist/config", "fonts.android")
    @js.native
    def android: Black = js.native
    inline def android_=(x: Black): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("android")(x.asInstanceOf[js.Any])
  }
  
  inline def makeStyles[T /* <: NamedStyles[Any | T] */, V](styles: T): js.Function1[/* props */ js.UndefOr[V], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ js.UndefOr[V], T]]
  inline def makeStyles[T /* <: NamedStyles[Any | T] */, V](styles: js.Function2[/* theme */ PartialFullTheme, /* props */ V, T]): js.Function1[/* props */ js.UndefOr[V], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ js.UndefOr[V], T]]
  
  inline def useTheme(): ThemeProps[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[ThemeProps[js.Object]]
  
  inline def withTheme[P, T](WrappedComponent: ComponentType[P & Partial[ThemeProps[T]]], themeKey: String): (FunctionComponent[
    Omit[
      P, 
      /* keyof react-native-elements.react-native-elements/dist/config/ThemeProvider.ThemeProps<T> */ theme | updateTheme | replaceTheme
    ]
  ]) | ForwardRefExoticComponent[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(WrappedComponent.asInstanceOf[js.Any], themeKey.asInstanceOf[js.Any])).asInstanceOf[(FunctionComponent[
    Omit[
      P, 
      /* keyof react-native-elements.react-native-elements/dist/config/ThemeProvider.ThemeProps<T> */ theme | updateTheme | replaceTheme
    ]
  ]) | ForwardRefExoticComponent[P]]
}
