package typings.reactI18next.mod

import typings.react.mod.ComponentType
import typings.reactI18next.anon.WithRef
import typings.reactI18next.reactI18nextStrings.i18n
import typings.reactI18next.reactI18nextStrings.tReady
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-i18next", "withTranslation")
@js.native
object withTranslation extends js.Object {
  def apply(): js.Function1[
    /* component */ ComponentType[WithTranslation_], 
    ComponentType[(Omit[WithTranslation_, i18n | tReady]) with WithTranslationProps]
  ] = js.native
  def apply(ns: js.UndefOr[Namespace], options: WithRef): js.Function1[
    /* component */ ComponentType[WithTranslation_], 
    ComponentType[(Omit[WithTranslation_, i18n | tReady]) with WithTranslationProps]
  ] = js.native
  def apply(ns: Namespace): js.Function1[
    /* component */ ComponentType[WithTranslation_], 
    ComponentType[(Omit[WithTranslation_, i18n | tReady]) with WithTranslationProps]
  ] = js.native
}

