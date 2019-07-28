package typings.reactDashThemeableDashTs.buildDashEs2017Mod

import typings.reactDashThemeableDashTs.buildDashEs2017HocMod.IThemeDecoratorArgs
import typings.reactDashThemeableDashTs.buildDashEs2017HocMod.TDecComponent
import typings.reactDashThemeableDashTs.buildDashEs2017ThemeableMod.IStaticFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-themeable-ts/build-es2017", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val themeable: IStaticFn = js.native
  def themeDecorator[P /* <: IThemeDecoratorArgs */](): js.Function1[/* WrappedComponent */ TDecComponent[P], _] = js.native
  def themeDecorator[P /* <: IThemeDecoratorArgs */](hasThemeKeyThemePropMemoizeeOptsContextPath: IThemeDecoratorArgs): js.Function1[/* WrappedComponent */ TDecComponent[P], _] = js.native
}

