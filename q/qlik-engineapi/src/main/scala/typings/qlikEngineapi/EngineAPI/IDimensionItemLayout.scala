package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DimensionItemLayout...
  */
@js.native
trait IDimensionItemLayout extends js.Object {
  var qData: Null = js.native
  var qInfo: INxInfo = js.native
  var qMeta: INxMetaTitleDescriptionTag = js.native
}

object IDimensionItemLayout {
  @scala.inline
  def apply(qData: Null, qInfo: INxInfo, qMeta: INxMetaTitleDescriptionTag): IDimensionItemLayout = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDimensionItemLayout]
  }
  @scala.inline
  implicit class IDimensionItemLayoutOps[Self <: IDimensionItemLayout] (val x: Self) extends AnyVal {
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
    def setQData(value: Null): Self = this.set("qData", value.asInstanceOf[js.Any])
    @scala.inline
    def setQInfo(value: INxInfo): Self = this.set("qInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setQMeta(value: INxMetaTitleDescriptionTag): Self = this.set("qMeta", value.asInstanceOf[js.Any])
  }
  
}

