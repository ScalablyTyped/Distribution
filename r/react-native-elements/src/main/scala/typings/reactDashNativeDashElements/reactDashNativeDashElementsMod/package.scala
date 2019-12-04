package typings.reactDashNativeDashElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashElementsMod {
  import typings.react.reactMod.ReactElement
  import typings.reactDashNative.reactDashNativeMod.ViewProperties
  import typings.std.Partial

  type DividerProps = ViewProperties
  /* Rewritten from type alias, can be one of: 
    - typings.react.reactMod.ReactElement
    - typings.reactDashNativeDashElements.reactDashNativeDashElementsMod.TextProps
    - typings.reactDashNativeDashElements.reactDashNativeDashElementsMod.HeaderIcon
  */
  type HeaderSubComponent = _HeaderSubComponent | ReactElement
  type IconNode = Boolean | ReactElement | IconProps
  /* Rewritten from type alias, can be one of: 
    - typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.material
    - typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.`material-community`
    - typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.`simple-line-icon`
    - typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.zocial
    - typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.`font-awesome`
    - typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.octicon
    - typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.ionicon
    - typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.foundation
    - typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.evilicon
    - typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.entypo
    - typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.antdesign
    - java.lang.String
  */
  type IconType = _IconType | String
  type RecursivePartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias react-native-elements.react-native-elements.RecursivePartial<T[P]> * / object}
    */ typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.RecursivePartial with js.Any
  type ReplaceTheme = js.Function1[/* updates */ RecursivePartial[FullTheme], Unit]
  type SearchBarProps = SearchBarWrapper with SearchBarBase with SearchBarPlatform with SearchBarDefault with SearchBarIOS with SearchBarAndroid
  type Theme[T] = Partial[FullTheme] with T
  type UpdateTheme = js.Function1[/* updates */ RecursivePartial[FullTheme], Unit]
}
