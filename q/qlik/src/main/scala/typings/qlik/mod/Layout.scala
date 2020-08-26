package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layout extends js.Object {
  var qHyperCube: HyperCube = js.native
  var qInfo: NxInfo = js.native
  var qSelectionInfo: Selectionobject = js.native
}

object Layout {
  @scala.inline
  def apply(qHyperCube: HyperCube, qInfo: NxInfo, qSelectionInfo: Selectionobject): Layout = {
    val __obj = js.Dynamic.literal(qHyperCube = qHyperCube.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qSelectionInfo = qSelectionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  implicit class LayoutOps[Self <: Layout] (val x: Self) extends AnyVal {
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
    def setQHyperCube(value: HyperCube): Self = this.set("qHyperCube", value.asInstanceOf[js.Any])
    @scala.inline
    def setQInfo(value: NxInfo): Self = this.set("qInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSelectionInfo(value: Selectionobject): Self = this.set("qSelectionInfo", value.asInstanceOf[js.Any])
  }
  
}

