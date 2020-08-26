package typings.reactI18next.mod.i18nextAugmentingMod

import typings.reactI18next.mod.ReportNamespaces
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait i18n extends js.Object {
  var reportNamespaces: ReportNamespaces = js.native
}

object i18n {
  @scala.inline
  def apply(reportNamespaces: ReportNamespaces): i18n = {
    val __obj = js.Dynamic.literal(reportNamespaces = reportNamespaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[i18n]
  }
  @scala.inline
  implicit class i18nOps[Self <: i18n] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReportNamespaces(value: ReportNamespaces): Self = this.set("reportNamespaces", value.asInstanceOf[js.Any])
  }
  
}

