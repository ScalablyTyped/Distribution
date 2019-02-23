package typings
package reactDashJssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInjectSheetMod {
  type ClassNameMap[C /* <: java.lang.String | scala.Double | js.Symbol */] = stdLib.Record[C, java.lang.String]
  type ConsistentWith[DecorationTargetProps, InjectedProps] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: DecorationTargetProps[P] | InjectedProps[P]}
    */ reactDashJssLib.reactDashJssLibStrings.ConsistentWith with js.Any
  type DynamicCSSRule[Props] = js.Any
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type Overwrite[T, U] = (Omit[T, java.lang.String]) with U
  type PropInjector[InjectedProps, AdditionalProps] = js.Function1[
    /* component */ js.Any, 
    reactLib.reactMod.ReactNs.ComponentType[
      (Omit[
        reactLib.reactMod.Global.JSXNs.LibraryManagedAttributes[_, PropsOf[_]], 
        java.lang.String
      ]) with AdditionalProps
    ]
  ]
  type PropsOf[C] = js.Any
  type StyleCreator[C /* <: java.lang.String | scala.Double | js.Symbol */, T /* <: js.Object */, Props] = js.Function1[/* theme */ T, Styles[C, Props]]
  type Styles[ClassKey /* <: java.lang.String | scala.Double | js.Symbol */, Props] = stdLib.Record[ClassKey, CSSProperties[Props]]
  type WithSheet[S /* <: java.lang.String | (Styles[java.lang.String, js.Object]) | (StyleCreator[java.lang.String, _, js.Object]) */, GivenTheme, Props] = reactDashJssLib.Anon_Classes[S] with WithTheme[GivenTheme]
}
