package typings.reactDashThemeableDashTs.buildDashEs2015Mod

import typings.reactDashThemeableDashTs.buildDashEs2015HocMod.IThemeDecoratorArgs
import typings.reactDashThemeableDashTs.buildDashEs2015HocMod.TDecComponent
import typings.reactDashThemeableDashTs.buildDashEs2015ThemeableMod.IStaticFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-themeable-ts/build-es2015", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val themeable: IStaticFn = js.native
  def themeDecorator[P /* <: IThemeDecoratorArgs */](): js.Function1[/* WrappedComponent */ TDecComponent[P], _] = js.native
  def themeDecorator[P /* <: IThemeDecoratorArgs */](hasThemeKeyThemePropMemoizeeOptsContextPath: IThemeDecoratorArgs): js.Function1[/* WrappedComponent */ TDecComponent[P], _] = js.native
}

