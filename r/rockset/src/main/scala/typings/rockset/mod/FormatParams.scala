package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatParams extends js.Object {
  var csv: js.UndefOr[CsvParams] = js.native
  // source data is in json format
  var json: js.UndefOr[Boolean] = js.native
  var xml: js.UndefOr[XmlParams] = js.native
}

object FormatParams {
  @scala.inline
  def apply(): FormatParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatParams]
  }
  @scala.inline
  implicit class FormatParamsOps[Self <: FormatParams] (val x: Self) extends AnyVal {
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
    def setCsv(value: CsvParams): Self = this.set("csv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsv: Self = this.set("csv", js.undefined)
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setXml(value: XmlParams): Self = this.set("xml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXml: Self = this.set("xml", js.undefined)
  }
  
}

