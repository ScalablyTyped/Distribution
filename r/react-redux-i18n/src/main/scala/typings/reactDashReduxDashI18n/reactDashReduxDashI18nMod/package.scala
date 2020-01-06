package typings.reactDashReduxDashI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashReduxDashI18nMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.redux.reduxMod.Action
  import typings.redux.reduxMod.Dispatch

  type DispatchCallback[S /* <: Action[_] */] = js.Function2[
    /* dispatch */ js.UndefOr[Dispatch[S]], 
    /* getState */ js.UndefOr[js.Function0[S]], 
    js.Any
  ]
  type SubTranslationObject = String | (StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-redux-i18n.react-redux-i18n.SubTranslationObject */ js.Object
  ])
  type TranslationObjects = StringDictionary[SubTranslationObject]
}
