package typings.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BDelayInit extends js.Object {
  var bDelayInit: Boolean = js.native
  var separatorChar: String = js.native
  var singleValuePropTypeID: String = js.native
}

object BDelayInit {
  @scala.inline
  def apply(bDelayInit: Boolean, separatorChar: String, singleValuePropTypeID: String): BDelayInit = {
    val __obj = js.Dynamic.literal(bDelayInit = bDelayInit.asInstanceOf[js.Any], separatorChar = separatorChar.asInstanceOf[js.Any], singleValuePropTypeID = singleValuePropTypeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[BDelayInit]
  }
  @scala.inline
  implicit class BDelayInitOps[Self <: BDelayInit] (val x: Self) extends AnyVal {
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
    def setBDelayInit(value: Boolean): Self = this.set("bDelayInit", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparatorChar(value: String): Self = this.set("separatorChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingleValuePropTypeID(value: String): Self = this.set("singleValuePropTypeID", value.asInstanceOf[js.Any])
  }
  
}

