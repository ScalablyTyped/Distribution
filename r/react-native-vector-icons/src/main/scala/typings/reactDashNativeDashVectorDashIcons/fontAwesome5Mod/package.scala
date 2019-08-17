package typings.reactDashNativeDashVectorDashIcons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fontAwesome5Mod {
  import typings.react.reactMod.Component
  import typings.reactDashNativeDashVectorDashIcons.iconMod.IconProps
  import typings.std.Exclude
  import typings.std.Pick

  type AllowOnlyOne[T, Keys /* <: String */] = (Omit[T, Keys]) with (/* import warning: ImportType.apply Failed type conversion: {[ K in Keys ]: -? std.Partial<std.Pick<T, K>> & std.Partial<std.Record<std.Exclude<Keys, K>, undefined>>}[Keys] */ js.Any)
  type FontAwesome5Icon = Component[FontAwesome5IconProps, js.Any, js.Any]
  type FontAwesome5IconProps = AllowOnlyOne[
    typings.reactDashNativeDashVectorDashIcons.reactDashNativeDashVectorDashIconsStrings.FontAwesome5IconProps with js.Any with IconProps, 
    FontAwesome5IconVariants
  ]
  type FontAwesome5IconVariants = String
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type ValueOf[T] = /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
}
