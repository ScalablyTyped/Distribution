package typings.reactNativeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DividerProps = typings.reactNative.mod.ViewProperties
  /* Rewritten from type alias, can be one of: 
    - typings.react.mod.ReactElement
    - typings.reactNativeElements.mod.TextProps
    - typings.reactNativeElements.mod.HeaderIcon
  */
  type HeaderSubComponent = typings.reactNativeElements.mod._HeaderSubComponent | typings.react.mod.ReactElement
  type IconNode = scala.Boolean | typings.react.mod.ReactElement | typings.reactNativeElements.mod.IconProps
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeElements.reactNativeElementsStrings.material
    - typings.reactNativeElements.reactNativeElementsStrings.`material-community`
    - typings.reactNativeElements.reactNativeElementsStrings.`simple-line-icon`
    - typings.reactNativeElements.reactNativeElementsStrings.zocial
    - typings.reactNativeElements.reactNativeElementsStrings.`font-awesome`
    - typings.reactNativeElements.reactNativeElementsStrings.octicon
    - typings.reactNativeElements.reactNativeElementsStrings.ionicon
    - typings.reactNativeElements.reactNativeElementsStrings.foundation
    - typings.reactNativeElements.reactNativeElementsStrings.evilicon
    - typings.reactNativeElements.reactNativeElementsStrings.entypo
    - typings.reactNativeElements.reactNativeElementsStrings.antdesign
    - java.lang.String
  */
  type IconType = typings.reactNativeElements.mod._IconType | java.lang.String
  type RecursivePartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native-elements.react-native-elements.RecursivePartial<T[P]> * / object}
    */ typings.reactNativeElements.reactNativeElementsStrings.RecursivePartial with org.scalablytyped.runtime.TopLevel[js.Any]
  type ReplaceTheme = js.Function1[
    /* updates */ typings.reactNativeElements.anon.RecursivePartialFullTheme, 
    scala.Unit
  ]
  type SearchBarProps = typings.reactNativeElements.mod.SearchBarWrapper with typings.reactNativeElements.mod.SearchBarBase with typings.reactNativeElements.mod.SearchBarPlatform with typings.reactNativeElements.mod.SearchBarDefault with typings.reactNativeElements.mod.SearchBarIOS with typings.reactNativeElements.mod.SearchBarAndroid
  type Theme[T] = typings.reactNativeElements.anon.PartialFullTheme with T
  type UpdateTheme = js.Function1[
    /* updates */ typings.reactNativeElements.anon.RecursivePartialFullTheme, 
    scala.Unit
  ]
}
