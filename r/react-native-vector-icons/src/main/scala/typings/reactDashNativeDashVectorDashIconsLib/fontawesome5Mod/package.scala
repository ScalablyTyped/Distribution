package typings
package reactDashNativeDashVectorDashIconsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fontawesome5Mod {
  type AllowOnlyOne[T, Keys /* <: java.lang.String */] = (Omit[T, Keys]) with (/* import warning: ImportType.apply Failed type conversion: {typemapped}[Keys] */ js.Any)
  type FontAwesome5Icon = reactLib.reactMod.Component[FontAwesome5IconProps, js.Any, js.Any]
  type FontAwesome5IconProps = AllowOnlyOne[
    reactDashNativeDashVectorDashIconsLib.reactDashNativeDashVectorDashIconsLibStrings.FontAwesome5IconProps with js.Any with reactDashNativeDashVectorDashIconsLib.iconMod.IconProps, 
    FontAwesome5IconVariants
  ]
  type FontAwesome5IconVariants = java.lang.String
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type ValueOf[T] = /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
}
