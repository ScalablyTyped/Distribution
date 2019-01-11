package typings
package reactDashReduxDashI18nLib.reactDashReduxDashI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-redux-i18n", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var I18n: reactDashReduxDashI18nLib.reactDashReduxDashI18nMod.I18n = js.native
  def i18nReducer(): reduxLib.reduxMod.Reducer[
    reactDashReduxDashI18nLib.reactDashReduxDashI18nMod.I18nState, 
    reduxLib.reduxMod.AnyAction
  ] = js.native
  def i18nReducer(state: js.Any): reduxLib.reduxMod.Reducer[
    reactDashReduxDashI18nLib.reactDashReduxDashI18nMod.I18nState, 
    reduxLib.reduxMod.AnyAction
  ] = js.native
  def i18nReducer(state: js.Any, options: js.Any): reduxLib.reduxMod.Reducer[
    reactDashReduxDashI18nLib.reactDashReduxDashI18nMod.I18nState, 
    reduxLib.reduxMod.AnyAction
  ] = js.native
  def loadTranslations(translationsObject: reactDashReduxDashI18nLib.reactDashReduxDashI18nMod.TranslationObjects): reactDashReduxDashI18nLib.reactDashReduxDashI18nMod.DispatchCallback[_] = js.native
  def setLocale(locale: java.lang.String): reactDashReduxDashI18nLib.reactDashReduxDashI18nMod.DispatchCallback[_] = js.native
  def syncTranslationWithStore(store: reduxLib.reduxMod.Store[_, reduxLib.reduxMod.AnyAction]): scala.Unit = js.native
}

