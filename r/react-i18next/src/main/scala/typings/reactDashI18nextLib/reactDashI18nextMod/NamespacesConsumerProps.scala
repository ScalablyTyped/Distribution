package typings
package reactDashI18nextLib.reactDashI18nextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespacesConsumerProps extends ReactI18NextOptions {
  var i18n: js.UndefOr[i18nextLib.i18nextMod.i18nextNs.i18n] = js.undefined
  var initialI18nStore: js.UndefOr[js.Object] = js.undefined
  var initialLanguage: js.UndefOr[java.lang.String] = js.undefined
  var ns: js.UndefOr[reactDashI18nextLib.Namespace] = js.undefined
  def children(
    t: i18nextLib.i18nextMod.i18nextNs.TranslationFunction[_, js.Object, java.lang.String],
    options: reactDashI18nextLib.Anon_I18n
  ): reactLib.reactMod.ReactNs.ReactNode
}

