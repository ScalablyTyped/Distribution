package typings.reactCsv.downloadMod

import typings.reactCsv.commonPropTypesMod.CommonPropTypes
import typings.reactCsv.commonPropTypesMod.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadPropTypes extends CommonPropTypes {
  var target: js.UndefOr[String] = js.native
}

object DownloadPropTypes {
  @scala.inline
  def apply(data: String | Data): DownloadPropTypes = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadPropTypes]
  }
  @scala.inline
  implicit class DownloadPropTypesOps[Self <: DownloadPropTypes] (val x: Self) extends AnyVal {
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
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

