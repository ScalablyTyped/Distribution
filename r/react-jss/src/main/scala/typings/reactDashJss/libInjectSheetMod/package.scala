package typings.reactDashJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInjectSheetMod {
  import typings.react.reactMod.ComponentType
  import typings.react.reactMod._Global_.JSX.LibraryManagedAttributes
  import typings.reactDashJss.Anon_Classes
  import typings.std.Exclude
  import typings.std.Pick
  import typings.std.Record

  type ClassNameMap[C /* <: String | Double | js.Symbol */] = Record[C, String]
  type ConsistentWith[DecorationTargetProps, InjectedProps] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.reactDashJss.reactDashJssStrings.ConsistentWith with js.Any
  type DynamicCSSRule[Props] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof csstype.csstype.Properties<number | string | std.Array<number | string>> ]: csstype.csstype.Properties<number | string | std.Array<number | string>>[K] | (props : Props): csstype.csstype.Properties<number | string | std.Array<number | string>>[K]}[keyof csstype.csstype.Properties<string | 0>] */ js.Any
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type Overwrite[T, U] = (Omit[T, String]) with U
  type PropInjector[InjectedProps, AdditionalProps] = js.Function1[
    /* component */ js.Any, 
    ComponentType[(Omit[LibraryManagedAttributes[_, PropsOf[_]], String]) with AdditionalProps]
  ]
  type PropsOf[C] = js.Any
  type StyleCreator[C /* <: String | Double | js.Symbol */, T /* <: js.Object */, Props] = js.Function1[/* theme */ T, Styles[C, Props]]
  type Styles[ClassKey /* <: String | Double | js.Symbol */, Props] = Record[ClassKey, CSSProperties[Props]]
  type WithSheet[S /* <: String | (Styles[String, js.Object]) | (StyleCreator[String, _, js.Object]) */, GivenTheme, Props] = (Anon_Classes[S, Props]) with WithTheme[GivenTheme]
}
