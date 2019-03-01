package typings
package reactDashNativeDashElementsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashElementsMod {
  type DividerProps = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties */ js.Any
  type HeaderSubComponent = _HeaderSubComponent | reactLib.reactMod.ReactNs.ReactElement[js.Object]
  type IconNode = scala.Boolean | reactLib.reactMod.ReactNs.ReactElement[js.Object] | IconProps
  type IconType = _IconType | java.lang.String
  type Theme[T] = stdLib.Partial[FullTheme] with T
  type UpdateTheme = js.Function1[
    /* updates */ reactDashNativeDashElementsLib.RecursivePartial[FullTheme], 
    scala.Unit
  ]
}
