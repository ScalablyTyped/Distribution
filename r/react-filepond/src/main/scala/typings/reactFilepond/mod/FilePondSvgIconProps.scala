package typings.reactFilepond.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePondSvgIconProps extends js.Object {
  var iconProcess: js.UndefOr[String] = js.native
  var iconRemove: js.UndefOr[String] = js.native
  var iconRetry: js.UndefOr[String] = js.native
  var iconUndo: js.UndefOr[String] = js.native
}

object FilePondSvgIconProps {
  @scala.inline
  def apply(): FilePondSvgIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondSvgIconProps]
  }
  @scala.inline
  implicit class FilePondSvgIconPropsOps[Self <: FilePondSvgIconProps] (val x: Self) extends AnyVal {
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
    def setIconProcess(value: String): Self = this.set("iconProcess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconProcess: Self = this.set("iconProcess", js.undefined)
    @scala.inline
    def setIconRemove(value: String): Self = this.set("iconRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconRemove: Self = this.set("iconRemove", js.undefined)
    @scala.inline
    def setIconRetry(value: String): Self = this.set("iconRetry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconRetry: Self = this.set("iconRetry", js.undefined)
    @scala.inline
    def setIconUndo(value: String): Self = this.set("iconUndo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconUndo: Self = this.set("iconUndo", js.undefined)
  }
  
}

