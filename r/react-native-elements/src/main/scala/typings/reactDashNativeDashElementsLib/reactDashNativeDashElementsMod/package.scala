package typings
package reactDashNativeDashElementsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashElementsMod {
  type DividerProps = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties */ js.Any
  /* Rewritten from type alias, can be one of: 
    - reactLib.reactMod.ReactElement
    - TextProps
    - HeaderIcon
  */
  type HeaderSubComponent = _HeaderSubComponent | reactLib.reactMod.ReactElement
  type IconNode = scala.Boolean | reactLib.reactMod.ReactElement | IconProps
  /* Rewritten from type alias, can be one of: 
    - reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.material
    - reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.`material-community`
    - reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.`simple-line-icon`
    - reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.zocial
    - reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.`font-awesome`
    - reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.octicon
    - reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.ionicon
    - reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.foundation
    - reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.evilicon
    - reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.entypo
    - reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.antdesign
    - java.lang.String
  */
  type IconType = _IconType | java.lang.String
  type RecursivePartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? object}
    */ reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.RecursivePartial with js.Any
  type SearchBarProps = SearchBarWrapper with SearchBarBase with SearchBarPlatform with SearchBarDefault with SearchBarIOS with SearchBarAndroid
  type Theme[T] = stdLib.Partial[FullTheme] with T
  type UpdateTheme = js.Function1[/* updates */ RecursivePartial[FullTheme], scala.Unit]
}
