package typings.reactDashI18next.reactDashI18nextMod

import typings.i18next.i18nextMod.WithT
import typings.react.reactMod.ComponentType
import typings.reactDashI18next.Anon_WithRef
import typings.reactDashI18next.reactDashI18nextStrings.i18n
import typings.reactDashI18next.reactDashI18nextStrings.tReady
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithTranslation extends WithT {
  var i18n: typings.i18next.i18nextMod.i18n = js.native
  var tReady: Boolean = js.native
}

@JSImport("react-i18next", "withTranslation")
@js.native
object withTranslation extends js.Object {
  def apply(): js.Function1[
    /* component */ ComponentType[WithTranslation], 
    ComponentType[Omit[WithTranslation, i18n | tReady]]
  ] = js.native
  def apply(ns: Namespace): js.Function1[
    /* component */ ComponentType[WithTranslation], 
    ComponentType[Omit[WithTranslation, i18n | tReady]]
  ] = js.native
  def apply(ns: Namespace, options: Anon_WithRef): js.Function1[
    /* component */ ComponentType[WithTranslation], 
    ComponentType[Omit[WithTranslation, i18n | tReady]]
  ] = js.native
}

