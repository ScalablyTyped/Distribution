package typings.qlik.mod

import typings.qlik.qlikStrings.AND
import typings.qlik.qlikStrings.NORMAL
import typings.qlik.qlikStrings.NOT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxFieldSelectionInfo extends js.Object {
  var qFieldSelectionmode: NORMAL | AND | NOT = js.native
  var qName: String = js.native
}

object NxFieldSelectionInfo {
  @scala.inline
  def apply(qFieldSelectionmode: NORMAL | AND | NOT, qName: String): NxFieldSelectionInfo = {
    val __obj = js.Dynamic.literal(qFieldSelectionmode = qFieldSelectionmode.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxFieldSelectionInfo]
  }
  @scala.inline
  implicit class NxFieldSelectionInfoOps[Self <: NxFieldSelectionInfo] (val x: Self) extends AnyVal {
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
    def setQFieldSelectionmode(value: NORMAL | AND | NOT): Self = this.set("qFieldSelectionmode", value.asInstanceOf[js.Any])
    @scala.inline
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
  }
  
}

