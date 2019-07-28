package typings.reactDashThemeableDashTs.reactDashThemeableDashTsMod

import typings.reactDashThemeableDashTs.buildDashEs5HocMod.IThemeDecoratorArgs
import typings.reactDashThemeableDashTs.buildDashEs5HocMod.TDecComponent
import typings.reactDashThemeableDashTs.buildDashEs5ThemeableMod.IStaticFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-themeable-ts", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val themeable: IStaticFn = js.native
  def themeDecorator[P /* <: IThemeDecoratorArgs */](): js.Function1[/* WrappedComponent */ TDecComponent[P], _] = js.native
  def themeDecorator[P /* <: IThemeDecoratorArgs */](hasThemeKeyThemePropMemoizeeOptsContextPath: IThemeDecoratorArgs): js.Function1[/* WrappedComponent */ TDecComponent[P], _] = js.native
}

