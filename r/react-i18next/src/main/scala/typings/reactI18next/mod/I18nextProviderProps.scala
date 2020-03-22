package typings.reactI18next.mod

import typings.i18next.mod.i18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nextProviderProps extends js.Object {
  var defaultNS: js.UndefOr[String] = js.undefined
  var i18n: typings.i18next.mod.i18n
}

object I18nextProviderProps {
  @scala.inline
  def apply(i18n: i18n, defaultNS: String = null): I18nextProviderProps = {
    val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
    if (defaultNS != null) __obj.updateDynamic("defaultNS")(defaultNS.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nextProviderProps]
  }
}

