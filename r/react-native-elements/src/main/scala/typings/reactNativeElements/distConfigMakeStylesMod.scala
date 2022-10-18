package typings.reactNativeElements

import typings.reactNative.mod.StyleSheet.NamedStyles
import typings.reactNativeElements.anon.PartialFullTheme
import typings.reactNativeElements.distConfigThemeProviderMod.ThemeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigMakeStylesMod {
  
  @JSImport("react-native-elements/dist/config/makeStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeStyles[T /* <: NamedStyles[Any | T] */, V](styles: T): js.Function1[/* props */ js.UndefOr[V], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ js.UndefOr[V], T]]
  inline def makeStyles[T /* <: NamedStyles[Any | T] */, V](styles: js.Function2[/* theme */ PartialFullTheme, /* props */ V, T]): js.Function1[/* props */ js.UndefOr[V], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ js.UndefOr[V], T]]
  
  inline def useTheme(): ThemeProps[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[ThemeProps[js.Object]]
}
