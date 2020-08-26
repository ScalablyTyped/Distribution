package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericDimensionsListProperties width extend GenericBaseLayout
  */
@js.native
trait IMeassureListItemLayout extends IGenericBaseLayout {
  var qData: Null = js.native
  @JSName("qMeta")
  var qMeta_IMeassureListItemLayout: INxMetaTitleDescriptionTag = js.native
}

object IMeassureListItemLayout {
  @scala.inline
  def apply(qData: Null, qInfo: INxInfo, qMeta: INxMetaTitleDescriptionTag): IMeassureListItemLayout = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMeassureListItemLayout]
  }
  @scala.inline
  implicit class IMeassureListItemLayoutOps[Self <: IMeassureListItemLayout] (val x: Self) extends AnyVal {
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
    def setQMeta(value: INxMetaTitleDescriptionTag): Self = this.set("qMeta", value.asInstanceOf[js.Any])
  }
  
}

