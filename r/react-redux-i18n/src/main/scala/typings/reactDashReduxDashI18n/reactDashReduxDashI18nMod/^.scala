package typings.reactDashReduxDashI18n.reactDashReduxDashI18nMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import typings.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-redux-i18n", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var I18n: typings.reactDashReduxDashI18n.reactDashReduxDashI18nMod.I18n = js.native
  def i18nReducer(): Reducer[I18nState, AnyAction] = js.native
  def i18nReducer(state: js.Any): Reducer[I18nState, AnyAction] = js.native
  def i18nReducer(state: js.Any, options: js.Any): Reducer[I18nState, AnyAction] = js.native
  def loadTranslations(translationsObject: TranslationObjects): DispatchCallback[_] = js.native
  def setLocale(locale: String): DispatchCallback[_] = js.native
  def syncTranslationWithStore(store: Store[_, AnyAction]): Unit = js.native
}

