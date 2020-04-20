package typings.reactI18next.mod.i18nextAugmentingMod

import typings.reactI18next.mod.ReportNamespaces
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait i18n extends js.Object {
  var reportNamespaces: ReportNamespaces
}

object i18n {
  @scala.inline
  def apply(reportNamespaces: ReportNamespaces): i18n = {
    val __obj = js.Dynamic.literal(reportNamespaces = reportNamespaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[i18n]
  }
}

