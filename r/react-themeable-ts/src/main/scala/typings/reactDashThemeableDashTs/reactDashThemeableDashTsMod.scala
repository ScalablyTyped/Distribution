package typings.reactDashThemeableDashTs

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.Validator
import typings.reactDashThemeableDashTs.buildDashEs5HocMod.IThemeDecoratorArgs
import typings.reactDashThemeableDashTs.buildDashEs5HocMod.TDecComponent
import typings.reactDashThemeableDashTs.buildDashEs5ThemeableMod.IStaticFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-themeable-ts", JSImport.Namespace)
@js.native
object reactDashThemeableDashTsMod extends js.Object {
  @js.native
  class ThemeProvider ()
    extends typings.reactDashThemeableDashTs.buildDashEs5ThemeDashProviderMod.ThemeProvider
  
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

