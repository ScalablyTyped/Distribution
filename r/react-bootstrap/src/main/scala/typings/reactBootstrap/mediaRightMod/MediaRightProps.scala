package typings.reactBootstrap.mediaRightMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaRightProps
  extends AllHTMLAttributes[MediaRight]
     with ClassAttributes[MediaRight] {
  var align: js.UndefOr[String] = js.native
}

object MediaRightProps {
  @scala.inline
  def apply(): MediaRightProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaRightProps]
  }
  @scala.inline
  implicit class MediaRightPropsOps[Self <: MediaRightProps] (val x: Self) extends AnyVal {
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
  }
  
}

