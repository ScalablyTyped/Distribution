package typings
package reactDashJssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInjectSheetMod {
  type ClassNameMap[C /* <: java.lang.String */] = stdLib.Record[C, java.lang.String]
  type ConsistentWith[DecorationTargetProps, InjectedProps] = reactDashJssLib.reactDashJssLibStrings.ConsistentWith with DecorationTargetProps
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
  type StyleCreator[C /* <: java.lang.String */, T /* <: js.Object */] = js.Function1[/* theme */ T, Styles[C]]
  type Styles[ClassKey /* <: java.lang.String */] = stdLib.Record[ClassKey, CSSProperties]
  type WithSheet[S /* <: java.lang.String | Styles[java.lang.String] | (StyleCreator[java.lang.String, _]) */, GivenTheme] = reactDashJssLib.Anon_Classes[S] with WithTheme[GivenTheme]
}
