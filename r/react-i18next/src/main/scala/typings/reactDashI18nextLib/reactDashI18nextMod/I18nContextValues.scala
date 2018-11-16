package typings
package reactDashI18nextLib.reactDashI18nextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18nContextValues extends js.Object {
  var defaultNS: js.UndefOr[java.lang.String] = js.native
  var i18n: i18nextLib.i18nextMod.i18nextNs.i18n = js.native
  var lng: js.UndefOr[java.lang.String] = js.native
  var reportNS: js.UndefOr[java.lang.String] = js.native
  @JSName("t")
  var t_Original: i18nextLib.i18nextMod.i18nextNs.TranslationFunction[_, js.Object, java.lang.String] = js.native
  def t(key: java.lang.String): js.Any = js.native
  def t(key: java.lang.String, options: i18nextLib.i18nextMod.i18nextNs.TranslationOptions[js.Object]): js.Any = js.native
  def t(key: js.Array[java.lang.String]): js.Any = js.native
  def t(
    key: js.Array[java.lang.String],
    options: i18nextLib.i18nextMod.i18nextNs.TranslationOptions[js.Object]
  ): js.Any = js.native
}

