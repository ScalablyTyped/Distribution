package typings.reactDashThemeableDashTs

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.Validator
import typings.reactDashThemeableDashTs.buildDashEs2015HocMod.IThemeDecoratorArgs
import typings.reactDashThemeableDashTs.buildDashEs2015HocMod.TDecComponent
import typings.reactDashThemeableDashTs.buildDashEs2015ThemeableMod.IStaticFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-themeable-ts/build-es2015", JSImport.Namespace)
@js.native
object buildDashEs2015Mod extends js.Object {
  @js.native
  class ThemeProvider ()
    extends typings.reactDashThemeableDashTs.buildDashEs2015ThemeDashProviderMod.ThemeProvider
  
  val themeable: IStaticFn = js.native
  def themeDecorator[P /* <: IThemeDecoratorArgs */](): js.Function1[/* WrappedComponent */ TDecComponent[P], _] = js.native
  def themeDecorator[P /* <: IThemeDecoratorArgs */](hasThemeKeyThemePropMemoizeeOptsContextPath: IThemeDecoratorArgs): js.Function1[/* WrappedComponent */ TDecComponent[P], _] = js.native
  /* static members */
  @js.native
  object ThemeProvider extends js.Object {
    var childContextTypes: StringDictionary[Validator[_]] = js.native
    var defaultProps: StringDictionary[js.Object] = js.native
  }
  
}

